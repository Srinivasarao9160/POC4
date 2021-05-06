package com.poc.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.entity.Job;

import antlr.collections.impl.LList;

public interface JobDao extends JpaRepository<Job, Integer> {

	public List<Job> findByJobType(String jobType);
	
	//public List<Job> findByJobExp(double experience);
	
	public List<Job> findByCountry(String country);
	
	public List<Job> findByAvailability(String availability);
	
	public List<Job> findByLanguage(String language);
	
	public List<Job> findByPayRate(double payRate);

	public List<Job> findByskills(String skills);


}
