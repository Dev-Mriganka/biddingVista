package com.bidvista.biddingvista.service;

import com.bidvista.biddingvista.repository.BidsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidsService {

    @Autowired
    BidsRespository bidsRespository;


}
