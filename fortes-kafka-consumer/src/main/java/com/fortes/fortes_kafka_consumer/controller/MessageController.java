package com.fortes.fortes_kafka_consumer.controller;

import com.fortes.fortes_kafka_consumer.dto.MessageDTO;
import com.fortes.fortes_kafka_consumer.dto.UserDTO;
import com.fortes.fortes_kafka_consumer.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;

	@GetMapping("/user/{id}/messages")
	public ResponseEntity<List<MessageDTO>> getMessageAndRepliesByUser(@PathVariable("id") Integer id){
		List<MessageDTO> messageDTO = messageService.getMessagesAndRepliesFromUser(new UserDTO(id));
		return ResponseEntity.ok(messageDTO);
	}
}
