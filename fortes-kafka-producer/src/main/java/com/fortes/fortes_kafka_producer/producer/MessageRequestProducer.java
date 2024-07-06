package com.fortes.fortes_kafka_producer.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fortes.fortes_kafka_producer.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.messaging.Message;
@Service
public class MessageRequestProducer {

	@Value("${topics.message.request.topic}")
	private String messageRequestTopic;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public String sendMessage(MessageDTO message) throws JsonProcessingException {
		String conteudo = objectMapper.writeValueAsString(message);

		Message<String> kafkaMessage = MessageBuilder
				.withPayload(conteudo)
				.setHeader(KafkaHeaders.TOPIC, messageRequestTopic)
				.setHeader(MessageHeaders.CONTENT_TYPE, "application/json")
				.build();
		kafkaTemplate.send(kafkaMessage);
		return "Message sent";
	}
}
