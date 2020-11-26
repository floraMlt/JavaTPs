package fr.umlv.calc;

public class Value implements Expr {

	private int value;

	// Constructeur
	public Value(final int value) {
        this.value = value;
    }

	// Surcharge de la m�thode eval h�rit�e d'Expr
    @Override
    public int eval() {
        return this.value;
    }
    
    // Affichage de la valeur
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
