/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;
import java.util.Scanner;
import dungeonhero.Game;
import dungeonhero.Map;
import dungeonhero.Player;
/**
 *
 * @author Dylan Pratt
 */
public class ActionInputView extends View {
    
    public ActionInputView(){   
            super("Press q to cancel and return to game menu");
 }

    
@Override
    public boolean doAction(String choice) {
                switch(choice){
            case "go north":
               
                
                break;
            case "go south":
                System.out.println("go north was called");
                break;
            case "go west":
                System.out.println("go north was called");
                break;
            case "go east":
                System.out.println("go north was called");
                break;
            case "attack": // creat new game
                System.out.println("attack funtion is called");
                getAttackOption();
                break;
            case "use item":
                System.out.println("use on what");
                getUseOption();
                //if
                break;
            case "Examine":
                System.out.println("What do you want to examine?");
                getExamineOption();
                //if
                break;
                
            default:
                System.out.println("The action had no effect");
                break;
        
        }
        return false;
        
    }
    
    public String getAttackOption(){
    
    System.out.println("getAttackInput called");
    return "AttackOption";
    
    }
    
    public String getUseOption(){
    
    System.out.println("getAttackInput called");
    return "useOption";
    
    }
    
    public String getExamineOption(){
    
    System.out.println("getAttackInput called");
    return "ExamineOption";
    }
    
   
    
}
