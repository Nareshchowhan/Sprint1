package com.employeemgnt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
      @Column(name="EmployeeName",length=25)
	private String name;
      @Column(name="EmployeeAge")
	private Integer age;
      @Column(name="EmployeeEmail",length=25)
	private String emailId;
      @Column(name="EmpolyeeContact")
	private String mobileNo;
      
   // Mapping many employee to one company
    /* 	@ManyToOne(cascade=CascadeType.ALL)
  	
  	//joining the companyId column to Employee Table
  	@JoinColumn(name="companyId")
  	private Company company;*/
  	
}
