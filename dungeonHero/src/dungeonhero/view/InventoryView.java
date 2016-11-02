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
    }

   
}
