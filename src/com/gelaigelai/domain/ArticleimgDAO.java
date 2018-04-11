package com.gelaigelai.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Articleimg entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gelaigelai.domain.Articleimg
 * @author MyEclipse Persistence Tools
 */
public class ArticleimgDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ArticleimgDAO.class);
	// property constants
	public static final String IMG_PATH = "imgPath";

	protected void initDao() {
		// do nothing
	}

	public void save(Articleimg transientInstance) {
		log.debug("saving Articleimg instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Articleimg persistentInstance) {
		log.debug("deleting Articleimg instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Articleimg findById(java.lang.Integer id) {
		log.debug("getting Articleimg instance with id: " + id);
		try {
			Articleimg instance = (Articleimg) getHibernateTemplate().get(
					"com.gelaigelai.domain.Articleimg", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Articleimg instance) {
		log.debug("finding Articleimg instance by example");
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
		log.debug("finding Articleimg instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Articleimg as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByImgPath(Object imgPath) {
		return findByProperty(IMG_PATH, imgPath);
	}

	public List findAll() {
		log.debug("finding all Articleimg instances");
		try {
			String queryString = "from Articleimg";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Articleimg merge(Articleimg detachedInstance) {
		log.debug("merging Articleimg instance");
		try {
			Articleimg result = (Articleimg) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Articleimg instance) {
		log.debug("attaching dirty Articleimg instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Articleimg instance) {
		log.debug("attaching clean Articleimg instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ArticleimgDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ArticleimgDAO) ctx.getBean("ArticleimgDAO");
	}
}