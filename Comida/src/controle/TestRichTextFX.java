package controle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.fxmisc.richtext.CodeArea;

public class TestRichTextFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        CodeArea codeArea = new CodeArea();
        Scene scene = new Scene(codeArea, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Test RichTextFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
