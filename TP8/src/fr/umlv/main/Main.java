package fr.umlv.main;
import fr.umlv.exo2.*;

public class Main {

	public static void main(String[] args) {
        /*var apple1 = new Apple(20, "Golden");
        var apple2 = new Apple(40, "Pink Lady");
   
        var basket = new Basket();
        basket.add(apple1);
        basket.add(apple2);
        System.out.println(basket);
        
        var set = new HashSet<Apple>();
        set.add(new Apple(20, "Golden"));
        System.out.println(set.contains(new Apple(20, "Golden")));
        
        var apple1 = new Apple(20, "Golden");
        var apple2 = new Apple(40, "Pink Lady");
        var pear = new Pear(5);
   
        var basket = new Basket();
        basket.add(apple1);
        basket.add(apple2);  // une pomme
        basket.add(pear);    // une poire
        System.out.println(basket);
        
        var apple1 = new Apple(20, "Golden");
        var apple2 = new Apple(40, "Pink Lady");
        var pear = new Pear(5);
   
        var basket = new Basket();
        basket.add(apple1, 5);      // 5 pommes
        basket.add(apple2);
        basket.add(pear, 7);        // 7 poires
        System.out.println(basket);*/
        
        var apple1 = new Apple(20, ApplesKind.Golden);
        var apple2 = new Apple(40, ApplesKind.PinkLady);
        var pear = new Pear(5);
   
        var basket = new Basket();
        basket.add(apple1, 5);
        basket.add(apple2);
        basket.add(pear, 7);
        System.out.println(basket);
      }
}
