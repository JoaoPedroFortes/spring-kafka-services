package com.fortes.fortes_kafka_consumer.service;

import com.fortes.fortes_kafka_consumer.dto.MessageDTO;
import com.fortes.fortes_kafka_consumer.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {

	void saveMessage(MessageDTO messageDTO) throws Exception;

	List<MessageDTO> getMessagesAndRepliesFromUser(UserDTO userDTO);
}
