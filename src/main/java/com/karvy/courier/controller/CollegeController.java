package com.karvy.courier.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.karvy.courier.bean.CollegeBean;
import com.karvy.courier.entity.College;
import com.karvy.courier.entity.Teachers;
import com.karvy.courier.service.CollegeService;
import com.karvy.courier.service.TeachersService;
import com.karvy.courier.util.CollegeUtil;


@RestController
public class CollegeController {
	@Autowired
	private CollegeService collegeService;
	
	
	/*public CollegeController(CollegeService collegeService) {
		super();
		this.collegeService = collegeService;
	}*/
	
	
	@Autowired
	private TeachersService teacherService;
	
	@Autowired
	private CollegeUtil collegeUtil;
	

	@RequestMapping(value = "collegeForm", method = RequestMethod.GET)
	public Map<String,String> collegeSave() {
		
		College college = new College();
		college.setCode("TPIST");
		college.setPincode(235466);
		
		collegeService.saveCollege(college);
		
		Map<String,String> map = new HashMap<>();
		map.put("Status", "Sucess");
		
		return map;
	}
	
	@RequestMapping(value = "teacherForm", method = RequestMethod.GET)
	public void teacherSave() {
		
		Teachers teacher = new Teachers();
		teacher.setTeacherName("raghu");
		teacher.setReg_id(123435);
		teacher.setSalary(2345325.565);
		College college = new College();
		college.setCollegeId(1);
		teacher.setCollegeId(college);
		
		teacherService.saveTeacher(teacher);
	}
	
	@RequestMapping(value = "collegeList", method = RequestMethod.GET)
	public List<CollegeBean> getAllColleges() {
		return collegeService.getCollegeList();
	}
	
	/*@RequestMapping(value = "collegeList", method = RequestMethod.GET)
	public String getAllColleges1() {
		// collegeService.getCollegeList();
		
		return "sucess";
	}*/
	
	@RequestMapping(value = "collegeBeanList", method = RequestMethod.GET)
	public List<CollegeBean> getAllCollegesBean() {
		return collegeUtil.getCollegeList();
	}

}
