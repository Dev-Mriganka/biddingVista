package com.bidvista.biddingvista.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BidRequest {

    private String userId;
    private String auctionId;
    private double bidAmount;
    private LocalDateTime timestamp;
}
