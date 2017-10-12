package com.kiabi.kialocator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kiabi.kialocator.bo.Salle;

@Repository
public interface SalleRepository extends CrudRepository<Salle, Integer> {

}
