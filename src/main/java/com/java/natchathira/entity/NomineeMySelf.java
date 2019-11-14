package com.java.natchathira.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "nominee_myself")
@Getter  @Setter
public class NomineeMySelf {

	@Id
	@GeneratedValue
	Long id;
	
	@Column(name = "first_name",length = 50,nullable = false)
	String firstName;
	
	@Column(name="last_name",length = 50)
	String lastName;
	
	@Column(name="job_title",length = 50)
	String jobTitle;
	
	@Column(name="company_name",length = 50)
	String companyName;
	
	@Column(name="email",length = 30,nullable = false)
	String email;
	
	@Column(name="phone_number",length = 20,nullable = false)
	String phoneNumber;
	
	@Column(name="website",length = 100)
	String website;
	
	@Column(name="facebook",length = 100)
	String facebook;
	
	@Column(name="linkedIn",length = 100)
	String linkedIn;
	
	@Column(name="dob")
	Date dob;
	
	@Column(name="reason_for_nominee",length = 1000)
	String reasonForNominee;
}
