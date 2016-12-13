/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;

import dungeonhero.DungeonHero;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Dylan Pratt
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = DungeonHero.getInFile();
    protected final PrintWriter console = DungeonHero.getOutFile();
    
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
        // get from keyboard
       String value = "";// returned name
       boolean valid = false;
       try {
           while(!valid){
               System.out.println("\nENTER COMMAND HERE:");
           
                value = this.keyboard.readLine();
                value = value.trim();
           
                if(value.length()<1){
                    ErrorView.display(this.getClass().getName(),"You must enter a value");
                    continue;
                }
                break; // end loop
            }
       } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());// error stuff for team assignment 11
        }
     return value;
    }
}