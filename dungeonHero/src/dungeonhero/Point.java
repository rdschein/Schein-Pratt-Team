/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero;

import java.io.Serializable;

/**
 *
 * @author Dylan Pratt
 */

//public class Player implements Serializable

public class Point implements Serializable {
    
    public int row;
    public int col;
    
    public Point (){}
    
    public int getRow ()
    {
    return row;
    }
    
    public int setRow(int newRow)
    {
        row = newRow;
        return row;
    }
    
    public int getCol ()
    {
    return col;
    }
    
    public int setCol(int newCol)
    {
        col = newCol;
        return col;
    }
}
