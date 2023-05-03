package tictactoe.online_multi_player.presentation.menu_dialog;

import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.Typography;
import tictactoe.core.designsystem.resources.ImagesUri;

public  class MenuDialogController extends DialogPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button menuButton;
    protected final ImageView iconImageView;
    protected final Button restartButton;
    protected final ImageView restartImageView;

    public MenuDialogController() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        menuButton = new Button();
        iconImageView = new ImageView();
        restartButton = new Button();
        restartImageView = new ImageView();

        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(250.0);
        gridPane.setPrefWidth(400.0);

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

        GridPane.setHalignment(menuButton, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(menuButton, 1);
        menuButton.setMnemonicParsing(false);
        menuButton.setPrefHeight(50.0);
        menuButton.setPrefWidth(350.0);
        menuButton.setText("Main Menu");
        menuButton.setFont(Typography.headerMediumFont);
        menuButton.setTextFill(javafx.scene.paint.Color.WHITE);

        iconImageView.setFitHeight(30.0);
        iconImageView.setFitWidth(30.0);
        iconImageView.setPickOnBounds(true);
        iconImageView.setPreserveRatio(true);
    
        menuButton.setGraphic(iconImageView);
        menuButton.setFont(new Font(24.0));

        GridPane.setHalignment(restartButton, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(restartButton, 2);
        restartButton.setMnemonicParsing(false);
        restartButton.setPrefHeight(50.0);
        restartButton.setPrefWidth(350.0);
        restartButton.setText("Restart");
         menuButton.setFont(Typography.headerMediumFont);
        restartButton.setTextFill(javafx.scene.paint.Color.WHITE);
        restartButton.setFont(Typography.headerMediumFont);

        restartImageView.setFitHeight(30.0);
        restartImageView.setFitWidth(30.0);
        restartImageView.setPickOnBounds(true);
        restartImageView.setPreserveRatio(true);
     
        restartButton.setGraphic(restartImageView);
        setContent(gridPane);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(menuButton);
        gridPane.getChildren().add(restartButton);
        
          menuButton.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 15px;");
         restartButton.setStyle("-fx-background-color: "+ColorPalette.lightRed+"; -fx-background-radius: 15px;");
         
           iconImageView.setImage(new Image(ImagesUri.home));
            restartImageView.setImage(new Image(ImagesUri.retry));
            
            
         
            menuButton.setOnAction((event) -> {
           
               
           
            });
         restartButton.setOnAction((event) -> {
           
            
       
   
            });

    }
}
