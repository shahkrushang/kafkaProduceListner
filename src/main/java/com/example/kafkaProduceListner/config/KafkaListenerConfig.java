package com.example.kafkaProduceListner.config;

import com.example.kafkaProduceListner.constant.KafkaConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaListenerConfig {

    private Logger logger = LoggerFactory.getLogger(KafkaListenerConfig.class);
    @KafkaListener(topics = KafkaConstant.KAFKA_TOPIC_NAME, groupId = KafkaConstant.GROUP_ID )
    public void listenKafkaProducedTopicHere(double dataInput){
        logger.info("data :- {}" , dataInput);
    }
}
