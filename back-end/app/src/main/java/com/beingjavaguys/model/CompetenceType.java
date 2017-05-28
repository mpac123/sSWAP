package com.beingjavaguys.model;
// Generated 2017-05-28 06:05:05 by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CompetenceType generated by hbm2java
 */
@Entity
@Table(name = "CompetenceType", catalog = "sswap")
public class CompetenceType implements java.io.Serializable {

	private int idCompetenceType;
	private String name;
	private Set<ProjectCompetence> projectCompetences = new HashSet<ProjectCompetence>(0);
	private Set<UserCompetence> userCompetences = new HashSet<UserCompetence>(0);

	public CompetenceType() {
	}

	public CompetenceType(int idCompetenceType, String name) {
		this.idCompetenceType = idCompetenceType;
		this.name = name;
	}

	public CompetenceType(int idCompetenceType, String name, Set<ProjectCompetence> projectCompetences,
			Set<UserCompetence> userCompetences) {
		this.idCompetenceType = idCompetenceType;
		this.name = name;
		this.projectCompetences = projectCompetences;
		this.userCompetences = userCompetences;
	}

	@Id

	@Column(name = "idCompetenceType", unique = true, nullable = false)
	public int getIdCompetenceType() {
		return this.idCompetenceType;
	}

	public void setIdCompetenceType(int idCompetenceType) {
		this.idCompetenceType = idCompetenceType;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "competenceType")
	public Set<ProjectCompetence> getProjectCompetences() {
		return this.projectCompetences;
	}

	public void setProjectCompetences(Set<ProjectCompetence> projectCompetences) {
		this.projectCompetences = projectCompetences;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "competenceType")
	public Set<UserCompetence> getUserCompetences() {
		return this.userCompetences;
	}

	public void setUserCompetences(Set<UserCompetence> userCompetences) {
		this.userCompetences = userCompetences;
	}

}
