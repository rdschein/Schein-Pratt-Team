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
public class MainMenuView {

    private String menu;
    
 public MainMenuView(){   
    this.menu = "\n"
                  + "\n---------------------------------"
                  + "\n  Main Menu                      "
                  + "\n---------------------------------"
                  + "\nN-New Game"
                  + "\nL-Load an existing game"
                  + "\nE-Exit"
                  + "\nH-Help"
                  + "\n---------------------------------";
 }
    
    void displayMainMenuView() {
        
        System.out.println(menu);
        
        boolean done = false;
        do{
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")){
                System.out.println(menu);
                return; // exit game
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        }while(!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get from keyboard
       String value ="";// returned name
       boolean valid = false;
       
       while(!valid){
           System.out.println("\nENTER COMMAND HERE:");
           
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
        gameMenu.displayMenu();
    }

    private void startExisitingGame() {
        System.out.println("startExistingGame called");
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.displayHelpMenu();
    }
}
