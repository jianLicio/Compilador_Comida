package controle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Controle {
    
    public static String lerArquivo(String caminho) {
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao colocar na panela: " + e.getMessage());
        }
        return conteudo.toString();
    }

    public static void main(String[] args) {
        String caminho = "C:\\Users\\jian_\\eclipse-workspace\\Compilador_Comida\\Comida\\testes\\correto.txt";
        String codigoFonte = lerArquivo(caminho);
        Comida parser = new Comida(new java.io.StringReader(codigoFonte));

        if (codigoFonte != null) {
            System.out.println("Código Fonte Lido:\n" + codigoFonte);
            try {
                parser.programa();  // Apenas chama o método usando o parser já declarado
                System.out.println("A MESA TA PRONTA.\n");
            } catch (Exception e) {
                System.out.println("Foi encontrado uva passa no arroz.");
                System.out.println(e.getMessage());
            } catch (Error e) {
                System.out.println("FOI ENCONTRADO PURE NO CACHORRO QUENTE.");
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Não foi possível ler o arquivo.");
        }
    }
}
