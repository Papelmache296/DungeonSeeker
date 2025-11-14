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
            //40% odds of spawing a Goblin            
            if((spawn >= 0) && (spawn <= 39)){
            enemy = spawnGoblin();                                            

            //25% odds of spawing a Zombie
            }else if((spawn >= 40) && (spawn <= 64)){
            enemy = spawnZombie();
            
            //25% odds of spawing a Skeleton
            }else if((spawn >= 65) && (spawn <= 89)){
            enemy = spawnSkeleton();
            
            //10% odds of spawing a Troll
            }else if((spawn >= 90) && (spawn <= 99)){
            enemy = spawnTroll();                       
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


