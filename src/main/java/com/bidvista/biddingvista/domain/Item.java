package com.bidvista.biddingvista.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Item {

    // important fields for auction item
    private String itemId;
    private String itemName;
    private String itemDescription;
    private List<String> itemImage;
    private String itemCategory;
}
