/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;
import dungeonhero.Actor;
import dungeonhero.DungeonHero;
import java.util.Scanner;
import dungeonhero.Game;
import dungeonhero.Location;
import dungeonhero.Map;
import static dungeonhero.control.LocationControl.moveCharacterToNewLoc;
import java.awt.Point;
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
//            case "go north":
//            Point newLoc = new Point();
//            newLoc.x = DungeonHero.getPlayer().getActorRow()-1;
//            newLoc.y = DungeonHero.getPlayer().getActorCol();
//            
//            moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc, DungeonHero.getCurrentGame().getMap().getLocations());
//            DungeonHero.getCurrentGame().map.visitLocation(newLoc.x, newLoc.y);
//                
//                break;
//            case "go south":
//            Point newLoc2 = new Point();
//            newLoc2.x = DungeonHero.getPlayer().getActorRow()+1;
//            newLoc2.y = DungeonHero.getPlayer().getActorCol();
//            
//            moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc2, DungeonHero.getCurrentGame().getMap().getLocations());
//            DungeonHero.getCurrentGame().map.visitLocation(newLoc2.x, newLoc2.y);
//                break;
//            case "go west":
//            Point newLoc3 = new Point();
//            newLoc3.x = DungeonHero.getPlayer().getActorRow();
//            newLoc3.y = DungeonHero.getPlayer().getActorCol()-1;
//            
//            moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc3, DungeonHero.getCurrentGame().getMap().getLocations());
//            DungeonHero.getCurrentGame().map.visitLocation(newLoc3.x, newLoc3.y);
//                break;
//            case "go east":
//                 Point newLoc4 = new Point();
//            newLoc4.x = DungeonHero.getPlayer().getActorRow();
//            newLoc4.y = DungeonHero.getPlayer().getActorCol()+1;
//            
//            moveCharacterToNewLoc(DungeonHero.getPlayer() ,newLoc4, DungeonHero.getCurrentGame().getMap().getLocations());
//            DungeonHero.getCurrentGame().map.visitLocation(newLoc4.x, newLoc4.y);
//                break;
            case "attack": // create new game
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
