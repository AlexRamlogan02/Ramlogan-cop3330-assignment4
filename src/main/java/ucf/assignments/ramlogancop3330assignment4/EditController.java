package ucf.assignments.ramlogancop3330assignment4;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EditController {


    @FXML
    protected void lButton() {
        System.out.println("Edit List!!!");
        Stage stage = new Stage();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275); //creates the scene

        javafx.scene.text.Text sceneTitle = new Text("The Result is editing the List");
        sceneTitle.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));

        //add text to grid
        grid.add(sceneTitle,0,0,2,1);

        stage.setTitle("Result...");
        stage.setScene(grid.getScene());
        stage.show();

    }

    @FXML
    protected void iButton(){
        System.out.println("Edit Item!!!");
        Stage stage = new Stage();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275); //creates the scene

        javafx.scene.text.Text sceneTitle = new Text("The Result is editing the Item");
        sceneTitle.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));

        //add text to grid
        grid.add(sceneTitle,0,0,2,1);

        stage.setTitle("Result...");
        stage.setScene(grid.getScene());
        stage.show();

    }

}
