package ucf.assignments.ramlogancop3330assignment4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

        //prompt show an empty to do list (first launch app, create a new one)
        //if the user wants to load, search  for to do list in files
        //if user clicks add button, open item class, and prompt for description
            //and due date
        //if user wants to edit, search for item or list, and allow to re-enter the description or name
        //if user wants to delete List, the list class will have instructions on deleting, which will delete
            //all items in the list and the list
        //delete item-> delete the list and move everything below it upwards
        //if user wants to save, ask for file name and save to desired location
        //to sort by date, use a sorting algorithm
    }
}