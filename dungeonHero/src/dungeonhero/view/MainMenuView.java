/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;

import dungeonhero.DungeonHero;
import dungeonhero.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class MainMenuView extends View {

    public MainMenuView(){
    super("\n"
                  + "\n---------------------------------"
                  + "\n  Main Menu                      "
                  + "\n---------------------------------"
                  + "\nN-New Game"
                  + "\nL-Load an existing game"
                  + "\nE-Exit"
                  + "\nH-Help"
                  + "\n---------------------------------");
}

@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "N": // creat new game
                this.startNewGame();
                break;
            case "L":
                this.startExisitingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("Invaild selection Try again");
                break;
        
        }
        return false;
    }

    private void startNewGame() {  
        GameControl.createNewGame(DungeonHero.getPlayer());
        
        // display the game
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExisitingGame() {
        System.out.println("startExistingGame called");
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();
    }
}
