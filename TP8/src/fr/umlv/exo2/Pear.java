package fr.umlv.exo2;

public class Pear implements Fruit {
	// attributs
	private int juice;
	
	// contructeur
	public Pear(int juice) throws IllegalArgumentException {
		if( juice < 0 || juice > 9 ) { throw new IllegalArgumentException("Le facteur de jus est invalide : il doit être entre 0 et 9"); }
		this.juice = juice;
	}
	
	// méthodes
	@Override
	public int price() {
		return juice*3;
	}
	
	@Override
	public String toString() {
		return "Pear (juiceFactor: " + juice + ")";
	}

	@Override
	public boolean equals(final Object o) {
        if (o == null) { return false; }
        if (o == this) { return true; }
        if (!(o instanceof Apple)) { return false; }
        final Pear p = (Pear) o;

        return juice == p.juice;
	}
	
	@Override
    public int hashCode() {
        return 31 * 7 + juice;
    }

}
