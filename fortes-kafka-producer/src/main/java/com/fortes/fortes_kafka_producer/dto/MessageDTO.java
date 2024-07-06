package com.fortes.fortes_kafka_producer.dto;

public class MessageDTO {
	private Integer messageId;
	private Integer userId;
	private Integer originMessageId;
	private String message;

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
}
