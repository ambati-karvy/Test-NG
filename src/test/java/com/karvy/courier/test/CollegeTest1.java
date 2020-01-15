package com.karvy.courier.test;

import org.testng.annotations.Test;

import com.karvy.courier.bean.CollegeBean;
import com.karvy.courier.controller.CollegeController;
import com.karvy.courier.service.CollegeService;

import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class CollegeTest1 {
 
  @Mock
  CollegeService collegeService;
	 
  @InjectMocks
  CollegeController collegeController ;
  @Spy
  List<CollegeBean> collegeBean = new ArrayList<CollegeBean>();
  
  
  @BeforeClass
  public void beforeClass() {
	  MockitoAnnotations.initMocks(this);
	  collegeBean = getCollegeList();
  }
  
  @Test
  public void f() {
	  Mockito.when(collegeService.getCollegeList()).thenReturn(collegeBean);
		 List<CollegeBean> colleges = collegeController.getAllColleges();
		 Assert.assertEquals(colleges.size(), 2);
	  System.out.println(collegeBean);
  }
  
  
  public  List<CollegeBean> getCollegeList() {
		 CollegeBean collegeBean = new CollegeBean();
		 collegeBean.setCode("TPIST");
		 List<CollegeBean> l1=new ArrayList<>();
		 l1.add(collegeBean);
		 l1.add(collegeBean);
		 
		 return l1;
	 }

}
