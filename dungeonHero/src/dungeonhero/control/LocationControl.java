/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.control;

import dungeonhero.Map;

/**
 *
 * @author Rob
 */
public class LocationControl {
    
    private static Map createMap() {
        // create the map
        Map map = new Map (5 , 10);
        
        //creat the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map,scenes);
        
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getRandomRow(int row) {
        // Rob wrote this function
        
        row = row + 3;
        
        while (row > 5) {
            row = row - 5;
        }
        while (row < 1) {
            row = row + 4;
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
