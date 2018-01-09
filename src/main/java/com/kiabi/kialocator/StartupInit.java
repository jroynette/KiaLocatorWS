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
		plan1.setUrl("https://photos-4.dropbox.com/t/2/AADkbB_mrfoteamVZcHXYpNQqvb1v-Cc9r3fyWHHiD10qg/12/20949726/png/32x32/1/_/1/2/Plan%20Lys%20-%20Batiment%20B%20-%20Niv%201.png/EM7e2g8Y9IsWIAcoBw/HUv0qJB3wvg2viJDn_h_FnqOUtxYOQh_5bC3ztk8NMw?preserve_transparency=1&size=2048x1536&size_mode=3");
		
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
		photo1.setUrl("https://photos-4.dropbox.com/t/2/AADkbB_mrfoteamVZcHXYpNQqvb1v-Cc9r3fyWHHiD10qg/12/20949726/png/32x32/1/_/1/2/Plan%20Lys%20-%20Batiment%20B%20-%20Niv%201.png/EM7e2g8Y9IsWIAcoBw/HUv0qJB3wvg2viJDn_h_FnqOUtxYOQh_5bC3ztk8NMw?preserve_transparency=1&size=2048x1536&size_mode=3");
		photo1.setSalle(salle1);
		
		//plan1.getSalles().add(salle2);

		planRepository.save(plan1);
		salleRepository.save(salle1);
		salleRepository.save(salle2);
		photoRepository.save(photo1);
	}
}
