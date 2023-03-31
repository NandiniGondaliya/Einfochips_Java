package com.einfochips.springdatamongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.einfochips.springdatamongo.TraineeRepository;
import com.einfochips.springdatamongo.model.Trainee;

@RestController
public class ExternalController {

	@Autowired
	TraineeRepository tr;
	
	@GetMapping("exttrainee")
	public List<Trainee> getTrainees(){
		return tr.findAll();
	}
	@GetMapping("exttrainee/{id}")
	public Trainee getTraineeById(@PathVariable String id) {
		return tr.findById(id).get();
	}
}
