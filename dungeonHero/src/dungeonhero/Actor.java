
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
public class Actor implements Serializable {
    
    
    private String name;
    private int actorRow;
    private int actorCol;

    public int getActorRow() {
        return actorRow;
    }

    public void setActorRow(int actorRow) {
        this.actorRow = actorRow;
    }

    public int getActorCol() {
        return actorCol;
    }

    public void setActorCol(int actorCol) {
        this.actorCol = actorCol;
    }

    public Actor() {
        actorRow = 5;
        actorCol = 5;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.name);
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actor other = (Actor) obj;
        
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
      
        return true;
    }
    
    
}




