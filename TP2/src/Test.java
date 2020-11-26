
public class Test {

	public static void main(String[] args)
	{
	// 4)  ' ' utilisé pour un caractère. " " utilisé pour un string. On peut l'utiliser là car l'espace est considéré comme un caractère 
         var first = args[0];
         var second = args[1];
         var last = args[2];
         System.out.println(first + ' ' + second + ' ' + last);
	}
}
// 05. Grâce au bytecode, on en déduit qu'utiliser append est plus rapide et optimal qu'utiliser l'opérateur +
