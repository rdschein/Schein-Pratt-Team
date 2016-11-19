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
    private boolean blockedLocation;
    private String description;
    private String mapSymbol;

    public Scene() {
    }
    
    public static Scene[] createScenes()
    {
    Scene[] scenes = new Scene[SceneType.values().length];
    
    //start and finishing scenes
    Scene startingScene = new Scene();
    startingScene.setDescription(
            "Hello this is the start"
          + "look here");// what should be in the scene
    startingScene.setMapSymbol("ST");
    startingScene.setBlockedLocation(false);
    scenes[SceneType.start.ordinal()] = startingScene;
    
    Scene finishScene = new Scene();
    finishScene.setDescription(
            "You saved the Princess! You're a real Hero! Your name with echo"
          + "through history and you will become a Legend!");// what should be in the scene
    finishScene.setMapSymbol("FN");
    finishScene.setBlockedLocation(false);
    scenes[SceneType.finish.ordinal()] = finishScene;
    
    //location scenes
    Scene a1Scene = new Scene();
    a1Scene.setDescription(
            "A1 Scene"
          + "Needs update");// what should be in the scene
    a1Scene.setMapSymbol("A1");
    a1Scene.setBlockedLocation(false);
    scenes[SceneType.A1.ordinal()] = a1Scene;
    
    Scene a2Scene = new Scene();
    a2Scene.setDescription(
            "A2 Scene"
          + "Needs update");// what should be in the scene
    a2Scene.setMapSymbol("A2");
    a2Scene.setBlockedLocation(false);
    scenes[SceneType.A2.ordinal()] = a2Scene;
    
    Scene a3Scene = new Scene();
    a3Scene.setDescription(
            "A3 Scene"
          + "Needs update");// what should be in the scene
    a3Scene.setMapSymbol("A3");
    a3Scene.setBlockedLocation(false);
    scenes[SceneType.A3.ordinal()] = a3Scene;
    
    Scene a4Scene = new Scene();
    a4Scene.setDescription(
            "A4 Scene"
          + "Needs update");// what should be in the scene
    a4Scene.setMapSymbol("A4");
    a4Scene.setBlockedLocation(false);
    scenes[SceneType.A4.ordinal()] = a4Scene;
    
    Scene a5Scene = new Scene();
    a5Scene.setDescription(
            "A5 Scene"
          + "Needs update");// what should be in the scene
    a5Scene.setMapSymbol("A5");
    a5Scene.setBlockedLocation(false);
    scenes[SceneType.A5.ordinal()] = a5Scene;
    
    Scene a6Scene = new Scene();
    a6Scene.setDescription(
            "A6 Scene"
          + "Needs update");// what should be in the scene
    a6Scene.setMapSymbol("A6");
    a6Scene.setBlockedLocation(false);
    scenes[SceneType.A6.ordinal()] = a6Scene;
    
    Scene a7Scene = new Scene();
    a7Scene.setDescription(
            "A7 Scene"
          + "Needs update");// what should be in the scene
    a7Scene.setMapSymbol("A7");
    a7Scene.setBlockedLocation(false);
    scenes[SceneType.A7.ordinal()] = a7Scene;
    
    Scene a8Scene = new Scene();
    a8Scene.setDescription(
            "A8 Scene"
          + "Needs update");// what should be in the scene
    a8Scene.setMapSymbol("A8");
    a8Scene.setBlockedLocation(false);
    scenes[SceneType.A8.ordinal()] = a8Scene;
    
    Scene a9Scene = new Scene();
    a9Scene.setDescription(
            "A9 Scene"
          + "Needs update");// what should be in the scene
    a9Scene.setMapSymbol("A9");
    a9Scene.setBlockedLocation(false);
    scenes[SceneType.A9.ordinal()] = a9Scene;
    
    Scene a10Scene = new Scene();
    a10Scene.setDescription(
            "A10 Scene"
          + "Needs update");// what should be in the scene
    a10Scene.setMapSymbol("A0");
    a10Scene.setBlockedLocation(false);
    scenes[SceneType.A10.ordinal()] = a10Scene;
    
    Scene b1Scene = new Scene();
    b1Scene.setDescription(
            "B1 Scene"
          + "Needs update");// what should be in the scene
    b1Scene.setMapSymbol("b1");
    b1Scene.setBlockedLocation(false);
    scenes[SceneType.B1.ordinal()] = b1Scene;
    
    Scene b2Scene = new Scene();
    b2Scene.setDescription(
            "b2 Scene"
          + "Needs update");// what should be in the scene
    b2Scene.setMapSymbol("B2");
    b2Scene.setBlockedLocation(false);
    scenes[SceneType.B2.ordinal()] = b2Scene;
    
    Scene b3Scene = new Scene();
    b3Scene.setDescription(
            "b3 Scene"
          + "Needs update");// what should be in the scene
    b3Scene.setMapSymbol("B3");
    b3Scene.setBlockedLocation(false);
    scenes[SceneType.B3.ordinal()] = b3Scene;
    
    Scene b4Scene = new Scene();
    b4Scene.setDescription(
            "b4 Scene"
          + "Needs update");// what should be in the scene
    b4Scene.setMapSymbol("b4");
    b4Scene.setBlockedLocation(false);
    scenes[SceneType.B4.ordinal()] = b4Scene;
    
    Scene b5Scene = new Scene();
    b5Scene.setDescription(
            "b5 Scene"
          + "Needs update");// what should be in the scene
    b5Scene.setMapSymbol("B5");
    b5Scene.setBlockedLocation(false);
    scenes[SceneType.B5.ordinal()] = b5Scene;
    
    Scene b6Scene = new Scene();
    b6Scene.setDescription(
            "B6 Scene"
          + "Needs update");// what should be in the scene
    b6Scene.setMapSymbol("b6");
    b6Scene.setBlockedLocation(false);
    scenes[SceneType.B6.ordinal()] = b6Scene;
    
    Scene b7Scene = new Scene();
    b7Scene.setDescription(
            "b7 Scene"
          + "Needs update");// what should be in the scene
    b7Scene.setMapSymbol("B7");
    b7Scene.setBlockedLocation(false);
    scenes[SceneType.B7.ordinal()] = b7Scene;
    
    Scene b8Scene = new Scene();
    b8Scene.setDescription(
            "b8 Scene"
          + "Needs update");// what should be in the scene
    b8Scene.setMapSymbol("B8");
    b8Scene.setBlockedLocation(false);
    scenes[SceneType.B8.ordinal()] = a8Scene;
    
    Scene b9Scene = new Scene();
    b9Scene.setDescription(
            "b9 Scene"
          + "Needs update");// what should be in the scene
    b9Scene.setMapSymbol("b9");
    b9Scene.setBlockedLocation(false);
    scenes[SceneType.B9.ordinal()] = b9Scene;
    
    Scene b10Scene = new Scene();
    b10Scene.setDescription(
            "b10 Scene"
          + "Needs update");// what should be in the scene
    b10Scene.setMapSymbol("b0");
    b10Scene.setBlockedLocation(false);
    scenes[SceneType.B10.ordinal()] = b10Scene;
    
    Scene c1Scene = new Scene();
    c1Scene.setDescription(
            "c1 Scene"
          + "Needs update");// what should be in the scene
    c1Scene.setMapSymbol("c1");
    c1Scene.setBlockedLocation(false);
    scenes[SceneType.C1.ordinal()] = c1Scene;
    
    Scene c2Scene = new Scene();
    c2Scene.setDescription(
            "c2 Scene"
          + "Needs update");// what should be in the scene
    c2Scene.setMapSymbol("c2");
    c2Scene.setBlockedLocation(false);
    scenes[SceneType.C2.ordinal()] = c2Scene;
    
    Scene c3Scene = new Scene();
    c3Scene.setDescription(
            "c3 Scene"
          + "Needs update");// what should be in the scene
    c3Scene.setMapSymbol("c3");
    c3Scene.setBlockedLocation(false);
    scenes[SceneType.C3.ordinal()] = c3Scene;
    
    Scene c4Scene = new Scene();
    c4Scene.setDescription(
            "c4 Scene"
          + "Needs update");// what should be in the scene
    c4Scene.setMapSymbol("c4");
    c4Scene.setBlockedLocation(false);
    scenes[SceneType.C4.ordinal()] = c4Scene;
    
    Scene c5Scene = new Scene();
    c5Scene.setDescription(
            "c5 Scene"
          + "Needs update");// what should be in the scene
    c5Scene.setMapSymbol("c5");
    c5Scene.setBlockedLocation(false);
    scenes[SceneType.C5.ordinal()] = c5Scene;
    
    Scene c6Scene = new Scene();
    c6Scene.setDescription(
            "C6 Scene"
          + "Needs update");// what should be in the scene
    c6Scene.setMapSymbol("c6");
    c6Scene.setBlockedLocation(false);
    scenes[SceneType.C6.ordinal()] = c6Scene;
    
    Scene c7Scene = new Scene();
    c7Scene.setDescription(
            "c7 Scene"
          + "Needs update");// what should be in the scene
    c7Scene.setMapSymbol("C7");
    c7Scene.setBlockedLocation(false);
    scenes[SceneType.C7.ordinal()] = c7Scene;
    
    Scene c8Scene = new Scene();
    c8Scene.setDescription(
            "c8 Scene"
          + "Needs update");// what should be in the scene
    c8Scene.setMapSymbol("c8");
    c8Scene.setBlockedLocation(false);
    scenes[SceneType.C8.ordinal()] = c8Scene;
    
    Scene c9Scene = new Scene();
    c9Scene.setDescription(
            "C9 Scene"
          + "Needs update");// what should be in the scene
    c9Scene.setMapSymbol("C9");
    c9Scene.setBlockedLocation(false);
    scenes[SceneType.C9.ordinal()] = c9Scene;
    
    Scene c10Scene = new Scene();
    c10Scene.setDescription(
            "C10 Scene"
          + "Needs update");// what should be in the scene
    c10Scene.setMapSymbol("c0");
    c10Scene.setBlockedLocation(false);
    scenes[SceneType.C10.ordinal()] = c10Scene;
    
    Scene d1Scene = new Scene();
    d1Scene.setDescription(
            "d1 Scene"
          + "Needs update");// what should be in the scene
    d1Scene.setMapSymbol("d1");
    d1Scene.setBlockedLocation(false);
    scenes[SceneType.D1.ordinal()] = d1Scene;
    
    Scene d2Scene = new Scene();
    d2Scene.setDescription(
            "d2 Scene"
          + "Needs update");// what should be in the scene
    d2Scene.setMapSymbol("d2");
    d2Scene.setBlockedLocation(false);
    scenes[SceneType.D2.ordinal()] = d2Scene;
    
    Scene d3Scene = new Scene();
    d3Scene.setDescription(
            "d3 Scene"
          + "Needs update");// what should be in the scene
    d3Scene.setMapSymbol("d3");
    d3Scene.setBlockedLocation(false);
    scenes[SceneType.D3.ordinal()] = d3Scene;
    
    Scene d4Scene = new Scene();
    d4Scene.setDescription(
            "d4 Scene"
          + "Needs update");// what should be in the scene
    d4Scene.setMapSymbol("d4");
    d4Scene.setBlockedLocation(false);
    scenes[SceneType.D4.ordinal()] = d4Scene;
    
    Scene d5Scene = new Scene();
    d5Scene.setDescription(
            "d5 Scene"
          + "Needs update");// what should be in the scene
    d5Scene.setMapSymbol("d5");
    d5Scene.setBlockedLocation(false);
    scenes[SceneType.D5.ordinal()] = d5Scene;
    
    Scene d6Scene = new Scene();
    d6Scene.setDescription(
            "d6 Scene"
          + "Needs update");// what should be in the scene
    d6Scene.setMapSymbol("d6");
    d6Scene.setBlockedLocation(false);
    scenes[SceneType.D6.ordinal()] = d6Scene;
    
    Scene d7Scene = new Scene();
    d7Scene.setDescription(
            "d7 Scene"
          + "Needs update");// what should be in the scene
    d7Scene.setMapSymbol("d7");
    d7Scene.setBlockedLocation(false);
    scenes[SceneType.D7.ordinal()] = d7Scene;
    
    Scene d8Scene = new Scene();
    d8Scene.setDescription(
            "d8 Scene"
          + "Needs update");// what should be in the scene
    d8Scene.setMapSymbol("d8");
    d8Scene.setBlockedLocation(false);
    scenes[SceneType.D8.ordinal()] = d8Scene;
    
    Scene d9Scene = new Scene();
    d9Scene.setDescription(
            "d9 Scene"
          + "Needs update");// what should be in the scene
    d9Scene.setMapSymbol("d9");
    d9Scene.setBlockedLocation(false);
    scenes[SceneType.D9.ordinal()] = d9Scene;
    
    Scene d10Scene = new Scene();
    d10Scene.setDescription(
            "d10 Scene"
          + "Needs update");// what should be in the scene
    d10Scene.setMapSymbol("d0");
    d10Scene.setBlockedLocation(false);
    scenes[SceneType.D10.ordinal()] = d10Scene;
    
    Scene e1Scene = new Scene();
    e1Scene.setDescription(
            "e1 Scene"
          + "Needs update");// what should be in the scene
    e1Scene.setMapSymbol("e1");
    e1Scene.setBlockedLocation(false);
    scenes[SceneType.E1.ordinal()] = e1Scene;
    
    Scene e2Scene = new Scene();
    e2Scene.setDescription(
            "e2 Scene"
          + "Needs update");// what should be in the scene
    e2Scene.setMapSymbol("e2");
    e2Scene.setBlockedLocation(false);
    scenes[SceneType.E2.ordinal()] = e2Scene;
    
    Scene e3Scene = new Scene();
    e3Scene.setDescription(
            "e3 Scene"
          + "Needs update");// what should be in the scene
    e3Scene.setMapSymbol("e3");
    e3Scene.setBlockedLocation(false);
    scenes[SceneType.E3.ordinal()] = e3Scene;
    
    Scene e4Scene = new Scene();
    e4Scene.setDescription(
            "e4 Scene"
          + "Needs update");// what should be in the scene
    e4Scene.setMapSymbol("e4");
    e4Scene.setBlockedLocation(false);
    scenes[SceneType.E4.ordinal()] = e4Scene;
    
    Scene e5Scene = new Scene();
    e5Scene.setDescription(
            "e5 Scene"
          + "Needs update");// what should be in the scene
    e5Scene.setMapSymbol("e5");
    e5Scene.setBlockedLocation(false);
    scenes[SceneType.E5.ordinal()] = e5Scene;
    
    Scene e6Scene = new Scene();
    e6Scene.setDescription(
            "e6 Scene"
          + "Needs update");// what should be in the scene
    e6Scene.setMapSymbol("e6");
    e6Scene.setBlockedLocation(false);
    scenes[SceneType.E6.ordinal()] = e6Scene;
    
    Scene e7Scene = new Scene();
    e7Scene.setDescription(
            "E7 Scene"
          + "Needs update");// what should be in the scene
    e7Scene.setMapSymbol("A7");
    e7Scene.setBlockedLocation(false);
    scenes[SceneType.E7.ordinal()] = e7Scene;
    
    Scene e8Scene = new Scene();
    e8Scene.setDescription(
            "e8 Scene"
          + "Needs update");// what should be in the scene
    e8Scene.setMapSymbol("e8");
    e8Scene.setBlockedLocation(false);
    scenes[SceneType.E8.ordinal()] = e8Scene;
    
    Scene e9Scene = new Scene();
    e9Scene.setDescription(
            "e9 Scene"
          + "Needs update");// what should be in the scene
    e9Scene.setMapSymbol("e9");
    e9Scene.setBlockedLocation(false);
    scenes[SceneType.E9.ordinal()] = e9Scene;
    
    Scene e10Scene = new Scene();
    e10Scene.setDescription(
            "A10 Scene"
          + "Needs update");// what should be in the scene
    e10Scene.setMapSymbol("e0");
    e10Scene.setBlockedLocation(false);
    scenes[SceneType.E10.ordinal()] = e10Scene;
    
    
   
    
    
    //enemy scenes
    Scene ghostScene = new Scene();
    ghostScene.setDescription(
            "In the shadows of the room you hear laughter.."
          + "from the darkness you see a hooded figure with a lanturn");// what should be in the scene
    ghostScene.setMapSymbol("GH");
    ghostScene.setBlockedLocation(false);
    scenes[SceneType.ghost.ordinal()] = ghostScene;
    
    
    return scenes;
    }

    private void setMapSymbol(String st) {
        mapSymbol = st;
    }
    
    public String getMapSymbol(){
        return mapSymbol;
    }

    public enum SceneType{
    
        start,
        //MAP LOCATIONS
        A1,
        A2,
        A3,
        A4,
        A5,
        A6,
        A7,
        A8,
        A9,
        A10,
        B1,
        B2,
        B3,
        B4,
        B5,
        B6,
        B7,
        B8,
        B9,
        B10,
        C1,
        C2,
        C3,
        C4,
        C5,
        C6,
        C7,
        C8,
        C9,
        C10,
        D1,
        D2,
        D3,
        D4,
        D5,
        D6,
        D7,
        D8,
        D9,
        D10,
        E1,
        E2,
        E3,
        E4,
        E5,
        E6,
        E7,
        E8,
        E9,
        E10,
        
        //OTHER
        ghost,
        knight,
        finish,
    
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

    public boolean getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(boolean blockedLocation) {
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
