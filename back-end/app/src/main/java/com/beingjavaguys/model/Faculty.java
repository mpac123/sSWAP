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
 * Faculty generated by hbm2java
 */
@Entity
@Table(name = "Faculty", catalog = "sswap")
public class Faculty implements java.io.Serializable {

	private int idFaculty;
	private String name;
	private String location;
	private Set<User> users = new HashSet<User>(0);

	public Faculty() {
	}

	public Faculty(int idFaculty) {
		this.idFaculty = idFaculty;
	}

	public Faculty(int idFaculty, String name, String location, Set<User> users) {
		this.idFaculty = idFaculty;
		this.name = name;
		this.location = location;
		this.users = users;
	}

	@Id

	@Column(name = "idFaculty", unique = true, nullable = false)
	public int getIdFaculty() {
		return this.idFaculty;
	}

	public void setIdFaculty(int idFaculty) {
		this.idFaculty = idFaculty;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "location", length = 45)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "faculty")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
