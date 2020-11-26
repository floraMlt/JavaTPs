package fr.upem.restos;

import java.util.Objects;

public class Avis {
	private final int score;
	private final String comment;
	
	public Avis(int score, String comment) {
		if(score < 0 || score > 5) {
            throw new IllegalArgumentException("Bad parameter");
        }
		this.score = score;
		this.comment = Objects.requireNonNull(comment, "Comment must not be null");
	}
	
	int getScore(){
		return this.score;
	}
	
	String getComment() {
		return this.comment;
	}
	
	@Override
	 public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("<");
        s.append(score);
        s.append("> ");
        s.append(comment);

        return s.toString();
    }
}
