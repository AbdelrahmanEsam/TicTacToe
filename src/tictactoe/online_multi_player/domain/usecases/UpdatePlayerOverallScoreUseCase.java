
package tictactoe.online_multi_player.domain.usecases;

public class UpdatePlayerOverallScoreUseCase {
   static UpdatePlayerOverallScoreUseCase instance ; 
    private UpdatePlayerOverallScoreUseCase()
    {
    
    
    }
    
    
    
    public static synchronized UpdatePlayerOverallScoreUseCase getInstance()
    {
        
        if(instance == null){
            instance = new UpdatePlayerOverallScoreUseCase();
        }
        return instance;
    }
    
}
