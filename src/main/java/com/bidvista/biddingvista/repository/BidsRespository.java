package com.bidvista.biddingvista.repository;

import com.bidvista.biddingvista.domain.Bids;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BidsRespository extends MongoRepository<Bids, String> {
}
