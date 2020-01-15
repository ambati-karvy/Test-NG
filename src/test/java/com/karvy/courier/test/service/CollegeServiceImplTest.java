package com.karvy.courier.test.service;

import org.testng.annotations.Test;

import com.karvy.courier.bean.CollegeBean;
import com.karvy.courier.dao.CollegeDao;
import com.karvy.courier.entity.College;
import com.karvy.courier.entity.Teachers;
import com.karvy.courier.serviceImpl.CollegeServiceImpl;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.testng.annotations.BeforeClass;

public class CollegeServiceImplTest {
  
  @Mock
  CollegeDao collegeDao;
  
  @InjectMocks
  CollegeServiceImpl collegeServiceImpl;
  
  @Spy
  List<College> collegeList = new ArrayList<>();
  
  @BeforeClass
  public void beforeClass() {
	  MockitoAnnotations.initMocks(this);
	  collegeList = getCollegeList(); 
  }
  
  @Test
  public void getCollegeListTest() {
	  when(collegeDao.getCollegeList()).thenReturn(getCollegeList());
	  List<CollegeBean> collegeList = collegeServiceImpl.getCollegeList();
	  System.out.println(collegeList);
  }
  
  public List<College> getCollegeList() {
	    List<College> collegeList = new ArrayList<>();
		
	    Teachers   teachers =new  Teachers ();
	    teachers.setTeacherName("ramana");
	    teachers.setTeacherId(324762875);
	    Set<Teachers> teacherSet = new HashSet<>();
	    College college = new College();
	    
	    college.setCollegeId(2);
	    college.setCode("TPIST");;
	    college.setTeachersSet(teacherSet);
	    
	    collegeList.add(college);
	    return collegeList;
	    
  }

}
