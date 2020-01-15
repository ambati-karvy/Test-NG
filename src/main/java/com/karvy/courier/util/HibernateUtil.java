package com.karvy.courier.util;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateUtil {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public <T> Serializable dynamicCreate(final T entity) {
		return sessionFactory.getCurrentSession().save(entity);
	}
	
	public <T> void saveORUpdate(final T entity) {
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
		sessionFactory.getCurrentSession().flush();
		sessionFactory.getCurrentSession().clear();
	}
	
	@SuppressWarnings("unchecked")
	public <T> List<T> fetchAll(Class<T> entityClass) {
		return sessionFactory.getCurrentSession().createQuery("FROM " + entityClass.getName()).setCacheable(true)
				.list();
	}
	
	@SuppressWarnings("deprecation")
	public Criteria createEntityCriteria(Class<?> entityClass) {
		return sessionFactory.getCurrentSession().createCriteria(entityClass);
	}
	
	@SuppressWarnings("deprecation")
	public Criteria createEntityCriteriaByAlias(Class<?> entityClass, String aliasName) {
		return sessionFactory.getCurrentSession().createCriteria(entityClass, aliasName);
	}

}
