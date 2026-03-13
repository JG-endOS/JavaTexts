package java_texts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class aplicacao extends Application {

    @Override
    public void start(Stage palco) {
        
        // Objetos JavaFx
        Label label = new Label("Olá mundo");

        Button botao = new Button("Clique aqui!");

        TextField campoTexto = new TextField();

        VBox layout = new VBox(label, botao, campoTexto);

        Scene cena = new Scene(layout, 300, 300);

        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

