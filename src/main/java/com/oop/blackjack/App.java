package com.oop.blackjack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/com/oop/blackjack/view/StartMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Blackjack Game - OOP Project");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}