package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class AddRecordView {
    private static Stage primaryStage;
    private static Window ownerWindow;

    static {
        primaryStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(AddRecordView.class.getClassLoader().getResource("AddRecordView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root, 385, 210);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);

    }

    public static void show(ActionEvent event) {
        if (ownerWindow == null) {
            Node source = (Node)event.getSource();
            Window mainWindow = (Stage)source.getScene().getWindow();
            ownerWindow = mainWindow;
            primaryStage.initOwner(ownerWindow);
            primaryStage.initModality(Modality.WINDOW_MODAL);
        }
        primaryStage.show();
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}
