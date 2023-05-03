package tictactoe.online_multi_player.presentation.winner_dialog;

import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import tictactoe.core.Navigation;
import tictactoe.core.PassData;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.Typography;
import tictactoe.core.designsystem.resources.ImagesUri;

public  class WinnerDialogController extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints4;
    protected final Text winnerNameTextView;
    protected final ImageView iconLeftImageView;
    protected final ImageView iconrightImageView;
    protected final Button mainMenuButton;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints5;
    protected final ColumnConstraints columnConstraints6;
    protected final RowConstraints rowConstraints5;
    protected final ImageView homeImageView;
    protected final Text text;
    protected final Button replayButton;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints7;
    protected final ColumnConstraints columnConstraints8;
    protected final RowConstraints rowConstraints6;
    protected final ImageView retryImageView;
    protected final Text text0;
    protected final Button watchMovesButton;
    protected final GridPane gridPane2;
    protected final ColumnConstraints columnConstraints9;
    protected final ColumnConstraints columnConstraints10;
    protected final RowConstraints rowConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final RowConstraints rowConstraints9;
    protected final ImageView cameraImageView;
    protected final Text text1;

    public WinnerDialogController() {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        gridPane = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints4 = new RowConstraints();
        winnerNameTextView = new Text();
        iconLeftImageView = new ImageView();
        iconrightImageView = new ImageView();
        mainMenuButton = new Button();
        gridPane0 = new GridPane();
        columnConstraints5 = new ColumnConstraints();
        columnConstraints6 = new ColumnConstraints();
        rowConstraints5 = new RowConstraints();
        homeImageView = new ImageView();
        text = new Text();
        replayButton = new Button();
        gridPane1 = new GridPane();
        columnConstraints7 = new ColumnConstraints();
        columnConstraints8 = new ColumnConstraints();
        rowConstraints6 = new RowConstraints();
        retryImageView = new ImageView();
        text0 = new Text();
        watchMovesButton = new Button();
        gridPane2 = new GridPane();
        columnConstraints9 = new ColumnConstraints();
        columnConstraints10 = new ColumnConstraints();
        rowConstraints7 = new RowConstraints();
        rowConstraints8 = new RowConstraints();
        rowConstraints9 = new RowConstraints();
        cameraImageView = new ImageView();
        text1 = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(250.0);
        setPrefWidth(400.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(128.20001220703125);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(77.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(437.79998779296875);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(421.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(195.199951171875);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(68.79998779296875);

        rowConstraints.setMaxHeight(128.60001220703126);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(46.399993896484375);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(276.79999008178714);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(68.79998779296875);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(276.79999008178714);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(65.6);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(218.99999084472654);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(62.599951171875006);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(218.99999084472654);
        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(15.400048828124994);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(gridPane, 1);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(winnerNameTextView, 1);
        GridPane.setHalignment(winnerNameTextView, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(winnerNameTextView, javafx.geometry.VPos.CENTER);
        winnerNameTextView.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        winnerNameTextView.setStrokeWidth(0.0);
        winnerNameTextView.setText("Winner");
        winnerNameTextView.setFont(Typography.headerMediumFont);
        winnerNameTextView.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        GridPane.setHalignment(iconLeftImageView, javafx.geometry.HPos.RIGHT);
        GridPane.setValignment(iconLeftImageView, javafx.geometry.VPos.CENTER);
        iconLeftImageView.setFitHeight(30.0);
        iconLeftImageView.setFitWidth(30.0);
        iconLeftImageView.setPickOnBounds(true);
        iconLeftImageView.setPreserveRatio(true);
        GridPane.setMargin(iconLeftImageView, new Insets(0.0));
     

        GridPane.setColumnIndex(iconrightImageView, 2);
        iconrightImageView.setFitHeight(30.0);
        iconrightImageView.setFitWidth(30.0);
        iconrightImageView.setPickOnBounds(true);
        iconrightImageView.setPreserveRatio(true);
        GridPane.setMargin(iconrightImageView, new Insets(0.0));


        GridPane.setColumnIndex(mainMenuButton, 1);
        GridPane.setRowIndex(mainMenuButton, 1);
        mainMenuButton.setMnemonicParsing(false);
        mainMenuButton.setPrefHeight(50.0);
        mainMenuButton.setPrefWidth(450.0);
        mainMenuButton.setFont(new Font(18.0));
        GridPane.setMargin(mainMenuButton, new Insets(0.0));

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMaxWidth(232.79998779296875);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(132.39998779296874);

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMaxWidth(260.0);
        columnConstraints6.setMinWidth(10.0);
        columnConstraints6.setPrefWidth(209.20001220703128);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(homeImageView, javafx.geometry.HPos.RIGHT);
        homeImageView.setFitHeight(30.0);
        homeImageView.setFitWidth(30.0);
        homeImageView.setPickOnBounds(true);
        homeImageView.setPreserveRatio(true);
       
        GridPane.setMargin(homeImageView, new Insets(0.0, 20.0, 0.0, 0.0));

        GridPane.setColumnIndex(text, 1);
        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Main Menu");
        text.setFont(Typography.subtitleOneMediumFont);
        mainMenuButton.setGraphic(gridPane0);

        GridPane.setColumnIndex(replayButton, 1);
        GridPane.setRowIndex(replayButton, 2);
        replayButton.setMnemonicParsing(false);
        replayButton.setPrefHeight(50.0);
        replayButton.setPrefWidth(450.0);
        replayButton.setFont(new Font(18.0));

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMaxWidth(211.20001220703125);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(180.799951171875);

        columnConstraints8.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints8.setMaxWidth(254.4000244140625);
        columnConstraints8.setMinWidth(10.0);
        columnConstraints8.setPrefWidth(252.80004882812503);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(retryImageView, javafx.geometry.HPos.RIGHT);
        retryImageView.setFitHeight(30.0);
        retryImageView.setFitWidth(30.0);
        retryImageView.setPickOnBounds(true);
        retryImageView.setPreserveRatio(true);
    
        GridPane.setMargin(retryImageView, new Insets(0.0, 20.0, 0.0, 0.0));

        GridPane.setColumnIndex(text0, 1);
        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Replay");
        text0.setFont(Typography.subtitleOneMediumFont);
        replayButton.setGraphic(gridPane1);

        GridPane.setColumnIndex(watchMovesButton, 1);
        GridPane.setRowIndex(watchMovesButton, 3);
        watchMovesButton.setMnemonicParsing(false);
        watchMovesButton.setPrefHeight(50.0);
        watchMovesButton.setPrefWidth(450.0);
        GridPane.setMargin(watchMovesButton, new Insets(0.0));

        columnConstraints9.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints9.setMaxWidth(211.20001220703125);
        columnConstraints9.setMinWidth(10.0);
        columnConstraints9.setPrefWidth(178.4000244140625);

        columnConstraints10.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints10.setMaxWidth(254.3999755859375);
        columnConstraints10.setMinWidth(10.0);
        columnConstraints10.setPrefWidth(254.3999755859375);

        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(30.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPrefHeight(30.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints9.setMinHeight(10.0);
        rowConstraints9.setPrefHeight(30.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(cameraImageView, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(cameraImageView, 1);
        GridPane.setValignment(cameraImageView, javafx.geometry.VPos.CENTER);
        cameraImageView.setFitHeight(30.0);
        cameraImageView.setFitWidth(30.0);
        cameraImageView.setPickOnBounds(true);
        cameraImageView.setPreserveRatio(true);
       
        GridPane.setMargin(cameraImageView, new Insets(0.0, 20.0, 0.0, 0.0));

        GridPane.setColumnIndex(text1, 1);
        GridPane.setHalignment(text1, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(text1, 1);
        GridPane.setValignment(text1, javafx.geometry.VPos.CENTER);
        text1.setFill(javafx.scene.paint.Color.WHITE);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Watch Moves");
        text1.setFont(Typography.subtitleOneMediumFont);
        
        GridPane.setMargin(text1, new Insets(0.0));
    
        watchMovesButton.setGraphic(gridPane2);

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getColumnConstraints().add(columnConstraints3);
        gridPane.getColumnConstraints().add(columnConstraints4);
        gridPane.getRowConstraints().add(rowConstraints4);
        gridPane.getChildren().add(winnerNameTextView);
        gridPane.getChildren().add(iconLeftImageView);
        gridPane.getChildren().add(iconrightImageView);
        getChildren().add(gridPane);
        gridPane0.getColumnConstraints().add(columnConstraints5);
        gridPane0.getColumnConstraints().add(columnConstraints6);
        gridPane0.getRowConstraints().add(rowConstraints5);
        gridPane0.getChildren().add(homeImageView);
        gridPane0.getChildren().add(text);
        getChildren().add(mainMenuButton);
        gridPane1.getColumnConstraints().add(columnConstraints7);
        gridPane1.getColumnConstraints().add(columnConstraints8);
        gridPane1.getRowConstraints().add(rowConstraints6);
        gridPane1.getChildren().add(retryImageView);
        gridPane1.getChildren().add(text0);
        getChildren().add(replayButton);
        gridPane2.getColumnConstraints().add(columnConstraints9);
        gridPane2.getColumnConstraints().add(columnConstraints10);
        gridPane2.getRowConstraints().add(rowConstraints7);
        gridPane2.getRowConstraints().add(rowConstraints8);
        gridPane2.getRowConstraints().add(rowConstraints9);
        gridPane2.getChildren().add(cameraImageView);
        gridPane2.getChildren().add(text1);
        getChildren().add(watchMovesButton);
        
        
        
        winnerNameTextView.setText(PassData.getInstance().winnerName.get());
        mainMenuButton.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 15px;");
         replayButton.setStyle("-fx-background-color: "+ColorPalette.lightRed+"; -fx-background-radius: 15px;");
         watchMovesButton.setStyle("-fx-background-color: "+ColorPalette.lightYellow+"; -fx-background-radius: 15px;");
           iconLeftImageView.setImage(new Image(ImagesUri.trophy));
           iconrightImageView.setImage(new Image(ImagesUri.trophy));
            homeImageView.setImage(new Image(ImagesUri.home));
            retryImageView.setImage(new Image(ImagesUri.retry));
            cameraImageView.setImage(new Image(ImagesUri.camera));
            actions();
            
          
    }
    
    
    private void actions()
    {
          mainMenuButton.setOnAction((event) -> {
            
              
                 setReturnAndClose("main");
            });
            
            
             replayButton.setOnAction((event) -> {
            
       
                 setReturnAndClose("replay");
            
            });
             
              watchMovesButton.setOnAction((event) -> {
            
              setReturnAndClose("watch moves");

            });
    }
    
    
    private void setReturnAndClose(String dialogReturn)
    {
            PassData.getInstance().dialogReturn.set("");
            PassData.getInstance().dialogReturn.set(dialogReturn);
            Navigation.closePage(this);
    }
}
