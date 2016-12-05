/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;

import dungeonhero.DungeonHero;
import dungeonhero.Game;
import dungeonhero.Items;
import dungeonhero.Location;
import dungeonhero.Map;
import dungeonhero.control.GameControl;
import java.util.Scanner;
import dungeonhero.view.MainMenuView;
import dungeonhero.view.InventoryView;
import dungeonhero.view.TheBossBattle;

 // @author Dylan
public class GameMenuView extends View {
    
    //private String menu;
    
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
                this.displayMap();
                break;
            case "I":
                //InventoryView inventory = new InventoryView();
                //inventory.display();
                this.viewInventory();
                System.out.println("---------------------------------\n" +
                    "  Game Menu                      \n" +
                    "---------------------------------\n" +
                    "M- View Map                      \n" +
                    "I-Inventory                      \n" +
                    "A-Type Action                    \n" +
                    "H-Help                           \n" +
                    "Q-Exit to Main Menu\n" +
                    "---------------------------------");
                break;
            case "A":
                ActionInputView action = new ActionInputView();
                action.display();
                break;
            case "H":
                HelpMenuView help = new HelpMenuView();
                help.display();
                break;
            case "B":
                TheBossBattle boss = new TheBossBattle();     // this is just a cheat that I can use to test the BossBattle dislay
                boss.display();
                
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

    private void viewInventory() {
        StringBuilder line;
        
        Game game = DungeonHero.getCurrentGame();
        Items[] inventory = game.getInventory();
        
        System.out.println("\n    List of Inventory Items");
        line = new StringBuilder();
        
        System.out.println(line.toString());
        
        for (Items item : inventory)
        {
            line = new StringBuilder(
            line.insert(0, item.getInventoryType()));
            
            System.out.println(line.toString());
            
            line.setLength(0);
        
        }
        
        
       // Items key = new Items();
       // key.setInventoryType("Key");
       // key.setQuantity(0);
       // key.setAmountRequired(1);
     //   inventory[Item.key.ordinal()] = key;
    }

    private void displayMap() {
       Game game = DungeonHero.getCurrentGame();
       Map map = game.getMap();
       Location[][] locations = map.getLocations();
       
       System.out.println("                       Dungeon Map");
       System.out.println("    1     2     3     4     5     6     7     8     9    10");
       
       int rows = 1;
       
       for (Location[] numOfRow : locations)
       {
           System.out.println("-------------------------------------------------------------");
           System.out.print(rows);
           rows++;
           
           for(Location numOfCol : numOfRow)
           {
               //int row = map.getNumOfRows();
               //int col = map.getNumOfCol();
               
               System.out.print("|");
               //Location location = locations [row][col];
               
              // boolean visited = location.isVisited();
               
               
               //if (visited == true)
               //{
               //    System.out.print(location.scene.getMapSymbol());
               //}
               //else
               //{
                   System.out.print(" ?? ");
               //}
               
               System.out.print("|");
           }
           System.out.println();
       }
       System.out.println("-------------------------------------------------------------");
       System.out.println("---------------------------------\n" +
            "  Game Menu                      \n" +
            "---------------------------------\n" +
            "M- View Map                      \n" +
            "I-Inventory                      \n" +
            "A-Type Action                    \n" +
            "H-Help                           \n" +
            "Q-Exit to Main Menu\n" +
            "---------------------------------");
   }
}
       
       
    

