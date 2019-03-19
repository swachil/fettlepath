package com.application.fettlepath.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A user.
 */
@Entity
@Table(name = "people_activity_likes")
public class PeopleActivityLikes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String status;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "people_activity_id")
	private PeopleActivity people_activity_id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "liked_id")
	private User liked_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PeopleActivity getPeople_activity_id() {
		return people_activity_id;
	}

	public void setPeople_activity_id(PeopleActivity people_activity_id) {
		this.people_activity_id = people_activity_id;
	}

	public User getLiked_id() {
		return liked_id;
	}

	public void setLiked_id(User liked_id) {
		this.liked_id = liked_id;
	}

}
