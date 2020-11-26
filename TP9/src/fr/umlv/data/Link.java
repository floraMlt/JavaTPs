package fr.umlv.data;

class Link<T> {
	// Attributs
	private final T element;
	private final Link<T> next;
	
	// Constructeur
	Link(T el, Link<T> nxt){
		this.element = el;
		this.next = nxt;
	}
	
	// Méthodes
	boolean hasNext() {
		if(this.getNext() == null) {
			return false;
		} else return true;
	}
	
	// Getters
	T getElement() {
		return this.element;
	}
	
	Link<T> getNext() {
		return this.next;
	}
	
}