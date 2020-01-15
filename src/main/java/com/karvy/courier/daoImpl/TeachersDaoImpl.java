package com.karvy.courier.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.karvy.courier.dao.TeacherDao;
import com.karvy.courier.entity.Teachers;
import com.karvy.courier.util.HibernateUtil;

@Repository
public class TeachersDaoImpl implements TeacherDao{

	@Autowired
	private HibernateUtil hibernateUtil;
	
	@Override
	public void saveTeacher(Teachers teachers) {
		// TODO Auto-generated method stub
		hibernateUtil.saveORUpdate(teachers);
	}

}
