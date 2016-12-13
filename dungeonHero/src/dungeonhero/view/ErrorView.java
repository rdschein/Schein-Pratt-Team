/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;

import dungeonhero.DungeonHero;
import java.io.PrintWriter;

/**
 *
 * @author Dylan Pratt
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = DungeonHero.getOutFile();
    private static final PrintWriter logFile = DungeonHero.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                "--------------------------------------------"
              + "\n- ERROR - " + errorMessage
              + "\n--------------------------------------------");
        
        logFile.println(className + " - " + errorMessage);
    }
    
}
