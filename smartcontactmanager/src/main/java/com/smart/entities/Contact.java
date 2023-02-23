package com.smart.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String name;
	private String nickName;
	private String phone;
	private String imageURL;
	private String email;
	private String work;
	
	@Column(length = 1000)
	private String description;
	
	@ManyToOne(cascade = CascadeType.ALL)
	User user = new User();

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(int cId, String name, String nickName, String phone, String imageURL, String email, String work,
			String description, User user) {
		super();
		this.cId = cId;
		this.name = name;
		this.nickName = nickName;
		this.phone = phone;
		this.imageURL = imageURL;
		this.email = email;
		this.work = work;
		this.description = description;
		this.user = user;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
