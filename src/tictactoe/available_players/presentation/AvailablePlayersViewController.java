package tictactoe.available_players.presentation;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import tictactoe.available_players.domain.model.Player;
import tictactoe.available_players.presentation.dialogs.NoPlayerSelectedDialog;
import tictactoe.available_players.presentation.dialogs.ReceivedRequestDialogViewController;
import tictactoe.available_players.presentation.dialogs.RequestDeniedDialogViewController;
import tictactoe.available_players.presentation.dialogs.SendRequestDialogViewController;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.resources.ImagesUri;
import tictactoe.core.designsystem.resources.StylesUri;

public class AvailablePlayersViewController extends VBox {

    private AvailablePlayersViewModel viewModel = null;
    protected final Button sendRequestBtn;
    protected final Button backBtn;
    protected final Button reloadBtn;
    protected final Label availablePlayerTxt;
    private final ToggleGroup toggleGroup = new ToggleGroup();
    private final VBox radioButtonsContainer;
    private final VBox backButtonBox;
    private final ScrollPane toggleButtonsScrollPane;
    private String selectedPlayer;
    protected final Image backIcon = new Image(getClass().getResourceAsStream(ImagesUri.back));
    protected final Image reloadIcon = new Image(getClass().getResourceAsStream(ImagesUri.retry));
    protected final GridPane headerGridPane = new GridPane();
    private final VBox reloadButtonBox;
    private Button sendRequesBtn;

