/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero;

import java.io.Serializable;

/**
 *
 * @author Dylan
 */
public class Game implements Serializable {
    private Items[] inventory;
    private Enemies[] enemies;
    public Player player;
    public Map map;
    
    public Items[] getInventory() {
        return inventory;
    }
    
    public void setInventory(Items[] inventory) {
        this.inventory = inventory;
    }
    
    public Enemies[] getEnemies() {
        return enemies;
    }
    
    public void setEnemies(Enemies[] enemies) {
        this.enemies = enemies;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Map getMap() {
        return map;
    }
    
    public void setMap(Map map) {
        this.map = map;
    }
}
