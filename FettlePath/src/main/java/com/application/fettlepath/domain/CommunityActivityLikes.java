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
@Table(name = "community_activity_likes")
public class CommunityActivityLikes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String status;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "community_activity_id")
	private CommunityActivity community_activity_id;

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

	public CommunityActivity getCommunity_activity_id() {
		return community_activity_id;
	}

	public void setCommunity_activity_id(CommunityActivity community_activity_id) {
		this.community_activity_id = community_activity_id;
	}

	public User getLiked_id() {
		return liked_id;
	}

	public void setLiked_id(User liked_id) {
		this.liked_id = liked_id;
	}

}
