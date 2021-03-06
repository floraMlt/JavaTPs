package fr.umlv.arthur.main;
import fr.umlv.arthur.Sword;
import fr.umlv.arthur.Knight;
import fr.umlv.arthur.Shield;
import fr.umlv.arthur.Bow;
import fr.umlv.arthur.Heroicity;

public class Main {

	public static void main(String[] args) {
		// Q1
		var excalibur = new Sword("excalibur", 10);
	    var arthur = new Knight("arthur", excalibur);
	    System.out.println(excalibur.name());    // affiche: excalibur
	    System.out.println(excalibur.damage());  // affiche: 10
	    System.out.println(excalibur);           // affiche: excalibur
	    System.out.println(arthur.name());       // affiche: arthur
	    System.out.println(arthur.damage());     // affiche: 10
	    
	    // Q2
	    var excalibur2 = new Sword("excalibur", 10);
	    System.out.println(excalibur.equals(excalibur2));     // true
	
	    // Q3
	    var secace = new Sword("secace", 7);
	    var seure = new Sword("seure", 4);
	    var lancelot = new Knight("lancelot", secace, seure);
	    System.out.println(lancelot.damage());     // 11
	    
	    // Q4
	    System.out.println(lancelot.isBetterThan(arthur)); //true
	    
	    // Q5
	    var hydra = new Shield("hydra", 4);
	    var clarent = new Sword("clarent", 7);
	    var mordred = new Knight("mordred", hydra, clarent);
	    System.out.println(mordred.damage());  // 7
	    System.out.println(mordred.protection());  // 4
	    
	    // Q6
	    System.out.println(arthur);
	    System.out.println(mordred);
	    
	    // Q7 
	    var astra = new Sword("astra", 20);
	    var bow1 = new Bow("bow1", 10, 7);  // bow1 est un Bow de name "bow1", 
	                                        // de damage 10 et de protection 7
	    var bow2 = new Bow("bow2", 10, 7);
	    var shield = new Shield("shield", 12);
	    var shiva = new Knight("shiva", astra, bow1, bow2, shield);
	    System.out.println(shiva);  //affiche: shiva damage: 40 protection: 26
	                                //           [astra, bow1, bow2, shield]
	    
	    // Q8
	    //var excalibur = new Sword("excalibur", 10);
	    //var arthur = new Knight("arthur", excalibur);
	    System.out.println(arthur.isHeroic());   // false
	    arthur.setHeroicity(new Heroicity(2));   // applique un facteur 2
	    System.out.println(arthur.isHeroic());   // true
	    System.out.println(arthur.damage());     // 20
	    System.out.println(arthur.protection()); // 0
	    System.out.println(arthur);  // affiche: arthur damage: 20 protection: 0
	                                 //            [excalibur]
	    
	    // Q9
	    mordred.setHeroicity(new Heroicity(2, 3)); // 2 sur les d�g�ts et 3 sur la protection
	    System.out.println(mordred.isHeroic());    // true
	    System.out.println(mordred.damage());      // 14
	    System.out.println(mordred.protection());  // 12
	    System.out.println(mordred);  // affiche: mordred damage: 14 protection: 12
	                                  //            [hydra, clarent]
	    
	
	}

}
