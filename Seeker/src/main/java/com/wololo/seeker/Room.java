/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wololo.seeker;

import java.util.ArrayList;

/**
 *
 * @author sanch
 */
public class Room {
    
    private int MIN_ENEMIES_PER_ROOM = 1;
    private int MAX_EMEMIES_PER_ROOM = 5;
    
    
    private ArrayList<Enemy> enemies = new ArrayList<>();
    private String floorName;
    
    public Room(String floorName){
        this.floorName = floorName;
    }
    
    public void spawnEnemies(EnemySpawner spawner){
        while(enemies.size < MAX_EMEMIES_PER_ROOM){
            Enemy spawn = spawner.spawnEnemy();
            enemies.add(spawn);
            System.out.println("You have encountered: " + spawn.getName());
        }
    }
    
}

/*
This class will handle all enemy spawing, events ina room and probably the combat system
*/
