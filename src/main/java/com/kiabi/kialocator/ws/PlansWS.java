package com.kiabi.kialocator.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiabi.kialocator.bo.Plan;
import com.kiabi.kialocator.repository.PlanRepository;

@CrossOrigin(origins = {"https://kia-locator-admin.herokuapp.com/","https://kialocator.herokuapp.com/"})
@RestController
public class PlansWS {

	@Autowired
	private PlanRepository planRepository;
	
	@RequestMapping("/plans")
	public Iterable<Plan> loadPlans() {
		return planRepository.findAll();
	}
	
	//TODO changer image plan
}
