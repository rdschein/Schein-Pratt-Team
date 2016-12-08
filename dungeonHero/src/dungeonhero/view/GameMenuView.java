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
import dungeonhero.Actor;
import dungeonhero.control.GameControl;
import static dungeonhero.control.LocationControl.moveCharacterToNewLoc;
import java.util.Scanner;
import dungeonhero.view.MainMenuView;
import dungeonhero.view.InventoryView;
import dungeonhero.view.TheBossBattle;
import java.awt.Point;

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
            case "GO NORTH":
                Point newLoc = new Point();
                newLoc.x = DungeonHero.getPlayer().getActorRow()-1;
                newLoc.y = DungeonHero.getPlayer().getActorCol();
            
                moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc, DungeonHero.getCurrentGame().getMap().getLocations());
                DungeonHero.getCurrentGame().map.visitLocation(newLoc.x, newLoc.y);
                this.displayMap();
                break;
            case "GO SOUTH":
                Point newLoc2 = new Point();
                newLoc2.x = DungeonHero.getPlayer().getActorRow()+1;
                newLoc2.y = DungeonHero.getPlayer().getActorCol();
            
                moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc2, DungeonHero.getCurrentGame().getMap().getLocations());
                DungeonHero.getCurrentGame().map.visitLocation(newLoc2.x, newLoc2.y);
                this.displayMap();
                break;
            case "GO WEST":
                Point newLoc3 = new Point();
                newLoc3.x = DungeonHero.getPlayer().getActorRow();
                newLoc3.y = DungeonHero.getPlayer().getActorCol()-1;
            
                moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc3, DungeonHero.getCurrentGame().getMap().getLocations());
                DungeonHero.getCurrentGame().map.visitLocation(newLoc3.x, newLoc3.y);
                this.displayMap();
                break;
            case "GO EAST":
                 Point newLoc4 = new Point();
                newLoc4.x = DungeonHero.getPlayer().getActorRow();
                newLoc4.y = DungeonHero.getPlayer().getActorCol()+1;
            
                moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc4, DungeonHero.getCurrentGame().getMap().getLocations());
                DungeonHero.getCurrentGame().map.visitLocation(newLoc4.x, newLoc4.y);
                this.displayMap();
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

    public void displayMap() {
       Game game = DungeonHero.getCurrentGame();
       Map map = game.getMap();
       Location[][] locations = map.getLocations();
       
       System.out.println("                       Dungeon Map");
       System.out.println("    1     2     3     4     5     6     7     8     9    10");
       
       int rows = 1;
       
       for (Location[] nextOfRow : locations)
       {
           System.out.println("-------------------------------------------------------------");
           System.out.print(rows);
           rows++;
           
           for(Location nextLoc : nextOfRow)
           {
               int row = nextLoc.getRow();
               int col = nextLoc.getColumn();
               
               System.out.print("|");
               Location location = locations [row][col];
               
               boolean visited = location.isVisited();
               
               
               if (visited == true)
               {
                   System.out.print(location.scene.getMapSymbol());
               }
               else
               {
                   System.out.print(" ?? ");
               }
               
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
       
       
    

