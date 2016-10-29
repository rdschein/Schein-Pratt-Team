/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.control;

import dungeonhero.DungeonHero;
import dungeonhero.Player;

/**
 *
 * @author Rob
 */
public class GameControl {

    public static Player createPlayer(String name) {
        //public static Player createPlayer(string name){
        
            if (name == null){
                return null;
            }
        
            Player player = new Player();
            player.setName(name);
            
            DungeonHero.setPlayer(player);
            
            return player;
        }

    public static void createNewGame(Player player) {
     System.out.println("create newGame called");
    }
    }
