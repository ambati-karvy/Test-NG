package com.karvy.courier.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.karvy.courier.dao.TeacherDao;
import com.karvy.courier.entity.Teachers;
import com.karvy.courier.service.TeachersService;


@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
public class TeachersServicesImpl implements TeachersService{
	
	@Autowired
	private TeacherDao teacherDao;

	@Override
	public void saveTeacher(Teachers teacher) {
		
		teacherDao.saveTeacher(teacher);
	}

}
