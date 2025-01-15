package controle;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.util.Objects;

public class CompiladorGUI extends Application {
    
	@Override
    public void start(Stage primaryStage) {
        // Layout principal
        VBox root = new VBox();
        root.setSpacing(10);

        // Números de linha
        TextFlow lineNumbers = new TextFlow();
        lineNumbers.setStyle("-fx-font-family: monospace; -fx-font-size: 12px; -fx-background-color: lightgray;");
        lineNumbers.setPrefWidth(40); // Largura fixa para os números de linha

        // Área de entrada
        TextArea inputArea = new TextArea("Insira o código aqui...");
        inputArea.setStyle("-fx-font-family: monospace; -fx-font-size: 12px; -fx-padding: 0;"); // Remove padding adicional

        // Atualizar números de linha ao alterar o texto
        inputArea.textProperty().addListener((obs, oldText, newText) -> atualizarNumerosDeLinha(newText, lineNumbers, inputArea));

        // Sincronizar o scroll
        inputArea.scrollTopProperty().addListener((obs, oldVal, newVal) -> {
            lineNumbers.setTranslateY(-newVal.doubleValue()); // Sincroniza o scroll dos números de linha
        });

        // Combinar números de linha e área de entrada no mesmo layout
        HBox editorContainer = new HBox(lineNumbers, inputArea);
        HBox.setHgrow(inputArea, Priority.ALWAYS); // Permite ao TextArea expandir dinamicamente

        // Adiciona ao layout principal
        root.getChildren().add(editorContainer);

        // Botão de compilar
        javafx.scene.control.Button compileButton = new javafx.scene.control.Button("Cozinhar");
        compileButton.setOnAction(e -> {
            String code = inputArea.getText();
            System.out.println("Cozinhando:\n" + code);
        });
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
                outputArea.setText("A mesa está pronta:\n" + result);
            } catch (Exception ex) {
                outputArea.setText("Foi encontrado comida estragada:\n" + ex.getMessage());
            }
        });

        // Configurar cena e exibir
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Linguagem Comida");
        primaryStage.show();

        // Inicializar números de linha
        atualizarNumerosDeLinha(inputArea.getText(), lineNumbers, inputArea);

    }

    private String compilarCodigo(String codigo) throws Exception {
        // Simula o processamento do compilador
        if (codigo.contains("erro")) {
            throw new Exception("Erro detectado no código!");
        }
        return "Código compilado com sucesso!";
    }
    
    private void atualizarNumerosDeLinha(String texto, TextFlow lineNumbers) {
        // Calcula o número de linhas
        String[] linhas = texto.split("\n");
        int totalLinhas = linhas.length;

        // Atualiza os números de linha
        lineNumbers.getChildren().clear();
        for (int i = 1; i <= totalLinhas; i++) {
            lineNumbers.getChildren().add(new Text(i + "\n"));
        }
    }
    
    private void atualizarNumerosDeLinha(String texto, TextFlow lineNumbers, TextArea inputArea) {
        // Calcula o número de linhas no TextArea
        String[] linhas = texto.split("\n");
        int totalLinhas = linhas.length;

        // Calcula a altura de linha do TextArea
        double alturaLinha = inputArea.getFont().getSize() * 1.5; // Ajuste para a altura real da linha

        // Atualiza os números de linha
        lineNumbers.getChildren().clear();
        for (int i = 1; i <= totalLinhas; i++) {
            Text numeroLinha = new Text(i + "\n");
            numeroLinha.setStyle("-fx-font-family: monospace; -fx-font-size: 12px;");
            lineNumbers.getChildren().add(numeroLinha);
        }

        // Ajusta a altura total do TextFlow
        lineNumbers.setPrefHeight(alturaLinha * totalLinhas);
    }


    public static void main(String[] args) {
        launch(args);
    }
}