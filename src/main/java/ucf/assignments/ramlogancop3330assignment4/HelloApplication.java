package ucf.assignments.ramlogancop3330assignment4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 240);
        stage.setTitle("To Do List");
        stage.setScene(scene);
        stage.show();
    }

    public void pickDelete(Stage stage) throws IOException{

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

    public static void main(String[] args) {
        launch();
        //automatically call create, which makes a new list. after that, the buttons
            //pressed depends on next action program will take
    }


}