/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.core;

import tictactoe.online_multi_player.domain.usecases.UpdatePlayerOverallScoreUseCase;

public class LocalAccessLayer {
    
     static LocalAccessLayer instance ; 
    private LocalAccessLayer()
    {
    
    
    }
    
    
    
    public static synchronized LocalAccessLayer getInstance()
    {
        
        if(instance == null){
            instance = new LocalAccessLayer();
        }
        return instance;
    }
    
    
      //todo implement your local database functions
    
}
