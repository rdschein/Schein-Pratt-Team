/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;
import dungeonhero.control.GameControl;
import dungeonhero.Player;
import java.util.Scanner;
import dungeonhero.DungeonHero;
/**
 *
 * @author Rob
 */
public class InventoryView {
    
    private String inventory;
    
    public InventoryView() {
        this.inventory = "\n"
                           + "\n---------------------------------"
                           + "\n  Inventory                      "
                           + "\n---------------------------------"
                           + "\nSword- " 
                           + "\nBow- "
                           + "\nBombs- "
                           + "\nGrapple- "
                           + "\nHarp- "
                           + "\nEnchanted Sword- "
                           + "\nKey- "
                           + "\n---------------------------------";
                            
    }
    
    void displayInventory() {
        System.out.println(inventory);
        
        boolean done = false;
        
        String InventoryOption = this.getInventoryOption();
            if (InventoryOption.toUpperCase().equals("I"))
                return;
            
            done = this.doAction(InventoryOption);
        while(!done);
    }

    private String getInventoryOption() {
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

    private boolean doAction(String InventoryOption) {
        return false;
    }
}
