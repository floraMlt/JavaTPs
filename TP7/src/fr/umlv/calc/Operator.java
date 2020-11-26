package fr.umlv.calc;

import java.util.Objects;

public abstract class Operator implements Expr {
	private Expr left;
	private Expr right;
	
	// constructeur
	public Operator(Expr left, Expr right) {
		this.left = Objects.requireNonNull(left);
		this.right = Objects.requireNonNull(right);
	}
	
	// getters
	protected Expr getLeft() {
		return left;
	}
	
	protected Expr getRight() {
		return right;
	}
	
	// m�thode abstraite que l'on d�finit dans les classes Add et Sub
	protected abstract String getStrOperator();
	
	// Affichage de l'expression
	@Override
	public String toString() {
		return left + getStrOperator() + right;
	}
}
