/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.control;

import dungeonhero.DungeonHero;
import dungeonhero.Enemies;
import dungeonhero.Game;
import dungeonhero.Items;
import dungeonhero.Map;
import dungeonhero.Player;
//import dungeonhero.control.LocationControl;

/**
 *
 * @author Rob
 */
public class GameControl {

    public static Player createPlayer(String name) {
        //public static Player createPlayer(string name){
        
            if (name == null){
                return null;
            }
        
            Player player = new Player();
            player.setName(name);
            
            DungeonHero.setPlayer(player);
            
            return player;
        }

    public static void createNewGame(Player player) {
        Game game = new Game();
        DungeonHero.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Items[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Enemies[] enemyList = GameControl.createEnemyList();
        game.setEnemies(enemyList);
        
        Map map = LocationControl.createMap();
        game.setMap(map);
        
        LocationControl.moveActorsToStartingLocation(map);
    }

    public static Items[] createInventoryList() {
        Items[] inventory = new Items[7];
        
        Items sword = new Items();
        sword.setInventoryType("Sword");
        sword.setQuantity(0);
        sword.setAmountRequired(0);
        inventory[Item.sword.ordinal()] = sword;
        
        Items bow = new Items();
        bow.setInventoryType("Bow");
        bow.setQuantity(0);
        bow.setAmountRequired(0);
        inventory[Item.bow.ordinal()] = bow;
        
        Items bomb = new Items();
        bomb.setInventoryType("Bomb");
        bomb.setQuantity(0);
        bomb.setAmountRequired(0);
        inventory[Item.bomb.ordinal()] = bomb;
        
        Items grapple = new Items();
        grapple.setInventoryType("Grapple");
        grapple.setQuantity(0);
        grapple.setAmountRequired(0);
        inventory[Item.grapple.ordinal()] = grapple;
        
        Items harp = new Items();
        harp.setInventoryType("Harp");
        harp.setQuantity(0);
        harp.setAmountRequired(0);
        inventory[Item.harp.ordinal()] = harp;
        
        Items enchantedSword = new Items();
        enchantedSword.setInventoryType("Enchanted Sword");
        enchantedSword.setQuantity(0);
        enchantedSword.setAmountRequired(0);
        inventory[Item.enchantedSword.ordinal()] = enchantedSword;
        
        Items key = new Items();
        key.setInventoryType("Key");
        key.setQuantity(0);
        key.setAmountRequired(1);
        inventory[Item.key.ordinal()] = key;
        
        return inventory;
    }
    
    public enum Item
    {
        sword,
        bow,
        bomb,
        grapple,
        harp,
        enchantedSword,
        key   
        
    }

    public static Enemies[] createEnemyList() {
        System.out.println("createEnemyList() in GameControl called.");
        return null;
    }
}
