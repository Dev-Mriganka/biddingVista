package com.bidvista.biddingvista.domain;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Address {

    private String id;

    @NotNull
    private String userId;

    @NotNull
    private String houseNo;

    @NotNull
    private String addressLine1;

    private String addressLine2;

    private String landmark;

    @NotNull
    private String city;

    @NotNull
    private String state;

    @NotNull
    private long pincode;
}
