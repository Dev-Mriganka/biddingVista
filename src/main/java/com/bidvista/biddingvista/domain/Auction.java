package com.bidvista.biddingvista.domain;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "auction")
@Getter
@Setter
public class Auction {

    // important fields for auction item
    @Id
    private String auctionId;
    private String auctionName;
    private String auctionRules;
    private String auctionDescription;
    private Item item;
    private String auctionStartTime;
    private String auctionEndTime;
    private String auctionStatus;
    private String auctionWinner;

}
