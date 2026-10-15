package org.example.workshopjavafxjdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    private static Scene mainScene;

    @Override
    public void start(Stage stage) {
        try {
            ScrollPane scrollPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gui/MainView.fxml")));

            mainScene = new Scene(scrollPane);
            stage.setScene(mainScene);
            stage.show();

            scrollPane.setFitToHeight(true);
            scrollPane.setFitToWidth(true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Scene getMainScene(){
        return mainScene;
    }
}