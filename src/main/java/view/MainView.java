package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainView extends Application {
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(MainView.class.getClassLoader().getResource("MainView.fxml"));
        Scene scene = new Scene(root, 600, 550);
        primaryStage.setScene(scene);
        primaryStage.setMinHeight(350);
        primaryStage.setMinWidth(600);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
