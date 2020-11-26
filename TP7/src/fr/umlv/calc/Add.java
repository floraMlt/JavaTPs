package fr.umlv.calc;

public class Add extends Operator {
	
	// constructeur utilisant le contructeur de la classe Operator
	public Add(Expr left, Expr right) {
		super(left, right);
	}
	
	// surcharge de la m�thode abstraite eval h�rit�e de Expr
	@Override
	public int eval() {
		return getLeft().eval() + getRight().eval();
	}
	
	// surcharge de la m�thode abstraite getStrOperator h�rit�e de Operator
	@Override
	protected String getStrOperator() {
		return " + ";
	}
}
