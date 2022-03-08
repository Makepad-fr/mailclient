package io.makepad.client;

import io.makepad.client.scenes.MailReaderScene;
import javafx.application.Application;
;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MailReaderScene scene = new MailReaderScene();
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}