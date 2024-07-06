package com.fortes.fortes_kafka_consumer.consumer;
import com.fortes.fortes_kafka_consumer.dto.MessageDTO;
import com.fortes.fortes_kafka_consumer.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class MessageRequestConsumer {

	@Autowired
	private MessageService messageService;

	@KafkaListener(
			topics = "${topics.message.request.topic}",
			groupId = "message-request-consumer-1",
			containerFactory = "kafkaJsonListenerContainerFactory"
	)
	public MessageDTO consume(MessageDTO message) {
		System.out.println("===== message received === ");
		try {
			messageService.saveMessage((MessageDTO) message);
			return (MessageDTO) message;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}