package com.beingjavaguys.model;
// Generated 2017-05-28 06:05:05 by Hibernate Tools 5.2.3.Final


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserStatus.
 * @see sswap.UserStatus
 * @author Hibernate Tools
 */

public class UserStatusHome {

	private static final Log log = LogFactory.getLog(UserStatusHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserStatus transientInstance) {
		log.debug("persisting UserStatus instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserStatus persistentInstance) {
		log.debug("removing UserStatus instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserStatus merge(UserStatus detachedInstance) {
		log.debug("merging UserStatus instance");
		try {
			UserStatus result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserStatus findById(int id) {
		log.debug("getting UserStatus instance with id: " + id);
		try {
			UserStatus instance = entityManager.find(UserStatus.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
