/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.view;

import dungeonhero.control.GameControl;
import java.util.Scanner;
/**
 *
 * @author Rob
 */
public class SaveGameView {
    
    private String promptMessage;
    
    public SaveGameView() {
        this.promptMessage = "";
    }
    
    void displaySave() {
        System.out.println("Save game function was called.");
    }
}
