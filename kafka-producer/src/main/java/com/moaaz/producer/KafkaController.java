package com.moaaz.producer;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final KafkaTemplate<String, Order> kafkaOrders;

    public KafkaController(KafkaTemplate<String, String> kafkaTemplate, KafkaTemplate<String, Order> kafkaOrders) {
        this.kafkaTemplate = kafkaTemplate;
        this.kafkaOrders = kafkaOrders;

    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        kafkaTemplate.send("myTopic", message);
        return "Message Sent: " + message;
    }


    @PostMapping("/send/order")
    public String sendOrderDetails(@RequestBody Order order) {
        kafkaOrders.send("orders", order);
        return "Order Notified";
    }


}
