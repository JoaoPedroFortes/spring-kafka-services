package com.fortes.fortes_kafka_consumer.dto;

import java.util.List;

public class MessageDTO {
	private Integer messageId;
	private Integer userId;
	private Integer originMessageId;
	private String message;
	private List<MessageDTO> replies;

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getOriginMessageId() {
		return originMessageId;
	}

	public void setOriginMessageId(Integer originMessageId) {
		this.originMessageId = originMessageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<MessageDTO> getReplies() {
		return replies;
	}

	public void setReplies(List<MessageDTO> replies) {
		this.replies = replies;
	}
}