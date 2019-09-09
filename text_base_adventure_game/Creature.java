package text_base_adventure_game;

public class Creature {

	private String name;
	private String description;
	private int hitPoints;
	private int damage;
	private Room room;
	
	public Creature() {
		name = "";
		description = "";
		hitPoints = 0;
		damage = 0;
		room = null;
	}
	
	public Creature(String name, String description, int hitPoints, int damage) {
		this.name = name;
		this.description = description;
		this.hitPoints = hitPoints;
		this.damage = damage;
		this.room = null;
	}
	

	@Override
	public String toString() {
		return String.format("name %3s, description %10s, hitPoints % 03d, damage %02d", name , description, hitPoints, damage);
		
	}
	
	
	public void attack(Creature creature) {
		System.out.print(this.name + "attacks target" + creature.name + "dealing" + damage + "damage");
	}
	
	
	public void takeDamage(int damage) {
		hitPoints = hitPoints - damage;
		if(hitPoints < 0) {
			hitPoints = 0;
		}
	}
	
	public boolean isAlive() {
		if (hitPoints > 0 ) {
			return true;
		}
			else {
				return false;
		}
		
		
		}
		
	public void setHitPoints(int hitPoints) {
		if(hitPoints <0) {
			this.hitPoints =0;
		}
		this.hitPoints += hitPoints;
	}
	public int getHitPoints() {
		return this.hitPoints;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getDamage() {
		return this.damage;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public Room getRoom() {
		return this.room;
	}
	public void setName(String name) {
		this.name = name;
	
	}
	public String getName() {
		return this.name;
	}
	
    public String getDescription() {
		return this.description;
	}

}
