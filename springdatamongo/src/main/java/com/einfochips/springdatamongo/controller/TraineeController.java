package com.einfochips.springdatamongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.springdatamongo.TraineeRepository;
import com.einfochips.springdatamongo.model.Trainee;

@RestController
public class TraineeController {
	@Autowired
	private TraineeRepository traineeRepo;
	
	@RequestMapping("insertTrainee")
	public ModelAndView insertTrainee() {
		ModelAndView mv = new ModelAndView("success");
		traineeRepo.save(new Trainee("1","Nandini","Ahmedabad"));
		traineeRepo.save(new Trainee("2","Divya","Patan"));
		traineeRepo.save(new Trainee("3","Priya","Ahmedabad"));
		traineeRepo.save(new Trainee("4","Het","Patan"));
		traineeRepo.save(new Trainee("5","Dhruvi","Goa"));
		return mv;
	}
	@RequestMapping("viewTainee")
	public List<Trainee> getTrainee(){
		return traineeRepo.findAll();
	}
	
	@RequestMapping("updateTrainee")
	public Trainee updateTrainee()
	{
		return traineeRepo.save(new Trainee("7","Krishna","Memnagar"));
	}
	@RequestMapping("deleteTrainee")
	public void deleteTrainee() {
		traineeRepo.deleteById("1");
	}
	@RequestMapping("/traineebyloc")
	public List<Trainee> getTraineebyloc(){
		return traineeRepo.getTraineebyLocation();
	}
}
