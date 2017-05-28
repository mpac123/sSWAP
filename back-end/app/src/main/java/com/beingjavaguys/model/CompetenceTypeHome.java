package com.beingjavaguys.model;
// Generated 2017-05-28 06:05:05 by Hibernate Tools 5.2.3.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CompetenceType.
 * @see sswap.CompetenceType
 * @author Hibernate Tools
 */
public class CompetenceTypeHome {

	private static final Log log = LogFactory.getLog(CompetenceTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CompetenceType transientInstance) {
		log.debug("persisting CompetenceType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CompetenceType persistentInstance) {
		log.debug("removing CompetenceType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CompetenceType merge(CompetenceType detachedInstance) {
		log.debug("merging CompetenceType instance");
		try {
			CompetenceType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CompetenceType findById(int id) {
		log.debug("getting CompetenceType instance with id: " + id);
		try {
			CompetenceType instance = entityManager.find(CompetenceType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
