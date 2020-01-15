package com.karvy.courier.util;

import java.util.List;

import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.karvy.courier.bean.CollegeBean;
import com.karvy.courier.entity.College;


@Service
@Repository
@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class,isolation=Isolation.READ_COMMITTED)
public class CollegeUtil {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	@SuppressWarnings("unchecked")
	public List<CollegeBean> getCollegeList() {
		
		return hibernateUtil.createEntityCriteriaByAlias(College.class, "collegeBean")
			.setProjection(Projections.projectionList()
					.add(Projections.property("collegeId"),"collegeId")
					.add(Projections.property("code"),"code")
					.add(Projections.property("name"),"name"))
			.setResultTransformer(Transformers.aliasToBean(CollegeBean.class)).list();
	}
	
}
