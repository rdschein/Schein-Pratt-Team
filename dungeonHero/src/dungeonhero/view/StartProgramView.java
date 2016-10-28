/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;

import dungeonhero.Player;
import dungeonhero.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class StartProgramView {

    
    
    private String promptMessage;
    
    
    public StartProgramView()
    {
        this.promptMessage = "Please enter your Name:";
       //banner 
        this.displayBanner();
       
    }
    public void displayStartProgramView()
    {
        // Print the Banner page with short discription
        
       //Prompt for Player name
        boolean done = false; // set flag to not done
        do{
            // prompt for and get players name
            String playersName = this.getPlayerName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
        } while (!done);
        
        // Call control function to create a player
        
        //If the player is created, display a welcome message and main mnu: else display error and repeat
        
    }

    private void displayBanner() 
    {
     System.out.println(
     "\n**********************************************************************"
   + "\n*                                                                    *"
   + "\n*Dungeon Heroes is a text based action role palying game. You will   *"
   + "\n*need to explore the dungeon and find hidden items to reveal the     *"
   + "\n*secrets of the Dungeon. Have Courage and Conquer the Dungeon!       *"
   + "\n*                                                                    *"
   + "\n**********************************************************************"
             
     
     
     );    //To change body of generated methods, choose Tools | Templates.
    }

    private String getPlayerName() {
       Scanner keyboard = new Scanner(System.in); // get from keyboard
       String value ="";// returned name
       boolean valid = false;
       
       while(!valid){
           System.out.println("\n"+this.promptMessage);
           
           value = keyboard.nextLine();
           value = value.trim();
           
           if(value.length()<1){
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
       
           break; // end loop
       }
       return value;
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                   + "The name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n*** displayNextView() called ***");
    }

    
}
