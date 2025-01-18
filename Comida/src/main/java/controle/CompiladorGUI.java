package controle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import javafx.scene.paint.Color;
import java.io.StringReader;

public class CompiladorGUI extends Application {

    private Label mensagemLabel;

    @Override
    public void start(Stage primaryStage) {

        // Configurar o CodeArea
        CodeArea codeArea = new CodeArea();
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setStyle("-fx-font-family: monospace; -fx-font-size: 12px;");

        // Adicionar o CodeArea ao VirtualizedScrollPane
        VirtualizedScrollPane<CodeArea> scrollPane = new VirtualizedScrollPane<>(codeArea);

        // Mensagem de status
        mensagemLabel = new Label();
        mensagemLabel.setTextFill(Color.BLACK);

        // Botão de "Cozinhar"
        Button compileButton = new Button("Cozinhar");
        compileButton.setOnAction(e -> compilarCodigo(codeArea));

        // Layout principal
        VBox buttonContainer = new VBox(compileButton, mensagemLabel);
        BorderPane root = new BorderPane();
        root.setCenter(scrollPane);
        root.setBottom(buttonContainer);

        // Configurar cena
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Linguagem Comida");
        primaryStage.show();
    }

    private void compilarCodigo(CodeArea codeArea) {
        String codigo = codeArea.getText();

        try {
            // Criar um analisador baseado no código digitado
            Comida parser = new Comida(new StringReader(codigo));
            parser.programa(); // Método principal definido em Comida.jj

            // Se não lançar exceção, o código é válido
            mensagemLabel.setText("✅ Código compilado com sucesso!");
            mensagemLabel.setTextFill(Color.GREEN);
            codeArea.setStyle("-fx-font-family: monospace; -fx-font-size: 12px;");
        } catch (ParseException e) {
            // Capturar erro de sintaxe e extrair a linha do erro
            mensagemLabel.setText("❌ Erro na linha " + e.currentToken.beginLine + ": " + e.getMessage());
            mensagemLabel.setTextFill(Color.RED);
            destacarLinhaErro(codeArea, e.currentToken.beginLine);
        }
    }

    private void destacarLinhaErro(CodeArea codeArea, int linhaErro) {
        String[] linhas = codeArea.getText().split("\n");
        StringBuilder novoTexto = new StringBuilder();

        for (int i = 0; i < linhas.length; i++) {
            if (i == linhaErro - 1) {
                novoTexto.append("[ERRO] ").append(linhas[i]).append("\n");
            } else {
                novoTexto.append(linhas[i]).append("\n");
            }
        }

        codeArea.replaceText(novoTexto.toString());
        codeArea.setStyle("-fx-font-family: monospace; -fx-font-size: 12px; -fx-background-color: lightpink;");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
