package com.build.socialApp.Entity;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID postID;
	
	@Column(length = 4096, nullable = false)
	private String content;
	
	@Column(length = 256, nullable = false)
    private String postPhoto;
	
	private Timestamp dateTime;

	public Post() {
		super();
	}

	public Post(UUID postID, String content, String postPhoto, Timestamp dateTime) {
		super();
		this.postID = postID;
		this.content = content;
		this.postPhoto = postPhoto;
		this.dateTime = dateTime;
	}

	public UUID getPostID() {
		return postID;
	}

	public void setPostID(UUID postID) {
		this.postID = postID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPostPhoto() {
		return postPhoto;
	}

	public void setPostPhoto(String postPhoto) {
		this.postPhoto = postPhoto;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
}
