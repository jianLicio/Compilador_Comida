package br.com.compilador.controller;

import org.springframework.web.bind.annotation.*;

import controle.Comida;
import controle.ParseException;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.io.StringReader;
import java.util.Map;

@RestController
@RequestMapping("/api/compilador")
@CrossOrigin(origins = "http://localhost:3000") // Permitir acesso do frontend
public class CompiladorController {

    @PostMapping("/analisar")
    public ResponseEntity<?> analisarCodigo(@RequestBody String codigo) {
        try {
            // Normaliza a entrada para evitar espaços em branco e caracteres indesejados
            codigo = codigo.trim().replace("\r", "").replace("\uFEFF", ""); 
    
            System.out.println("Código recebido: [" + codigo + "]");
            for (char c : codigo.toCharArray()) {
                System.out.println("Char: [" + c + "] ASCII: " + (int) c);
            }
            
            Comida parser = new Comida(new StringReader(codigo));
            parser.programa(); // Método principal do JavaCC
            return ResponseEntity.ok().body(Map.of("mensagem", "Código válido! Análise bem-sucedida.", "sucesso", true));
        } catch (ParseException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("mensagem", "Erro de sintaxe: " + e.getMessage(), "sucesso", false));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("mensagem", "Erro inesperado: " + e.getMessage(), "sucesso", false));
        }
    }

    static class Response {
        private String mensagem;
        private boolean sucesso;

        public Response(String mensagem, boolean sucesso) {
            this.mensagem = mensagem;
            this.sucesso = sucesso;
        }

        public String getMensagem() {
            return mensagem;
        }

        public boolean isSucesso() {
            return sucesso;
        }
    }
}
