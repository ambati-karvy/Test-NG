package com.karvy.courier.test;

import org.testng.annotations.Test;

import com.karvy.courier.bean.CollegeBean;
import com.karvy.courier.controller.CollegeController;
import com.karvy.courier.service.CollegeService;
import com.karvy.courier.test.annotations.CommonDataProvider;
import com.karvy.courier.test.annotations.Csv;

import io.github.sskorol.core.DataSupplier;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class CollegeControllerTest {
	
  @Mock
  CollegeService collegeService;
  
  @InjectMocks
  CollegeController collegeController;
  
  List<CollegeBean> collegeList = new ArrayList<>();
 
  @BeforeClass
  public void beforeClass() {
	  MockitoAnnotations.initMocks(this);
	  collegeList = getCollegeList(); 
  }
  
  
  @Test(dataProvider = "genData", dataProviderClass = CommonDataProvider.class)
  @Csv(value = "/2.csv", encoding = "utf-8")
  public void test4(String userName, String password, String expected) {
	  System.out.println("++++++++++++++++++"+userName);
      assertNotNull(userName);
      assertNotNull(password);
      assertNotNull(expected);
  }
  
  
  @Test
  public void collegeListTest() {
    when(collegeService.getCollegeList()).thenReturn(collegeList);
    List<CollegeBean> data = collegeController.getAllColleges();
    Assert.assertEquals(data.size(), 2);
  }
  
 

  @Test(dataProvider = "dataProviderIsStringLengthGreaterTwo", dataProviderClass = ExternalDataSourceClass.class)
  public void testIsStringLengthGreaterThanTwo(String str, boolean expected) {
     System.out.println(str);
     System.out.println(expected);
  }
  
  @Test(dataProvider = "getColleges", dataProviderClass = ExternalDataSourceClass.class)
  public void testIsStringLengthGreate(CollegeBean collegeBean) {
     System.out.println(collegeBean.getCode());
     //System.out.println(expected);
  }
  
      
  @Test(dataProvider = "getData" ,dataProviderClass = ExternalDataSourceClass.class)
  public void shouldSupplyStreamData(final CollegeBean collegeBean) {
	  System.out.println(collegeBean.getCode()+"------------------------");
  }
  
  
  @Test(dataProvider = "Authentication" ,dataProviderClass = ExternalDataSourceClass.class)
  public void test(String sUsername, String sPassword) {
	 System.out.println(sUsername); 
	 System.out.println(sPassword); 
  }
  

  public List<CollegeBean> getCollegeList() {
    List<CollegeBean> collegeList = new ArrayList<>();
	
    CollegeBean collegeBean = new CollegeBean();
    collegeBean.setCode("Tpist");
    collegeBean.setName("Thandraparayadu");
    
    collegeList.add(collegeBean);
    collegeList.add(collegeBean);
    
    return collegeList;
    
  }
}
