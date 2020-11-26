package fr.flora.TP;

public class PrintArgs {
	public static void main(String[] args) {
		for(int i=0 ; i<args.length ; i++) {
			System.out.println(args[i]);
		}
		
		for (String argument : args) {
			System.out.println(argument);
		}
	}
	// s'il n'y a pas d'argument, une exception est lancée
}
