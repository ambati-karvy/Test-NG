package com.karvy.courier.test.entity;

import com.karvy.courier.test.annotations.FieldName;
import com.karvy.courier.test.annotations.Source;

@Source(path = "college.csv")
public class CollegeTestEntity {
	@FieldName(value="code")
	private String code;
	private String name;
	
	
	public CollegeTestEntity() {
		super();
	}
	public CollegeTestEntity(String code, String name) {
		super();
		this.code = code;
		this.name = name;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollegeTestEntity other = (CollegeTestEntity) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CollegeTestEntity [code=" + code + ", name=" + name + "]";
	}
	
	
}
