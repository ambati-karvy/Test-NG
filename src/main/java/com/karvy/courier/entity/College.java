package com.karvy.courier.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "college")
public class College implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2824139689537495335L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "college_id")
	private Integer collegeId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "pincode")
	private Integer pincode;
	
	@OneToMany(mappedBy="collegeId", cascade = CascadeType.ALL)
	private Set<Teachers> teachersSet;

	
	public Set<Teachers> getTeachersSet() {
		return teachersSet;
	}

	public void setTeachersSet(Set<Teachers> teachersSet) {
		this.teachersSet = teachersSet;
	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	

}
