package com.barclays.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.barclays.model.User;

@Service
public class KafkaConsumerService {
	
	@Service
	public class Consumer {

		private final Logger logger = LoggerFactory.getLogger(Consumer.class);

		@KafkaListener(topics = "barclays-topic", groupId = "barclays-group")
		public void consume(User message) {
			logger.info(String.format("$$$ -> Consumed Message -> %s", message));
		}
	}
}
