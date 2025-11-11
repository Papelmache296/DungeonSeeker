/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wololo.seeker;

/**
 *
 * @author sanch
 */
public class Troll extends Enemy {
    
        public Troll (String name, int health, int strength, int speed, int defence){
        super(name, 30, 20, 2, 10);
        
    }
    
}

/*
    Mid level enemy, has increased attack and durability but the speed is half of a normal unit such as "Goblin"
    possible adding of random chance of getting 2 of them
*/