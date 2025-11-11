/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wololo.seeker;

/**
 *
 * @author sanch
 */
public class Enemy {
    
    private String name;
    private int health;
    private int strength;
    private int speed;
    private int defence;
    
    
    
    
public Enemy (String name, int health, int strength, int speed, int defence){

    this.name = name;
    this.health = health;
    this.strength = strength;
    this.speed = speed;
    this.defence = defence;
}

public String getName(){
    return name;
}

public int getHealth(){
    return health;
}

public int getStrength(){
    return strength;
}

public int getSpeed(){
    return speed;
}

public int getDefence(){
    return defence;
}



public String setName(){
    return name;
}

public int setHealth(){
    return health;
}

public int setStrength(){
    return strength;
}

public int setSpeed(){
    return speed;
}

public int Defence(){
    return defence;
}

 
}   
    

    



/*
   Contains all the featues of the enemies and behaviours
    Loot than can they provide
*/