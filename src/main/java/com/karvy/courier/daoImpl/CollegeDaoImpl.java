package com.karvy.courier.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.karvy.courier.dao.CollegeDao;
import com.karvy.courier.entity.College;
import com.karvy.courier.util.HibernateUtil;

@Repository
public class CollegeDaoImpl implements CollegeDao{
	
	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public void saveCollege(College college) {
		
		hibernateUtil.saveORUpdate(college);
		
	}

	@Override
	public List<College> getCollegeList() {
		// TODO Auto-generated method stub
		return hibernateUtil.fetchAll(College.class);
	}

}
