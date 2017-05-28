package com.beingjavaguys.model;
// Generated 2017-05-28 06:05:05 by Hibernate Tools 5.2.3.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserCompetence.
 * @see sswap.UserCompetence
 * @author Hibernate Tools
 */
public class UserCompetenceHome {

	private static final Log log = LogFactory.getLog(UserCompetenceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserCompetence transientInstance) {
		log.debug("persisting UserCompetence instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserCompetence persistentInstance) {
		log.debug("removing UserCompetence instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserCompetence merge(UserCompetence detachedInstance) {
		log.debug("merging UserCompetence instance");
		try {
			UserCompetence result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserCompetence findById(int id) {
		log.debug("getting UserCompetence instance with id: " + id);
		try {
			UserCompetence instance = entityManager.find(UserCompetence.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
