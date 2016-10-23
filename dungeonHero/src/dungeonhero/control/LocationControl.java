/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.control;
/**
 *
 * @author Rob
 */
public class LocationControl {
    
    public int getRandomRow(int row) {
        
        row = row + 3;
        
        while (row > 5) {
            row = row - 5;
        }
        while (row < 1) {
            row = row + 4;
        }
       
        return row;
    }
    
    public int getRandomCol(int col) {
        // Dylan wrote this function
        // Dyaln wrote this function
    
    col = col + 7;
    
    while(col > 10){
    col = col - 7;
    }
    while(col < 1){
    col = col + 4;
    }
    return col;
    
    }
}
