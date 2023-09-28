package com.acoder.pojo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EMP")
public class EmployeeEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMPNO")
	private String empNo;
	
	@Column(name = "ENAME")
	private String empName;
	
	@Column(name ="MGR" )
	private Integer empMGR;
	
	@Column(name = "SAL")
	private Double empSal;
	
	@Column(name = "HIREDATE")
	private Date hireDate;
	
	@Column(name = "JOB")
	private String empJob;
	
	@Column(name ="DEPTNO" )
	private Integer empDeptno;
	
	@Column(name ="COMM" )
	private Integer empComm;
}
