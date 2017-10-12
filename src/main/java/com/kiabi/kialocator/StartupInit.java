package com.kiabi.kialocator;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kiabi.kialocator.bo.Photo;
import com.kiabi.kialocator.bo.Plan;
import com.kiabi.kialocator.bo.Salle;
import com.kiabi.kialocator.repository.PhotoRepository;
import com.kiabi.kialocator.repository.PlanRepository;
import com.kiabi.kialocator.repository.SalleRepository;

@Component
public class StartupInit {

	@Autowired
	PlanRepository planRepository;
	
	@Autowired
	SalleRepository salleRepository;
	
	@Autowired
	PhotoRepository photoRepository;

	@PostConstruct
	public void init() {

		Plan plan1 = new Plan();
		plan1.setBatiment("1");
		plan1.setEtage("1");
		plan1.setSite("Hem");
		plan1.setUrl("http://test.com");
		
		Salle salle1 = new Salle();
		salle1.setNom("salle1");
		salle1.setPositionX(10);
		salle1.setPositionY(20);
		salle1.setRetro(true);
		salle1.setVisio(false);
		salle1.setPlan(plan1);
		salle1.setCapactite(10);
		
		Salle salle2 = new Salle();
		salle2.setNom("salle2");
		salle2.setPositionX(100);
		salle2.setPositionY(200);
		salle2.setRetro(false);
		salle2.setVisio(true);
		salle2.setPlan(plan1);
		salle2.setCapactite(5);
		
		Photo photo1 = new Photo();
		photo1.setLibelle("photo1");
		photo1.setUrl("http://testphoto.com");
		photo1.setSalle(salle1);
		
		//plan1.getSalles().add(salle2);

		planRepository.save(plan1);
		salleRepository.save(salle1);
		salleRepository.save(salle2);
		photoRepository.save(photo1);
	}
}
