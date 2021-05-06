package com.poc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JobDetails")
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jobId;
	private String jobTitle;
	private String jobDescription;
	private String country;
	private String state;
	private String availability;
	private double replyRate;
	private double payRate;
	private double experience;
	private String skills;
	private String language;
	private String jobType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User user;

	public Job() {
		super();
	}

	public Job(int jobId, String jobTitle, String jobDescription, String country, String state, String availability,
			double replyRate, double payRate, double experience, String skills, String language, String jobType,
			User user) {
		super();
		
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.country = country;
		this.state = state;
		this.availability = availability;
		this.replyRate = replyRate;
		this.payRate = payRate;
		this.experience = experience;
		this.skills = skills;
		this.language = language;
		this.jobType = jobType;
		this.user = user;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public double getReplyRate() {
		return replyRate;
	}

	public void setReplyRate(double replyRate) {
		this.replyRate = replyRate;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobTitle=" + jobTitle + ", jobDescription=" + jobDescription + ", country="
				+ country + ", state=" + state + ", availability=" + availability + ", replyRate=" + replyRate
				+ ", payRate=" + payRate + ", experience=" + experience + ", skills=" + skills + ", language="
				+ language + ", jobType=" + jobType + ", user=" + user + "]";
	}

	
}
