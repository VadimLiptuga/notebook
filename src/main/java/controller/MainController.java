package controller;

import javafx.event.ActionEvent;
import view.AddRecordView;

public class MainController {
    public void addRecord(ActionEvent event) {
        AddRecordView.show(event);
    }
}
