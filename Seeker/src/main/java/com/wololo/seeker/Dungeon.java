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
public class Dungeon {
    private int MAX_PLAYERS_PER_DUNGEON = 1;
    private int MAX_FLOORS_PER_DUNGEON = 4;
    private ArrayList<Enemy> enemies = new ArrayList<>();
    private String floorName;
    
    public Dungeon(String floorName){
        this.floorName = floorName;
    }
   //method under construcction!!!!!!!! 
    public void spawnEnemy(Enemy newEnemy){
        if(enemies.size < MIN_ENEMIES_PER_ROOM){
            enemies.add(newEnemy);
            System.out.println("You have encountered: " + enemy.getName());
        }else{
            
        }
    //REVISE THIS LATER!!!!!!!!
    }
}

/*
    Main class for the dungeon behaviour using random.
    Must contain all the structure of the dungeon such as:
    - Number of floors or rooms or meybe both
    - Amount of enemies encounter per room/floor
    - Type of enemies encountered (one or more types)
    - Possible treasure chest or drop
*/
