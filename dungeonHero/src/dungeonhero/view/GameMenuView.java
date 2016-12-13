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
import dungeonhero.exceptions.LocationControlException;
import java.util.Scanner;
import dungeonhero.view.MainMenuView;
import dungeonhero.view.InventoryView;
import dungeonhero.view.TheBossBattle;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                  + "\n---------------------------------"
                  + "\nYOU ARE CURRENT LOCATED AT:"+DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol()).scene.getMapSymbol());
 }
@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "M": // creat new game
                this.displayMap();
                break;
            case "I":
                InventoryView inventory = new InventoryView();
                inventory.display();
                //this.viewInventory();
                System.out.println("---------------------------------\n" +
                    "  Game Menu                      \n" +
                    "---------------------------------\n" +
                    "M- View Map                      \n" +
                    "I-Inventory                      \n" +
                    "A-Type Action                    \n" +
                    "H-Help                           \n" +
                    "Q-Exit to Main Menu\n" +
                    "\n---------------------------------" +
                    "\nYOU ARE CURRENT LOCATED AT:"+DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol()).scene.getMapSymbol());
                break;
//            case "A":
//                ActionInputView action = new ActionInputView();
//                action.display();
//                break;
            case "H":
                HelpMenuView help = new HelpMenuView();
                help.display();
                break;
            case "GO NORTH":
               
                Point newLoc = new Point();
                newLoc.x = DungeonHero.getPlayer().getActorRow()-1;
                newLoc.y = DungeonHero.getPlayer().getActorCol();
                if(DungeonHero.getCurrentGame().getMap().getLocation(newLoc.x+1, newLoc.y).getScene().isCanGoNorth() == true){
            
            try {
                moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc, DungeonHero.getCurrentGame().getMap().getLocations());
            } catch (LocationControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
                DungeonHero.getCurrentGame().map.visitLocation(newLoc.x, newLoc.y);
                
                System.out.println(DungeonHero.getCurrentGame().getMap().getLocation(newLoc.x, newLoc.y).getScene().getDescription());
                
                this.displayMap();
                }else
                 {
                 System.out.print("You are not able to do that");
                 }
                break;
            case "GO SOUTH":
                Point newLoc2 = new Point();
                newLoc2.x = DungeonHero.getPlayer().getActorRow()+1;
                newLoc2.y = DungeonHero.getPlayer().getActorCol();
            
                if(DungeonHero.getCurrentGame().getMap().getLocation(newLoc2.x-1, newLoc2.y).getScene().isCanGoSouth() == true){
            try {
                moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc2, DungeonHero.getCurrentGame().getMap().getLocations());
            } catch (LocationControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
                DungeonHero.getCurrentGame().map.visitLocation(newLoc2.x, newLoc2.y);
                
                System.out.println(DungeonHero.getCurrentGame().getMap().getLocation(newLoc2.x, newLoc2.y).getScene().getDescription());
                
                this.displayMap();
                }else
                {
               this.console.println("You are not able to do that");
                }
                break;
            case "GO WEST":
                Point newLoc3 = new Point();
                newLoc3.x = DungeonHero.getPlayer().getActorRow();
                newLoc3.y = DungeonHero.getPlayer().getActorCol()-1;
            
                if(DungeonHero.getCurrentGame().getMap().getLocation(newLoc3.x, newLoc3.y+1).getScene().isCanGoWest() == true){
            try {
                moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc3, DungeonHero.getCurrentGame().getMap().getLocations());
            } catch (LocationControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
                DungeonHero.getCurrentGame().map.visitLocation(newLoc3.x, newLoc3.y);
                
                System.out.println(DungeonHero.getCurrentGame().getMap().getLocation(newLoc3.x, newLoc3.y).getScene().getDescription());
                
                this.displayMap();
                }else
                {
                  System.out.print("You are not able to do that"); 
                }
                break;
            case "GO EAST":
                Point newLoc4 = new Point();
                newLoc4.x = DungeonHero.getPlayer().getActorRow();
                newLoc4.y = DungeonHero.getPlayer().getActorCol()+1;
                
                if(DungeonHero.getCurrentGame().getMap().getLocation(newLoc4.x, newLoc4.y-1).getScene().isCanGoEast() == true){
            try {
                moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc4, DungeonHero.getCurrentGame().getMap().getLocations());
            } catch (LocationControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
                DungeonHero.getCurrentGame().map.visitLocation(newLoc4.x, newLoc4.y);
                
                System.out.println(DungeonHero.getCurrentGame().getMap().getLocation(newLoc4.x, newLoc4.y).getScene().getDescription());// displays the scene
                
                this.displayMap();
                 }else
                {
                    System.out.print("You are not able to do that"); 
                }
                break;
            case "GRAB BOW": 
                if(DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(),DungeonHero.getPlayer().getActorCol()) == 
                        DungeonHero.getCurrentGame().getMap().getLocation(4, 1) && DungeonHero.getPlayer().playerInventory[1].getQuantity() == 0)
                {
                    DungeonHero.getPlayer().playerInventory[1].setQuantity(1);
                    System.out.println("Congrats! You got the Enchanted Bow! It was said\n"
                            + "That this item was used to hunt down the ghosts the would\n"
                            + "haunt the castles of old.");
                }else
                {
                    System.out.println("There is no bow to grab");
                }
                break;
            case "GRAB BOMBS": 
                if(DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(),DungeonHero.getPlayer().getActorCol()) == 
                        DungeonHero.getCurrentGame().getMap().getLocation(0, 4) && DungeonHero.getPlayer().playerInventory[2].getQuantity() == 0)
                {
                    DungeonHero.getPlayer().playerInventory[2].setQuantity(1);
                    System.out.println("Congrats! You got a bag of Bombs! What could \n"
                            + "You do with these?");
                }else
                {
                    System.out.println("There are no bombs to grab");
                }
                break;
            case "GRAB GRAPPLING HOOK": 
                if(DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(),DungeonHero.getPlayer().getActorCol()) == 
                        DungeonHero.getCurrentGame().getMap().getLocation(4, 6) && DungeonHero.getPlayer().playerInventory[3].getQuantity() == 0)
                {
                    DungeonHero.getPlayer().playerInventory[3].setQuantity(1);
                    System.out.println("Congrats! You got a Grappling Hook! You can now swing \n"
                            + "across things");
                }else
                {
                    System.out.println("There is no grappling hook to grab");
                }
                break;
            case "GRAB HARP": 
                if(DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(),DungeonHero.getPlayer().getActorCol()) == 
                        DungeonHero.getCurrentGame().getMap().getLocation(0, 5) && DungeonHero.getPlayer().playerInventory[4].getQuantity() == 0)
                {
                    DungeonHero.getPlayer().playerInventory[4].setQuantity(1);
                    System.out.println("Congrats! You got the Sacred Harp! This harp is a royal artifact!\n"
                            + "What could it possibly be doing here?\n "
                            + "It glows with a white light!");
                }else
                {
                    System.out.println("There is no harp to grab");
                }
                break;
            case "GRAB SWORD": 
                if(DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(),DungeonHero.getPlayer().getActorCol()) == 
                        DungeonHero.getCurrentGame().getMap().getLocation(4, 0) && DungeonHero.getPlayer().playerInventory[0].getQuantity() == 1)
                {
                    DungeonHero.getPlayer().playerInventory[0].setQuantity(2);
                    System.out.println("Congrats! You got the Enchanted Sword! This Mythical blade was said\n"
                            + "to have been forged by angels. Evil can not touch it!\n ");
                }else
                {
                    System.out.println("There is no sword to grab");
                }
                break;
            case "USE BOMBS ON WALLS":
                
                if(DungeonHero.getCurrentGame().player.playerInventory[2].getQuantity() == 1){
                
                if(DungeonHero.getCurrentGame().getMap().getLocation(0, 4) == DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol())
                        && DungeonHero.getCurrentGame().map.getLocation(0, 4).getScene().isCanGoWest() == false)
                {
                    DungeonHero.getCurrentGame().map.getLocation(0, 4).getScene().setCanGoWest(true);
                    
                    DungeonHero.getCurrentGame().getMap().getLocation(0, 4).getScene().setDescription(
                            "*------------------------------------------------------------------------*\n"
                            + "There is a door to the south and a hole to the west"
                            + "*------------------------------------------------------------------------*");
                    
                    System.out.println("The weak wall to the west colapsed! You can now contine to travel west if you like.");
                
                
                }else if(DungeonHero.getCurrentGame().getMap().getLocation(3, 2) == DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol())
                        && DungeonHero.getCurrentGame().map.getLocation(3, 2).getScene().isCanGoSouth() == false)
                {
                    DungeonHero.getCurrentGame().map.getLocation(3, 2).getScene().setCanGoSouth(true);
                    
                    
                    System.out.println("The weak wall to the south colapsed! You can now contine to travel west if you like.");
                
                }else if(DungeonHero.getCurrentGame().getMap().getLocation(2, 0) == DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol())
                        && DungeonHero.getCurrentGame().map.getLocation(2, 0).getScene().isCanGoSouth() == false)
                {
                    DungeonHero.getCurrentGame().map.getLocation(2, 0).getScene().setCanGoSouth(true);
                    
                    System.out.println("The weak wall to the south colapsed! You can now contine to travel west if you like.");
                
                }else if(DungeonHero.getCurrentGame().getMap().getLocation(3, 2) == DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol())
                        && DungeonHero.getCurrentGame().map.getLocation(3, 2).getScene().isCanGoSouth() == false)
                {
                    DungeonHero.getCurrentGame().map.getLocation(3, 2).getScene().setCanGoSouth(true);
                    
                    System.out.println("The weak wall to the south colapsed! You can now contine to travel west if you like.");
                
                }else if(DungeonHero.getCurrentGame().getMap().getLocation(0, 6) == DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol())
                        && DungeonHero.getCurrentGame().map.getLocation(0, 6).getScene().isCanGoWest() == false)
                {
                    DungeonHero.getCurrentGame().map.getLocation(0, 6).getScene().setCanGoWest(true);
                    
                    System.out.println("The weak wall to the west colapsed! You can now contine to travel west if you like.");
                
                
                }else if(DungeonHero.getCurrentGame().getMap().getLocation(3, 8) == DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol())
                        && DungeonHero.getCurrentGame().map.getLocation(3, 8).getScene().isCanGoEast() == false)
                {
                    DungeonHero.getCurrentGame().map.getLocation(3, 8).getScene().setCanGoEast(true);
                    
                    System.out.println("The weak wall to the east colapsed! You can now contine to travel west if you like.");
                
                }else
                {
                    System.out.println("Your Bombs had no effect");
                
                }
                
                
                }else
                {
                    System.out.println("You don't have any bombs to use");
                }
                break;
                case "USE GRAPPLING HOOK": // creat new game
                if(DungeonHero.getCurrentGame().player.playerInventory[3].getQuantity() == 1){
                if(DungeonHero.getCurrentGame().getMap().getLocation(1, 9) == DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol())
                        && DungeonHero.getCurrentGame().player.firePit1%2 != 0)
                {
                    DungeonHero.getCurrentGame().map.getLocation(1, 9).getScene().setCanGoSouth(false);
                    DungeonHero.getCurrentGame().map.getLocation(1, 9).getScene().setCanGoNorth(true);
                    
                    DungeonHero.getCurrentGame().player.setFirePit1(DungeonHero.getCurrentGame().player.getFirePit1()+1);
                    
                    System.out.println("You swung across the fire pit with your grappling hook. You are\n"
                            + "on the north side of the room now. You can now continue your path north");
                
                }else if(DungeonHero.getCurrentGame().getMap().getLocation(1, 9) == DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol())
                        && DungeonHero.getCurrentGame().player.firePit1%2 == 0)
                {
                    DungeonHero.getCurrentGame().map.getLocation(1, 9).getScene().setCanGoSouth(true);
                    DungeonHero.getCurrentGame().map.getLocation(1, 9).getScene().setCanGoNorth(false);
                    
                    DungeonHero.getCurrentGame().player.setFirePit1(DungeonHero.getCurrentGame().player.getFirePit1()+1);
                    
                    System.out.println("You swung across the fire pit with your grappling hook. You are\n"
                            + "on the south side of the room now. You can now continue your path south");
                
                }else if(DungeonHero.getCurrentGame().getMap().getLocation(3, 0) == DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol())
                        && DungeonHero.getCurrentGame().player.firePit2%2 != 0)
                {
                    DungeonHero.getCurrentGame().map.getLocation(3, 0).getScene().setCanGoSouth(true);
                    DungeonHero.getCurrentGame().map.getLocation(3, 0).getScene().setCanGoNorth(false);
                    
                    DungeonHero.getCurrentGame().player.setFirePit2(DungeonHero.getCurrentGame().player.getFirePit2()+1);
                    
                    System.out.println("You swung across the fire pit with your grappling hook. You are\n"
                            + "on the south side of the room now. You can now continue your path south");
                
                }else if(DungeonHero.getCurrentGame().getMap().getLocation(3, 0) == DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol())
                        && DungeonHero.getCurrentGame().player.firePit2%2 == 0)
                {
                    DungeonHero.getCurrentGame().map.getLocation(3, 0).getScene().setCanGoSouth(false);
                    DungeonHero.getCurrentGame().map.getLocation(3, 0).getScene().setCanGoNorth(true);
                    
                    DungeonHero.getCurrentGame().player.setFirePit2(DungeonHero.getCurrentGame().player.getFirePit2()+1);
                    
                    System.out.println("You swung across the fire pit with your grappling hook. You are\n"
                            + "on the north side of the room now. You can now continue your path north");
                
                }
                else
                {
                    System.out.println("You can not do that right now");
       
                }
                }else
                {
                    System.out.println("You don't have a grappling hook");
                
                }
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
        //double bow = DungeonHero.getPlayer().playerInventory[1].getQuantity();
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
       // inventory[Item.key.ordinal()] = key;
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
            "\n---------------------------------" +
            "\nYOU ARE CURRENT LOCATED AT:"+DungeonHero.getCurrentGame().getMap().getLocation(DungeonHero.getPlayer().getActorRow(), DungeonHero.getPlayer().getActorCol()).scene.getMapSymbol());
   }
}
       
       
    

