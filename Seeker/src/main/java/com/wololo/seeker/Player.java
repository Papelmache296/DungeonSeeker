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
    private int currentPlayerHealth;
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
           
        int newPlayerHealth = currentPlayerHealth - enemyDamage;
             
        currentPlayerHealth = newPlayerHealth;
                
            isAlive = (currentPlayerHealth > 0);
                    if(currentPlayerHealth <= 0){
                        System.out.println("You are dead.");
                    } 
    }
    
    public void attack(){
        
    /*
     Comunicate to the combatSystem or Enemy class what type of attack   
     the player does.
        
    */
        
    }
    
    public void ability(){
        
    /*
     Selects what spell or ability is used and check conditions like: 
        - Mana
        - Stamina
        - Cooldown(if need it)
        
    */
    }
    
    public void item(){
        
    /*
        
        
    */
        
    }
}
        
    


/*
Player class holds all the stats, status and behavior.
what it needs:
-Max and Min health(DONE)
-Current health through the dungeon(DONE)
-Death condition in case of health drops to zero(DONE)
-Actions such as: movement, attack/defence, items and spells
*/