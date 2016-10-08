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
    }
    
}
