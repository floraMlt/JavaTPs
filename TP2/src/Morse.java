
public class Morse {
	public static void main(String[] args) {
		// 1)
		var newS = "";
		for(String txt : args) {
			newS += txt + " Stop. ";
		}
		System.out.println(newS);
		
		// 2)
		// java.lang.StringBuilder permet d'avoir des objets comme des String mais que l'on peut modifier.
		// append() permet d'ajouter un string à un stringBuilder, elle renvoie donc le stringBuilder modifié
		// String newS=(new StringBuilder()).append("txt").append(" Stop . ").toString(); 
		
		// 3)
		StringBuilder newS2= new StringBuilder();
		for (String txt : args){
			newS2.append(txt).append(" Stop. ");		
		}
		System.out.println(newS2);
		// Avec un StringBuilder on peut utiliser la méthode append() autant qu'on veut sans faire de copie

	}

}
