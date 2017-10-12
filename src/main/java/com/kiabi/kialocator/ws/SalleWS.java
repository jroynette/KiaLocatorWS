package com.kiabi.kialocator.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kiabi.kialocator.bo.Photo;
import com.kiabi.kialocator.bo.Salle;
import com.kiabi.kialocator.repository.PhotoRepository;
import com.kiabi.kialocator.repository.SalleRepository;

@RestController
public class SalleWS {

	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private PhotoRepository photoRepository;
	
	@RequestMapping(method = RequestMethod.POST, value = "/salles")
	public Salle creerSalle(@RequestBody Salle salle) {
		return salleRepository.save(salle);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/salles/{id}")
	public Salle modifierSalle(@RequestBody Salle salle) {
		return salleRepository.save(salle);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/salles/{id}")
	public void deleteSalle(@PathVariable("id") Integer id) {
		salleRepository.deleteById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/salles/{id}/photos")
	public void ajoutPhoto(@PathVariable("id") Integer id, @RequestBody Photo photo) {
		//TODO a implem
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/salles/{idSalle}/photos/{idPhoto}")
	public void deletePhoto(@PathVariable("id") Integer idSalle, @PathVariable("id") Integer idPhoto) {
		photoRepository.deleteById(idPhoto);
	}
		
	//photos ajout, supprimer
}
