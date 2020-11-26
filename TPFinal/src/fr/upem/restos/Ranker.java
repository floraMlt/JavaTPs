package fr.upem.restos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Predicate;

public class Ranker<E>{
	private final HashMap<E, ArrayList<Avis>> avisList;

	public Ranker() {
		this.avisList = new HashMap<>();
	}
	
	public void addEvaluation(E item, int score, String comment) {
		ArrayList<Avis> elemAvis = avisList.get(Objects.requireNonNull(item, "Item must not be null"));
		if(elemAvis==null) elemAvis = new ArrayList<Avis>();
		elemAvis.add(new Avis(score, comment));
		avisList.put(item,  elemAvis);
	}
	
	public void addEvaluation(E item, int score) {
		this.addEvaluation(item, score, "");
	}
	
	public double averageScoreFor(E item){
		return avisList.get(item).stream().mapToInt(e -> e.getScore()).average().orElse(0);
	}
	
	public void printCommentsForItemWithScoreBetterOrEqualsThan(int score){
		StringBuilder s = new StringBuilder();
        avisList.entrySet().stream().forEach((el) -> {
            StringBuilder sbElmt = new StringBuilder();
            el.getValue().stream().filter(e -> e.getScore() >= score).forEach((e) -> {
                sbElmt.append(e).append(", ");
            });
            if(sbElmt.length() != 0) {
                sbElmt.delete(sbElmt.length() - 2, sbElmt.length());
                s.append(el.getKey()).append(" : [").append(sbElmt.toString()).append("]\n");
            }
        });
        System.out.println(s.toString());
	}
	
	 public void printCommentsForItemVerifying(Predicate<E> predicate) {
	        StringBuilder s = new StringBuilder();
	        avisList.keySet().stream().filter(predicate).forEach((el) -> {
	            StringBuilder sbElmt = new StringBuilder();
	            avisList.get(el).stream().forEach(e ->{
	                sbElmt.append(e).append(", ");
	            });
	            if(sbElmt.length() != 0) {
	                sbElmt.delete(sbElmt.length() - 2, sbElmt.length());
	                s.append(el).append(" : [").append(sbElmt.toString()).append("]\n");
	            }
	        });
	    System.out.println(s.toString());
	}
	
}
