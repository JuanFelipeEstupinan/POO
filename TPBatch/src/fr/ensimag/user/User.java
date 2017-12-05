package fr.ensimag.user;

import java.util.LinkedList;

public class User {
	private String userId;
	private Score score;
	private LinkedList<Job> jobs;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public LinkedList<Job> getJobs() {
		return jobs;
	}

	public void setJobs(LinkedList<Job> jobs) {
		this.jobs = jobs;
	}	
}
