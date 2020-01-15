package com.karvy.courier.service;

import java.util.List;

import com.karvy.courier.bean.CollegeBean;
import com.karvy.courier.entity.College;

public interface CollegeService {
	
	void saveCollege(College college);
	
	List<CollegeBean> getCollegeList();

}
