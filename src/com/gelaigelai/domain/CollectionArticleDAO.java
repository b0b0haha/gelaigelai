package com.gelaigelai.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CollectionArticle entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.gelaigelai.domain.CollectionArticle
 * @author MyEclipse Persistence Tools
 */
public class CollectionArticleDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(CollectionArticleDAO.class);
	// property constants
	public static final String IDARTICLE = "idarticle";

	protected void initDao() {
		// do nothing
	}

	public void save(CollectionArticle transientInstance) {
		log.debug("saving CollectionArticle instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CollectionArticle persistentInstance) {
		log.debug("deleting CollectionArticle instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CollectionArticle findById(java.lang.Integer id) {
		log.debug("getting CollectionArticle instance with id: " + id);
		try {
			CollectionArticle instance = (CollectionArticle) getHibernateTemplate()
					.get("com.gelaigelai.domain.CollectionArticle", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CollectionArticle instance) {
		log.debug("finding CollectionArticle instance by example");
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
		log.debug("finding CollectionArticle instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from CollectionArticle as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIdarticle(Object idarticle) {
		return findByProperty(IDARTICLE, idarticle);
	}

	public List findAll() {
		log.debug("finding all CollectionArticle instances");
		try {
			String queryString = "from CollectionArticle";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CollectionArticle merge(CollectionArticle detachedInstance) {
		log.debug("merging CollectionArticle instance");
		try {
			CollectionArticle result = (CollectionArticle) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CollectionArticle instance) {
		log.debug("attaching dirty CollectionArticle instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CollectionArticle instance) {
		log.debug("attaching clean CollectionArticle instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CollectionArticleDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (CollectionArticleDAO) ctx.getBean("CollectionArticleDAO");
	}
}