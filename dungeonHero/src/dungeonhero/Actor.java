/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero;

import java.io.Serializable;
import java.awt.Point;

/**
 *
 * @author Rob
 */
public enum Actor implements Serializable {
    
    Goblin("Evil underling of the dungeon.", 1, 1),
    Ghost("Evil spirit that haunts the dungeon.", 1, 4),
    Knight("Noble soldier who guards the dungeon.", 2, 2),
    Undead("Skeleton that haunts the dungeon.", 4, 3);
    
    private final String description;
    private final Point coordinates;
    
    Actor(String description, int row, int column) {
        this.description = description;
        this.coordinates = new Point(row, column);
    }
    
    public String getDescription() {
        return description;
    }
    
    public Point getCoordinates() {
        return coordinates;
    }

}
