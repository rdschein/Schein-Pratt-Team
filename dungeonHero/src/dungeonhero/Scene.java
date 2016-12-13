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
    private boolean canGoNorth;
    private boolean canGoWest;
    private boolean canGoEast;
    private boolean containsBow;

    public boolean isContainsBow() {
        return containsBow;
    }

    public void setContainsBow(boolean containsBow) {
        this.containsBow = containsBow;
    }

    public boolean isCanGoNorth() {
        return canGoNorth;
    }

    public void setCanGoNorth(boolean canGoNorth) {
        this.canGoNorth = canGoNorth;
    }

    public boolean isCanGoWest() {
        return canGoWest;
    }

    public void setCanGoWest(boolean canGoWest) {
        this.canGoWest = canGoWest;
    }

    public boolean isCanGoEast() {
        return canGoEast;
    }

    public void setCanGoEast(boolean canGoEast) {
        this.canGoEast = canGoEast;
    }

    public boolean isCanGoSouth() {
        return canGoSouth;
    }

    public void setCanGoSouth(boolean canGoSouth) {
        this.canGoSouth = canGoSouth;
    }
    private boolean canGoSouth;

    public Scene() {
        containsBow = false;
        
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
            "*-------------------------------------------------------------------*\n"
          + "You saved the Princess! You're a real Hero! Your name will echo"
          + "throughout history and you will become a Legend!\n"
          + "*-------------------------------------------------------------------*");// what should be in the scene
    finishScene.setMapSymbol("FN");
    finishScene.setBlockedLocation(false);
    scenes[SceneType.finish.ordinal()] = finishScene;
    
    //location scenes
    Scene a1Scene = new Scene();
    a1Scene.setDescription(
            "*------------------------------------------------------------------*\n"
          + "You enter the room triumphantly as many monsters "
          + "have fallen before you, however, the real test awaits as the "
          + "Boss of the dungeon emerges to stop you. This is your final obstacle!\n "
          + "When the Boss is defeated, the dungeon is cleared and you will\n"
          + "be known as the Dungeon Hero!\n"
          + "*-------------------------------------------------------------------*");// what should be in the scene
    a1Scene.setMapSymbol(" A1 ");
    a1Scene.setBlockedLocation(false);
    scenes[SceneType.A1.ordinal()] = a1Scene;
    a1Scene.setCanGoNorth(false);
    a1Scene.setCanGoWest(false);
    a1Scene.setCanGoEast(false);
    a1Scene.setCanGoSouth(false);
    
    Scene a2Scene = new Scene();
    a2Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n "
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon!\n "
          + "You notice doorways to the east and the south.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    a2Scene.setMapSymbol(" A2 ");
    a2Scene.setBlockedLocation(false);
    scenes[SceneType.A2.ordinal()] = a2Scene;
    a2Scene.setCanGoNorth(false);
    a2Scene.setCanGoWest(false);
    a2Scene.setCanGoEast(true);
    a2Scene.setCanGoSouth(true);
    
    Scene a3Scene = new Scene();
    a3Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n "
          + "Make another choice in direction to continue\n "
          + "your journey through the dungeon!\n "
          + "You notice doorways to the east, south, and west.\n"
          + "*---------------------------------------------------------*");
    a3Scene.setMapSymbol(" A3 ");
    a3Scene.setBlockedLocation(false);
    scenes[SceneType.A3.ordinal()] = a3Scene;
    a3Scene.setCanGoNorth(false);
    a3Scene.setCanGoWest(true);
    a3Scene.setCanGoEast(true);
    a3Scene.setCanGoSouth(true);
    
    Scene a4Scene = new Scene();
    a4Scene.setDescription(
            "*-----------------------------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue your journey through the dungeon!\n"
          + "You notice a crumbling wall that does not appear to be stable.\n"
          + "perhaps this path leads to another room...you also notice a\n"
          + "doorway to the south and one to the west.\n"
          + "*-----------------------------------------------------------------------------*");// what should be in the scene
    a4Scene.setMapSymbol(" A4 ");
    a4Scene.setBlockedLocation(false);
    scenes[SceneType.A4.ordinal()] = a4Scene;
    a4Scene.setCanGoNorth(false);
    a4Scene.setCanGoWest(true);
    a4Scene.setCanGoEast(true);
    a4Scene.setCanGoSouth(true);
    
    Scene a5Scene = new Scene();
    a5Scene.setDescription(
            "*------------------------------------------------------------------------*\n"
          + "You discover a stash of small bombs in this room!\n"
          + "As you wonder what they could be used for you\n"
          + "notice a crumbling wall that does not appear to be stable.\n"
          + "Perhaps this path leads to another room…the only doorway is to the south.\n"
          + "*------------------------------------------------------------------------*");// what should be in the scene
    a5Scene.setMapSymbol(" A5 ");
    a5Scene.setBlockedLocation(false);
    scenes[SceneType.A5.ordinal()] = a5Scene;
    a5Scene.setCanGoNorth(false);
    a5Scene.setCanGoWest(false);
    a5Scene.setCanGoEast(false);
    a5Scene.setCanGoSouth(true);
    
    Scene a6Scene = new Scene();
    a6Scene.setDescription(
            "*--------------------------------------------------------------*\n"
          + "You enter the room and discover a powerful artifact!\n"
          + "The item is a magical harp that is said to be used\n"
          + "to enhance an enchanted sword. The walls are solid around you!\n"
          + "You will have to go back the way you came to the east.\n"
          + "*--------------------------------------------------------------*");// what should be in the scene
    a6Scene.setMapSymbol(" A6 ");
    a6Scene.setBlockedLocation(false);
    scenes[SceneType.A6.ordinal()] = a6Scene;
    a6Scene.setCanGoNorth(false);
    a6Scene.setCanGoWest(false);
    a6Scene.setCanGoEast(true);
    a6Scene.setCanGoSouth(false);
    
    Scene a7Scene = new Scene();
    a7Scene.setDescription(
            "*------------------------------------------------------------------------*\n"
          + "You enter the room and are challenged by a Knight that guards the dungeon!\n"
          + "You notice that there is a crumbling wall behind him.\n"
          + "You wonder if he is guarding anything important through\n"
          + "the only doorway is to the east.\n"
          + "*------------------------------------------------------------------------*");// what should be in the scene
    a7Scene.setMapSymbol(" A7 ");
    a7Scene.setBlockedLocation(false);
    scenes[SceneType.A7.ordinal()] = a7Scene;
    a7Scene.setCanGoNorth(false);
    a7Scene.setCanGoWest(false);
    a7Scene.setCanGoEast(true);
    a7Scene.setCanGoSouth(false);
    
    Scene a8Scene = new Scene();
    a8Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon!\n"
          + "The only doorway is to the east.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    a8Scene.setMapSymbol(" A8 ");
    a8Scene.setBlockedLocation(false);
    scenes[SceneType.A8.ordinal()] = a8Scene;
    a8Scene.setCanGoNorth(false);
    a8Scene.setCanGoWest(true);
    a8Scene.setCanGoEast(true);
    a8Scene.setCanGoSouth(false);
    
    Scene a9Scene = new Scene();
    a9Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon!\n"
          + "The only doorway is to the east.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    a9Scene.setMapSymbol(" A9 ");
    a9Scene.setBlockedLocation(false);
    scenes[SceneType.A9.ordinal()] = a9Scene;
    a9Scene.setCanGoNorth(false);
    a9Scene.setCanGoWest(true);
    a9Scene.setCanGoEast(true);
    a9Scene.setCanGoSouth(false);
    
    Scene a10Scene = new Scene();
    a10Scene.setDescription(
            "*-------------------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon!\n"
          + "There is a doorway to the west and to the south where you came in.\n"
          + "*-------------------------------------------------------------------*");// what should be in the scene
    a10Scene.setMapSymbol(" A0 ");
    a10Scene.setBlockedLocation(false);
    scenes[SceneType.A10.ordinal()] = a10Scene;
    a10Scene.setCanGoNorth(false);
    a10Scene.setCanGoWest(true);
    a10Scene.setCanGoEast(false);
    a10Scene.setCanGoSouth(true);
    
    Scene b1Scene = new Scene();
    b1Scene.setDescription(
            "*-------------------------------------------------------------------*\n"
          + "As you enter the room you notice bones scattered along the floor...\n"
          + "Perhaps past adventurers who failed to defeat the dungeon monsters?\n"
          + "Unfortunately, you are left with no time to think as the bones"
          + "rise and form into a large skeleton monster!\n"
          + "There are doorways to the north, south, and east.\n"
          + "*-------------------------------------------------------------------*");// what should be in the scene
    b1Scene.setMapSymbol(" b1 ");
    b1Scene.setBlockedLocation(false);
    scenes[SceneType.B1.ordinal()] = b1Scene;
    b1Scene.setCanGoNorth(true);
    b1Scene.setCanGoWest(false);
    b1Scene.setCanGoEast(true);
    b1Scene.setCanGoSouth(true);
    
    Scene b2Scene = new Scene();
    b2Scene.setDescription(
            "*-----------------------------------------------------------------------------*\n"
          + "As you enter the room you notice the heat has increased drastically...\n"
          + "Watch your step! It appear that the dungeon is not only crawling"
          + "with monsters but with fire traps too! There are doorways in every direction.\n"
          + "*-----------------------------------------------------------------------------*");// what should be in the scene
    b2Scene.setMapSymbol(" B2 ");
    b2Scene.setBlockedLocation(false);
    scenes[SceneType.B2.ordinal()] = b2Scene;
    b2Scene.setCanGoNorth(true);
    b2Scene.setCanGoWest(true);
    b2Scene.setCanGoEast(false);
    b2Scene.setCanGoSouth(true);
    
    Scene b3Scene = new Scene();
    b3Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways in every direction.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    b3Scene.setMapSymbol(" B3 ");
    b3Scene.setBlockedLocation(false);
    scenes[SceneType.B3.ordinal()] = b3Scene;
    b3Scene.setCanGoNorth(true);
    b3Scene.setCanGoWest(true);
    b3Scene.setCanGoEast(true);
    b3Scene.setCanGoSouth(true);
    
    Scene b4Scene = new Scene();
    b4Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n "
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways to the west, north, and south.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    b4Scene.setMapSymbol(" b4 ");
    b4Scene.setBlockedLocation(false);
    scenes[SceneType.B4.ordinal()] = b4Scene;
    b4Scene.setCanGoNorth(true);
    b4Scene.setCanGoWest(true);
    b4Scene.setCanGoEast(false);
    b4Scene.setCanGoSouth(true);
    
    Scene b5Scene = new Scene();
    b5Scene.setDescription(
            "*------------------------------------------------------------------------*\n"
          + "You enter the room and notice a glimmer on an old table.\n"
          + "As you investigate you find that it is the master key to the dungeon!\n"
          + "This key enables the user access to all rooms of the dungeon.\n"
          + "There are doorways to the north, south, and west\n"
          + "*------------------------------------------------------------------------*");// what should be in the scene
    b5Scene.setMapSymbol(" B5 ");
    b5Scene.setBlockedLocation(false);
    scenes[SceneType.B5.ordinal()] = b5Scene;
    b5Scene.setCanGoNorth(true);
    b5Scene.setCanGoWest(false);
    b5Scene.setCanGoEast(true);
    b5Scene.setCanGoSouth(true);
    
    Scene b6Scene = new Scene();
    b6Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways to the east and west.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    b6Scene.setMapSymbol(" b6 ");
    b6Scene.setBlockedLocation(false);
    scenes[SceneType.B6.ordinal()] = b6Scene;
    b6Scene.setCanGoNorth(false);
    b6Scene.setCanGoWest(true);
    b6Scene.setCanGoEast(true);
    b6Scene.setCanGoSouth(false);
    
    Scene b7Scene = new Scene();
    b7Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways to the east, west, and south.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    b7Scene.setMapSymbol(" B7 ");
    b7Scene.setBlockedLocation(false);
    scenes[SceneType.B7.ordinal()] = b7Scene;
    b7Scene.setCanGoNorth(false);
    b7Scene.setCanGoWest(true);
    b7Scene.setCanGoEast(true);
    b7Scene.setCanGoSouth(true);
    
    Scene b8Scene = new Scene();
    b8Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways to the east, west, and south.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    b8Scene.setMapSymbol(" B8 ");
    b8Scene.setBlockedLocation(false);
    scenes[SceneType.B8.ordinal()] = a8Scene;
    b8Scene.setCanGoNorth(false);
    b8Scene.setCanGoWest(true);
    b8Scene.setCanGoEast(true);
    b8Scene.setCanGoSouth(true);
    
    Scene b9Scene = new Scene();
    b9Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways to the west and south.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    b9Scene.setMapSymbol(" b9 ");
    b9Scene.setBlockedLocation(false);
    scenes[SceneType.B9.ordinal()] = b9Scene;
    b9Scene.setCanGoNorth(false);
    b9Scene.setCanGoWest(true);
    b9Scene.setCanGoEast(false);
    b9Scene.setCanGoSouth(true);
    
    Scene b10Scene = new Scene();
    b10Scene.setDescription(
            "*---------------------------------------------------------------------------------------*\n"
          + "As you enter the room you notice the heat has increased drastically...\n"
          + "Watch your step! It appear that the dungeon is not only"
          + "crawling with monsters but with fire traps too!\n"
          + "You notice a door on the other side but no way to reach it...\n"
          + "There is a locked door to the north and a doorway that you came through to the south.\n"
          + "*---------------------------------------------------------------------------------------*");// what should be in the scene
    b10Scene.setMapSymbol(" b0 ");
    b10Scene.setBlockedLocation(false);
    scenes[SceneType.B10.ordinal()] = b10Scene;
    b10Scene.setCanGoNorth(false);
    b10Scene.setCanGoWest(false);
    b10Scene.setCanGoEast(false);
    b10Scene.setCanGoSouth(true);
    
    Scene c1Scene = new Scene();
    c1Scene.setDescription(
            "*----------------------------------------------------------------------------------*\n"
          + "As you walk into the room, you are greeted by one of the dungeon goblins!\n"
          + "Though not very powerful, these goblins are abundant and annoying!\n"
          + "He won’t let you pass without a fight! You notice a crumbling wall to the south\n"
          + "….There are doorways to the north and west.\n"
          + "*----------------------------------------------------------------------------------*");// what should be in the scene
    c1Scene.setMapSymbol(" c1 ");
    c1Scene.setBlockedLocation(false);
    scenes[SceneType.C1.ordinal()] = c1Scene;
    c1Scene.setCanGoNorth(true);
    c1Scene.setCanGoWest(false);
    c1Scene.setCanGoEast(true);
    c1Scene.setCanGoSouth(false);
    
    Scene c2Scene = new Scene();
    c2Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways to the north, east, and west.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    c2Scene.setMapSymbol(" c2 ");
    c2Scene.setBlockedLocation(false);
    scenes[SceneType.C2.ordinal()] = c2Scene;
    c2Scene.setCanGoNorth(true);
    c2Scene.setCanGoWest(true);
    c2Scene.setCanGoEast(true);
    c2Scene.setCanGoSouth(false);
    
    Scene c3Scene = new Scene();
    c3Scene.setDescription(
            "*---------------------------------------------------------------------------------------*\n"
          + "You enter the room and are challenged by a Knight that guards the dungeon!\n"
          + "You notice many different doorways but are unable to pass until the Knight is defeated\n"
          + "...There are doorways to the north, east, and west.\n"
          + "*---------------------------------------------------------------------------------------*");// what should be in the scene
    c3Scene.setMapSymbol(" c3 ");
    c3Scene.setBlockedLocation(false);
    scenes[SceneType.C3.ordinal()] = c3Scene;
    c3Scene.setCanGoNorth(true);
    c3Scene.setCanGoWest(true);
    c3Scene.setCanGoEast(true);
    c3Scene.setCanGoSouth(false);
    
    Scene c4Scene = new Scene();
    c4Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways to the north and west.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    c4Scene.setMapSymbol(" c4 ");
    c4Scene.setBlockedLocation(false);
    scenes[SceneType.C4.ordinal()] = c4Scene;
    c4Scene.setCanGoNorth(true);
    c4Scene.setCanGoWest(true);
    c4Scene.setCanGoEast(false);
    c4Scene.setCanGoSouth(false);
    
    Scene c5Scene = new Scene();
    c5Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways to the north and south.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    c5Scene.setMapSymbol(" c5 ");
    c5Scene.setBlockedLocation(false);
    scenes[SceneType.C5.ordinal()] = c5Scene;
    c5Scene.setCanGoNorth(true);
    c5Scene.setCanGoWest(false);
    c5Scene.setCanGoEast(false);
    c5Scene.setCanGoSouth(true);
    
    Scene c6Scene = new Scene();
    c6Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways to the east and south.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    c6Scene.setMapSymbol(" c6 ");
    c6Scene.setBlockedLocation(false);
    scenes[SceneType.C6.ordinal()] = c6Scene;
    c6Scene.setCanGoNorth(false);
    c6Scene.setCanGoWest(false);
    c6Scene.setCanGoEast(true);
    c6Scene.setCanGoSouth(true);
    
    Scene c7Scene = new Scene();
    c7Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways in every direction.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    c7Scene.setMapSymbol(" c7 ");
    c7Scene.setBlockedLocation(false);
    scenes[SceneType.C7.ordinal()] = c7Scene;
    c7Scene.setCanGoNorth(true);
    c7Scene.setCanGoWest(true);
    c7Scene.setCanGoEast(true);
    c7Scene.setCanGoSouth(true);
    
    Scene c8Scene = new Scene();
    c8Scene.setDescription(
            "*-----------------------------------------------------------------------------*\n"
          + "As you walk into the room, you are greeted by one of the dungeon goblins!\n"
          + "Though not very powerful, these goblins are abundant and annoying!\n"
          + "He won’t let you pass without a fight! There are doorways in every direction.\n"
          + "*-----------------------------------------------------------------------------*");// what should be in the scene
    c8Scene.setMapSymbol(" c8 ");
    c8Scene.setBlockedLocation(false);
    scenes[SceneType.C8.ordinal()] = c8Scene;
    c8Scene.setCanGoNorth(true);
    c8Scene.setCanGoWest(true);
    c8Scene.setCanGoEast(true);
    c8Scene.setCanGoSouth(true);
    
    Scene c9Scene = new Scene();
    c9Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue "
          + "your journey through the dungeon!\n"
          + "There are doorways to the north, south, and west.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    c9Scene.setMapSymbol(" c9 ");
    c9Scene.setBlockedLocation(false);
    scenes[SceneType.C9.ordinal()] = c9Scene;
    c9Scene.setCanGoNorth(true);
    c9Scene.setCanGoWest(true);
    c9Scene.setCanGoEast(false);
    c9Scene.setCanGoSouth(true);
    
    Scene c10Scene = new Scene();
    c10Scene.setDescription(
            "*-------------------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There are doorways to the north and the south where you came in.\n"
          + "*-------------------------------------------------------------------*");// what should be in the scene
    c10Scene.setMapSymbol(" c0 ");
    c10Scene.setBlockedLocation(false);
    scenes[SceneType.C10.ordinal()] = c10Scene;
    c10Scene.setCanGoNorth(true);
    c10Scene.setCanGoWest(false);
    c10Scene.setCanGoEast(false);
    c10Scene.setCanGoSouth(true);
    
    Scene d1Scene = new Scene();
    d1Scene.setDescription(
            "*---------------------------------------------------------------------------------------*\n"
          + "You look as though you’ve seen a ghost...Oh wait...you have!\n"
          + "A ghost appears in the room but not only that, there is also a pit of fire!\n"
          + "There is only one other doorway in this room. Do you fight or flee to safety?\n"
          + "Watch your step if you choose to fight off the ghost! There is a doorway to the south.\n"
          + "*---------------------------------------------------------------------------------------*");// what should be in the scene
    d1Scene.setMapSymbol(" d1 ");
    d1Scene.setBlockedLocation(false);
    scenes[SceneType.D1.ordinal()] = d1Scene;
    d1Scene.setCanGoNorth(true);
    d1Scene.setCanGoWest(false);
    d1Scene.setCanGoEast(false);
    d1Scene.setCanGoSouth(false);
    
    Scene d2Scene = new Scene();
    d2Scene.setDescription(
            "*----------------------------------------------------------------------------------*\n"
          + "Two doorways reside in this room.\n"
          + "There are not many options for you to choose but as you"
          + "head towards the next door you hear a ghostly wail. Behind you!\n"
          + "A ghost has appeared and does not appear to want you to continue your journey!\n"
          + "Do you fight? There is a doorway to the south and the east.\n"
          + "*----------------------------------------------------------------------------------*");// what should be in the scene
    d2Scene.setMapSymbol(" d2 ");
    d2Scene.setBlockedLocation(false);
    scenes[SceneType.D2.ordinal()] = d2Scene;
    d2Scene.setCanGoNorth(false);
    d2Scene.setCanGoWest(false);
    d2Scene.setCanGoEast(true);
    d2Scene.setCanGoSouth(true);
    
    Scene d3Scene = new Scene();
    d3Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There There are doorways to the east and west.\n"
          + "*---------------------------------------------------------*\n");// what should be in the scene
    d3Scene.setMapSymbol(" d3 ");
    d3Scene.setBlockedLocation(false);
    scenes[SceneType.D3.ordinal()] = d3Scene;
    d3Scene.setCanGoNorth(false);
    d3Scene.setCanGoWest(true);
    d3Scene.setCanGoEast(true);
    d3Scene.setCanGoSouth(true);
    
    Scene d4Scene = new Scene();
    d4Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There is a doorway to the west where you\n"
          + "came in and a locked door to the south.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    d4Scene.setMapSymbol(" d4 ");
    d4Scene.setBlockedLocation(false);
    scenes[SceneType.D4.ordinal()] = d4Scene;
    d4Scene.setCanGoNorth(false);
    d4Scene.setCanGoWest(true);
    d4Scene.setCanGoEast(false);
    d4Scene.setCanGoSouth(true);
    
    Scene d5Scene = new Scene();
    d5Scene.setDescription(
            "*------------------------------------------------------------------------------*\n"
          +  "This room has strange stone coffins lining the walls.\n"
          + "Suddenly high pitched laughter echoes throughout the room.\n"
          + "The coffins open and lanterns fly out of them and then phase\n"
          + "through the walls into different rooms. There is a gobin to “greet” you!\n"
          + "There are doorways to the north and the south.\n"
          + "*------------------------------------------------------------------------------*");// what should be in the scene
    d5Scene.setMapSymbol(" d5 ");
    d5Scene.setBlockedLocation(false);
    scenes[SceneType.D5.ordinal()] = d5Scene;
    d5Scene.setCanGoNorth(true);
    d5Scene.setCanGoWest(false);
    d5Scene.setCanGoEast(false);
    d5Scene.setCanGoSouth(true);
    
    Scene d6Scene = new Scene();
    d6Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon!\n"
          + "There are doorways to the north and east.\n"
          + "*---------------------------------------------------------*\n");// what should be in the scene
    d6Scene.setMapSymbol(" d6 ");
    d6Scene.setBlockedLocation(false);
    scenes[SceneType.D6.ordinal()] = d6Scene;
    d6Scene.setCanGoNorth(true);
    d6Scene.setCanGoWest(false);
    d6Scene.setCanGoEast(true);
    d6Scene.setCanGoSouth(false);
    
    Scene d7Scene = new Scene();
    d7Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon!\n"
          + "There are doorways in every direction.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    d7Scene.setMapSymbol(" d7 ");
    d7Scene.setBlockedLocation(false);
    scenes[SceneType.D7.ordinal()] = d7Scene;
    d7Scene.setCanGoNorth(true);
    d7Scene.setCanGoWest(true);
    d7Scene.setCanGoEast(true);
    d7Scene.setCanGoSouth(true);
    
    Scene d8Scene = new Scene();
    d8Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon!\n"
          + "There are doorways to the north, east, and west.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    d8Scene.setMapSymbol(" d8 ");
    d8Scene.setBlockedLocation(false);
    scenes[SceneType.D8.ordinal()] = d8Scene;
    d8Scene.setCanGoNorth(true);
    d8Scene.setCanGoWest(true);
    d8Scene.setCanGoEast(true);
    d8Scene.setCanGoSouth(false);
    
    Scene d9Scene = new Scene();
    d9Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon!\n"
          + "You notice a crumbling wall to the east...\n"
          + "There are doorways to the north and west.\n"
          + "*---------------------------------------------------------*");// what should be in the scene
    d9Scene.setMapSymbol(" d9 ");
    d9Scene.setBlockedLocation(false);
    scenes[SceneType.D9.ordinal()] = d9Scene;
    d9Scene.setCanGoNorth(true);
    d9Scene.setCanGoWest(true);
    d9Scene.setCanGoEast(false);
    d9Scene.setCanGoSouth(false);
    
    Scene d10Scene = new Scene();
    d10Scene.setDescription(
            "*----------------------------------------------------------------*\n"
          + "Two doorways reside in this room.\n"
          + "You notice a crumbling wall to the west...\n"
          + "There are not many options for you to choose but\n"
          + "as you head towards the next door you hear a ghostly wail.\n"
          + "Behind you! A ghost has appeared and does not appear to want\n"
          + "you to continue your journey! Do you fight?\n"
          + "There are doorways to the north and south"
          + "*----------------------------------------------------------------*");// what should be in the scene
    d10Scene.setMapSymbol(" d0 ");
    d10Scene.setBlockedLocation(false);
    scenes[SceneType.D10.ordinal()] = d10Scene;
    d10Scene.setCanGoNorth(true);
    d10Scene.setCanGoWest(true);
    d10Scene.setCanGoEast(false);
    d10Scene.setCanGoSouth(true);
    
    Scene e1Scene = new Scene();
    e1Scene.setDescription(
            "*--------------------------------------------------------------*\n"
          + "You’ve successfully made it to this room after avoiding\n"
          + "the pit of fire and defeating the ghost. You discover the\n"
          + "legends of the great enchanted sword to be real. The harp\n"
          + "allows a hero to bear the sword...the only weapon capable\n"
          + "of defeating the dungeon boss!\n"
          + "Your only doorway is back to the north."
          + "*--------------------------------------------------------------*");// what should be in the scene
    e1Scene.setMapSymbol(" e1 ");
    e1Scene.setBlockedLocation(false);
    scenes[SceneType.E1.ordinal()] = e1Scene;
    e1Scene.setCanGoNorth(true);
    e1Scene.setCanGoWest(false);
    e1Scene.setCanGoEast(false);
    e1Scene.setCanGoSouth(false);
    
    Scene e2Scene = new Scene();
    e2Scene.setDescription(
            "*--------------------------------------------------------------------------------------*\n"
          + "This room contains a small weapons stash but many of the items are worn and broken.\n"
          + "You notice a functional bow and a quiver of arrows against the wall.\n"
          + "You decide it could be useful as you travel through the dungeon and\n"
          + "add it to your inventory. There is a doorway to the north and to the west."
          + "*--------------------------------------------------------------------------------------*");// what should be in the scene
    e2Scene.setMapSymbol(" e2 ");
    e2Scene.setBlockedLocation(false);
    scenes[SceneType.E2.ordinal()] = e2Scene;
    e2Scene.setCanGoNorth(true);
    e2Scene.setCanGoWest(false);
    e2Scene.setCanGoEast(true);
    e2Scene.setCanGoSouth(false);
    e2Scene.setContainsBow(true);
    
    Scene e3Scene = new Scene();
    e3Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon!\n"
          + "You notice a crumbling wall to the north...\n"
          + "There is only one doorway to the west."
          + "*---------------------------------------------------------*");// what should be in the scene
    e3Scene.setMapSymbol(" e3 ");
    e3Scene.setBlockedLocation(false);
    scenes[SceneType.E3.ordinal()] = e3Scene;
    e3Scene.setCanGoNorth(true);
    e3Scene.setCanGoWest(true);
    e3Scene.setCanGoEast(false);
    e3Scene.setCanGoSouth(false);
    
    Scene e4Scene = new Scene();
    e4Scene.setDescription(
            "*---------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon! There is a \n"
          + "locked door to the north. There is a doorway to the west."
          + "*---------------------------------------------------------*");// what should be in the scene
    e4Scene.setMapSymbol(" e4 ");
    e4Scene.setBlockedLocation(false);
    scenes[SceneType.E4.ordinal()] = e4Scene;
    e4Scene.setCanGoNorth(true);
    e4Scene.setCanGoWest(false);
    e4Scene.setCanGoEast(true);
    e4Scene.setCanGoSouth(false);
    
    Scene e5Scene = new Scene();
    e5Scene.setDescription(
                     "*---------------------------------------------------------\n*"
                   + "The Entrance Hall is large and\n "
                   + "filled with grotesque statues of\n "
                   + "monsters battling men.\n "
                   + "As you walk around the frozen battlefield you\n "
                   + "notice a door to the north as\n"
                   + "well as a door to the west.\n"
                   + "*---------------------------------------------------------*");
    e5Scene.setMapSymbol(" e5 ");
    e5Scene.setBlockedLocation(false);
    scenes[SceneType.E5.ordinal()] = e5Scene;
    e5Scene.setCanGoNorth(true);
    e5Scene.setCanGoWest(true);
    e5Scene.setCanGoEast(false);
    e5Scene.setCanGoSouth(false);
    
    Scene e6Scene = new Scene();
    e6Scene.setDescription(
            "*------------------------------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon!\n"
          + "There is a doorway to the east where you came in."
          + "*------------------------------------------------------------------------------*");// what should be in the scene
    e6Scene.setMapSymbol(" e6 ");
    e6Scene.setBlockedLocation(false);
    scenes[SceneType.E6.ordinal()] = e6Scene;
    e6Scene.setCanGoNorth(false);
    e6Scene.setCanGoWest(false);
    e6Scene.setCanGoEast(true);
    e6Scene.setCanGoSouth(false);
    
    Scene e7Scene = new Scene();
    e7Scene.setDescription(
            "*------------------------------------------------------------------------------*\n"
          + "This room has stashes of used equipment but nothing looks too useful.\n"
          + "You find a grappling hook and think that it may be useful in your\n"
          + "adventure in the dungeon and add it to your inventory.\n"
          + "There is a doorway to the north and to the west."
          + "*------------------------------------------------------------------------------*");// what should be in the scene
    e7Scene.setMapSymbol(" e7 ");
    e7Scene.setBlockedLocation(false);
    scenes[SceneType.E7.ordinal()] = e7Scene;
    e7Scene.setCanGoNorth(true);
    e7Scene.setCanGoWest(true);
    e7Scene.setCanGoEast(false);
    e7Scene.setCanGoSouth(false);
    
    Scene e8Scene = new Scene();
    e8Scene.setDescription(
            "*------------------------------------------------------------------------------*\n"
          + "You enter the room and notice a glimmer on an old table.\n"
          + "As you investigate you find that it is the master key to the dungeon!\n"
          + "This key enables the user access to all rooms of the dungeon.\n"
          + "There is a doorway to the east where you came in."
          + "*------------------------------------------------------------------------------*");// what should be in the scene
    e8Scene.setMapSymbol(" e8 ");
    e8Scene.setBlockedLocation(false);
    scenes[SceneType.E8.ordinal()] = e8Scene;
    e8Scene.setCanGoNorth(false);
    e8Scene.setCanGoWest(false);
    e8Scene.setCanGoEast(true);
    e8Scene.setCanGoSouth(false);
    
    Scene e9Scene = new Scene();
    e9Scene.setDescription(
            "*------------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue"
          + "your journey through the dungeon!\n"
          + "There is a doorway to the east where you came in."
          + "*------------------------------------------------------*");// what should be in the scene
    e9Scene.setMapSymbol(" e9 ");
    e9Scene.setBlockedLocation(false);
    scenes[SceneType.E9.ordinal()] = e9Scene;
    e9Scene.setCanGoNorth(false);
    e9Scene.setCanGoWest(true);
    e9Scene.setCanGoEast(true);
    e9Scene.setCanGoSouth(false);
    
    Scene e10Scene = new Scene();
    e10Scene.setDescription(
            "*----------------------------------------------------*\n"
          + "This room is empty.\n"
          + "Make another choice in direction to continue\n"
          + "your journey through the dungeon!\n"
          + "There is a doorway to the north and to the west.\n"
          + "*----------------------------------------------------*");// what should be in the scene
    e10Scene.setMapSymbol(" e0 ");
    e10Scene.setBlockedLocation(false);
    scenes[SceneType.E10.ordinal()] = e10Scene;
    e10Scene.setCanGoNorth(true);
    e10Scene.setCanGoWest(true);
    e10Scene.setCanGoEast(false);
    e10Scene.setCanGoSouth(false);
    
   
    
    
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
