/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wololo.seeker;

/**
 *
 * @author sanch
 */
public class Player {
    private String playerName;
    private static int PLAYER_MAX_HEALTH = 100;
    private static int PLAYER_MIN_HEALTH = 0;
    private static int PLAYER_MIN_LEVEL = 1;
    private static int PLAYER_MAX_LEVEL = 7;
    private int currentHealth;
    boolean isAlive = true;
    
    public Player(String name){
        playerName = name;
    }
    public void setName(String name){
        this.playerName = name;
    }
    
    public String getName(){
        return playerName;
    }
    
    public void damageTaken() {
        
        
            isAlive = (currentHealth > 0);
                    if(currentHealth <= 0){
                        System.out.println("You are dead.");
                    } 
    }
}
    


/*public void playerStatus{
    
    boolean isAlive = true;
    
    if(playerCurrentHealth <= 0){
    
            System.out.println("You are dead.");
    }else{
        isAlive = true;
    }
    }
        
    


/*
Player class holds all the stats, status and behavior.
what it needs:
-Max and Min health
-Current health through the dungeon
-Death condition in case of health drops to zero
-Actions such as: movement, attack/defence, items and spells
*/