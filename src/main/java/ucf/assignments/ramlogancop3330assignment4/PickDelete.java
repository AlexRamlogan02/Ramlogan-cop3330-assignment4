package ucf.assignments.ramlogancop3330assignment4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class PickDelete extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);

        stage.setTitle("Select");

        Button List = new Button();
        List.setText("List?");
        List.setOnAction(event -> {
            System.out.println("Delete List");
        });
        box.getChildren().add(List);

        Button Item = new Button();
        Item.setText("Item?");
        Item.setOnAction(event -> {
            System.out.println("Delete Item");
        });

        box.getChildren().add(Item);
        Scene newScene = new Scene(box);

        stage.show();
    }
}