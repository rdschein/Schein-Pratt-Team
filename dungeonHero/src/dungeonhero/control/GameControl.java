/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.control;

import dungeonhero.Actor;
import dungeonhero.DungeonHero;
import dungeonhero.Enemies;
import dungeonhero.Game;
import dungeonhero.Items;
import dungeonhero.Location;
import dungeonhero.Map;
import dungeonhero.Scene;
import dungeonhero.exceptions.GameControlException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
//import dungeonhero.control.LocationControl;

/**
 *
 * @author Rob
 */
public class GameControl {

    public static Actor createPlayer(String name) {
        //public static Player createPlayer(string name){
        
            if (name == null){
                return null;
            }
        
            Actor player = new Actor();
            player.setName(name);
            
            DungeonHero.setPlayer(player);
            
            return player;
        }

    public static void createNewGame(Actor player) {
        Game game = new Game();
        DungeonHero.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Items[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Enemies[] enemyList = GameControl.createEnemyList();
        game.setEnemies(enemyList);
        
        Map map = LocationControl.createMap();
        game.setMap(map);
        
        LocationControl.moveActorsToStartingLocation(map,player);
    }

    public static Items[] createInventoryList() {
        Items[] inventory = new Items[6];
        
        Items sword = new Items();
        sword.setInventoryType("Sword");
        sword.setQuantity(1);
        sword.setAmountRequired(0);
        sword.setDamage(3);
        inventory[Item.sword.ordinal()] = sword;
        
        Items bow = new Items();
        bow.setInventoryType("Bow");
        bow.setQuantity(0);
        bow.setAmountRequired(0);
        bow.setDamage(2);
        inventory[Item.bow.ordinal()] = bow;
        
        Items bomb = new Items();
        bomb.setInventoryType("Bomb");
        bomb.setQuantity(0);
        bomb.setAmountRequired(0);
        bomb.setDamage(1);
        inventory[Item.bomb.ordinal()] = bomb;
        
        Items grapple = new Items();
        grapple.setInventoryType("Grapple");
        grapple.setQuantity(0);
        grapple.setAmountRequired(0);
        grapple.setDamage(0);
        inventory[Item.grapple.ordinal()] = grapple;
        
        Items harp = new Items();
        harp.setInventoryType("Harp");
        harp.setQuantity(0);
        harp.setAmountRequired(0);
        harp.setDamage(0);
        inventory[Item.harp.ordinal()] = harp;
        
        Items enchantedSword = new Items();
        enchantedSword.setInventoryType("Enchanted Sword");
        enchantedSword.setQuantity(0);
        enchantedSword.setAmountRequired(0);
        enchantedSword.setDamage(5);
        inventory[Item.enchantedSword.ordinal()] = enchantedSword;
        
        return inventory;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //row a
        locations[0][0].setScene(scenes[Scene.SceneType.A1.ordinal()]);
        locations[0][1].setScene(scenes[Scene.SceneType.A2.ordinal()]);
        locations[0][2].setScene(scenes[Scene.SceneType.A3.ordinal()]);
        locations[0][3].setScene(scenes[Scene.SceneType.A4.ordinal()]);
        locations[0][4].setScene(scenes[Scene.SceneType.A5.ordinal()]);
        locations[0][5].setScene(scenes[Scene.SceneType.A6.ordinal()]);
        locations[0][6].setScene(scenes[Scene.SceneType.A7.ordinal()]);
        locations[0][7].setScene(scenes[Scene.SceneType.A8.ordinal()]);
        locations[0][8].setScene(scenes[Scene.SceneType.A9.ordinal()]);
        locations[0][9].setScene(scenes[Scene.SceneType.A10.ordinal()]);
        
        locations[1][0].setScene(scenes[Scene.SceneType.B1.ordinal()]);
        locations[1][1].setScene(scenes[Scene.SceneType.B2.ordinal()]);
        locations[1][2].setScene(scenes[Scene.SceneType.B3.ordinal()]);
        locations[1][3].setScene(scenes[Scene.SceneType.B4.ordinal()]);
        locations[1][4].setScene(scenes[Scene.SceneType.B5.ordinal()]);
        locations[1][5].setScene(scenes[Scene.SceneType.B6.ordinal()]);
        locations[1][6].setScene(scenes[Scene.SceneType.B7.ordinal()]);
        locations[1][7].setScene(scenes[Scene.SceneType.B8.ordinal()]);
        locations[1][8].setScene(scenes[Scene.SceneType.B9.ordinal()]);
        locations[1][9].setScene(scenes[Scene.SceneType.B10.ordinal()]);
        
        locations[2][0].setScene(scenes[Scene.SceneType.C1.ordinal()]);
        locations[2][1].setScene(scenes[Scene.SceneType.C2.ordinal()]);
        locations[2][2].setScene(scenes[Scene.SceneType.C3.ordinal()]);
        locations[2][3].setScene(scenes[Scene.SceneType.C4.ordinal()]);
        locations[2][4].setScene(scenes[Scene.SceneType.C5.ordinal()]);
        locations[2][5].setScene(scenes[Scene.SceneType.C6.ordinal()]);
        locations[2][6].setScene(scenes[Scene.SceneType.C7.ordinal()]);
        locations[2][7].setScene(scenes[Scene.SceneType.C8.ordinal()]);
        locations[2][8].setScene(scenes[Scene.SceneType.C9.ordinal()]);
        locations[2][9].setScene(scenes[Scene.SceneType.C10.ordinal()]);
    
        locations[3][0].setScene(scenes[Scene.SceneType.D1.ordinal()]);
        locations[3][1].setScene(scenes[Scene.SceneType.D2.ordinal()]);
        locations[3][2].setScene(scenes[Scene.SceneType.D3.ordinal()]);
        locations[3][3].setScene(scenes[Scene.SceneType.D4.ordinal()]);
        locations[3][4].setScene(scenes[Scene.SceneType.D5.ordinal()]);
        locations[3][5].setScene(scenes[Scene.SceneType.D6.ordinal()]);
        locations[3][6].setScene(scenes[Scene.SceneType.D7.ordinal()]);
        locations[3][7].setScene(scenes[Scene.SceneType.D8.ordinal()]);
        locations[3][8].setScene(scenes[Scene.SceneType.D9.ordinal()]);
        locations[3][9].setScene(scenes[Scene.SceneType.D10.ordinal()]);

        locations[4][0].setScene(scenes[Scene.SceneType.E1.ordinal()]);
        locations[4][1].setScene(scenes[Scene.SceneType.E2.ordinal()]);
        locations[4][2].setScene(scenes[Scene.SceneType.E3.ordinal()]);
        locations[4][3].setScene(scenes[Scene.SceneType.E4.ordinal()]);
        locations[4][4].setScene(scenes[Scene.SceneType.E5.ordinal()]);
        locations[4][5].setScene(scenes[Scene.SceneType.E6.ordinal()]);
        locations[4][6].setScene(scenes[Scene.SceneType.E7.ordinal()]);
        locations[4][7].setScene(scenes[Scene.SceneType.E8.ordinal()]);
        locations[4][8].setScene(scenes[Scene.SceneType.E9.ordinal()]);
        locations[4][9].setScene(scenes[Scene.SceneType.E10.ordinal()]);
    }

    public static void saveGame(Game game, String filePath) 
        throws GameControlException{
        
        try( FileOutputStream fops = new FileOutputStream(filePath))
        {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }catch(Exception e)
        {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
       Game game = null;
       
       try( FileInputStream fips = new FileInputStream(filePath)){
           ObjectInputStream input = new ObjectInputStream(fips);
           
           game = (Game) input.readObject();
           
           DungeonHero.setCurrentGame(game);
       }
       catch(Exception e){
           throw new GameControlException(e.getMessage());
       }
    }

    public static void getReport2File(String filePath) // assigment 11
        throws GameControlException{
        
        try( BufferedReader in = new BufferedReader(new FileReader(filePath));
              BufferedWriter out = new BufferedWriter(new FileWriter(filePath)))
        {
            String text = "This game is awesome!";
            while((text = in.readLine())!= null)
            {
                out.write(text);
            }
        }catch(Exception e)
        {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getReportToFile(String filePath) //Rob assignment 11
            throws GameControlException {
        try( BufferedReader in = new BufferedReader(new FileReader(filePath));
             BufferedWriter out = new BufferedWriter(new FileWriter(filePath)))
        {
            String text = "Dungeon Hero was written by Dylan Pratt and Rob Schein\n"
                        + "at Brigham Young University-Idaho for the CIT 260 class.";
            while ((text = in.readLine()) != null)
            {
                out.write(text);
            }
        } catch(Exception e)
        {
            throw new GameControlException(e.getMessage());
        }
    }

    private static class health {

        public health() {
        }
    }
    
    public enum Item
    {
        sword,
        bow,
        bomb,
        grapple,
        harp,
        enchantedSword, 
    }
    
    

    public static Enemies[] createEnemyList() {
        System.out.println("createEnemyList() in GameControl called.");
        return null;
    }
}
