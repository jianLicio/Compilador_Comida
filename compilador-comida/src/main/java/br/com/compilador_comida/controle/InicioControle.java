package br.com.compilador_comida.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class InicioControle {

    @GetMapping("/frontend")
    public String redirecionarParaIndex() {
        return "redirect:/frontend/index.html";
    }
}
