package com.traineemgmt.model.dao.trainee;

public class Trainee {
	
	private String traineeId;
	private String traineeName;
	private String branch;
	private double percentage;
		
	public Trainee() {
	}
	
	public Trainee(String traineeName, String branch, double percentage) {
		super();
		this.traineeName = traineeName;
		this.branch = branch;
		this.percentage = percentage;
	}

	public Trainee(String traineeId, String traineeName, String branch, double percentage) {
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.branch = branch;
		this.percentage = percentage;
	}

	public String getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}
