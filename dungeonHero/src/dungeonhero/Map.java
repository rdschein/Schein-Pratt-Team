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
public class Map implements Serializable {
    
    private int numOfRows;
    private int numOfCol;
    private Location[][] locations;
    public Map() {
    }
    
    public Map (int numOfRows, int numOfCol)
    {
    
        if(numOfRows < 1 || numOfCol < 1) {
            System.out.println("The number of rows and colums must be > Zero");
            return;
    }
       this.numOfRows = numOfRows;
       this.numOfCol = numOfCol;
       
       // creat 2-D array for location objects
       this.locations = new Location[numOfRows][numOfCol];
       
       for (int row = 0; row < numOfRows; row++)
       {
           for(int column = 0; column < numOfCol; column++){
           //create and intitalize new location object instance
           Location location = new Location();
           location.setColumn(column);
           location.setRow(row);
           location.setVisited(false);
           
           // assign the Location object to the current position in array
           locations[row][column] = location;
           }
       }
    }// end of function

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

    public Location[][] getLocations() {
        return locations;
    }
    
    
    
}
