package com.gelaigelai.domain;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Msg
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.gelaigelai.domain.Msg
 * @author MyEclipse Persistence Tools
 */
public class MsgDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(MsgDAO.class);
	// property constants
	public static final String MSG_FROM = "msgFrom";
	public static final String MSG_TO = "msgTo";
	public static final String MSG_INFO = "msgInfo";

	protected void initDao() {
		// do nothing
	}

	public void save(Msg transientInstance) {
		log.debug("saving Msg instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Msg persistentInstance) {
		log.debug("deleting Msg instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Msg findById(java.lang.Integer id) {
		log.debug("getting Msg instance with id: " + id);
		try {
			Msg instance = (Msg) getHibernateTemplate().get(
					"com.gelaigelai.domain.Msg", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Msg instance) {
		log.debug("finding Msg instance by example");
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
		log.debug("finding Msg instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Msg as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMsgFrom(Object msgFrom) {
		return findByProperty(MSG_FROM, msgFrom);
	}

	public List findByMsgTo(Object msgTo) {
		return findByProperty(MSG_TO, msgTo);
	}

	public List findByMsgInfo(Object msgInfo) {
		return findByProperty(MSG_INFO, msgInfo);
	}

	public List findAll() {
		log.debug("finding all Msg instances");
		try {
			String queryString = "from Msg";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Msg merge(Msg detachedInstance) {
		log.debug("merging Msg instance");
		try {
			Msg result = (Msg) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Msg instance) {
		log.debug("attaching dirty Msg instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Msg instance) {
		log.debug("attaching clean Msg instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MsgDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MsgDAO) ctx.getBean("MsgDAO");
	}
}