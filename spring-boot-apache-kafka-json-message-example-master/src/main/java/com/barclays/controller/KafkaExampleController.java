package com.barclays.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.model.User;
import com.barclays.service.KafkaProducerService;

@RestController
public class KafkaExampleController {

    @Autowired
    KafkaProducerService kafkaProducer;


    @PostMapping("/publish")
    public String sendMessage(@RequestBody User user)
    {
        kafkaProducer.send(user);
        return "Message sent successfully to the Kafka topic barclays-topic";
    }
    
    @GetMapping("/msg")
    public String message()
    {
        return "Message sent successfully to the Kafka topic barclays-topic";
    }

}
