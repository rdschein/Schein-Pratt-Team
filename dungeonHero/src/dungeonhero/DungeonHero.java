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

    public static Actor getPlayer() {
        return player;
    }

    public static void setPlayer(Actor player) {
        DungeonHero.player = player;
    }
    private static Actor player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView= new StartProgramView();
        try{
        startProgramView.displayStartProgramView();
        } catch(Throwable te){
            System.out.println(te.getMessage()); //Team assignment 10
            te.printStackTrace();
            startProgramView.display();
        }
        
        
    }
    
}
