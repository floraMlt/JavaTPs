package fr.umlv.data;

public class LinkedLink<T> {
	// Attributs
	private Link<T> head;
	
	// Constructeur
	public LinkedLink(){
		this.head = null;
	}
	
	// Méthodes
	public void add(T value) {
		head = new Link<T>(value, head);
	}
	
	public T get(int index) {
		if(head == null) {
			throw new NullPointerException("Liste chainee vide");
		}
		Link<T> currentLink = head;
		for(int i=0 ; i<index ; i++) {
			if(currentLink.getNext() != null) {
				currentLink = currentLink.getNext();
			} else throw new IllegalArgumentException("Index pas compris dans la liste");
		}
		return currentLink.getElement();
	}
	
	public boolean contains(Object o) {
		Link<T> currentLink = head;
		while(currentLink != null) {
			if(currentLink.getElement().equals(o)) {
				return true;
			} else {
				currentLink = currentLink.getNext();
			}
			//return false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("La liste chainee contient : ");
        for(Link<T> curr = head; curr != null; curr = curr.getNext()){              
        	str.append(curr.getElement()).append(' ');
        }
        return str.toString();
	}
}
