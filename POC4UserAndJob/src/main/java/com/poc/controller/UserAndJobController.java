package com.poc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.entity.Job;
import com.poc.entity.User;
import com.poc.service.UserAndJobService;

@RestController
public class UserAndJobController {
	
	@Autowired
	private UserAndJobService userandjobservice;

	// create NewUser
	@PostMapping("user/createuser")
	public User createUser(@RequestBody User user) {
		return userandjobservice.createNewUser(user);
		
	}
	// Create NewJob
	@PostMapping("job/createjob")
	public Job creatJob(@RequestBody Job job) {
		return userandjobservice.createNewJob(job);
	}
	// get all jobs
	@GetMapping("getalljobs")
	public List<Job> getAllJobs(@RequestBody Job job){
		return userandjobservice.getAllJobs(job);
	}
	
	// Get job by id
	@GetMapping("job/getbyid/{job}")
	public Optional<Job> getJobById(@PathVariable int job){
		return userandjobservice.getJobById(job);
	}
	// Get Job By Type
	@GetMapping("/jobbytype/{type}")
    public List<Job> findByJobType(@PathVariable String type) {
		return userandjobservice.getJobByType(type);
	}
	
	// Get Job By Experience
//	@GetMapping("/jobbyexp/{exp}")
//	public List<Job> findByJobExp(@PathVariable double exp){
//		return userandjobservice.getJobByExp(exp);
//	}
	// Get job by Country
	@GetMapping("jobbycountry/{country}")
	public List<Job> findByCountry(@PathVariable String country) {
		return userandjobservice.getJobByCountry(country);
		
	}
	// Get job by Availability
	@GetMapping("jobbyavailability/{available}")
	public List<Job> findByAvailability(@PathVariable String available){
		return userandjobservice.getJobByAvailability(available);
		
	}
	// Get by skills
	@GetMapping("/job/getBySkills/{skills}")
    public List<Job> getJobByskills(@PathVariable String skills){
        return userandjobservice.getJobskills(skills);
    }
	
	
	// Get job by language
	@GetMapping("jobbylanguage/{lang}")
	public List<Job> findByLanguage(@PathVariable String lang){
		return userandjobservice.getJobByLanguage(lang);
	}
	@GetMapping("jobbypayrate/{payrate}")
	public List<Job> findByPayRate(@PathVariable double payrate){
		return userandjobservice.getJobByPayRate(payrate);
		
	}
	
}
