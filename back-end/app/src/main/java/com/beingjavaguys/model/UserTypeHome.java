package com.beingjavaguys.model;
// Generated 2017-05-28 06:05:05 by Hibernate Tools 5.2.3.Final


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserType.
 * @see sswap.UserType
 * @author Hibernate Tools
 */

public class UserTypeHome {

	private static final Log log = LogFactory.getLog(UserTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserType transientInstance) {
		log.debug("persisting UserType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserType persistentInstance) {
		log.debug("removing UserType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserType merge(UserType detachedInstance) {
		log.debug("merging UserType instance");
		try {
			UserType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserType findById(int id) {
		log.debug("getting UserType instance with id: " + id);
		try {
			UserType instance = entityManager.find(UserType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
