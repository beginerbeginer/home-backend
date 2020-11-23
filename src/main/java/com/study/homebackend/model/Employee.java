package com.study.homebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastaName;

	@Column(name = "email_id")
	private String emailId;

	public Employee() {

	}

	public Employee(String firstName, String lastaName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastaName = lastaName;
		this.emailId = emailId;
	}

//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastaName() {
//		return lastaName;
//	}
//	public void setLastaName(String lastaName) {
//		this.lastaName = lastaName;
//	}
//	public String getEmailId() {
//		return emailId;
//	}
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}

}
