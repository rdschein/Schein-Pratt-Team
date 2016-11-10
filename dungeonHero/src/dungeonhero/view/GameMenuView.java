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
public class GameMenuView extends View {
    
    private String menu;
    
    public GameMenuView(){   
            super("\n"
                  + "\n---------------------------------"
                  + "\n  Game Menu                      "
                  + "\n---------------------------------"
                  + "\nM- View Map                      "
                  + "\nI-Inventory                      "
                  + "\nA-Type Action                    "
                  + "\nH-Help                           "
                  + "\nQ-Exit to Main Menu"
                  + "\n---------------------------------");
 }
@Override
    public boolean doAction(String choice) {
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
                ActionInputView action = new ActionInputView();
                action.display();
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
