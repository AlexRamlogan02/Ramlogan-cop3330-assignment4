package ucf.assignments.ramlogancop3330assignment4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    protected EventHandler<ActionEvent> onAddButtonClick() throws IOException {
        System.out.println("Add something");

        FXMLLoader fxmlLoader = new FXMLLoader(ucf.assignments.ramlogancop3330assignment4.
                HelloApplication.class.getResource("AddWindow.fxml"));


        Stage newStage = new Stage();
        newStage.setScene(new Scene(fxmlLoader.load()));
        newStage.setTitle("Select");

        Button List = new Button();
        List.setText("List?");
        List.setOnAction(event -> {
            Stage newList = new Stage();
            FXMLLoader setNew = new FXMLLoader(ucf.assignments.ramlogancop3330assignment4.
                    HelloApplication.class.getResource("hello-view.fxml"));
            Scene newSList = null;
            try {
                newSList = new Scene(setNew.load(), 200, 240);
            } catch (IOException e) {
                e.printStackTrace();
            }
            newList.setScene(newSList);
        });

        Button Item = new Button();
        Item.setText("Item?");
        Item.setOnAction(event -> {
            System.out.println("New Item");
        });

        newStage.showAndWait();
        newStage.close();



        return null;
    }


    @FXML
    protected void onDeleteButtonClick() {
        System.out.println("Delete something");
        Application.launch(PickDelete.class);
    }

    @FXML
    protected EventHandler<ActionEvent> onEditButtonClick() throws IOException {
        System.out.println("Edit Something");

        FXMLLoader fxmlLoader = new FXMLLoader(ucf.assignments.ramlogancop3330assignment4.
                HelloApplication.class.getResource("EditWindow.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 200, 240);
        Stage tempStage = new Stage();
        tempStage.setTitle("Select Option");
        tempStage.setScene(scene);
        tempStage.show();
        return null;
    }

    @FXML
    protected void addItem(){
        GridPane item = new GridPane();
        TextField input = new TextField();
        DatePicker dueDate = new DatePicker();

    }

}