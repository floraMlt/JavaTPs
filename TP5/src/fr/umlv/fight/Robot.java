package fr.umlv.fight;

public class Robot {
	private final String name;
	private int vie;
	
	public Robot(String name) {
		this.name = name;
		this.vie = 10;
	}
	
	public void setVie(int nbVieMoins){this.vie = (this.vie-nbVieMoins);}
	public int getVie(){ return this.vie;}
	public String getName(){ return this.name;}
	/*
	void shot(){
		vie = Math.max(vie-2, 0);
	}
	 */
	
	@Override
	public String toString() {
		return "Robot " + this.name;
	}

	public void fire(Robot robot2) {
		if(robot2.isDead()) { 
			throw new IllegalArgumentException("Erreur code de déontologie de l'association sportive de tir de robot !");
		} else {
			// robot2.shot();
			robot2.setVie(2);
			System.out.println(this + " a été touché par le " + robot2 + " !");
		}
	}
	
	public boolean isDead() {
		if(this.getVie() == 0) {
			System.out.println(this + " mort");
			return true; 
		}else {
			System.out.println(this + " encore en vie !");
			return false; 
		}
	}
	
	boolean rollDice(){
		return true;
	}
	
	/*public static void main(String[] args) {
		var bob = new Robot("bob");
		var bloup = new Robot("bloup");
	    System.out.println(bob);  // affiche "Robot bob"
	    
	    bob.fire(bloup);
	    bob.fire(bloup);
	    bob.fire(bloup);
	    bloup.isDead();
	    bob.fire(bloup);
	    bob.fire(bloup);
	    bloup.isDead();
	    
	    var arena = new Arena();
	    System.out.println("Robot vainqueur : " + arena.fight(bob, bloup));
	    
	}*/

}
