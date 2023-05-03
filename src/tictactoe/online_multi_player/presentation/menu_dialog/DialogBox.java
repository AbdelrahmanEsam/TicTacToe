/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.online_multi_player.presentation.menu_dialog;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import tictactoe.core.PassData;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.Typography;
import tictactoe.core.designsystem.resources.ImagesUri;

public class DialogBox {
   
    static Boolean clickedButton = null;
    public static void displayBackDialog(String title, String message) {
      
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setWidth(400);
        window.setHeight(250);
       
        window.initStyle(StageStyle.UNDECORATED);
        GridPane gridPane;
        ColumnConstraints columnConstraints;
        RowConstraints rowConstraints;
        RowConstraints rowConstraints0;
        RowConstraints rowConstraints1;
        ImageView closeDialog;
        Button menuButton;
        ImageView iconImageView;
        Button restartButton;
        ImageView retartImageView;
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        closeDialog = new ImageView();
        menuButton = new Button();
        iconImageView = new ImageView();
        restartButton = new Button();
        retartImageView = new ImageView();

        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(250.0);
        gridPane.setPrefWidth(400.0);
       gridPane.setStyle("-fx-background-color: "+ColorPalette.lightGreen+"; -fx-background-radius: 15px;");
        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        rowConstraints.setMaxHeight(154.4);
        rowConstraints.setMinHeight(0.0);
        rowConstraints.setPrefHeight(52.59998025894165);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(267.20000000000005);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(97.80001831054689);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(221.40001525878904);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(114.5999816894531);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(closeDialog, javafx.geometry.HPos.RIGHT);
        closeDialog.setFitHeight(30.0);
        closeDialog.setFitWidth(30.0);
        closeDialog.setPickOnBounds(true);
        closeDialog.setPreserveRatio(true);
        GridPane.setMargin(closeDialog, new Insets(0.0, 20.0, 0.0, 0.0));
        closeDialog.setImage(new Image(ImagesUri.close));

        GridPane.setHalignment(menuButton, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(menuButton, 1);
        
        menuButton.setMnemonicParsing(false);
        menuButton.setPrefHeight(50.0);
        menuButton.setPrefWidth(350.0);
        menuButton.setText("Main Menu");
        menuButton.setFont(Typography.subtitleOneRegularFont);
        menuButton.setTextFill(javafx.scene.paint.Color.WHITE);

        iconImageView.setFitHeight(30.0);
        iconImageView.setFitWidth(30.0);
        iconImageView.setPickOnBounds(true);
        iconImageView.setPreserveRatio(true);
        iconImageView.setImage(new Image(ImagesUri.home));
        menuButton.setGraphic(iconImageView);
        menuButton.setFont(new Font(24.0));
        menuButton.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 15px;");

        GridPane.setHalignment(restartButton, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(restartButton, 2);
        restartButton.setMnemonicParsing(false);
        restartButton.setPrefHeight(50.0);
        restartButton.setPrefWidth(350.0);
        restartButton.setText("Restart");
        restartButton.setFont(Typography.subtitleOneRegularFont);
        restartButton.setStyle("-fx-background-color: "+ColorPalette.lightRed+"; -fx-background-radius: 15px;");
       
        restartButton.setTextFill(javafx.scene.paint.Color.WHITE);
        restartButton.setFont(new Font(24.0));

        retartImageView.setFitHeight(30.0);
        retartImageView.setFitWidth(30.0);
        retartImageView.setPickOnBounds(true);
        retartImageView.setPreserveRatio(true);
        retartImageView.setImage(new Image(ImagesUri.restartIcon));
        restartButton.setGraphic(retartImageView);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(closeDialog);
        gridPane.getChildren().add(menuButton);
        gridPane.getChildren().add(restartButton);
        window.setScene(new Scene(gridPane, 400, 250));
        window.centerOnScreen();
           window.show();
        
        menuButton.setOnAction((event) -> {
              PassData.getInstance().dialogReturn.setValue(null);
            PassData.getInstance().dialogReturn.setValue("main");
             ((Stage) closeDialog.getScene().getWindow()).close();
        });
         restartButton.setOnAction((event) -> {
               PassData.getInstance().dialogReturn.setValue(null);
             PassData.getInstance().dialogReturn.setValue("replay");
              ((Stage) closeDialog.getScene().getWindow()).close();
        });
         
         
          closeDialog.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
                
          });
          
          
           
    }
} 
