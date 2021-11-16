package ucf.assignments.ramlogancop3330assignment4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EditApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EditWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 240, 240);
        stage.setTitle("To Do List");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        //automatically call create, which makes a new list. after that, the buttons
        //pressed depends on next action program will take
    }

}
