package com.beingjavaguys.model;
// Generated 2017-05-28 06:05:05 by Hibernate Tools 5.2.3.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectCompetence.
 * @see sswap.ProjectCompetence
 * @author Hibernate Tools
 */
public class ProjectCompetenceHome {

	private static final Log log = LogFactory.getLog(ProjectCompetenceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectCompetence transientInstance) {
		log.debug("persisting ProjectCompetence instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectCompetence persistentInstance) {
		log.debug("removing ProjectCompetence instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectCompetence merge(ProjectCompetence detachedInstance) {
		log.debug("merging ProjectCompetence instance");
		try {
			ProjectCompetence result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectCompetence findById(int id) {
		log.debug("getting ProjectCompetence instance with id: " + id);
		try {
			ProjectCompetence instance = entityManager.find(ProjectCompetence.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
