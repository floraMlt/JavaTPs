package fr.umlv.exo;

import java.util.List;
import java.util.Objects;

public class Exo3 {
	// Méthodes
	/* MAIN*/
	public static void main(final String[] args) {
		var list = List.of("hello", "world", "hello", "lambda");
		    System.out.println(count3(list, "hello"));  // 2
	}
		
	/*AUTRES METHODES*/
	static <T> int count3(List<T> list, T el) {
		Objects.requireNonNull(el, "Element ne doit pas être null");
		return list.stream().filter(element -> el.equals(element)).mapToInt(element -> 1).reduce(0, (total, e) -> total+(e));
	}
}