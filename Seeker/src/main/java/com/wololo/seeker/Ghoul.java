/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wololo.seeker;

/**
 *
 * @author sanch
 */
public class Ghoul extends Enemy {
    
    public Ghoul (String name, int health, int strength, int speed, int defence){
        super(name, 10, 7, 4, 4);
        
    }
    
    
    
    
    
}


/* 
    Undead type of enemy, can be killed by healing
    Sacred damage does double damage(Fate stat must be created for specific class before adding this)
    possibility of resurection.
*/
