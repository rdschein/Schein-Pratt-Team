/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero;
/**
 *
 * @author Rob and Dylan
 */
public class DungeonHero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player(); // sets up player
        
        playerOne.setName("Rob Pratt");  // setting the values
        playerOne.setGameOverCount(7);
        
        String playerInfo = playerOne.toString(); // Printing it out
        System.out.println(playerInfo); 
        
        // for the Location
        Location start = new Location();
        
        start.setColumn(5);
        start.setRow(1);
        start.setVisited(true);
        
        
        String startInfo = start.toString();
        System.out.println(startInfo);
        
        
        // for the map
        
        Map dungeon = new Map();
        
        dungeon.setNumOfCol(10);
        dungeon.setNumOfRows(5);
        
        String mapInfo = dungeon.toString();
        System.out.println(mapInfo);
        
        // for the Enemies
        Enemies goblin = new Enemies();
        
        goblin.setType("Bad Guy");
        goblin.setAttributes("Green");
        
        String goblinInfo = goblin.toString();
        System.out.println(goblinInfo);
        
        // for the items
        
        Items bow = new Items();
        
        bow.setInventoryType("Located at 1-1");
        bow.setAmountRequired(30);
        bow.setQuantity(50);
        
        String bowInfo = bow.toString();
        System.out.println(bowInfo);
        
        // for the scene
        
        Scene puzzle = new Scene();
        
        puzzle.setSceneType("Puzzle");
        puzzle.setSceneName("Death Trap");
        puzzle.setBlockedLocation("1-2");
        puzzle.setDescription("It's Awesome");
        
        String puzzleInfo = puzzle.toString();
        System.out.println(puzzleInfo);
        
        
        
    }
    
}
