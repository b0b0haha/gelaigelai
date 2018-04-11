package com.gelaigelai.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Game
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.gelaigelai.domain.Game
 * @author MyEclipse Persistence Tools
 */
public class GameDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(GameDAO.class);
	// property constants
	public static final String GINFO = "ginfo";

	protected void initDao() {
		// do nothing
	}

	public void save(Game transientInstance) {
		log.debug("saving Game instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Game persistentInstance) {
		log.debug("deleting Game instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Game findById(java.lang.Integer id) {
		log.debug("getting Game instance with id: " + id);
		try {
			Game instance = (Game) getHibernateTemplate().get(
					"com.gelaigelai.domain.Game", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Game instance) {
		log.debug("finding Game instance by example");
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
		log.debug("finding Game instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Game as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGinfo(Object ginfo) {
		return findByProperty(GINFO, ginfo);
	}

	public List findAll() {
		log.debug("finding all Game instances");
		try {
			String queryString = "from Game";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Game merge(Game detachedInstance) {
		log.debug("merging Game instance");
		try {
			Game result = (Game) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Game instance) {
		log.debug("attaching dirty Game instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Game instance) {
		log.debug("attaching clean Game instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GameDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GameDAO) ctx.getBean("GameDAO");
	}
}