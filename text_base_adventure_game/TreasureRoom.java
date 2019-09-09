package text_base_adventure_game;

public class TreasureRoom extends Room {

private String treasure;

	
	public TreasureRoom(int roomIndex, String description, Monster monster,String treasure) {
		super(roomIndex, description, monster);
		
		this.treasure = treasure;

	
	}
	
	
	
	public void enter(Player player) {
		if(monster.isAlive() == true) {
//		System.out.println(player.getName() + "This room is " + this.description + " and has " + this.monster);
			toString();
		}
		else {
			System.out.println("You explored the room and found the hidden treasure" + this.treasure);
		}
	 
			
	}

}