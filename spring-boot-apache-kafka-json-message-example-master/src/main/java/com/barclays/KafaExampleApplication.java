package com.barclays;

import com.barclays.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafaExampleApplication.class, args);
    }

    @KafkaListener(topics = "barclays-topic", groupId = "barclays-group")
    public void listen(User user) {

        System.out.println("Received User information : " + user);
    }
}
