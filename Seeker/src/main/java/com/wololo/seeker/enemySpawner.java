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
            int odds = 0;
            //40% odds of spawing a Goblin
            odds += 40;
            if(spawn < odds){
            enemy = spawnGoblin();                                            
}
            //25% odds of spawing a Zombie
            odds += 25;
            if(spawn < odds){
            enemy = spawnZombie();                       
}
            //25% odds of spawing a Skeleton
            odds += 25;
            if(spawn < odds){
            enemy = spawnSkeleton();            
}
            //10% odds of spawing a Troll
            odds += 10;
            if(spawn <odds){
            enemy = spawnTroll();                       
}
            return enemy;
            assert odds ==100;
    }
}    
            


            
    
    /*
    This class will hold all related to enemy spawning:
    we need:
    - Randomizer to get monsters from 1-6
    - probability of spawning to not get many high level enemies in one room
    -
    */


