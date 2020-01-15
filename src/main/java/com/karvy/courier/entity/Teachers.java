package com.karvy.courier.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "teachers")
public class Teachers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_id")
	private Integer teacherId;
	
	@Column(name = "teacher_name")
	private String teacherName;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "salary")
	private Double salary;
	
	@Column(name = "reg_id")
	private Integer reg_id;

	@ManyToOne
	@JoinColumn(name = "college_id_fk")
	private College collegeId;

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getReg_id() {
		return reg_id;
	}

	public void setReg_id(Integer reg_id) {
		this.reg_id = reg_id;
	}

	public College getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(College collegeId) {
		this.collegeId = collegeId;
	}
	
	
}
