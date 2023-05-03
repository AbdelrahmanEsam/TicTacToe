package tictactoe.core;

import tictactoe.multi_player.presentation.MultiPlayerViewModel;
import tictactoe.authentication.login.presentation.LoginViewModel;
import tictactoe.authentication.registration.RegistrationViewModel;
import tictactoe.available_players.presentation.AvailablePlayersViewModel;
import tictactoe.main_menu.presentation.MainViewController;
import tictactoe.online_multi_player.presentation.OnlineViewController;
import tictactoe.online_multi_player.presentation.OnlineViewModel;
import tictactoe.main_menu.presentation.MainViewModel;
import tictactoe.main_menu.presentation.single_mode.SingleModeViewModel;
import tictactoe.single_player.presentation.SinglePlayerViewModel;


public class ViewModelFactory {
        
    
    public static Object getViewModel(ViewController viewController)
    {
        
        
        
    
        
        switch(viewController)
        {
        
            case MAINVIEWCONTROLLER :{
            
              return new MainViewModel();
         
            }
            
            case ONLINEVIEWCONTROLLER:{
                return new OnlineViewModel();
            }
            
            
             case MENUDIALOGCONTROLLER:{
                return new OnlineViewModel();
            }
             
             
             case REGISTRATIONVIEWCONTROLLER:{
                return new RegistrationViewModel();
            }

            case LOGINVIEWCONTROLLER:{
                return new LoginViewModel();
            }
            
            case AVAILABLEPLAYERSVIEWCONTROLLER:{
                    return new AvailablePlayersViewModel();
                
            }
            
            
             case MULTIVIEWCONTROLLER:{
                    return new MultiPlayerViewModel();
                
            }
             
             
              case SINGLEVIEWCONTROLLER:{
                    return new SinglePlayerViewModel();
                
            }
            
              case SINGLEVIEWCONTROLLER:{
                    return new SingleModeViewModel();
                
            }
            //todo add your own controller name in enum class and add your case here            //todo add your own controller name in enum class and add your case here
            
            
            default:{
                 return new MainViewModel();
            }
        
        
        }
       
    
    }

}



