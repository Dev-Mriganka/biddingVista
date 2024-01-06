package com.bidvista.biddingvista.controllers;

import com.bidvista.biddingvista.dto.BidRequest;
import com.bidvista.biddingvista.stream.producer.BidPlacedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/bids")
public class BidsController {

    @Autowired
    BidPlacedEvent bidPlacedEvent;

    @PostMapping("/v1/placebid")
    public ResponseEntity<String> placeBid(@RequestBody BidRequest bidRequest) {
        // Process bid placement logic, validate bid request, etc
        // Save bid to MongoDB


        // Send bid placed event to Kafka


    }

}
