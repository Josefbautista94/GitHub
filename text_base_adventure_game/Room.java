package text_base_adventure_game;

public class Room {

	public int roomIndex;
	public String description;
	public Monster monster;
	
	public Room(int roomIndex, String description, Monster monster) {
		this.roomIndex = roomIndex;
		this.description = description;
		this.monster = monster; 	
	}

	public void enter(Player player) {
		if (monster.isAlive() == true) {
			System.out.println(player.getName() + " This room is " + this.description + " " + this.monster);
		}
	}
	public boolean isComplete() {
		if(monster.isAlive() == false) {
			return true;
		}
		return false;
	}
	@Override
	public String toString(){         
	   	return String.format("roomIndex %5d, description %20s, monster %10s", roomIndex, description, monster); 	
	    
	    }
	

	
}
