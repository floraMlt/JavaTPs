package fr.umlv.calc;

import java.util.Iterator;

public interface Expr {
	
	// méthode abstraite implémentée dans Add et Sub
	public int eval();
	
	// méthode Parse public utilisant la méthode parseRec qui elle est privée et n'a pas besoin d'être accessible à l'exterieur de la classe
	public static Expr parse(Iterator<String> iter) throws IllegalArgumentException{
		  var result = parseRec(iter);
		  if(iter.hasNext()) {
			  throw new IllegalStateException("expression is ill-formed");
		  }
		  return result;
	  }
	  
	  // méthode appelée par parse
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
