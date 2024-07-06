package com.fortes.fortes_kafka_consumer.repository;
import com.fortes.fortes_kafka_consumer.entity.Message;
import com.fortes.fortes_kafka_consumer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

	List<Message> getMessagesByUserOrderById(User user);
}
