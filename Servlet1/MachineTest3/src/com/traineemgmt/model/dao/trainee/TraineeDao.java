package com.traineemgmt.model.dao.trainee;

import java.util.List;

interface TraineeDao {
	public List<Trainee> getAllTrainees();
	public Trainee addTrainee(Trainee trainee);
}
