package text_base_adventure_game;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;


public class Game {

	private boolean active = true;
	private Player player;
	private Monster monster1;
	private Monster monster2; 
	private Monster monster3;
	private Battle fight1;
	private Battle fight2;
	private Battle fight3;
	public Room[] dungeon;
	private Room room1;
	private Room room2;
	private TreasureRoom treasureRoom; 


	
	public Game() {
		 		
        File playerInfo = new File("PlayerInfo.txt");
		
		if(playerInfo.exists()) {
			
			System.out.println("File exists");
		} else {
			System.out.println("File doesn't exist ");
		}
		
		playerInfo.canRead();
		
		
		try {
			BufferedReader reader = new BufferedReader( new FileReader(playerInfo));
			
			String line;
			try {
//				while((line = br.readLine()) != null) {
//				}
				
				String name = reader.readLine();
				String description =reader.readLine();
				int hitPoints = Integer.parseInt(reader.readLine());
				int damage = Integer.parseInt(reader.readLine());
				int healAmount = Integer.parseInt(reader.readLine());
				
				player = new Player(name,description,hitPoints,damage,healAmount);
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		monster1 = new Monster("Reptar","Giant big dinosaur", 240,4,20, active );
		fight1 = new Battle(player, monster1);
		room1 = new Room(0,"a giant city half of it being destroyed by a monster",monster1);
		monster2 = new Monster("ghost","scary as ", 300,30,20, active );
		fight2 = new Battle(player, monster2);
		room2 = new Room(1,"dark and cold inhabited by",monster2);
		monster3 = new Monster("Vegeta","An alien", 900,60,50, active );
		fight3 = new Battle(player, monster3);
		treasureRoom = new TreasureRoom(2,"a giant hall with something shiny on the other end",monster3,"a large pile of gold");
			
		dungeon = new Room[] {room1,room2,treasureRoom};
		
		
	
	}
	
	public void play() {
		
		while(active) {
			if(monster1.isAlive()) {
		room1.enter(player);
		fight1.run();
		
			}
			if(monster2.isAlive()) {
		room2.enter(player);
		fight2.run();
			}
			if(monster3.isAlive()) {
		treasureRoom.enter(player);
		fight3.run();
			}
		
		if(!(monster1.isAlive() && monster2.isAlive() && monster3.isAlive()) || !player.isAlive() ) {
			this.active = false;
		}
		}
	}
	
	
	public static void main(String[] args) {
		
		Game game = new Game();
		
		
		game.play();
	}
	
	 
		
	
	
	
}
	
	

