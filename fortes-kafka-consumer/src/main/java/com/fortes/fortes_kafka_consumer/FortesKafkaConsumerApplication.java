package com.fortes.fortes_kafka_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages={"com.fortes.fortes_kafka_consumer.entity"})
@EnableJpaRepositories(basePackages = {"com.fortes.fortes_kafka_consumer.repository"})
public class FortesKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FortesKafkaConsumerApplication.class, args);
	}

}
