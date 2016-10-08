/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero;


import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Dylan
 */
public class Map {
    
    private int numOfRows;
    private int numOfCol;

    public Map() {
    }
    
    

    public int getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(int numOfRows) {
        this.numOfRows = numOfRows;
    }

    public int getNumOfCol() {
        return numOfCol;
    }

    public void setNumOfCol(int numOfCol) {
        this.numOfCol = numOfCol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.numOfRows;
        hash = 47 * hash + this.numOfCol;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "numOfRows=" + numOfRows + ", numOfCol=" + numOfCol + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.numOfRows != other.numOfRows) {
            return false;
        }
        if (this.numOfCol != other.numOfCol) {
            return false;
        }
        return true;
    }
    
    
    
}
