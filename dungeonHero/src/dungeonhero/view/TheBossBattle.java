/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;

import java.util.Scanner;
import dungeonhero.view.MainMenuView;
import dungeonhero.view.InventoryView;
import dungeonhero.view.GameMenuView;
/**
 *
 * @author Dylan Pratt
 */
public class TheBossBattle extends View {
    public TheBossBattle(){   
            super("\n"
                  + "\n***********************************************************"
                  + "\n*As you enter the room everything is dark. Its cold.      *"
                  + "\n*Suddenly torches light up. You see over on the other     *"
                  + "\n*side of the room you see a shadow. He is tall and dressed*"
                  + "\n*in black armor.                                          *"
                  + "\n*\"You have done well to make it this far\"               *" 
                  + "\n*                                                         *"
                  + "\n*You draw you Sword.                                      *"
                  + "\n*                                                         *"
                  + "\n*The battle begins                                        *"
                  + "\n***********************************************************");
 }
    
    @Override
    public boolean doAction(String choice) {

        //gameMenu.display();
        return false;
    }
}
    

