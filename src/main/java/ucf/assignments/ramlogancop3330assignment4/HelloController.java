package ucf.assignments.ramlogancop3330assignment4;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    protected EventHandler<ActionEvent> onAddButtonClick() throws IOException {
        System.out.println("Add something");

        FXMLLoader fxmlLoader = new FXMLLoader(ucf.assignments.ramlogancop3330assignment4.
                HelloApplication.class.getResource("AddWindow.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 200, 240);
        Stage tempStage = new Stage();
        tempStage.setTitle("Select Option");
        tempStage.setScene(scene);
        tempStage.show();


        return null;
    }


    @FXML
    protected EventHandler<ActionEvent> onDeleteButtonClick() throws IOException {
        System.out.println("Delete something");

        FXMLLoader fxmlLoader = new FXMLLoader(ucf.assignments.ramlogancop3330assignment4.
                HelloApplication.class.getResource("DeleteWindow.fxml"));
/*
        Scene scene = new Scene(fxmlLoader.load(), 200, 240);
        Stage tempStage = new Stage();
        tempStage.setTitle("Select Option");
        tempStage.setScene(scene);
        tempStage.show();
*/
        Stage newStage = new Stage();
        newStage.setScene(new Scene(fxmlLoader.load()));
        newStage.showAndWait();
        newStage.close();

        return null;
    }
    @FXML
    protected EventHandler<ActionEvent> onEditButtonClick() throws IOException {
        System.out.println("Edit Something");
        getClass("queryWindow.fxml");

        FXMLLoader fxmlLoader = new FXMLLoader(ucf.assignments.ramlogancop3330assignment4.
                HelloApplication.class.getResource("EditWindow.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 200, 240);
        Stage tempStage = new Stage();
        tempStage.setTitle("Select Option");
        tempStage.setScene(scene);
        tempStage.show();
        return null;
    }

    private void getClass(String s) {
    }

    @FXML
    protected void addItem(){
        GridPane item = new GridPane();
        TextField input = new TextField();
        DatePicker dueDate = new DatePicker();

    }

}