package com.fortes.fortes_kafka_consumer.util;

import com.fortes.fortes_kafka_consumer.dto.MessageDTO;
import com.fortes.fortes_kafka_consumer.entity.Message;
import com.fortes.fortes_kafka_consumer.entity.User;

public class MessageMapper {

	public static Message MessageFromMessageDTO(MessageDTO messageDTO){

		Message message = new Message();

		message.setId(messageDTO.getMessageId());
		message.setMessage(messageDTO.getMessage());

		if(messageDTO.getOriginMessageId() != null){
			message.setOriginMessage(new Message(messageDTO.getOriginMessageId()));
		}
		if(messageDTO.getUserId() != null){
			message.setUser(new User(messageDTO.getUserId()));
		}
		return message;
	}

	public static MessageDTO MessageDTOFromMessage(Message message){

		MessageDTO messageDTO = new MessageDTO();

		messageDTO.setMessageId(message.getId());
		messageDTO.setMessage(message.getMessage());

		var originMessage = message.getOriginMessage();
		if(originMessage != null){
			messageDTO.setOriginMessageId(originMessage.getId());
		}
		var user = message.getUser();
		if(user != null){
			messageDTO.setUserId(user.getId());
		}

		if(message.getReplies() != null && !message.getReplies().isEmpty()){
			messageDTO.setReplies(message.getReplies().stream().map(MessageMapper::MessageDTOFromMessage).toList());
		}
		return messageDTO;
	}
}
