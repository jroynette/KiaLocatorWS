package com.kiabi.kialocator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kiabi.kialocator.bo.Plan;

@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {

}
