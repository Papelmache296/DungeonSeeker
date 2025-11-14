/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wololo.seeker;

import java.util.Random;

/**
 *
 * @author sanch
 */
public class EnemySpawner {
    
    public Enemy spawnEnemy(){
        
        Enemy enemy = null;
        
    Random spawnMonster = new Random();
            
            int spawn = spawnMonster.nextInt(100);
            //If number is between 0-39, spawns a Goblin            
            if((spawn >= 0) && (spawn <= 39)){
            enemy = new Goblin();                                            

            //If number is between 4-64, spawns a Ghoul
            }else if((spawn >= 40) && (spawn <= 64)){
            enemy = new Ghoul();
            
            //If number is between 64-89, spawns a Skeleton
            }else if((spawn >= 65) && (spawn <= 89)){
            enemy = new Skeleton();
            
            //If number is between 90-99, spawns a Troll
            }else if((spawn >= 90) && (spawn <= 99)){
            enemy = new Troll();
            
            //In case of error
            }else{
                System.out.println("ERROR!");
            }
            return enemy;
    }
}            
            
    
    /*
    This class will hold all related to enemy spawning:
    we need:
    - Randomizer to get monsters from 1-6
    - probability of spawning to not get many high level enemies in one room
    -
    */


