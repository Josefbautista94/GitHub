package text_base_adventure_game;

public class Monster extends Creature{
	boolean isEnraged = false;
	int enrageThreshold;
	
	public Monster(String name, String description, int hitPoints, int damage, int enrageThreshold, boolean isEnrage) {
		
		super(name, description, hitPoints, damage);
		this.enrageThreshold = enrageThreshold;
		this.isEnraged = false;
		
		
			
		}
	public boolean canEnrage() {
	if(getHitPoints() < this.enrageThreshold) {
		
		return true;
	}
	
		return false;
		
		
		
	}
	public void enrage() {
		if(!isEnraged) {
			setDamage(getDamage() *2);
			isEnraged = true;
			System.out.println("The " + getName() + "has enraged");
		}
	
	
	}
	
	
	
}



