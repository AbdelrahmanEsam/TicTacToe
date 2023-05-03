package tictactoe.main_menu.presentation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import tictactoe.core.ViewController;
import tictactoe.core.ViewControllerFactory;
import tictactoe.core.ViewModelFactory;

public class TicTacToe extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = (Parent)ViewControllerFactory.getViewController(ViewController.SINGLEVIEWCONTROLLER);

        
        Scene scene = new Scene(root);
        root.setStyle("-fx-background-color: White;"); 
     
        stage.setScene(scene);
        stage.show();
        
        
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
