/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.core;

import tictactoe.online_multi_player.domain.usecases.UpdatePlayerOverallScoreUseCase;
public class RemoteAccessLayer {
    static RemoteAccessLayer instance ; 
    private RemoteAccessLayer()
    {
    
    
    }
    
    
    
    public static synchronized RemoteAccessLayer getInstance()
    {
        
        if(instance == null){
            instance = new RemoteAccessLayer();
        }
        return instance;
        
      
    } 
    
    
    //todo implement your server functions
}
