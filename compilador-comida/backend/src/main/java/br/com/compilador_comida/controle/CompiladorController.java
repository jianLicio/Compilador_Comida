package br.com.compilador_comida.controle;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")  // Permitir requisições do frontend
public class CompiladorController {

    @PostMapping("/compilar")
    public Map<String, Object> compilar(@RequestBody Map<String, String> request) {
        String codigo = request.get("codigo");
        Map<String, Object> resposta = new HashMap<>();

        try {
            // Aqui você chamaria seu compilador JavaCC
            boolean sucesso = executarCompilador(codigo);

            resposta.put("mensagem", sucesso ? "Código compilado com sucesso!" : "Erro na compilação.");
            resposta.put("sucesso", sucesso);
        } catch (Exception e) {
            resposta.put("mensagem", "Erro ao compilar: " + e.getMessage());
            resposta.put("sucesso", false);
        }
        return resposta;
    }

    private boolean executarCompilador(String codigo) {
        // Simulação do compilador (substituir com a lógica real)
        return codigo.contains("arroz") && codigo.contains("feijão");
    }
}
