package com.beingjavaguys.model;
// Generated 2017-05-28 06:05:05 by Hibernate Tools 5.2.3.Final


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ContactInfo.
 * @see sswap.ContactInfo
 * @author Hibernate Tools
 */

public class ContactInfoHome {

	private static final Log log = LogFactory.getLog(ContactInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ContactInfo transientInstance) {
		log.debug("persisting ContactInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ContactInfo persistentInstance) {
		log.debug("removing ContactInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ContactInfo merge(ContactInfo detachedInstance) {
		log.debug("merging ContactInfo instance");
		try {
			ContactInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ContactInfo findById(int id) {
		log.debug("getting ContactInfo instance with id: " + id);
		try {
			ContactInfo instance = entityManager.find(ContactInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
