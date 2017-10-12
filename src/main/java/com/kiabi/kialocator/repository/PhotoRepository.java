package com.kiabi.kialocator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kiabi.kialocator.bo.Photo;

@Repository
//TODO voir paging and sorting
public interface PhotoRepository extends CrudRepository<Photo, Integer> {

}
