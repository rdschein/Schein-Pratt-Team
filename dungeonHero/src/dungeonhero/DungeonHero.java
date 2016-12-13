/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero;

import dungeonhero.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rob and Dylan
 */
public class DungeonHero {
    private static Game currentGame = null;
    
    private static PrintWriter outFile= null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        DungeonHero.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        DungeonHero.inFile = inFile;
    }
    

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
    
    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        DungeonHero.logFile = logFile;
    }
    private static Actor player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        DungeonHero.inFile = new BufferedReader(new InputStreamReader(System.in));
       
        DungeonHero.outFile = new PrintWriter(System.out, true);
        
        String filePath = "log.txt";
        DungeonHero.logFile = new PrintWriter(filePath);
        
        }catch(Throwable e){
            System.out.println("Exception:" + e.toString() + "\nCause: "+ e.getCause() + "\nMessage: " + e.getMessage());
            
            e.printStackTrace();;
        
        }
        
        finally{
            try {
                if(DungeonHero.inFile != null)
                DungeonHero.inFile.close();
                if(DungeonHero.outFile != null)
                DungeonHero.outFile.close();
                if(DungeonHero.logFile != null)
                DungeonHero.logFile.close();
            } catch (IOException ex) {
                Logger.getLogger(DungeonHero.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
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
