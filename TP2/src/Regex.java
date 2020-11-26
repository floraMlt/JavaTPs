import java.util.regex.*;

public class Regex {
	
	public static void main(String[] args) {
		// 1)
		/* Pattern est une classe qui encapsule une expression r�guli�re donn�e (cha�ne de caract�res, �crite dans une syntaxe particuli�re, propre � la biblioth�que d'expressions r�guli�res que l'on utilise) 
		Cette classe permet de compiler l'expression r�guli�re fournie avec la m�thode compile(). 
		Matcher, permet de comparer une expression r�guli�re � un texte, et de faire diff�rentes op�rations dessus.
		*/
	
		// 2)
		System.out.println("Strings correspondants � des nombres : ");
		for (String s : args) 
		{
			Pattern nbPattern = Pattern.compile("(\\d)"); // digit
			Matcher nbMatches = nbPattern.matcher(s);
			if (nbMatches.find())
			{		
				System.out.println(s + " ");
			}
		}
		
		// 3) 
		System.out.println(System.getProperty("line.separator") +"Strings avec des nombres ou dernier caract�re est un nombre : ");
		for (String s : args) 
		{
			Pattern pattern = Pattern.compile("(\\d+$)"); // digit + end of a line
			Matcher lastMatches = pattern.matcher(s);
			if(lastMatches.find()) 
			{
				System.out.println(lastMatches.group() + "  ");
			}
		}
		
		byte tabAdress [] = new byte [4];
		adressIPV("192.168.1.255", tabAdress);
		
	}
	
	// 4) 
	public static void adressIPV(String arg, byte[] tabAd) {
		System.out.println("Adresses IPv4 : ");			
		Pattern pattern = Pattern.compile("([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$");
		Matcher matches = pattern.matcher(arg);
		if (matches.find()){
			System.out.println("LOL");
			for(int i=0; i < 4; i++){
				int value = Integer.parseInt(matches.group(i+1));
				if ( value > 255){
					System.out.println("Error");
				}
				System.out.println("value" + (value));
				tabAd[i] = (byte)(value - 128);
				System.out.println(tabAd[i]+128);
			}
		}
	}
}
