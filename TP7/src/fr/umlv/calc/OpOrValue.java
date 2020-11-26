package fr.umlv.calc;
import java.util.Objects;
import java.util.Scanner;
import java.util.Collection;
import java.util.Iterator;

public class OpOrValue {
	  public static final int OP_NONE = 0;
	  public static final int OP_ADD = 1;
	  public static final int OP_SUB = 2;
	  
	  private final int operator;
	  private final int value;
	  private final OpOrValue left;
	  private final OpOrValue right;
	  
	  private OpOrValue(int operator, int value, OpOrValue left, OpOrValue right) { 
		this.operator = operator;
	    this.value = value;
	    this.left = left;
	    this.right = right;
	  }
	  
	  public OpOrValue(int value) { // feuille
	    this(OP_NONE, value, null, null);
	  }
	  
	  public OpOrValue(int operator, OpOrValue left, OpOrValue right) throws IllegalArgumentException { // branche
	    // a bug lies here
	    this(operator, 0, Objects.requireNonNull(left), Objects.requireNonNull(right)); 
	    // on vérifie l'opérateur
	    if (operator != OP_ADD && operator != OP_SUB)
			throw new IllegalArgumentException("L'operateur " + operator + " n'est pas correct");
	  
	  }
	  
	  public int eval() {
	    switch(operator) {
	    case OP_ADD:
	      return left.eval() + right.eval();
	    case OP_SUB:
	      return left.eval() - right.eval();
	    default: // case OP_NONE:
	      return value;
	    }
	  }
	  
	  /*public static OpOrValue parse(Scanner scanner) {
		  var result = parseRec(scanner); // appel à méthode récursive
		  if(scanner.hasNext()) {
			  throw new IllegalStateException("expression is ill-formed");
		  }
		  return result;
	  }
	  
	  private static OpOrValue parseRec(Scanner scanner) throws IllegalArgumentException {
		  if(!scanner.hasNext()) throws IllegalArgumentException {
			  throw new IllegalStateException("expression is ill-formed");
		  }
		  var token = scanner.next();
		  try {
			  var val = Integer.parseInt(token);
			  return new OpOrValue(val);
		  } catch(NumberFormatException nfe) {
			  var left = parseRec(scanner);
			  var right = parseRec(scanner);
			  switch(token) {
			  case "+" :
				  return new OpOrValue(OP_ADD, left, right);
			  case "-" :
				  return new OpOrValue(OP_SUB, left, right);
			 default :
				  throw new IllegalArgumentException("wrong operator");
			  }
		  }
	  }*/
	  
	  public static OpOrValue parse(Iterator<String> iter) throws IllegalArgumentException {
		  var result = parseRec(iter); // appel à méthode récursive
		  if(iter.hasNext()) {
			  throw new IllegalStateException("expression is ill-formed");
		  }
		  return result;
	  }
	  
	  private static OpOrValue parseRec(Iterator<String> iter) throws IllegalArgumentException {
		  if(!iter.hasNext()) {
			  throw new IllegalStateException("expression is ill-formed");
		  }
		  var token = iter.next();
		  try {
			  var val = Integer.parseInt(token);
			  return new OpOrValue(val);
		  } catch(NumberFormatException nfe) {
			  var left = parseRec(iter);
			  var right = parseRec(iter);
			  switch(token) {
			  case "+" :
				  return new OpOrValue(OP_ADD, left, right);
			  case "-" :
				  return new OpOrValue(OP_SUB, left, right);
			 default :
				  throw new IllegalArgumentException("wrong operator");
			  }
		  }
	  }
	  
	  
	  @Override
		public String toString() {
			if (operator != OP_NONE) {
				if (operator == OP_ADD)
					return left.toString() + " + " + right.toString();
				else
					return left.toString() + " - " + right.toString();
			} else {
				return (Integer.toString(value));
			}
	  }
	    
	  /*public static void main(String[] args) {
	    OpOrValue expression = new OpOrValue(OP_ADD,
	        new OpOrValue(2),
	        new OpOrValue(3)
	        );
	    System.out.println(expression.eval());
	    var expr = parse(new Scanner("- + 2 3 4"));
	    System.out.println(expr.eval());
	  }*/
	}