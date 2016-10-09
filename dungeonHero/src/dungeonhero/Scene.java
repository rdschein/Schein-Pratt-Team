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
public class Scene implements Serializable{
    
    private String sceneType;
    private String sceneName;
    private String blockedLocation;
    private String description;

    public Scene() {
    }

    
    
    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public String getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(String blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.sceneType);
        hash = 97 * hash + Objects.hashCode(this.sceneName);
        hash = 97 * hash + Objects.hashCode(this.blockedLocation);
        hash = 97 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "sceneType=" + sceneType + ", sceneName=" + sceneName + ", blockedLocation=" + blockedLocation + ", description=" + description + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.sceneType, other.sceneType)) {
            return false;
        }
        if (!Objects.equals(this.sceneName, other.sceneName)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
