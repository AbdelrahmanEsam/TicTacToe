package tictactoe.online_multi_player.presentation;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ArrayChangeListener;
import javafx.collections.ObservableIntegerArray;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Separator;
import javafx.scene.effect.Blend;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import tictactoe.core.Navigation;
import tictactoe.core.PassData;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.Typography;
import tictactoe.core.designsystem.resources.ImagesUri;
import tictactoe.online_multi_player.presentation.menu_dialog.DialogBox;
import tictactoe.online_multi_player.presentation.menu_dialog.MenuDialogController;

public  class OnlineViewController extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints1;
    protected final Text titleTextView;
    protected final Blend blend;
    protected final ImageView backImageView;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints2;
    protected final GridPane gridPane2;
    protected final ColumnConstraints columnConstraints5;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final Text firstPlayerName1;
    protected final ImageView firstPlayerSymbolImageView1;
    protected final GridPane gridPane3;
    protected final ColumnConstraints columnConstraints6;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final Text firstPlayerName;
    protected final ImageView secondPlayerSymbolImageView;
    protected final GridPane gridPane4;
    protected final ColumnConstraints columnConstraints7;
    protected final ColumnConstraints columnConstraints8;
    protected final ColumnConstraints columnConstraints9;
    protected final ColumnConstraints columnConstraints10;
    protected final ColumnConstraints columnConstraints11;
    protected final RowConstraints rowConstraints9;
    protected final RowConstraints rowConstraints10;
    protected final RowConstraints rowConstraints11;
    protected final RowConstraints rowConstraints12;
    protected final ImageView secondPlaceImageView;
    protected final ImageView firstPlaceImageView;
    protected final ImageView fourthPlaceImageView;
    protected final ImageView fifthPlaceImageView;
    protected final ImageView sevenPlaceImageView;
    protected final ImageView eightPlaceImageView;
    protected final ImageView thirdPlaceImageView;
    protected final ImageView sixthPlaceImageView;
    protected final ImageView ninethPlaceImageView;
    protected final Text text;
    protected final GridPane gridPane5;
    protected final ColumnConstraints columnConstraints12;
    protected final RowConstraints rowConstraints13;
    protected final RowConstraints rowConstraints14;
    protected final RowConstraints rowConstraints15;
    protected final RowConstraints rowConstraints16;
    protected final RowConstraints rowConstraints17;
    protected final Text playerOneNameScoreTextView;
    protected final Text playerOneScoreTextView;
    protected final Separator separator;
    protected final Text playerTwoNameScoreTextView;
    protected final Text playerTwoScoreTextView;
    private ImageView imageViews[][] = new ImageView[3][3];

      OnlineViewModel viewModel ;
    public OnlineViewController(OnlineViewModel viewModel) {
        this.viewModel = viewModel;
      
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        gridPane0 = new GridPane();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints1 = new RowConstraints();
        titleTextView = new Text();
        blend = new Blend();
        backImageView = new ImageView();
        gridPane1 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        gridPane2 = new GridPane();
        columnConstraints5 = new ColumnConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        firstPlayerName1 = new Text();
        firstPlayerSymbolImageView1 = new ImageView();
        gridPane3 = new GridPane();
        columnConstraints6 = new ColumnConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        rowConstraints8 = new RowConstraints();
        firstPlayerName = new Text();
        secondPlayerSymbolImageView = new ImageView();
        gridPane4 = new GridPane();
        columnConstraints7 = new ColumnConstraints();
        columnConstraints8 = new ColumnConstraints();
        columnConstraints9 = new ColumnConstraints();
        columnConstraints10 = new ColumnConstraints();
        columnConstraints11 = new ColumnConstraints();
        rowConstraints9 = new RowConstraints();
        rowConstraints10 = new RowConstraints();
        rowConstraints11 = new RowConstraints();
        rowConstraints12 = new RowConstraints();
        secondPlaceImageView = new ImageView();
        firstPlaceImageView = new ImageView();
        fourthPlaceImageView = new ImageView();
        fifthPlaceImageView = new ImageView();
        sevenPlaceImageView = new ImageView();
        eightPlaceImageView = new ImageView();
        thirdPlaceImageView = new ImageView();
        sixthPlaceImageView = new ImageView();
        ninethPlaceImageView = new ImageView();
        text = new Text();
        gridPane5 = new GridPane();
        columnConstraints12 = new ColumnConstraints();
        rowConstraints13 = new RowConstraints();
        rowConstraints14 = new RowConstraints();
        rowConstraints15 = new RowConstraints();
        rowConstraints16 = new RowConstraints();
        rowConstraints17 = new RowConstraints();
        playerOneNameScoreTextView = new Text();
        playerOneScoreTextView = new Text();
        separator = new Separator();
        playerTwoNameScoreTextView = new Text();
        playerTwoScoreTextView = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setStyle("-fx-background-color: #FFB048;");

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setPrefHeight(190.0);
        gridPane.setPrefWidth(599.0);
        gridPane.setStyle("-fx-background-color: #ffffff;");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPane0.setPrefHeight(60.0);
        gridPane0.setPrefWidth(600.0);
        gridPane0.setStyle("-fx-background-color: #ffffff;");

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(titleTextView, 1);
        GridPane.setHalignment(titleTextView, javafx.geometry.HPos.CENTER);
        titleTextView.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        titleTextView.setStrokeWidth(0.0);
        titleTextView.setText("Multi Player");
        titleTextView.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        titleTextView.setTextOrigin(javafx.geometry.VPos.CENTER);
        titleTextView.setFont(new Font(32.0));

        blend.setOpacity(0.0);
        titleTextView.setEffect(blend);

        GridPane.setHalignment(backImageView, javafx.geometry.HPos.LEFT);
        GridPane.setValignment(backImageView, javafx.geometry.VPos.CENTER);
        backImageView.setFitHeight(30.0);
        backImageView.setFitWidth(30.0);
        backImageView.setPickOnBounds(true);
        backImageView.setPreserveRatio(true);
        GridPane.setMargin(backImageView, new Insets(0.0, 0.0, 0.0, 20.0));
        backImageView.setImage(new Image(ImagesUri.back));

        GridPane.setRowIndex(gridPane1, 1);
        gridPane1.setPrefHeight(101.0);
        gridPane1.setPrefWidth(599.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPane2.setStyle("-fx-background-color: #ffffff;");

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(100.0);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMaxHeight(47.1999855041504);
        rowConstraints4.setMinHeight(0.0);
        rowConstraints4.setPrefHeight(0.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMaxHeight(65.6);
        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(65.6);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(firstPlayerName1, javafx.geometry.HPos.CENTER);
        firstPlayerName1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstPlayerName1.setStrokeWidth(0.0);
        firstPlayerName1.setText("player 1");
      

        GridPane.setHalignment(firstPlayerSymbolImageView1, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(firstPlayerSymbolImageView1, 2);
        GridPane.setValignment(firstPlayerSymbolImageView1, javafx.geometry.VPos.CENTER);
        firstPlayerSymbolImageView1.setFitHeight(30.0);
        firstPlayerSymbolImageView1.setFitWidth(30.0);
        firstPlayerSymbolImageView1.setPickOnBounds(true);
        firstPlayerSymbolImageView1.setPreserveRatio(true);
        firstPlayerSymbolImageView1.setImage(new Image(ImagesUri.emptyEnabled));

        GridPane.setColumnIndex(gridPane3, 1);
        gridPane3.setStyle("-fx-background-color: #ffffff;");

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMinWidth(10.0);
        columnConstraints6.setPrefWidth(100.0);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMaxHeight(27.600008392333983);
        rowConstraints7.setMinHeight(0.0);
        rowConstraints7.setPrefHeight(0.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMaxHeight(64.79999999999998);
        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPrefHeight(64.79999999999998);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(firstPlayerName, javafx.geometry.HPos.CENTER);
        firstPlayerName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstPlayerName.setStrokeWidth(0.0);
        firstPlayerName.setText("player 2");
        firstPlayerName.setFont(new Font(18.0));

        GridPane.setHalignment(secondPlayerSymbolImageView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(secondPlayerSymbolImageView, 2);
        secondPlayerSymbolImageView.setFitHeight(30.0);
        secondPlayerSymbolImageView.setFitWidth(30.0);
        secondPlayerSymbolImageView.setPickOnBounds(true);
        secondPlayerSymbolImageView.setPreserveRatio(true);
        secondPlayerSymbolImageView.setImage(new Image(ImagesUri.emptyEnabled));
        setTop(gridPane);

        BorderPane.setAlignment(gridPane4, javafx.geometry.Pos.CENTER);
        gridPane4.setMinWidth(USE_PREF_SIZE);
        gridPane4.setStyle("-fx-background-color: #ffffff;");

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(100.0);

        columnConstraints8.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints8.setMinWidth(10.0);
        columnConstraints8.setPrefWidth(100.0);

        columnConstraints9.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints9.setMinWidth(10.0);
        columnConstraints9.setPrefWidth(100.0);

        columnConstraints10.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints10.setMinWidth(10.0);
        columnConstraints10.setPrefWidth(100.0);

        columnConstraints11.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints11.setMinWidth(10.0);
        columnConstraints11.setPrefWidth(100.0);

        rowConstraints9.setMaxHeight(164.99998321533204);
        rowConstraints9.setMinHeight(10.0);
        rowConstraints9.setPrefHeight(123.99998626708984);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints10.setMaxHeight(217.4);
        rowConstraints10.setMinHeight(10.0);
        rowConstraints10.setPrefHeight(118.99998779296874);
        rowConstraints10.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints11.setMaxHeight(217.59999999999997);
        rowConstraints11.setMinHeight(10.0);
        rowConstraints11.setPrefHeight(111.20002441406251);
        rowConstraints11.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints12.setMaxHeight(103.60001220703123);
        rowConstraints12.setMinHeight(0.0);
        rowConstraints12.setPrefHeight(77.5999755859375);
        rowConstraints12.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(secondPlaceImageView, 2);
        GridPane.setHalignment(secondPlaceImageView, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(secondPlaceImageView, javafx.geometry.VPos.CENTER);
        secondPlaceImageView.setFitHeight(100.0);
        secondPlaceImageView.setFitWidth(100.0);
        secondPlaceImageView.setPickOnBounds(true);
        secondPlaceImageView.setPreserveRatio(true);
        secondPlaceImageView.setImage(new Image(ImagesUri.emptyEnabled));

        GridPane.setColumnIndex(firstPlaceImageView, 1);
        GridPane.setHalignment(firstPlaceImageView, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(firstPlaceImageView, javafx.geometry.VPos.CENTER);
        firstPlaceImageView.setFitHeight(100.0);
        firstPlaceImageView.setFitWidth(100.0);
        firstPlaceImageView.setPickOnBounds(true);
        firstPlaceImageView.setPreserveRatio(true);
        firstPlaceImageView.setImage(new Image(ImagesUri.emptyEnabled));

        GridPane.setColumnIndex(fourthPlaceImageView, 1);
        GridPane.setHalignment(fourthPlaceImageView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(fourthPlaceImageView, 1);
        GridPane.setValignment(fourthPlaceImageView, javafx.geometry.VPos.CENTER);
        fourthPlaceImageView.setFitHeight(100.0);
        fourthPlaceImageView.setFitWidth(100.0);
        fourthPlaceImageView.setPickOnBounds(true);
        fourthPlaceImageView.setPreserveRatio(true);
        fourthPlaceImageView.setImage(new Image(ImagesUri.emptyEnabled));

        GridPane.setColumnIndex(fifthPlaceImageView, 2);
        GridPane.setHalignment(fifthPlaceImageView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(fifthPlaceImageView, 1);
        GridPane.setValignment(fifthPlaceImageView, javafx.geometry.VPos.CENTER);
        fifthPlaceImageView.setFitHeight(100.0);
        fifthPlaceImageView.setFitWidth(100.0);
        fifthPlaceImageView.setPickOnBounds(true);
        fifthPlaceImageView.setPreserveRatio(true);
        fifthPlaceImageView.setImage(new Image(ImagesUri.emptyEnabled));

        GridPane.setColumnIndex(sevenPlaceImageView, 1);
        GridPane.setHalignment(sevenPlaceImageView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(sevenPlaceImageView, 2);
        GridPane.setValignment(sevenPlaceImageView, javafx.geometry.VPos.CENTER);
        sevenPlaceImageView.setFitHeight(100.0);
        sevenPlaceImageView.setFitWidth(100.0);
        sevenPlaceImageView.setPickOnBounds(true);
        sevenPlaceImageView.setPreserveRatio(true);
        sevenPlaceImageView.setImage(new Image(ImagesUri.emptyEnabled));

        GridPane.setColumnIndex(eightPlaceImageView, 2);
        GridPane.setHalignment(eightPlaceImageView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(eightPlaceImageView, 2);
        GridPane.setValignment(eightPlaceImageView, javafx.geometry.VPos.CENTER);
        eightPlaceImageView.setFitHeight(100.0);
        eightPlaceImageView.setFitWidth(100.0);
        eightPlaceImageView.setPickOnBounds(true);
        eightPlaceImageView.setPreserveRatio(true);
        eightPlaceImageView.setImage(new Image(ImagesUri.emptyEnabled));

        GridPane.setColumnIndex(thirdPlaceImageView, 3);
        GridPane.setHalignment(thirdPlaceImageView, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(thirdPlaceImageView, javafx.geometry.VPos.CENTER);
        thirdPlaceImageView.setFitHeight(100.0);
        thirdPlaceImageView.setFitWidth(100.0);
        thirdPlaceImageView.setPickOnBounds(true);
        thirdPlaceImageView.setPreserveRatio(true);
        thirdPlaceImageView.setImage(new Image(ImagesUri.emptyEnabled));

        GridPane.setColumnIndex(sixthPlaceImageView, 3);
        GridPane.setHalignment(sixthPlaceImageView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(sixthPlaceImageView, 1);
        GridPane.setValignment(sixthPlaceImageView, javafx.geometry.VPos.CENTER);
        sixthPlaceImageView.setFitHeight(100.0);
        sixthPlaceImageView.setFitWidth(100.0);
        sixthPlaceImageView.setPickOnBounds(true);
        sixthPlaceImageView.setPreserveRatio(true);
        sixthPlaceImageView.setImage(new Image(ImagesUri.emptyEnabled));

        GridPane.setColumnIndex(ninethPlaceImageView, 3);
        GridPane.setHalignment(ninethPlaceImageView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(ninethPlaceImageView, 2);
        GridPane.setValignment(ninethPlaceImageView, javafx.geometry.VPos.CENTER);
        ninethPlaceImageView.setFitHeight(100.0);
        ninethPlaceImageView.setFitWidth(100.0);
        ninethPlaceImageView.setPickOnBounds(true);
        ninethPlaceImageView.setPreserveRatio(true);
        ninethPlaceImageView.setImage(new Image(ImagesUri.emptyEnabled));

        GridPane.setColumnIndex(text, 4);
        GridPane.setHalignment(text, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(text, javafx.geometry.VPos.BOTTOM);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Score");
        text.setFont(new Font(30.0));
        GridPane.setMargin(text, new Insets(0.0, 0.0, 10.0, 0.0));

        GridPane.setColumnIndex(gridPane5, 4);
        GridPane.setRowIndex(gridPane5, 1);
        gridPane5.setStyle("-fx-background-color: #ffffff;");

        columnConstraints12.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints12.setMinWidth(10.0);
        columnConstraints12.setPrefWidth(100.0);

        rowConstraints13.setMaxHeight(41.19998779296875);
        rowConstraints13.setMinHeight(10.0);
        rowConstraints13.setPrefHeight(26.19998779296875);
        rowConstraints13.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints14.setMaxHeight(67.20001831054688);
        rowConstraints14.setMinHeight(10.0);
        rowConstraints14.setPrefHeight(36.60001220703125);
        rowConstraints14.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints15.setMaxHeight(71.40001220703125);
        rowConstraints15.setMinHeight(0.0);
        rowConstraints15.setPrefHeight(0.0);
        rowConstraints15.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints16.setMaxHeight(58.79999389648438);
        rowConstraints16.setMinHeight(5.4000183105468835);
        rowConstraints16.setPrefHeight(34.99999999999999);
        rowConstraints16.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints17.setMaxHeight(58.79999389648438);
        rowConstraints17.setMinHeight(10.0);
        rowConstraints17.setPrefHeight(23.000012207031247);
        rowConstraints17.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(playerOneNameScoreTextView, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(playerOneNameScoreTextView, javafx.geometry.VPos.TOP);
        playerOneNameScoreTextView.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneNameScoreTextView.setStrokeWidth(0.0);
        playerOneNameScoreTextView.setText("player 1");
        playerOneNameScoreTextView.setFont(new Font(18.0));

        GridPane.setHalignment(playerOneScoreTextView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(playerOneScoreTextView, 1);
        GridPane.setValignment(playerOneScoreTextView, javafx.geometry.VPos.TOP);
        playerOneScoreTextView.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneScoreTextView.setStrokeWidth(0.0);
        playerOneScoreTextView.setText("0");
        playerOneScoreTextView.setFont(new Font(16.0));

        GridPane.setRowIndex(separator, 2);
        GridPane.setValignment(separator, javafx.geometry.VPos.TOP);
        separator.setStyle("-fx-background-color: #ADADAD;");
        GridPane.setMargin(separator, new Insets(0.0, 10.0, 0.0, 10.0));

        GridPane.setHalignment(playerTwoNameScoreTextView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(playerTwoNameScoreTextView, 3);
        GridPane.setValignment(playerTwoNameScoreTextView, javafx.geometry.VPos.BOTTOM);
        playerTwoNameScoreTextView.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoNameScoreTextView.setStrokeWidth(0.0);
        playerTwoNameScoreTextView.setText("player 2");
        playerTwoNameScoreTextView.setFont(new Font(18.0));

        GridPane.setHalignment(playerTwoScoreTextView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(playerTwoScoreTextView, 4);
        GridPane.setValignment(playerTwoScoreTextView, javafx.geometry.VPos.BOTTOM);
        playerTwoScoreTextView.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoScoreTextView.setStrokeWidth(0.0);
        playerTwoScoreTextView.setText("0");
        playerTwoScoreTextView.setFont(new Font(16.0));
        setCenter(gridPane4);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane0.getColumnConstraints().add(columnConstraints0);
        gridPane0.getColumnConstraints().add(columnConstraints1);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints1);
        gridPane0.getChildren().add(titleTextView);
        gridPane0.getChildren().add(backImageView);
        gridPane.getChildren().add(gridPane0);
        gridPane1.getColumnConstraints().add(columnConstraints3);
        gridPane1.getColumnConstraints().add(columnConstraints4);
        gridPane1.getRowConstraints().add(rowConstraints2);
        gridPane2.getColumnConstraints().add(columnConstraints5);
        gridPane2.getRowConstraints().add(rowConstraints3);
        gridPane2.getRowConstraints().add(rowConstraints4);
        gridPane2.getRowConstraints().add(rowConstraints5);
        gridPane2.getChildren().add(firstPlayerName1);
        gridPane2.getChildren().add(firstPlayerSymbolImageView1);
        gridPane1.getChildren().add(gridPane2);
        gridPane3.getColumnConstraints().add(columnConstraints6);
        gridPane3.getRowConstraints().add(rowConstraints6);
        gridPane3.getRowConstraints().add(rowConstraints7);
        gridPane3.getRowConstraints().add(rowConstraints8);
        gridPane3.getChildren().add(firstPlayerName);
        gridPane3.getChildren().add(secondPlayerSymbolImageView);
        gridPane1.getChildren().add(gridPane3);
        gridPane.getChildren().add(gridPane1);
        gridPane4.getColumnConstraints().add(columnConstraints7);
        gridPane4.getColumnConstraints().add(columnConstraints8);
        gridPane4.getColumnConstraints().add(columnConstraints9);
        gridPane4.getColumnConstraints().add(columnConstraints10);
        gridPane4.getColumnConstraints().add(columnConstraints11);
        gridPane4.getRowConstraints().add(rowConstraints9);
        gridPane4.getRowConstraints().add(rowConstraints10);
        gridPane4.getRowConstraints().add(rowConstraints11);
        gridPane4.getRowConstraints().add(rowConstraints12);
        gridPane4.getChildren().add(secondPlaceImageView);
        gridPane4.getChildren().add(firstPlaceImageView);
        gridPane4.getChildren().add(fourthPlaceImageView);
        gridPane4.getChildren().add(fifthPlaceImageView);
        gridPane4.getChildren().add(sevenPlaceImageView);
        gridPane4.getChildren().add(eightPlaceImageView);
        gridPane4.getChildren().add(thirdPlaceImageView);
        gridPane4.getChildren().add(sixthPlaceImageView);
        gridPane4.getChildren().add(ninethPlaceImageView);
        gridPane4.getChildren().add(text);
        gridPane5.getColumnConstraints().add(columnConstraints12);
        gridPane5.getRowConstraints().add(rowConstraints13);
        gridPane5.getRowConstraints().add(rowConstraints14);
        gridPane5.getRowConstraints().add(rowConstraints15);
        gridPane5.getRowConstraints().add(rowConstraints16);
        gridPane5.getRowConstraints().add(rowConstraints17);
        gridPane5.getChildren().add(playerOneNameScoreTextView);
        gridPane5.getChildren().add(playerOneScoreTextView);
        gridPane5.getChildren().add(separator);
        gridPane5.getChildren().add(playerTwoNameScoreTextView);
        gridPane5.getChildren().add(playerTwoScoreTextView);
        gridPane4.getChildren().add(gridPane5);
        
        titleTextView.setFont(Typography.headerBoldFont);
        playerOneNameScoreTextView.setFont(Typography.subtitleTwoRegularFont);
          firstPlayerName1.setFont(Typography.subtitleOneRegularFont);
          firstPlayerName.setFont(Typography.subtitleOneRegularFont);
          playerOneNameScoreTextView.setFont(Typography.subtitleOneRegularFont);
          playerTwoNameScoreTextView.setFont(Typography.subtitleOneRegularFont);
          
          playerOneScoreTextView.setFont(Typography.BodyOneRegularFont);
          playerTwoScoreTextView.setFont(Typography.BodyOneRegularFont);
        
          
            imageViews[0][0] = firstPlaceImageView;
            imageViews[0][1] = secondPlaceImageView;
            imageViews[0][2] = thirdPlaceImageView;
            imageViews[1][0] = fourthPlaceImageView;
            imageViews[1][1] = fifthPlaceImageView;
            imageViews[1][2] = sixthPlaceImageView;
            imageViews[2][0]= sevenPlaceImageView;
            imageViews[2][1] = eightPlaceImageView;
            imageViews[2][2] = ninethPlaceImageView;
     
        
        boardSetters();
      properitiesObservers();
      init();

    }
    
    
    private void init()
    {
    
     
        viewModel.setPlayerOneSymbol(1);
          viewModel.setPlayerTwoSymbol(2);
           viewModel.setPlayerOneName("ahmed");
          viewModel.setPlayerTwoName("ali");
    
    }
    
    
    private void boardSetters()
    {
        
          backImageView.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {    
              try {
                  Navigation.openPage(ViewController.MAINVIEWCONTROLLER, this);
              } catch (IOException ex) {
                  Logger.getLogger(OnlineViewController.class.getName()).log(Level.SEVERE, null, ex);
              }
             
    }); 
    
       firstPlaceImageView.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {    
             viewModel.setBoard(0,0);
    }); 
    
    
       secondPlaceImageView.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {    
             viewModel.setBoard(0,1);
    }); 
       
          thirdPlaceImageView.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {    
             viewModel.setBoard(0,2);
    }); 
          
          
             fourthPlaceImageView.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {    
             viewModel.setBoard(1,0);
    }); 
             
                fifthPlaceImageView.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {    
             viewModel.setBoard(1,1);
    }); 
                
                   sixthPlaceImageView.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {    
             viewModel.setBoard(1,2);
    }); 
                   
                      sevenPlaceImageView.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {    
             viewModel.setBoard(2,0);
    }); 
                      
                         eightPlaceImageView.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {    
             viewModel.setBoard(2,1);
    }); 
                         
             ninethPlaceImageView.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {    
             viewModel.setBoard(2,2);
    }); 
             
             
    
    }
    
    
    private void properitiesObservers()
    {
    
    
       viewModel.boardNotifier.addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
           int [][] board = viewModel.getBoard();
           System.out.println(board[0][1]);
           for(int row = 0 ; row < 3 ; row++){
               for(int column = 0 ; column < 3 ; column++)
               {
                   ImageView imageView = imageViews[row][column];
                   if(board[row][column] == 1){
                       imageView.setImage(new Image(ImagesUri.xWithBackground));
                   }else if (board[row][column] == 2){
                       imageView.setImage(new Image(ImagesUri.oWithBackground));
                   }
               }
           }
       });
       
       
      viewModel.getWinnerName().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
    
          System.out.println(newValue);
          if(!newValue.isEmpty())PassData.getInstance().winnerName.set(newValue);
           try {
               if(!newValue.isEmpty()) Navigation.openPage(ViewController.WINNERDIALOGCNTROLLER, null);
           } catch (IOException ex) {
               Logger.getLogger(OnlineViewController.class.getName()).log(Level.SEVERE, null, ex);
           }
       });
      
      
       PassData.getInstance().dialogReturn.addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {

            try {

                 switch(newValue){
           
               case "main":{
                 Navigation.openPage(ViewController.MAINVIEWCONTROLLER, this);
                   break;
               }
               
               case "replay":{
                 
                   resetBoard();
                   viewModel.swapNames();
                     break;
               }
               
               
               case "watch moves":
               {
                  
                 break;
               }
           
           } 
               } catch (IOException ex) {
                   Logger.getLogger(OnlineViewController.class.getName()).log(Level.SEVERE, null, ex);
               }
          
       });
       
     viewModel.getPlayerOneName().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
         firstPlayerName1.setText(newValue);
         playerOneNameScoreTextView.setText(newValue);
       });
     
      viewModel.getPlayerTwoName().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
         
         firstPlayerName.setText(newValue);
         playerTwoNameScoreTextView.setText(newValue);
       });
      
      
         viewModel.getPlayerOneSymbol().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
             if(newValue.intValue() == 1)
             {
                 firstPlayerSymbolImageView1.setImage(new Image(ImagesUri.x));
             }else{
                firstPlayerSymbolImageView1.setImage(new Image(ImagesUri.o));
             }
            
       });
         
         
          viewModel.getPlayerTwoSymbol().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
             if(newValue.intValue() == 1)
             {
                 secondPlayerSymbolImageView.setImage(new Image(ImagesUri.x));
             }else{
                secondPlayerSymbolImageView.setImage(new Image(ImagesUri.o));
             }
            
       });
         
         
           viewModel.getPlayerOneScore().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
        
            playerOneScoreTextView.setText(newValue.toString());
            
       });
           
           
             viewModel.getPlayerTwoScore().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
        
           playerTwoScoreTextView.setText(newValue.toString());
            
       });
      
      
      
      
      
    
    
    }
    
    
    private void resetBoard()
    {
               for(int row = 0 ; row < 3 ; row++){
               for(int column = 0 ; column < 3 ; column++)
               {
                   ImageView imageView = imageViews[row][column];
                       imageView.setImage(new Image(ImagesUri.emptyEnabled));
               }
           }
               
               viewModel.resetBorad();
    
    }
}
