package br.com.compilador.controller;

import org.springframework.web.bind.annotation.*;

import controle.Comida;
import controle.ParseException;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.io.StringReader;
// import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/compilador")
@CrossOrigin(origins = "http://localhost:3000")
public class CompiladorController {

    @PostMapping("/analisar")
    public ResponseEntity<?> analisarCodigo(@RequestBody String codigo) {
        // try {
        // // Normaliza o código de entrada
        // codigo = codigo.trim().replace("\r", "").replace("\uFEFF", "");
        // System.out.println("Código recebido: [" + codigo + "]");

        // Comida parser = new Comida(new StringReader(codigo));
        // parser.programa();

        // return ResponseEntity.ok(Map.of(
        // "mensagem", "A MESA ESTÁ SERVIDA!",
        // "sucesso", true));

        // }
        try {
            // Normaliza o código de entrada
            codigo = codigo.trim().replace("\r", "").replace("\uFEFF", "");
            System.out.println("Código recebido: [" + codigo + "]");

            Comida parser = new Comida(new StringReader(codigo));
            parser.programa();

            return ResponseEntity.ok("A MESA ESTÁ SERVIDA!"); // Retorna apenas a string

        } catch (ParseException e) {
            System.err.println("Erro de sintaxe: " + e.getMessage());

            String mensagemErroFormatada = formatarMensagemErro(e.getMessage());

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensagemErroFormatada);

        } catch (Throwable e) {
            System.err.println("Erro crítico durante a análise: "
                    + (e.getMessage() != null ? e.getMessage() : "Erro desconhecido"));

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of(
                            "mensagem", "Erro crítico ao processar o código.",
                            "erro", e.getMessage() != null ? e.getMessage() : "Erro desconhecido",
                            "sucesso", false));
        }

    }

    private String formatarMensagemErro(String erroOriginal) {
        if (erroOriginal == null || erroOriginal.isEmpty()) {
            return "FOI ENCONTRADO UVA PASSA NO ARROZ!\nComida estragada encontrada: Erro desconhecido.";
        }

        // Substituir termos técnicos por expressões mais amigáveis
        String erroFormatado = erroOriginal
                .replace("Encountered", "Comida estragada encontrada")
                .replace("at line", "no fogão")
                .replace("column", "boca")
                .replace("Was expecting one of:", "Tava esperando os ingredientes:");

        return "FOI ENCONTRADO UVA PASSA NO ARROZ!\n" + erroFormatado;
    }

}
