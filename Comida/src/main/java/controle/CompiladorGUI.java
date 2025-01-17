package controle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

public class CompiladorGUI extends Application {
    
	@Override
	public void start(Stage primaryStage) {
		
		// Configurar o CodeArea
        CodeArea codeArea = new CodeArea();
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea)); // Ativar números de linha
        codeArea.setStyle("-fx-font-family: monospace; -fx-font-size: 12px;");

        // Adicionar o CodeArea ao VirtualizedScrollPane para rolagem eficiente
        VirtualizedScrollPane<CodeArea> scrollPane = new VirtualizedScrollPane<>(codeArea);

        // Botão de "Cozinhar"
        Button compileButton = new Button("Cozinhar");
        compileButton.setOnAction(e -> {
            String code = codeArea.getText();
            System.out.println("Cozinhando:\n" + code);
        });
        
	    // Layout principal
        VBox buttonContainer = new VBox(compileButton);
        BorderPane root = new BorderPane();
        root.setCenter(scrollPane); // Adiciona o editor no centro
        root.setBottom(buttonContainer); // Adiciona o botão na parte inferior
        	
        // Configurar cena
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Linguagem Comida");
        primaryStage.show();

	}

	public static void main(String[] args) {
	    launch(args);
	}

}