package text_base_adventure_game;

import java.util.Scanner;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Battle {

	
	private Player player;
	private Monster monster;
	Scanner scnr = new Scanner(System.in);
	private String input;

	public Battle (Player player, Monster monster) {
	this.player = player;
	this.monster = monster;
	}
	


	public void run() {
		System.out.println("A battle begins: " + player.getName() + " vs " + monster.getName());
		while(monster.isAlive() == true && player.isAlive() == true) {
            System.out.println("--------------------------------");
            System.out.println(player.getName() + ": " + player.getHitPoints() + " vs " + monster.getName() + ": " + monster.getHitPoints());
            System.out.println(player.getName() + "'s turn");
            System.out.println(" Attack(a) or Heal(h)? ");
            System.out.println("--------------------------------");
            input = scnr.next();
               if(input.equals("a") || input.equals("A")) {
                   monster.takeDamage(player.getDamage());
                   
           		    System.out.println("--------------------------------");   
        			System.out.println(monster.getName() + "'s turn");
        			System.out.println("--------------------------------");
                  
                   if(monster.canEnrage()) {
                  	 monster.enrage();
                       player.takeDamage(monster.getDamage());
                   } 
                   else {
                       player.takeDamage(monster.getDamage());
                   }
                    
               
               }
              
               else if (input.equals("h") || input.equals("H")) {
                   player.heal();
               }
//               else {

               else {
            	   
                   System.out.println("--------------------------------");
               	   System.out.println("Invalid input, try again");
                   System.out.println("--------------------------------");  
                  
                   }
             
              
                if(monster.isAlive() == false) {
                    System.out.println("--------------------------------");
                    System.out.println("You've defeated the creature!");
                    System.out.println("--------------------------------");
                    
                } 
                else if (player.isAlive() == false) {
              	  // if player is dead print you lose
                 System.out.println("--------------------------------"); 
              	  System.out.println("Game Over - YOU HAVE BEEN DEFEATED!");
                 System.out.println("--------------------------------");
                  
                } 
            
        }
	}
}