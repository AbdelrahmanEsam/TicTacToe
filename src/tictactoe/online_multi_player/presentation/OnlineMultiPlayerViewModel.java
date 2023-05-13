package tictactoe.online_multi_player.presentation;

import java.util.LinkedList;
import java.util.Queue;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.util.Pair;
import tictactoe.core.Remote;

public class OnlineMultiPlayerViewModel {

    private Remote remote;
    private int board[][] = new int[3][3];
    private SimpleIntegerProperty boardNotifier = new SimpleIntegerProperty();
    private SimpleStringProperty winnerName = new SimpleStringProperty();
    private SimpleIntegerProperty playerOneSymbol = new SimpleIntegerProperty();
    private SimpleIntegerProperty playerTwoSymbol = new SimpleIntegerProperty();
    private SimpleStringProperty playerOneName = new SimpleStringProperty();
    private SimpleStringProperty playerTwoName = new SimpleStringProperty();
    private SimpleIntegerProperty playerOneScore = new SimpleIntegerProperty();
    private SimpleIntegerProperty playerTwoScore = new SimpleIntegerProperty();
    private SimpleIntegerProperty turnNotifier = new SimpleIntegerProperty();
    private SimpleIntegerProperty numberOfPlayedMoves = new SimpleIntegerProperty();
    private SimpleStringProperty denied = new SimpleStringProperty();

    private Queue<Pair<Integer, Integer>> watchMovesQueue = new LinkedList();
    private boolean requestSent = false;
     private SimpleStringProperty replayRequest = new SimpleStringProperty();
    private SimpleStringProperty replayResponse = new SimpleStringProperty();

    public SimpleStringProperty getReplayResponse() {
        return replayResponse;
    }

    public void setReplayResponse(SimpleStringProperty replayResponse) {
        this.replayResponse = replayResponse;
    }
    public SimpleStringProperty getReplayRequest() {
        return replayRequest;
    }

    public Queue<Pair<Integer, Integer>> getWatchMovesQueue() {
        return watchMovesQueue;
    }

    public boolean isRequestSent() {
        return requestSent;
    }

    //todo connect the server and everything will work perfectlly
    public OnlineMultiPlayerViewModel(Remote remote) {

        this.remote = remote;
        boardNotifier.set(1);
        winnerName.set("");

        //listeners to the remote class
        listenToMoveResponse();
        listenToGameResult();
        listenToReplayRequest();
        observeReplayResponse();

    }

    public SimpleIntegerProperty getTurnNotifier() {

        return turnNotifier;

    }

    public void setTurnNotifier(int turnNotifier) {
        this.turnNotifier.set(turnNotifier);
    }

    public SimpleIntegerProperty getBoardNotifier() {

        return boardNotifier;

    }

    public void setPlayerOneName(String name) {

        playerOneName.set(name);
    }

    public void setPlayerTwoName(String name) {
        playerTwoName.set(name);
    }

    public SimpleStringProperty getPlayerOneName() {

        return playerOneName;

    }

    public SimpleStringProperty getPlayerTwoName() {

        return playerTwoName;

    }

    public SimpleStringProperty getWinnerName() {

        return winnerName;

    }

    public void resetWinnerName() {

        winnerName.set("");

    }

    public SimpleIntegerProperty getPlayerOneSymbol() {
        return playerOneSymbol;

    }

    public void setPlayerOneSymbol(int value) {
        playerOneSymbol.set(value);

    }

    public void setPlayerTwoSymbol(int value) {
        playerTwoSymbol.set(value);

    }

    public SimpleIntegerProperty getPlayerTwoSymbol() {
        return playerTwoSymbol;

    }

    public SimpleIntegerProperty getPlayerOneScore() {
        return playerOneScore;

    }

    public SimpleIntegerProperty getPlayerTwoScore() {
        return playerTwoScore;

    }

    public void setBoard(int row, int column) {

        if (board[row][column] != 0 || !winnerName.get().isEmpty()) {
            return;
        }

        if (turnNotifier.get() == playerOneSymbol.get()) {
            setXorO(row, column, playerOneSymbol.get());
            sendMoveRequest(row, column);
            turnNotifier.set(playerTwoSymbol.get());
        } else {
            setXorO(row, column, playerTwoSymbol.get());
            turnNotifier.set(playerOneSymbol.get());
        }
        boardNotifier.set(boardNotifier.get() + 1);
        checkWinner();

    }

    public int[][] getBoard() {

        return board;

    }

    private void setXorO(int row, int column, int playerSymbol) {
        board[row][column] = playerSymbol;
        numberOfPlayedMoves.set(numberOfPlayedMoves.get() + 1);
    }

    private void checkWinner() {
        // rows checker
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != 0) {
                setWinnerName(row, 0);
                return;
            }
        }
        // columns checker
        for (int column = 0; column < 3; column++) {
            if (board[0][column] == board[1][column] && board[1][column] == board[2][column] && board[0][column] != 0) {
                setWinnerName(0, column);
                return;
            }
        }

        //  diagonals checkers
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) {
            setWinnerName(0, 0);
            return;
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0) {
            setWinnerName(0, 2);
            return;
        }

        if (numberOfPlayedMoves.get() == 9 && winnerName.get().isEmpty()) {
            sendWinnerRequest("draw");
        }
    }

    private void setWinnerName(int row, int column) {
        if (board[row][column] == playerOneSymbol.get()) {
            sendWinnerRequest(playerOneName.get());
        } else {
            sendWinnerRequest(playerTwoName.get());
        }

    }

    public void swapSymbols() {
        int temp = playerOneSymbol.get();
        playerOneSymbol.set(playerTwoSymbol.get());
        playerTwoSymbol.set(temp);
    }

    void resetBorad() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                board[row][column] = 0;
            }
        }
        winnerName.setValue("");
        numberOfPlayedMoves.set(0);

    }

    private void sendMoveRequest(int row, int column) {
        remote.sendGameMoveRequest(playerTwoName.get(), row, column);
    }

    private void sendWinnerRequest(String result) {
        if (playerOneName.get().equals(result) || result.equals("draw")) {
            remote.sendGameResultRequest(playerOneName.get(),
                    playerTwoName.get(), result);
        }
    }

    private void listenToMoveResponse() {
        remote.getGameMoveResponse().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            String[] splitedResponse = newValue.split(" ");
            setBoard(Integer.valueOf(splitedResponse[0]), Integer.valueOf(splitedResponse[1]));

        });

    }

    private void listenToGameResult() {

        remote.getGameResultResponse().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.isEmpty()) {
                winnerName.set(newValue);
                if (playerOneName.get().equals(newValue)) {

                    playerOneScore.set(playerOneScore.get() + 1);

                } else if (playerTwoName.get().equals(newValue)) {
                    playerTwoScore.set(playerTwoScore.get() + 1);
                }
            }
        });

    }
    private void listenToReplayRequest(){
    remote.getReplayRequest().addListener((observable, oldValue, newValue) -> {
        replayRequest.set(newValue);
    });
    }
    protected void sendReplayRequest() {
        remote.sendReplayRequest(playerOneName.get(), playerTwoName.get());
    }

    public  void sendReplayResponse(String response) {
    remote.replayResponse(response);
    }
    
    private void observeReplayResponse()
    {
    remote.getReplayResponse().addListener((observable, oldValue, newValue) -> {
        replayResponse.set(newValue);
    });
    
    }

}
