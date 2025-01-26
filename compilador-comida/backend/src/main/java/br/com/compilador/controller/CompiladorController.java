package br.com.compilador.controller;

import org.springframework.web.bind.annotation.*;

import controle.Comida;
import controle.ParseException;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.io.StringReader;

@RestController
@RequestMapping("/api/compilador")
@CrossOrigin(origins = "*") // Permitir acesso do frontend
public class CompiladorController {

    @PostMapping("/analisar")
    public ResponseEntity<?> analisarCodigo(@RequestBody String codigo) {
        try {
            Comida parser = new Comida(new StringReader(codigo));
            parser.programa(); // Método principal do JavaCC
            return ResponseEntity.ok().body("Código válido! Análise bem-sucedida.");
        } catch (ParseException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro de sintaxe: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro inesperado: " + e.getMessage());
        }
    }
}
