package java_texts;

import javafx.application.Application;
import javafx.stage.Stage;

public class TesteJavaFx extends Application {

    @Override
    public void start(Stage palco) {

        palco.setTitle("Meu Primeiro Palco");

        palco.show();
    }

    public static void main(String[] args) {

        launch(args);
        
    }
}