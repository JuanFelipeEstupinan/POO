package fr.ensimag.user;

public class Job {

	private JobId jobId;
	private String file;
	private int dureeMax;

	private enum Etat {
		ATTENTE, COURS, TERMINE
	};

	Etat etat;

	public Job(JobId jobId, int dureeMax, String file) {
		super();
		this.jobId = jobId;
		this.file = file;
		this.dureeMax = dureeMax;
		this.etat = Etat.ATTENTE;
	}

	public JobId getJobId() {
		return jobId;
	}

	public void setJobId(JobId jobId) {
		this.jobId = jobId;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public int getDureeMax() {
		return dureeMax;
	}

	public void setDureeMax(int dureeMax) {
		this.dureeMax = dureeMax;
	}

	public void nextState() {
		switch (this.etat) {
		case ATTENTE:
			this.etat = Etat.COURS;
			break;
		case COURS:
			this.etat = Etat.TERMINE;
			break;
		default:
			break;
		}
	}

}
