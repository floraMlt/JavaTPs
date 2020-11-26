package fr.umlv.exo2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;

public class Basket {
	// attributs
	private HashMap<Fruit, Integer> fruitList;
	//private ArrayList<Fruit> fruitList;
	private int basketQuantity;
	private int bPrice;
	
	// constructeur
	public Basket() {
		this.fruitList = new HashMap<Fruit, Integer>();
		//this.fruitList = new ArrayList<Fruit>();
		this.bPrice = 0;
		this.basketQuantity = 0;
	}
	
	// méthodes
	public void add(Fruit fruit, int quantity) {
		basketQuantity += 1;
		//fruitList.add(fruit);
		fruitList.put(fruit, quantity);
		this.bPrice = bPrice + (fruit.price()*quantity);
	}	
	
	public void add(Fruit fruit) {
		this.add(fruit, 1);
	}
	
	@Override
    public String toString() {
        StringBuilder str = new StringBuilder("Votre panier contient : ");
        str.append(fruitList.size()).append(" articles\n");
        for(HashMap.Entry<Fruit, Integer> entry : fruitList.entrySet()) {
            str.append("- ").append(entry.getKey()).append(" x ").append(entry.getValue()).append("\n");
        }
        str.append("Prix total : ").append(bPrice).append(" €");
        return str.toString();
    }
	
	// Question 1
	/*@Override
	public String toString() {
        StringBuilder str = new StringBuilder("Votre panier contient : ");
        str.append(fruitList.size()).append(" articles\n");
        Iterator<Fruit> iter = fruitList.iterator();
        while(iter.hasNext()) {
        	str.append(iter.next().toString());
        	str.append(" x 1");
        	str.append("\n");
        }
        str.append("Prix total : ").append(bPrice).append(" €");
        return str.toString();
	}*/
}
