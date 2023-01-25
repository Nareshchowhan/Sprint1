package com.employeemgnt.entity;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name="companyName",length=25)
	private String name;
	@Column(name="companylocation",length=25)
	private String location;
	@Column(name="companypincode", length=25)
	private String pincode;
     
	@OneToMany(cascade=CascadeType.ALL)
	//name we can give anything which is a primary key of other table
	@JoinColumn(name ="employeeid" )
	private List<Employee> employee;

}
