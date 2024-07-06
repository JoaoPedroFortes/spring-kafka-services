package com.fortes.fortes_kafka_producer.api;

import com.fortes.fortes_kafka_producer.dto.MessageDTO;
import com.fortes.fortes_kafka_producer.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageAPI {
	@Autowired
	private MessageService messageService;

	@PostMapping
	public String send(@RequestBody MessageDTO message) {
		return messageService.sendMessage(message);
	}
}