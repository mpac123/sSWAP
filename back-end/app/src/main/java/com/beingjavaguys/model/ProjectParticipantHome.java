package com.beingjavaguys.model;
// Generated 2017-05-28 06:05:05 by Hibernate Tools 5.2.3.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectParticipant.
 * @see sswap.ProjectParticipant
 * @author Hibernate Tools
 */

public class ProjectParticipantHome {

	private static final Log log = LogFactory.getLog(ProjectParticipantHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectParticipant transientInstance) {
		log.debug("persisting ProjectParticipant instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectParticipant persistentInstance) {
		log.debug("removing ProjectParticipant instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectParticipant merge(ProjectParticipant detachedInstance) {
		log.debug("merging ProjectParticipant instance");
		try {
			ProjectParticipant result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectParticipant findById(int id) {
		log.debug("getting ProjectParticipant instance with id: " + id);
		try {
			ProjectParticipant instance = entityManager.find(ProjectParticipant.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
