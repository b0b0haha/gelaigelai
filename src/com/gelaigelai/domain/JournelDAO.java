package com.gelaigelai.domain;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Journel entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gelaigelai.domain.Journel
 * @author MyEclipse Persistence Tools
 */
public class JournelDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(JournelDAO.class);
	// property constants
	public static final String JNAME = "jname";
	public static final String JINFO = "jinfo";

	protected void initDao() {
		// do nothing
	}

	public void save(Journel transientInstance) {
		log.debug("saving Journel instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Journel persistentInstance) {
		log.debug("deleting Journel instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Journel findById(java.lang.Integer id) {
		log.debug("getting Journel instance with id: " + id);
		try {
			Journel instance = (Journel) getHibernateTemplate().get(
					"com.gelaigelai.domain.Journel", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Journel instance) {
		log.debug("finding Journel instance by example");
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
		log.debug("finding Journel instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Journel as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByJname(Object jname) {
		return findByProperty(JNAME, jname);
	}

	public List findByJinfo(Object jinfo) {
		return findByProperty(JINFO, jinfo);
	}

	public List findAll() {
		log.debug("finding all Journel instances");
		try {
			String queryString = "from Journel";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Journel merge(Journel detachedInstance) {
		log.debug("merging Journel instance");
		try {
			Journel result = (Journel) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Journel instance) {
		log.debug("attaching dirty Journel instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Journel instance) {
		log.debug("attaching clean Journel instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static JournelDAO getFromApplicationContext(ApplicationContext ctx) {
		return (JournelDAO) ctx.getBean("JournelDAO");
	}
}