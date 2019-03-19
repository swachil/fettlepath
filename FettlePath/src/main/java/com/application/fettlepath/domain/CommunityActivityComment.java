package com.application.fettlepath.domain;

import java.io.Serializable;

import javax.persistence.Column;
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
@Table(name = "community_activity_comment")
public class CommunityActivityComment implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 500)
	private String comment;
	private String status;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "people_activity_id")
	private PeopleActivity people_activity_id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "commented_user_id")
	private User commented_user_id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shared_id")
	private User shared_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

	public User getCommented_user_id() {
		return commented_user_id;
	}

	public void setCommented_user_id(User commented_user_id) {
		this.commented_user_id = commented_user_id;
	}

	public User getShared_id() {
		return shared_id;
	}

	public void setShared_id(User shared_id) {
		this.shared_id = shared_id;
	}

}
