package com.bidvista.biddingvista.repository;

import com.bidvista.biddingvista.domain.Auction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuctionRepository extends MongoRepository<Auction, String> {
}
