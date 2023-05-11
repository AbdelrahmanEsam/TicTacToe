package tictactoe.online_multi_player.presentation;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class OnlineViewModel {
    
    private int  board [][] =  new int [3][3];
   private SimpleIntegerProperty boardNotifier = new SimpleIntegerProperty();
   private SimpleStringProperty winnerName = new SimpleStringProperty();
   private SimpleIntegerProperty playerOneSymbol = new SimpleIntegerProperty();
   private SimpleIntegerProperty playerTwoSymbol = new SimpleIntegerProperty();
   private SimpleStringProperty playerOneName = new SimpleStringProperty();
   private SimpleStringProperty playerTwoName = new SimpleStringProperty();
   private SimpleIntegerProperty playerOneScore = new SimpleIntegerProperty();
   private SimpleIntegerProperty playerTwoScore = new SimpleIntegerProperty();
   private SimpleIntegerProperty turnNotifier = new SimpleIntegerProperty(); 
    
   
   
   
   
   //todo connect the server and everything will work perfectlly
    
    public OnlineViewModel()
    {
   
       boardNotifier.set(1);
       winnerName.set("");
       turnNotifier.set(1);
 
  
    }
    
    
    public SimpleIntegerProperty getTurnNotifier()
    {
    
        return turnNotifier;
    
    }
    
    
    
    
    public SimpleIntegerProperty getBoardNotifier()
    {
    
        return boardNotifier;
    
    }
    
    
     
    
   
    
    public void setPlayerOneName(String name)
    {
    
       playerOneName.set(name);
    }
    
     public void setPlayerTwoName(String name)
    {
       playerTwoName.set(name);
    }
     
     
     public SimpleStringProperty getPlayerOneName()
     {
     
         return playerOneName;
     
     }
     
      public SimpleStringProperty getPlayerTwoName()
     {
     
         return playerTwoName;
     
     }
      
       public SimpleStringProperty getWinnerName()
     {
     
         return winnerName;
     
     }
       
         public void resetWinnerName()
     {
     
        winnerName.set("");
     
     }
      
      public SimpleIntegerProperty getPlayerOneSymbol()
      {
          return playerOneSymbol;
      
      }
      
      
      public void setPlayerOneSymbol(int value)
      {
           playerOneSymbol.set(value);
      
      }
      
      
       public void setPlayerTwoSymbol(int value)
      {
           playerTwoSymbol.set(value);
      
      }

      
       public SimpleIntegerProperty getPlayerTwoSymbol()
      {
          return playerTwoSymbol;
      
      }
       
      
        public SimpleIntegerProperty getPlayerOneScore()
      {
          return playerOneScore;
      
      }
        
        
         public SimpleIntegerProperty getPlayerTwoScore()
      {
          return playerTwoScore;
      
      }
       
       
    public void setBoard(int row , int column)
    {
      
        if(board[row][column]!= 0 || !winnerName.get().isEmpty() || turnNotifier.get() != 1) return;
        
        
        if(turnNotifier.get() == 1)
        {
           setXorO(row , column ,playerOneSymbol.get());
           turnNotifier.set(2);
        }else
        {
          setXorO(row, column,playerTwoSymbol.get());
          turnNotifier.set(1);
        }
         boardNotifier.set(boardNotifier.get()+1);
        checkWinner();
         
    }
    
    
    public int[][] getBoard()
    {
    
        return board;
    
    }
    
   
    
    private void setXorO(int row, int column, int playerSymbol)
    {
              board[row][column]= playerSymbol;
    }
    
    private void checkWinner()
    {
       // rows checker
       for (int row = 0; row < 3; row++) {
    if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != 0 ) {
       setWinnerName(row, 0);
 
    }
  }
        // columns checker
         for (int column = 0; column < 3; column++) {
     if (board[0][column] == board[1][column] && board[1][column] == board[2][column] && board[0][column] != 0 ) {
         setWinnerName(0, column);
    }
  }
         
         
       //  diagonals checkers
    if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) {
       setWinnerName(0, 0);
        }

     if (board[0][2] == board[1][1] && board[1][1] == board[2][0]&& board[0][2] != 0) {
         setWinnerName(0, 2);
    }
        }
    
    private void setWinnerName(int row , int column)
    {
      if(board[row][column] == playerOneSymbol.get())
     {
      winnerName.set(playerOneName.get());
      playerOneScore.set(playerOneScore.get()+1);
     }else
     {
        winnerName.set(playerTwoName.get());
        playerTwoScore.set(playerTwoScore.get()+1);
     }
    }
    

    
    
    
    public void swapNames()
    {
        int temp = playerOneSymbol.get();
        playerOneSymbol.set(playerTwoSymbol.get());
        playerTwoSymbol.set(temp);
    }
    
  

    void resetBorad() {
          for(int row = 0 ; row < 3 ; row++){
               for(int column = 0 ; column < 3 ; column++)
               {
                 board[row][column] = 0;
               }
           }
          winnerName.setValue("");
         
    }
    }
   

