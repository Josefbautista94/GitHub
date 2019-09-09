package text_base_adventure_game;



public class Player extends Creature{

	private int healAmount;

	
	public Player(String name, String description, int hp, int damage, int healAmount){
		super(name,description,hp,damage);
		this.healAmount = healAmount;
	}
	
	public void heal() {
		setHitPoints(this.healAmount) ;   
	}

}
