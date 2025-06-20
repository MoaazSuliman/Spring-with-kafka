package com.moaaz.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class kafkaTopicConfiguration {

    @Bean
    public NewTopic newTopic() {
        return new NewTopic("products", 3, (short) 1);
    }
}
