/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wololo.seeker;

/**
 *
 * @author sanch
 */
public class Goblin extends Enemy {
    
        public Goblin (String name, int health, int strength, int speed, int defence){
        super(name, 5, 2, 6, 2);
        
    }
    
}


/*
    Weakest of the enemies, can die with one blow at low level if its a critical
    only has 1 attack and can be more than one at the same time
    possible option of a "horde" of them
*/