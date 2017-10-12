package com.kiabi.kialocator.bo;

import java.time.LocalTime;

import javax.persistence.Entity;

public class Reservation {

	private LocalTime dateDebut;

	private LocalTime dateFin;

	public LocalTime getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalTime dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalTime getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalTime dateFin) {
		this.dateFin = dateFin;
	}
}
