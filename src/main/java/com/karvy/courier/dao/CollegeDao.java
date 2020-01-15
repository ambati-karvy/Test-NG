package com.karvy.courier.dao;

import java.util.List;

import com.karvy.courier.entity.College;

public interface CollegeDao {

	void saveCollege(College college);
	
	List<College> getCollegeList();
}
