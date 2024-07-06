package com.fortes.fortes_kafka_producer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fortes.fortes_kafka_producer.dto.MessageDTO;
import com.fortes.fortes_kafka_producer.producer.MessageRequestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {


	@Autowired
	private MessageRequestProducer messageRequestProducer;

	public String sendMessage(MessageDTO message) {
		try {
			return messageRequestProducer.sendMessage(message);
		} catch (JsonProcessingException e) {
			return "An unexpected error occurred. "+ e.getMessage();
		}
	}
}
