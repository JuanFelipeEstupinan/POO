package fr.ensimag.scheduler;

import java.util.HashMap;
import java.util.PriorityQueue;

import fr.ensimag.user.Job;
import fr.ensimag.user.JobId;
import fr.ensimag.user.User;

public class Scheduler {
	
	PriorityQueue<User> UserQueue;
	HashMap<JobId, Job> jobSet;
	private static int jobCount = 0;
	
	public JobId addJob(String execFile, int dureeMax, String userId) {
		Job newJob = new Job(new JobId(jobCount), dureeMax, execFile);
		jobCount++;
		return newJob.getJobId();
	}
	
	Job getJob(JobId id) {
		return jobSet.get(id);
	}
	
	Job extractNextJobToSchedule() {
		// Get user with highest priority
		User nextUser = UserQueue.peek();
		// Retrieve and remove from queue
		Job nextJob = jobQueue.poll();
		// Remove from HashMap
		jobSet.remove(nextJob.getJobId());
		// Update users score
		return nextJob;
	}
	
}
