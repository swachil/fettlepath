package com.application.fettlepath.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.application.fettlepath.config.Constants;

/**
 * A user.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;

	@NotNull
	@Pattern(regexp = Constants.LOGIN_REGEX)
	@Column(length = 50, unique = true, nullable = false)
	private String username;

	@NotNull
	@Column(name = "password", length = 60, nullable = false)
	private String password;

	@Column(name = "first_name", length = 50)
	private String firstName;

	@Column(name = "last_name", length = 50)
	private String lastName;

	@Column(length = 254, unique = true)
	private String email;

	private String country;
	private String postal_code;
	private Date birth_date;
	private int gender;
	private String user_type;
	private String feth_path_url;
	private String website_url;
	private String image_path;
	@Column(length = 500)
	private String address;
	private String city;
	private String state;
	private Long company_size;
	private String industry;
	private String company_type;
	private String tagline;
	private String profile_logo;
	private short official_agreement;
	private Timestamp reset_date;
	private String status;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getFeth_path_url() {
		return feth_path_url;
	}

	public void setFeth_path_url(String feth_path_url) {
		this.feth_path_url = feth_path_url;
	}

	public String getWebsite_url() {
		return website_url;
	}

	public void setWebsite_url(String website_url) {
		this.website_url = website_url;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getCompany_size() {
		return company_size;
	}

	public void setCompany_size(Long company_size) {
		this.company_size = company_size;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getCompany_type() {
		return company_type;
	}

	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getProfile_logo() {
		return profile_logo;
	}

	public void setProfile_logo(String profile_logo) {
		this.profile_logo = profile_logo;
	}

	public short getOfficial_agreement() {
		return official_agreement;
	}

	public void setOfficial_agreement(short official_agreement) {
		this.official_agreement = official_agreement;
	}

	public Timestamp getReset_date() {
		return reset_date;
	}

	public void setReset_date(Timestamp reset_date) {
		this.reset_date = reset_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
