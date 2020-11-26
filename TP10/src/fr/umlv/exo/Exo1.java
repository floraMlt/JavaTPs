package fr.umlv.exo;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Exo1 {

	// Méthodes
	/* MAIN*/
	public static void main(final String[] args) {
		var list = List.of("hello", "world", "hello", "lambda");
	    System.out.println(count(list, "hello"));  // 2
	    System.out.println(count2(list, "hello"));  // 2
	    System.out.println(count3(list, "hello"));  // 2
	}
	
	/*AUTRES METHODES*/
	static long count(List<String> list, String str) {
		Objects.requireNonNull(str, "Le string ne doit pas être null");
		long nbCount = 0;
		for (String string : list) {
			if (string.equals(str)) nbCount ++;
		}
		return nbCount;
	}
	
	static <T> long count2(List<T> list, T el) {
		Objects.requireNonNull(el, "Element ne doit pas être null");
		return list.stream().filter(str -> el.equals(str)).count();
	}
	
	// Version avec Predicate<T>
	static <T> long count3(List<T> list, T el) {
		Objects.requireNonNull(el, "Element ne doit pas être null");
		return list.stream().filter(isSame(el)).count();
	}
	
	private static <T> Predicate<T> isSame(T el) {
		Objects.requireNonNull(el, "Element ne doit pas être null");
		return element -> el.equals(element);
	}
}
