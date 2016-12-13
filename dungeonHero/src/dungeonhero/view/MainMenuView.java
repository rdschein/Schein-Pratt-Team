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
                  + "\nS-Save Game"
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
                this.startSavedGame();
                break;
            case "S":
                this.saveGame();
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

    private void displayHelpMenu() {
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();
    }
    
    private void startSavedGame() {
        this.console.println("\n\nEnter the file path for file where the game is to be saved");
        
        String filePath = this.getInput();
        
        try{
            GameControl.getSavedGame(filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game is to be saved");
        
        String filePath = this.getInput();
        
        try{
            GameControl.saveGame(DungeonHero.getCurrentGame(), filePath);
        }catch(Exception ex)
        {
            ErrorView.display("MainMenuView", ex.getMessage());
        
        }
    }
}
