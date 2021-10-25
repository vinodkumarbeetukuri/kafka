package com.barclays.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.barclays.model.User;

@Service
public class KafkaProducerService {
    private final Logger LOG = LoggerFactory.getLogger(KafkaProducerService.class);
    
    private static final String TOPIC = "barclays-topic";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;


    public void send(User user) {
        LOG.info("Sending User Json Serializer : {}", user);
        kafkaTemplate.send(TOPIC, user);
    }
}
