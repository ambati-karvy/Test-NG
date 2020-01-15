package com.karvy.courier.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.karvy.courier.bean.CollegeBean;
import com.karvy.courier.bean.TeacherBean;
import com.karvy.courier.dao.CollegeDao;
import com.karvy.courier.entity.College;
import com.karvy.courier.entity.Teachers;
import com.karvy.courier.service.CollegeService;


@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
public class CollegeServiceImpl implements CollegeService{
	
	@Autowired
	private CollegeDao collegeDao;

	@Override
	public void saveCollege(College college) {
		collegeDao.saveCollege(college);
		
	}

	@Override
	public List<CollegeBean> getCollegeList() {
		
		List<College> colleges = collegeDao.getCollegeList();
		List<CollegeBean> listCollegeBean = new ArrayList<>();
		List<TeacherBean> listTeacherBean = new ArrayList<>();
		
		CollegeBean collegeBean = null;
		TeacherBean teacherBean = null;
		
		for(College college : colleges) {
			collegeBean = new CollegeBean();
			collegeBean.setCode(college.getCode());
			collegeBean.setCollegeId(college.getCollegeId());
			
			for(Teachers teacher : college.getTeachersSet()) {
				teacherBean = new TeacherBean();
				teacherBean.setName(teacher.getTeacherName());
				teacherBean.setRegNo(teacher.getReg_id());
				
				listTeacherBean.add(teacherBean);
			}
			collegeBean.setTeachersList(listTeacherBean);
			
			listCollegeBean.add(collegeBean);
			
		}
		return listCollegeBean;
	}

}
