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
class HelpMenuView {
    
    private String menu;
    
    public HelpMenuView(){   
    this.menu = "\n"
                  + "\n---------------------------------"
                  + "\n  Help Menu                      "
                  + "\n---------------------------------"
                  + "\nH-How to Play"
                  + "\nM-How to Move?"
                  + "\nL-What to look for?"
                  + "\nI-Finding items"
                  + "\nQ-Exit help menu"
                  + "\n---------------------------------";
 }

    void displayHelpMenu() {
        
        System.out.println(menu);
        
        boolean done = false;
        do{
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")){
                MainMenuView MainMenu = new MainMenuView();
                MainMenu.displayMainMenuView();
                return; // exit game
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        }while(!done);
        
    }
    
    private String getMenuOption() {
       Scanner keyboard = new Scanner(System.in); // get from keyboard
       String value ="";// returned name
       boolean valid = false;
       
       while(!valid){
           System.out.println("\nENTER COMMAND HERE:");
           
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
