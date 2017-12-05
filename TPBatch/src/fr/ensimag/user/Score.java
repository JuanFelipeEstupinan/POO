package fr.ensimag.user;

public class Score implements Comparable<Score> {
	
	private int score;

	@Override
	public int compareTo(Score oScore) {
		return Integer.compare(this.score, oScore.getScore());
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
