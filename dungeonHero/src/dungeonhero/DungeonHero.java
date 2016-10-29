/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero;

import dungeonhero.view.StartProgramView;

/**
 *
 * @author Rob and Dylan
 */
public class DungeonHero {
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DungeonHero.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DungeonHero.player = player;
    }
    private static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView= new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
        
    }
    
}
