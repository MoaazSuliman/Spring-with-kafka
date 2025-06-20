package com.moaaz.kafka_consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
/**
 *
 * listen1,2,3 are listing to the same topic
 * But
 * listen1 , listen2 ===> only one of them will listen to the message, because they are in the same group
 * listen3 ===> will always listen to the message, because it's in a different group.
 */
public class Listener {


    @KafkaListener(topics = "myTopic", groupId = "group1")
    private void listen1(String message) {
        System.out.println("Message Received 1 : " + message);
    }


    @KafkaListener(topics = "myTopic", groupId = "group1")
    private void listen2(String message) {
        System.out.println("Message Received 2 : " + message);
    }

    @KafkaListener(topics = "myTopic", groupId = "group2")
    private void listen3(String message) {
        System.out.println("Message Received 3 : " + message);
    }
}
