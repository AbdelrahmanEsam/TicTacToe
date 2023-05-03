/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.core;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class PassData {
    
    private static PassData instance  = null;
     public static SimpleStringProperty winnerName = new SimpleStringProperty();
    public static SimpleStringProperty dialogReturn = new SimpleStringProperty();
    private PassData()
    {
    
    }
    
   
   public static synchronized PassData getInstance()
    {
  
     if(instance == null){
        instance = new PassData();
        }
     
    
    
    return instance;
    }
    
    
    
    
}
