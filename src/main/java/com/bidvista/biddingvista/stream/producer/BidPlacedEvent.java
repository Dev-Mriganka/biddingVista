package com.bidvista.biddingvista.stream.producer;

import com.bidvista.biddingvista.domain.Bids;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BidPlacedEvent {

    private final KafkaTemplate<String, String> kafkaTemplate;

    ObjectMapper objectMapper;

    @Value("${spring.kafka.topic}")
    public String topic;

    public BidPlacedEvent(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public void sendPlacedBidEvent(Bids bids) throws JsonProcessingException {
        var key = bids.getAuctionId();
        var value = objectMapper.writeValueAsString(bids);
        log.info("sending bid='{}' to topic='{}'", bids, topic);
        kafkaTemplate.send(topic, key, value);
    }
}
