
public class Test {

	public static void main(String[] args)
	{
	// 4)  ' ' utilis� pour un caract�re. " " utilis� pour un string. On peut l'utiliser l� car l'espace est consid�r� comme un caract�re 
         var first = args[0];
         var second = args[1];
         var last = args[2];
         System.out.println(first + ' ' + second + ' ' + last);
	}
}
// 05. Gr�ce au bytecode, on en d�duit qu'utiliser append est plus rapide et optimal qu'utiliser l'op�rateur +
