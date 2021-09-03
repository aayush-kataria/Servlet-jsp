package com.traineemgmt.model.exceptions;

public class TraineeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 4194505128085654190L;
		
	public TraineeNotFoundException(String message) {
		super(message);

	}
}
