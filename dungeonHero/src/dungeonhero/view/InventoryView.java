/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;
import dungeonhero.control.GameControl;
import java.util.Scanner;
import dungeonhero.DungeonHero;
import dungeonhero.view.GameMenuView;

/**
 *
 * @author Rob
 */
public class InventoryView extends View {
    
    public String menu;
    
    public InventoryView() {
//         super("\n"
//                           + "\n---------------------------------"
//                           + "\n  Inventory                      "
//                           + "\n---------------------------------"
//                           + "\nSword- " 
//                           + "\nBow- "
//                           + "\nBombs- "
//                           + "\nGrapple- "
//                           + "\nHarp- "
//                           + "\nEnchanted Sword- "
//                           + "\nKey- "
//                           + "\n---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("  Inventory                      ");
        System.out.println("---------------------------------");
        if(DungeonHero.getPlayer().playerInventory[0].getQuantity() == 1)
        {
         System.out.println("Sword");
        }
        else
        {
            System.out.println("Enchanted Sword");
        }
        if(DungeonHero.getPlayer().playerInventory[1].getQuantity() == 1)
        {
            System.out.println("Bow");
        }
        if(DungeonHero.getPlayer().playerInventory[2].getQuantity() == 1)
        {
            System.out.println("Bombs");
        }
        if(DungeonHero.getPlayer().playerInventory[3].getQuantity() == 1)
        {
            System.out.println("Grapple");
        }
        if(DungeonHero.getPlayer().playerInventory[4].getQuantity() == 1)
        {
            System.out.println("Harp");
        }
    }
  

    @Override
    public boolean doAction(String value) {
        return false;
    }

   
}
