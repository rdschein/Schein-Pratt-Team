/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;

import dungeonhero.DungeonHero;
import dungeonhero.Game;
import dungeonhero.Items;
import java.util.Scanner;
import dungeonhero.view.MainMenuView;

/**
 *
 * @author Dylan
 */
public class HelpMenuView extends View {
    
    private String menu;
    
    public HelpMenuView(){   
    super( "\n"
                  + "\n---------------------------------"
                  + "\n  Help Menu                      "
                  + "\n---------------------------------"
                  + "\nH-How to Play                    "
                  + "\nM-How to Move                    "
                  + "\nA-How to Attack                  "
                  + "\nL-Acquiring and Using Items      "
                  + "\nI-List of Items                  "
                  + "\nQ-Exit help menu                 "
                  + "\n---------------------------------");
 }

    
@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "H": // creat new game
                System.out.println("Dungeon Hero is a game where the player moves\n"
                        + "around and explores a dungeon by entering commands that\n"
                        + "will be explained in other areas of the help menu.\n"
                        + "The hero (you!) will adventure through the dungeon and\n"
                        + "defeat monsters and overcome obstacles along the way.\n"
                        + "You will have a supply of items that can be used to\n"
                        + "help you in various scenarios in the dungeon. For example,\n"
                        + "you may use the enchanted sword to defeat powerful enemies.\n"
                        + "Use your items, defeat enemies, explore the dungeon, and defeat\n"
                        + "the dungeon boss to become the Dungeon Hero.");
                break;
            case "M":
                System.out.println("Movement is essential in Dungeon Hero since you\n"
                        + "must move to new rooms to encounter new enemies and progress\n"
                        + "through the dungeon. By entering commands to move north, south,\n"
                        + "east, and west, the player can move one position at a time\n"
                        + "in a given direction. The console will inform the player of\n"
                        + "whether or not they are able to travel the direction entered.\n"
                        + "Sometimes, obstacles and walls will block your path so\n"
                        + "you must enter a new path command. \n"
                        + "The commands for movement are as follows:\n\n"
                        + "Move North: go north\n" 
                        + "Move South: go south\n" 
                        + "Move East: go east\n" 
                        + "Move West: go west");
                break;
            case "L":
                System.out.println("Items have various usages in Dungeon Hero.\n"
                        + "You have a supply of items and weapons that will be\n"
                        + "used throughout the dungeon to win the game. Items to\n"
                        + "help you will need to be acquired. The bombs can be\n"
                        + "used to destroy crumbling walls and the grappling hook\n"
                        + "can be used to swing over pits of fire. There are command\n"
                        + "to use these items to eliminate the obstacle at hand.\n"
                        + "These commands are as follows:\n\n"
                        + "Pick Up Bow: grab bow\n" 
                        + "Pick Up Harp: grab harp\n" 
                        + "Pick Up Enchanted Sword: grab sword\n" 
                        + "Pick Up Bombs: grab bombs\n" 
                        + "Pick Up Grappling Hook: grab grappling hook\n" 
                        + "Use Bombs: use bombs on walls\n" 
                        + "Use Grappling Hook: use grappling hook");
                break;
            case "A":
                System.out.println("Attacking is important to the game as well.\n"
                        + "You can’t beat the game without fighting off the\n"
                        + "monsters after all! When you enter a new room,\n"
                        + "a description pops up explaining to you what is in the room.\n"
                        + "If a monster appears you have the option to attack.\n"
                        + "Not all monsters are weak to the same weapon!!! A floating\n"
                        + "monster such as a ghost may not be able to be defeats with a sword!\n"
                        + "To attack you can use the following commands:\n\n"
                        + "Attack With Sword: use sword\n"
                        + "Attack With Bow: use bow");
                break;
            case "I":
                System.out.println("Possible items in game");
                this.viewInventory();
                break;
           
                
            default:
                System.out.println("Invaild selection Try again");
                break;
        
        }
        return false;
    }
    
      private void viewInventory() {
        //double bow = DungeonHero.getPlayer().playerInventory[1].getQuantity();
        StringBuilder line;
        
        Game game = DungeonHero.getCurrentGame();
        Items[] inventory = game.getInventory();
        
        System.out.println("\n    List of Possible Inventory Items");
        line = new StringBuilder();
        
        System.out.println(line.toString());
        
        for (Items item : inventory)
        {
            
            line = new StringBuilder(
            line.insert(0, item.getInventoryType()));
            
                System.out.println(line.toString());
            
            line.setLength(0);
           
        
        }
    
    
}
}