package com.poc.service;

import java.util.List;
import java.util.Optional;

import org.apache.naming.java.javaURLContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.dao.JobDao;
import com.poc.dao.UserDao;
import com.poc.entity.Job;
import com.poc.entity.User;

import antlr.collections.impl.LList;

@Service
public class UserAndJobService {
	@Autowired
	private UserDao userdao;
	@Autowired
	private JobDao jobdao;
	

	public User createNewUser(User user) {
		return userdao.save(user);
		
	}
	
	public Job createNewJob(Job job) {
		return jobdao.save(job);
		
}
	public List<Job> getAllJobs(Job job){
		return jobdao.findAll();
		
	}
	public Optional<Job> getJobById(int id) {
		return jobdao.findById(id);
		
	}

	public List<Job> getJobByType(String type) {
		return jobdao.findByJobType(type);
	}
	
//	public List<Job> getJobByExp(double exp){
//		return jobdao.findByJobExp(exp);
//	}
	
	public List<Job> getJobByCountry(String country) {
		return jobdao.findByCountry(country);
	}
	
	public List<Job> getJobByAvailability(String availability){
		return jobdao.findByAvailability(availability);
		
	}
	
	public List<Job> getJobskills(String skills){
        return jobdao.findByskills(skills);
    }
	

	public List<Job> getJobByLanguage(String language){
		return jobdao.findByLanguage(language);
	}

	public List<Job> getJobByPayRate(double payrate){
		return jobdao.findByPayRate(payrate);
	}
}
