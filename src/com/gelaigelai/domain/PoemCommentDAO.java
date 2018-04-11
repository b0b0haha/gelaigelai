package com.gelaigelai.domain;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PoemComment entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.gelaigelai.domain.PoemComment
 * @author MyEclipse Persistence Tools
 */
public class PoemCommentDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(PoemCommentDAO.class);
	// property constants
	public static final String INFO = "info";
	public static final String USER_ID = "userId";

	protected void initDao() {
		// do nothing
	}

	public void save(PoemComment transientInstance) {
		log.debug("saving PoemComment instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PoemComment persistentInstance) {
		log.debug("deleting PoemComment instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PoemComment findById(java.lang.Integer id) {
		log.debug("getting PoemComment instance with id: " + id);
		try {
			PoemComment instance = (PoemComment) getHibernateTemplate().get(
					"com.gelaigelai.domain.PoemComment", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PoemComment instance) {
		log.debug("finding PoemComment instance by example");
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
		log.debug("finding PoemComment instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PoemComment as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByInfo(Object info) {
		return findByProperty(INFO, info);
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findAll() {
		log.debug("finding all PoemComment instances");
		try {
			String queryString = "from PoemComment";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PoemComment merge(PoemComment detachedInstance) {
		log.debug("merging PoemComment instance");
		try {
			PoemComment result = (PoemComment) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PoemComment instance) {
		log.debug("attaching dirty PoemComment instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PoemComment instance) {
		log.debug("attaching clean PoemComment instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PoemCommentDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (PoemCommentDAO) ctx.getBean("PoemCommentDAO");
	}
}