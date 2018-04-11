package com.gelaigelai.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Fun
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.gelaigelai.domain.Fun
 * @author MyEclipse Persistence Tools
 */
public class FunDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(FunDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(Fun transientInstance) {
		log.debug("saving Fun instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Fun persistentInstance) {
		log.debug("deleting Fun instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Fun findById(com.gelaigelai.domain.FunId id) {
		log.debug("getting Fun instance with id: " + id);
		try {
			Fun instance = (Fun) getHibernateTemplate().get(
					"com.gelaigelai.domain.Fun", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Fun instance) {
		log.debug("finding Fun instance by example");
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
		log.debug("finding Fun instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Fun as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Fun instances");
		try {
			String queryString = "from Fun";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Fun merge(Fun detachedInstance) {
		log.debug("merging Fun instance");
		try {
			Fun result = (Fun) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Fun instance) {
		log.debug("attaching dirty Fun instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Fun instance) {
		log.debug("attaching clean Fun instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FunDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FunDAO) ctx.getBean("FunDAO");
	}
}