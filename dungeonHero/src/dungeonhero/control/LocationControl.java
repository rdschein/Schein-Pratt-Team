/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.control;

import dungeonhero.Location;
import dungeonhero.Map;
import dungeonhero.Scene;
import dungeonhero.Actor;
import static dungeonhero.Scene.createScenes;
import dungeonhero.exceptions.LocationControlException;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Rob
 */
public class LocationControl {
    
    static Map createMap() {
        // create the map
        Map map = new Map (5 , 10);
        
        //creat the scenes for the game createScenes()
        Scene[] scenes = createScenes();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map,scenes);
        
        return map;
    }

    static void moveActorsToStartingLocation(Map map, Actor player) {
        player.setActorRow(4);
        player.setActorCol(4);
        
        map.visitLocation(4,4);
        
        
        
    }
    public static void moveCharacterToNewLoc(Actor character ,Point coordinates, Location[][] locations ) throws LocationControlException
    {
        if(character == null)
        {
        System.out.println("The problem is with the character");
        }
        if(locations == null)
        {
        System.out.println("The problem is with the locations");
        }
        if(coordinates == null || 
                coordinates.x < 0 ||
                coordinates.x > 5 ||
                coordinates.y < 0 ||
                coordinates.y > 10)
        {
        throw new LocationControlException("Error: new Locations are out of bounds"); // Dylan Assigment 10
        }
      
        Location oldLocation = locations[character.getActorRow()][character.getActorCol()]; // testing
       // Location oldLocation = locations[4][character.getActorCol()]; // testing
        
        Location newLocation = locations[coordinates.x][coordinates.y];
      
        
        oldLocation.getActors().remove(character);
        newLocation.getActors().add(character);
        
        character.setActorRow(coordinates.x);
        character.setActorCol(coordinates.y);
        
    }
    
//    public static void movePlayerNorth(Map map, Actor player)
//    {
//       player.setPlayerRow(player.getPlayerRow()+1);
//        
//       map.visitLocation(player.getPlayerRow(), player.getPlayerCol());
//    
//    }
//    public static void movePlayerWest(Map map, Player player)
//    {
//        player.setPlayerRow(player.getPlayerCol()-1);
//        
//        map.visitLocation(player.getPlayerRow(), player.getPlayerCol());
//    }
//    public static void movePlayerEasth(Map map, Player player)
//    {
//       player.setPlayerRow(player.getPlayerCol()+1);
//        
//       map.visitLocation(player.getPlayerRow(), player.getPlayerCol());
//    
//    }
//    public static void movePlayerSouth(Map map, Player player)
//    {
//       player.setPlayerRow(player.getPlayerRow()-1);
//        
//       map.visitLocation(player.getPlayerRow(), player.getPlayerCol());
//    
//    }
    
    
    public int getRandomRow(int row) throws LocationControlException {
        // Rob wrote this function
        
       Scanner keyboard = new Scanner(System.in); // get from keyboard
       String value ="";// returned name
       boolean valid = false;
       
       while(!valid){
           System.out.println("\nPlease enter a number between 1&5");
           
           value = keyboard.nextLine();
           value = value.trim();
           
           if(value.equals("Q"))
               break;
            try{   
            row = Integer.parseInt(value); // dylan assigment 10
            }catch(NumberFormatException nf)
            {
                System.out.println("\nNumberFormatExpection: You must enter a vaild number. Try again");
            }
       }
        
        while (row > 5) {
            row = row - 5;
        }
        while (row < 1) {
            row = row + 4;
        }
        
        if(row > 5 || row < 1) // error catching
        {
            throw new LocationControlException("Error: The row is greater than 5 or less than one"); // team assignment 10 needs to be finsihed
        }
       
        return row;
    }
    
    
    public int getRandomCol(int col) throws LocationControlException {
        // Dylan wrote this function
        // Dyaln wrote this function
    
    col = col + 5;
    
    while(col > 10){
    col = col - 7;
    }
    while(col < 1){
    col = col + 4;
    }
    
    if (col > 10 || col < 1) 
    {
          throw new LocationControlException("Error: The column is greater than 10 and lower than 1");
    }
    return col;
    
    }
}
