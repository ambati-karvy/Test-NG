package com.karvy.courier.test.util;

import java.lang.annotation.Annotation;

import com.karvy.courier.test.annotations.Source;
import com.karvy.courier.test.entity.CollegeTestEntity;

public class TestMain {

	public static void main(String[] args) {
		/*CollegeTestEntity collegeTestEntity = new CollegeTestEntity();
		
		Class cls = collegeTestEntity.getClass();
		Annotation getMyAnntotaion = cls.getAnnotation(Source.class);
		Source myAnno = (Source)getMyAnntotaion;
		
		System.out.println(collegeTestEntity.toString());
		
		System.out.println(myAnno.path());*/
		
		CvsDataReader cvsDataReader = new CvsDataReader();
		System.out.println(cvsDataReader.calaculate());
	}

}
