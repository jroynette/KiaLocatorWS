package com.kiabi.kialocator.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Salle {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Integer id;
	
	@NotNull
	private String nom;

	@NotNull
	private Integer capactite;

	private Boolean retro;

	private Boolean visio;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id")
	@JsonIgnore
	@NotNull
	private Plan plan;

	private Integer positionX;
	
	private Integer positionY;

	@OneToMany(mappedBy="salle", cascade = CascadeType.REMOVE)
	private List<Photo> photos = new ArrayList<>();

	//private List<Reservation> reservationsJour;

	// champ calcule
	//private Boolean disponible;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCapactite() {
		return capactite;
	}

	public void setCapactite(Integer capactite) {
		this.capactite = capactite;
	}

	public Boolean getRetro() {
		return retro;
	}

	public void setRetro(Boolean retro) {
		this.retro = retro;
	}

	public Boolean getVisio() {
		return visio;
	}

	public void setVisio(Boolean visio) {
		this.visio = visio;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan carte) {
		this.plan = carte;
	}

	public Integer getPositionX() {
		return positionX;
	}

	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}

	public Integer getPositionY() {
		return positionY;
	}

	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	
	public Integer getIdPlan() {
		return (plan != null) ? plan.getId() : null;
	}

	public void setIdPlan(Integer id) {
		if(plan == null){
			plan = new Plan();
		}
		plan.setId(id);
	}
	
	

//	public List<Photo> getPhotos() {
//		return photos;
//	}
//
//	public void setPhotos(List<Photo> photos) {
//		this.photos = photos;
//	}
//
//	public List<Reservation> getReservationsJour() {
//		return reservationsJour;
//	}
//
//	public void setReservationsJour(List<Reservation> reservationsJour) {
//		this.reservationsJour = reservationsJour;
//	}

//	public Boolean getDisponible() {
//		return disponible;
//	}
//
//	public void setDisponible(Boolean disponible) {
//		this.disponible = disponible;
//	}

}
