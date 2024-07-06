package com.fortes.fortes_kafka_consumer.dto;

public class UserDTO {

	private Integer id;

	public UserDTO(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
