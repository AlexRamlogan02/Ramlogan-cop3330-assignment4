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


    public static class List
    {
        //hold name of list and number of items on the list
    }

    public static class Item
    {   //holds info for a single item on a list such as description & due date
    }

    public static void main(String[] args) {
        launch();
        //automatically call create, which makes a new list. after that, the buttons
            //pressed depends on next action program will take
    }

    public static void create()
    {
        //creates a new to do list named Untitled in a new window to be filled in later
    }


    private static void save()
    {
        //if user wants to save, they will click a button that says "save list",
            // ask for file name and save to desired location
    }

    public static void start()
    {
        //loads & display the FXML file
    }

    private static void delete()
    {
        //this button will delete all items in the list, before deleting the list in its location
    }
    private static void look()
    {
        //look is to help sort things in due date order. It will look for items in ascending due date
            //order and displays it in due date order
    }

    public void addItem()
    {
        //fills in the item class, and creates a new item within the list
    }

    public void edit()
    {
        //if a user wants to edit either a list or a item, this will take the item or list name, and allow user
            //to change it
    }


}