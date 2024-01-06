package com.bidvista.biddingvista.domain;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Bids {

    // important fields for bid
    @Id
    private String bidId;
    private String auctionId;
    private String userId;
    private String bidAmount;
    private String bidTime;
    private String bidStatus;


}
