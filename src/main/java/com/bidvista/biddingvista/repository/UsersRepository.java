package com.bidvista.biddingvista.repository;

import com.bidvista.biddingvista.domain.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String> {
}
