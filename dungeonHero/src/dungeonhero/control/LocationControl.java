/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.control;
import java.util.Scanner;
/**
 *
 * @author Rob
 */
public class LocationControl {
    
    public double getRandomRow(int row) {
        
        row = row + 3;
        while (row >= 5) {
            row = row - 5;
        }
        while (row <= 1) {
            row = row + 4;
        }
       
        return row;
    }
}
