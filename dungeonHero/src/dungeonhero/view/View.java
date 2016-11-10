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
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View(){}
    
    public View(String message){
    
        this.displayMessage = message;
    }
    
    @Override
     public void display() {
         
         String menu = this.displayMessage;
         System.out.println(menu);
         
        boolean done = false;
        do{
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")){
                //MainMenuView MainMenu = new MainMenuView();
                //MainMenu.display();
                return; // exit game
            }
            // do the requested action and display the next view
            done = this.doAction(value);
        }while(!done);
               
    }
    
    @Override
    public String getInput() {
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
     
}
