package com.einfochips.springdatamongo;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.RequestMapping;

import com.einfochips.springdatamongo.model.Trainee;

public interface TraineeRepository extends MongoRepository<Trainee, String> {

	@Query("select count(t) from Trainee t")
	int countTrainees();
	
	@Aggregation(pipeline= {
			"{'$match':{'location':'Ahmedabad'}}"
	})
	List<Trainee> getTraineebyLocation();
}
