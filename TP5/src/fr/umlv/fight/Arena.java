package fr.umlv.fight;

public class Arena {
	public Robot fight(Robot r1, Robot r2) {
		r1.fire(r2);
		if(! r2.isDead()) {
			r2.fire(r1);
			if(! r1.isDead()) {
				return fight(r1, r2);
			} else return r2;
		} else return r1;
	}
	
	/*public static void main(String[] args) {
		var D2R2 = new Robot("D2R2");
		var Data = new Robot("Data");
		var arena = new Arena();
	    System.out.println("Robot vainqueur : " + arena.fight(D2R2, Data));
	}*/
}
