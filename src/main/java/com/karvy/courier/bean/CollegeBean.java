package com.karvy.courier.bean;

import java.io.Serializable;
import java.util.List;

public class CollegeBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4646850656485335657L;
	
	private int collegeId;
	private String code;
	private String name;
	private List<TeacherBean> teachersList;
	
	
	public CollegeBean() {
		super();
	}
	public CollegeBean(String code) {
		super();
		this.code = code;
	}
	public List<TeacherBean> getTeachersList() {
		return teachersList;
	}
	public void setTeachersList(List<TeacherBean> teachersList) {
		this.teachersList = teachersList;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
