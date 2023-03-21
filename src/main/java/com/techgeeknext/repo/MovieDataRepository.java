package com.techgeeknext.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techgeeknext.entities.MovieData;

//import adminservice.model.adminservice;

@Repository
public interface MovieDataRepository extends JpaRepository<MovieData, Long> {
	List<MovieData> findAll();
	
}
