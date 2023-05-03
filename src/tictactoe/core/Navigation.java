package tictactoe.core;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import tictactoe.online_multi_player.presentation.OnlineViewController;


public class Navigation {
  
    public static void closePage(Node node)
    {
          Stage stage = (Stage) node.getScene().getWindow();
         stage.close();
    
    }
    
    public  static Stage openPage(ViewController viewController,Node node) throws IOException
    {
      
        
        Object viewControllerObject =  ViewControllerFactory.getViewController(viewController);
        if(node != null){   
           closePage(node);
        }
     
        Scene scene = null ;
        Parent root = null ;
        root = (Parent)viewControllerObject;
        Stage stage = new Stage();
        stage.setTitle(viewControllerObject.getClass().getSimpleName());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    return stage;
    }

   
    
}
