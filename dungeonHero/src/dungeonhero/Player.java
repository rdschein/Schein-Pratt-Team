
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
public class Player implements Serializable {
    
    
    private String name;
    private int gameOverCount;
    private int playerRow;
    private int playerCol;

    public int getPlayerRow() {
        return playerRow;
    }

    public void setPlayerRow(int playerRow) {
        this.playerRow = playerRow;
    }

    public int getPlayerCol() {
        return playerCol;
    }

    public void setPlayerCol(int playerCol) {
        this.playerCol = playerCol;
    }

    public Player() {
        playerRow = 5;
        playerCol = 5;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGameOverCount() {
        return gameOverCount;
    }

    public void setGameOverCount(int gameOverCount) {
        this.gameOverCount = gameOverCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + this.gameOverCount;
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", gameOverCount=" + gameOverCount + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.gameOverCount != other.gameOverCount) {
            return false;
        }
        return true;
    }
    
    
}




