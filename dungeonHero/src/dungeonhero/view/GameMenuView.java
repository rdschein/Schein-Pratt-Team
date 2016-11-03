/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;

import java.util.Scanner;
import dungeonhero.view.MainMenuView;
import dungeonhero.view.InventoryView;

 // @author Dylan
class GameMenuView {
    
    private String menu;
    
    public GameMenuView(){   
    this.menu = "\n"
                  + "\n---------------------------------"
                  + "\n  Game Menu                      "
                  + "\n---------------------------------"
                  + "\nM- View Map                      "
                  + "\nI-Inventory                      "
                  + "\nA-Type Action                    "
                  + "\nH-Help                           "
                  + "\nQ-Exit to Main Menu"
                  + "\n---------------------------------";
 }

    void displayMenu() {
       System.out.println(menu);
        
        boolean done = false;
        do{
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")){
                //MainMenuView MainMenu = new MainMenuView();
                //MainMenu.displayMainMenuView();
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "M": // creat new game
                System.out.println("The Map will now be displayed");
                break;
            case "I":
                InventoryView inventory = new InventoryView();
                inventory.displayInventory();
                break;
            case "A":
                System.out.println("Enter command");
                break;
            case "H":
                System.out.println("Help Menu called here");
                break;
                
            default:
                System.out.println("Invaild selection Try again");
                break;
        
        }
        return false;
    }
    
}
