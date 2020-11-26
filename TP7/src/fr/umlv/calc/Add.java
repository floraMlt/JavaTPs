package fr.umlv.calc;

public class Add extends Operator {
	
	// constructeur utilisant le contructeur de la classe Operator
	public Add(Expr left, Expr right) {
		super(left, right);
	}
	
	// surcharge de la méthode abstraite eval héritée de Expr
	@Override
	public int eval() {
		return getLeft().eval() + getRight().eval();
	}
	
	// surcharge de la méthode abstraite getStrOperator héritée de Operator
	@Override
	protected String getStrOperator() {
		return " + ";
	}
}
