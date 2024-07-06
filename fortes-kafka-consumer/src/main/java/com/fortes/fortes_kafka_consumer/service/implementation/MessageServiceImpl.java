package com.fortes.fortes_kafka_consumer.service.implementation;

import com.fortes.fortes_kafka_consumer.dto.MessageDTO;
import com.fortes.fortes_kafka_consumer.dto.UserDTO;
import com.fortes.fortes_kafka_consumer.entity.Message;
import com.fortes.fortes_kafka_consumer.repository.MessageRepository;
import com.fortes.fortes_kafka_consumer.service.MessageService;
import com.fortes.fortes_kafka_consumer.util.MessageMapper;
import com.fortes.fortes_kafka_consumer.util.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageRepository messageRepository;

	@Override
	public void saveMessage(MessageDTO messageDTO) throws Exception{
		Message message = MessageMapper.MessageFromMessageDTO(messageDTO);
		messageRepository.save(message);
	}

	@Override
	public List<MessageDTO> getMessagesAndRepliesFromUser(UserDTO userDTO) {
		List<Message> messages = messageRepository.getMessagesByUserOrderById(UserMapper.getUserFromUserDTO(userDTO));
		return messages.stream().map(MessageMapper::MessageDTOFromMessage).toList();

	}

}