    public AvailablePlayersViewController(AvailablePlayersViewModel viewModel) {
        this.viewModel = viewModel;
        ImageView backIconView = new ImageView(backIcon);
        backIconView.setFitWidth(50);
        backIconView.setFitHeight(50);
        ImageView reloadIconView = new ImageView(reloadIcon);
        reloadIconView.setFitWidth(50);
        reloadIconView.setFitHeight(50);
        sendRequestBtn = new Button();
        backBtn = new Button();
        reloadBtn = new Button();
        radioButtonsContainer = new VBox();
        backButtonBox = new VBox();
        reloadButtonBox = new VBox();
        toggleButtonsScrollPane = new ScrollPane(radioButtonsContainer);
        availablePlayerTxt = new Label();
        headerGridPane.setPadding(new Insets(10));
        headerGridPane.setHgap(170);
        headerGridPane.addRow(0, backButtonBox, availablePlayerTxt, reloadButtonBox);
        GridPane.setHalignment(availablePlayerTxt, HPos.CENTER);

        setAlignment(javafx.geometry.Pos.CENTER);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setSpacing(10.0);
        setPadding(new Insets(16.0));

        sendRequestBtn.setText("Send Request");
        sendRequestBtn.setCursor(Cursor.HAND);
        sendRequestBtn.setMnemonicParsing(false);
        backIconView.setFitHeight(50);
        backIconView.setFitWidth(50);
        backBtn.setGraphic(backIconView);
        backBtn.setCursor(Cursor.HAND);
        backBtn.setStyle("-fx-background-color: transparent; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        reloadBtn.setGraphic(reloadIconView);
        reloadBtn.setCursor(Cursor.HAND);
        reloadBtn.setStyle("-fx-background-color: -light-red; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        backButtonBox.getChildren().add(backBtn);
        backButtonBox.setAlignment(Pos.CENTER_LEFT);
        reloadButtonBox.getChildren().add(reloadBtn);
        reloadButtonBox.setAlignment(Pos.CENTER_RIGHT);

        availablePlayerTxt.setStyle("-fx-font-size: 28;");
        availablePlayerTxt.setText("Available Players");

        radioButtonsContainer.setAlignment(javafx.geometry.Pos.CENTER);
        radioButtonsContainer.setSpacing(20.0);
        radioButtonsContainer.setPadding(new Insets(30.0));
        radioButtonsContainer.setId("my-vbox");

        toggleButtonsScrollPane.setContent(radioButtonsContainer);
        toggleButtonsScrollPane.setFitToWidth(true);
        toggleButtonsScrollPane.autosize();
        toggleButtonsScrollPane.setMaxSize(300, 600);
        toggleButtonsScrollPane.setMinViewportHeight(400);
        toggleButtonsScrollPane.setHbarPolicy(ScrollBarPolicy.NEVER);
        toggleButtonsScrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);

        getChildren().add(headerGridPane);
        getChildren().add(toggleButtonsScrollPane);
        getChildren().add(sendRequestBtn);

        getStylesheets().addAll(this.getClass().getResource(StylesUri.globalStyle).toExternalForm());
        this.setId("pane");
        setPrefWidth(800);
        setMaxHeight(600);
        sendRequestBtn.setOnAction(((event) -> SendRequest()));
        backBtn.setOnAction((event) -> back());
        reloadBtn.setOnAction((event) -> {
            viewModel.sendRequest("ahmed", "ali");
        });

        initialize();
    }

    public void initialize() {
        viewModel.func();
        viewPlayers();
        checkForRequests();
        getCurrentToggled();

    }

    void SendRequest() {
        SendRequestDialogViewController sendRequestDialog = new SendRequestDialogViewController(sendRequestBtn, selectedPlayer);
        try {
            if (selectedPlayer == null) {
                new NoPlayerSelectedDialog().show();
            } else {
                viewModel.sendRequest("Ahmed", selectedPlayer);
//                sendRequestDialog.show();
//                SimpleObjectProperty<RequestStatus> rs = viewModel.getRequestStatus();
//                rs.addListener((observable, oldValue, newValue) -> {
//                    System.out.println(newValue);
//                    switch (rs.getValue()) {
//                        case ACCEPTED: {
//                            try {
//                                //passPlyersNames2MultiplayerBoard
//                                Navigation.openPage(ViewController.MULTIPLAYERVIEWCONTROLLER, this);
//                            } catch (IOException ex) {
//                                Logger.getLogger(AvailablePlayersViewController.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        }
//                        break;
//                        case REJECTED:
//                            new RequestDeniedDialogViewController().show();
//                            break;
//                        case SENDING: {
//                            try {
//                                sendRequestDialog.show();
//                            } catch (IOException ex) {
//                                Logger.getLogger(AvailablePlayersViewController.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        }
//                        break;
//                    }
//                });

            }
        } catch (Exception ex) {
            Logger.getLogger(AvailablePlayersViewController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void viewPlayers() {
        System.out.println("controller");

        viewModel.getAvailablePlayers().addListener((ListChangeListener.Change<? extends String> change) -> {
            while (change.next()) {
                if (change.wasAdded()) {
                    Platform.runLater(() -> {

                        for (String player : change.getAddedSubList()) {
                            RadioButton radioButton = new RadioButton(player);
                            radioButton.setToggleGroup(toggleGroup);
                            radioButtonsContainer.getChildren().add(radioButton);
                            toggleButtonsScrollPane.setVvalue(viewModel.getAvailablePlayers().size() - 1);
                        }

                    });

                }
            }
        });

    }

    private void getCurrentToggled() {
        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                RadioButton selectedRadioButton = (RadioButton) newValue;
                selectedPlayer = selectedRadioButton.getText();
            }
        });

    }

    private void back() {
        try {
            Navigation.openPage(ViewController.MAINVIEWCONTROLLER, this);
        } catch (IOException ex) {
            Logger.getLogger(AvailablePlayersViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void checkForRequests() {

        viewModel.isHaveRequest().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                Platform.runLater(() -> {
//                    ReceivedRequestDialogViewController receivedRequestDialogViewController = new ReceivedRequestDialogViewController();
                });
            } else {
                // Do something when the boolean property changes to false
                System.out.println(newValue);
            }
        });
    }

    public void observeSenderNamefromRemote() {
        viewModel.getRequestSender().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            Platform.runLater(() -> {
                ReceivedRequestDialogViewController receivedRequestDialogViewController =
                        new ReceivedRequestDialogViewController(newValue);
            });

        });
    }

}
