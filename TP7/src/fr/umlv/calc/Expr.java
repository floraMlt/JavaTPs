package fr.umlv.calc;

import java.util.Iterator;

public interface Expr {
	
	// m�thode abstraite impl�ment�e dans Add et Sub
	public int eval();
	
	// m�thode Parse public utilisant la m�thode parseRec qui elle est priv�e et n'a pas besoin d'�tre accessible � l'exterieur de la classe
	public static Expr parse(Iterator<String> iter) throws IllegalArgumentException{
		  var result = parseRec(iter);
		  if(iter.hasNext()) {
			  throw new IllegalStateException("expression is ill-formed");
		  }
		  return result;
	  }
	  
	  // m�thode appel�e par parse
	  private static Expr parseRec(Iterator<String> iter) throws IllegalArgumentException{
		  if(!iter.hasNext()) {
			  throw new IllegalStateException("expression is ill-formed");
		  }
		  var token = iter.next();
		  try {
			  var val = Integer.parseInt(token);
			  return new Value(val);
		  } catch(NumberFormatException nfe) {
			  var left = parseRec(iter);
			  var right = parseRec(iter);
			  switch(token) {
			  case "+" :
				  return new Add(left, right);
			  case "-" :
				  return new Sub(left, right);
			 default :
				  throw new IllegalArgumentException("wrong operator");
			  }
		  }
	  }
	
}
