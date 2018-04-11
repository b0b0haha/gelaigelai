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
 * ArticleComment entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.gelaigelai.domain.ArticleComment
 * @author MyEclipse Persistence Tools
 */
public class ArticleCommentDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ArticleCommentDAO.class);
	// property constants
	public static final String INFO = "info";

	protected void initDao() {
		// do nothing
	}

	public void save(ArticleComment transientInstance) {
		log.debug("saving ArticleComment instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ArticleComment persistentInstance) {
		log.debug("deleting ArticleComment instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ArticleComment findById(java.lang.Integer id) {
		log.debug("getting ArticleComment instance with id: " + id);
		try {
			ArticleComment instance = (ArticleComment) getHibernateTemplate()
					.get("com.gelaigelai.domain.ArticleComment", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ArticleComment instance) {
		log.debug("finding ArticleComment instance by example");
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
		log.debug("finding ArticleComment instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ArticleComment as model where model."
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

	public List findAll() {
		log.debug("finding all ArticleComment instances");
		try {
			String queryString = "from ArticleComment";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ArticleComment merge(ArticleComment detachedInstance) {
		log.debug("merging ArticleComment instance");
		try {
			ArticleComment result = (ArticleComment) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ArticleComment instance) {
		log.debug("attaching dirty ArticleComment instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ArticleComment instance) {
		log.debug("attaching clean ArticleComment instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ArticleCommentDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ArticleCommentDAO) ctx.getBean("ArticleCommentDAO");
	}
}