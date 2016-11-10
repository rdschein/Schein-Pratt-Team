/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;

import java.util.Scanner;
import dungeonhero.view.MainMenuView;

/**
 *
 * @author Dylan
 */
public class HelpMenuView extends View {
    
    private String menu;
    
    public HelpMenuView(){   
    super( "\n"
                  + "\n---------------------------------"
                  + "\n  Help Menu                      "
                  + "\n---------------------------------"
                  + "\nH-How to Play                    "
                  + "\nM-How to Move?                   "
                  + "\nL-What to look for?              "
                  + "\nI-Finding items                  "
                  + "\nQ-Exit help menu                 "
                  + "\n---------------------------------");
 }

    
@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "H": // creat new game
                System.out.println("How to play instructions her");
                break;
            case "M":
                System.out.println("How to move instructions her");
                break;
            case "L":
                System.out.println("How to play instructions her");
                break;
            case "I":
                System.out.println("How to items instructions her");
                break;
                
            default:
                System.out.println("Invaild selection Try again");
                break;
        
        }
        return false;
    }
    
}
