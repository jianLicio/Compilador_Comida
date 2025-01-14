package controle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CompiladorGUI extends Application {
    
	@Override
    public void start(Stage primaryStage) {
        // Layout principal
        VBox root = new VBox();
        root.setSpacing(10);

        // Área de entrada
        TextArea inputArea = new TextArea("Insira o código aqui...");
        root.getChildren().add(inputArea);

        // Botão de compilar
        Button compileButton = new Button("Compilar");
        root.getChildren().add(compileButton);

        // Área de saída
        TextArea outputArea = new TextArea();
        outputArea.setEditable(false);
        root.getChildren().add(outputArea);

        // Ação do botão
        compileButton.setOnAction(e -> {
            String code = inputArea.getText();
            try {
                String result = compilarCodigo(code);
                outputArea.setText("Compilação bem-sucedida:\n" + result);
            } catch (Exception ex) {
                outputArea.setText("Erro durante a compilação:\n" + ex.getMessage());
            }
        });

        // Configurar cena e exibir
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Compilador LL(1)");
        primaryStage.show();
    }

    private String compilarCodigo(String codigo) throws Exception {
        // Simula o processamento do compilador
        if (codigo.contains("erro")) {
            throw new Exception("Erro detectado no código!");
        }
        return "Código compilado com sucesso!";
    }

    public static void main(String[] args) {
        launch(args);
    }
}