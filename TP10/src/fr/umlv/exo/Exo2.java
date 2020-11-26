package fr.umlv.exo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exo2 {
	// M�thodes
	/* MAIN*/
	public static void main(final String[] args) {
		var list = List.of("hello", "world", "hello", "lambda");
		System.out.println(upperCase(list));  // [HELLO, WORLD, HELLO, LAMBDA]
		System.out.println(upperCase2(list));
		System.out.println(upperCase3(list));
		System.out.println(upperCase4(list));
	}
		
	/*AUTRES METHODES*/
	//Exo2_Q1
	private static List<String> upperCase(List<String> list){
		Objects.requireNonNull(list, "La liste ne doit pas �tre null");
		if(list.isEmpty()) { throw new IllegalArgumentException("La liste ne peut pas �tre vide");}
		List<String> listUpCase = new ArrayList<String>();
		for(String str : list) {
			listUpCase.add(str.toUpperCase());
		}
		return listUpCase;
	}
	
	// Exo2_Q2
	private static List<String> upperCase2(List<String> words){
		Objects.requireNonNull(words, "La liste ne doit pas �tre null");
		if(words.isEmpty()) { throw new IllegalArgumentException("La liste ne peut pas �tre vide");}
		var uppercases = new ArrayList<String>();
		words.stream().map(el -> el.toUpperCase()).forEach(el -> uppercases.add(el));
		return uppercases;
	}
	
	// Exo2_Q3
	private static List<String> upperCase3(List<String> words){
		Objects.requireNonNull(words, "La liste ne doit pas �tre null");
		if(words.isEmpty()) { throw new IllegalArgumentException("La liste ne peut pas �tre vide");}
		var uppercases3 = new ArrayList<String>();
		words.stream().map(String::toUpperCase).forEach(el -> uppercases3.add(el));
		return uppercases3;
	}
	
	//Exo2_Q4
	private static List<String> upperCase4(List<String> words){
		Objects.requireNonNull(words, "La liste ne doit pas �tre null");
		if(words.isEmpty()) { throw new IllegalArgumentException("La liste ne peut pas �tre vide");}
		return words.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
}
