/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.control;

import dungeonhero.Location;
import dungeonhero.Map;
import dungeonhero.Player;
import dungeonhero.Scene;
import dungeonhero.Actor;
import static dungeonhero.Scene.createScenes;
import dungeonhero.exceptions.LocationControlException;
import java.awt.Point;

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

    static void moveActorsToStartingLocation(Map map, Player player) {
        player.setPlayerRow(5);
        player.setPlayerCol(5);
        
        map.visitLocation(5,5);
        
        
        
    }
    public static void moveCharacterToNewLoc(Actor character ,Point coordinates, Location[][] locations )
    {
        if(character == null){}
        if(locations == null){}
        if(coordinates == null || 
                coordinates.x < 0 ||
                coordinates.x > 5 ||
                coordinates.y < 0 ||
                coordinates.y > 10){}
        
      //  character.setPlayerRow(coordinates.x); 
      //  character.setPlayerCol(coordinates.y); 
        
        Location oldLocation = locations[character.getActorRow()][character.getActorCol()];
        Location newLocation = locations[coordinates.x][coordinates.y];
        
        oldLocation.getActors().remove(character);
        newLocation.getActors().add(character);
   
    }
    
    public static void movePlayerNorth(Map map, Player player)
    {
       player.setPlayerRow(player.getPlayerRow()+1);
        
       map.visitLocation(player.getPlayerRow(), player.getPlayerCol());
    
    }
    public static void movePlayerWest(Map map, Player player)
    {
        player.setPlayerRow(player.getPlayerCol()-1);
        
        map.visitLocation(player.getPlayerRow(), player.getPlayerCol());
    }
    public static void movePlayerEasth(Map map, Player player)
    {
       player.setPlayerRow(player.getPlayerCol()+1);
        
       map.visitLocation(player.getPlayerRow(), player.getPlayerCol());
    
    }
    public static void movePlayerSouth(Map map, Player player)
    {
       player.setPlayerRow(player.getPlayerRow()-1);
        
       map.visitLocation(player.getPlayerRow(), player.getPlayerCol());
    
    }
    
    
    public int getRandomRow(int row) throws LocationControlException {
        // Rob wrote this function
        
        row = row + 3;
        
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
    
    public int getRandomCol(int col) {
        // Dylan wrote this function
        // Dyaln wrote this function
    
    col = col + 5;
    
    while(col > 10){
    col = col - 7;
    }
    while(col < 1){
    col = col + 4;
    }
    return col;
    
    }
}
