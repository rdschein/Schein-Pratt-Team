/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;
import java.util.Scanner;

/**
 *
 * @author Dylan Pratt
 */
class ActionInputView {

    void displayActionInputView() {
        boolean done = false;
        do{
            //prompt for and get players name
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q")){
                //MainMenuView MainMenu = new MainMenuView();
                //MainMenu.displayMainMenuView();
                return; // exit game
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        }while(!done);
        
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in); // get from keyboard
       String value ="";// returned name
       boolean valid = false;
       
       while(!valid){
           System.out.println("\nENTER COMMAND HERE (all lower case):");
           
           value = keyboard.nextLine();
           value = value.trim();
           
           if(value.length()<1){
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
       
           break; // end loop
       }
       return value;
    }

    private boolean doAction(String choice) {
                switch(choice){
            case "attack": // creat new game
                System.out.println("attack funtion is called");
                break;
            case "use item":
                System.out.println("use on what");
                //if
                break;
            case "Examine":
                System.out.println("What do you want to examine?");
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
