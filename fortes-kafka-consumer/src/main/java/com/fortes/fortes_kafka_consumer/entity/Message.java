package com.fortes.fortes_kafka_consumer.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_message")
	private Integer id;

	private String message;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_origin_message")
	private Message originMessage;

	@OneToMany(mappedBy = "originMessage")
	private List<Message> replies;

	public Message(Integer messageId) {
		this.id = messageId;
	}

	public Message() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Message getOriginMessage() {
		return originMessage;
	}

	public void setOriginMessage(Message originMessage) {
		this.originMessage = originMessage;
	}

	public List<Message> getReplies() {
		return replies;
	}

	public void setReplies(List<Message> replies) {
		this.replies = replies;
	}
}
