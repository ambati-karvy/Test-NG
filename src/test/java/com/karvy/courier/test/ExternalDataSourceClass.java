package com.karvy.courier.test;

import java.util.stream.Stream;

import org.testng.annotations.DataProvider;

import com.karvy.courier.bean.CollegeBean;
import com.karvy.courier.test.entity.CollegeTestEntity;

import io.github.sskorol.core.DataSupplier;
import one.util.streamex.StreamEx;

public class ExternalDataSourceClass {

	@DataProvider
    public static Object[][] dataProviderIsStringLengthGreaterTwo() {
        return new Object[][] {
                { "",       false },
                { "1",      false },
                { "12",     false },
                { "123",    true },
                { "Test",   true },
            };
    }
	
	@DataProvider
    public static Object[][] getColleges() {
		CollegeBean[][] result = new CollegeBean[1][1];
		result[0][0] = new CollegeBean("tpist");
		result[0][0] = new CollegeBean("tpist");
		
		return result;
    }
	
	
	@DataSupplier
	  public Stream<CollegeBean> getData() {
	      return Stream.of(
	          new CollegeBean("Petya"),
	          new CollegeBean("Virus Petya"),
	          new CollegeBean("Mark"))
	              .filter(u -> !u.getCode().contains("Virus"));
	  }
	
	 @DataProvider(name = "Authentication")
	  public static Object[][] credentials() {
	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
	  }
	 
	 
	 
	 /*@DataSupplier
	 public StreamEx<CollegeTestEntity> getUsers() {
	     return use(CsvReader.class).withTarget(CollegeTestEntity.class).withSource("college.csv").read();
	 }*/
	
}
