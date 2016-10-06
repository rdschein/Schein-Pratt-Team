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
        Player playerOne = new Player();
        
        playerOne.setName("Rob Pratt");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
