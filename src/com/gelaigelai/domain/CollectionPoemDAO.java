package com.gelaigelai.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CollectionPoem entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.gelaigelai.domain.CollectionPoem
 * @author MyEclipse Persistence Tools
 */
public class CollectionPoemDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(CollectionPoemDAO.class);
	// property constants
	public static final String IDPOEM = "idpoem";

	protected void initDao() {
		// do nothing
	}

	public void save(CollectionPoem transientInstance) {
		log.debug("saving CollectionPoem instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CollectionPoem persistentInstance) {
		log.debug("deleting CollectionPoem instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CollectionPoem findById(java.lang.Integer id) {
		log.debug("getting CollectionPoem instance with id: " + id);
		try {
			CollectionPoem instance = (CollectionPoem) getHibernateTemplate()
					.get("com.gelaigelai.domain.CollectionPoem", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CollectionPoem instance) {
		log.debug("finding CollectionPoem instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CollectionPoem instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from CollectionPoem as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIdpoem(Object idpoem) {
		return findByProperty(IDPOEM, idpoem);
	}

	public List findAll() {
		log.debug("finding all CollectionPoem instances");
		try {
			String queryString = "from CollectionPoem";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CollectionPoem merge(CollectionPoem detachedInstance) {
		log.debug("merging CollectionPoem instance");
		try {
			CollectionPoem result = (CollectionPoem) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CollectionPoem instance) {
		log.debug("attaching dirty CollectionPoem instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CollectionPoem instance) {
		log.debug("attaching clean CollectionPoem instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CollectionPoemDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (CollectionPoemDAO) ctx.getBean("CollectionPoemDAO");
	}
}