package com.phonebookbackend.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class ConsumerService {
    private final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consumer(String message){
        logger.info(String.format("$$ -> Consumed Message -> %s", message));
    }
}
