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
@Table(name = "people_connection")
public class PeopleConnection implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String status;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "following_id")
	private User following_id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "followed_id")
	private User followed_id;

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

	public User getFollowing_id() {
		return following_id;
	}

	public void setFollowing_id(User following_id) {
		this.following_id = following_id;
	}

	public User getFollowed_id() {
		return followed_id;
	}

	public void setFollowed_id(User followed_id) {
		this.followed_id = followed_id;
	}

}
