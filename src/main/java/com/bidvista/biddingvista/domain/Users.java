package com.bidvista.biddingvista.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "users")
@Data
@NoArgsConstructor
public class Users {

    @Id
    private String id;

    @NotNull
    @Field(name = "Fullname")
    private String fullname;

    @Field(name = "Password")
    @JsonIgnore
    private String password;

    @Field(name = "Email")
    private String email;

    @Field(name = "isEmailVerified")
    private boolean isEmailVerified;

    @Field(name = "phoneNo")
    private long phoneNo;

    @Field(name = "isPhoneVerified")
    private boolean isPhoneVerified;

    @Field(name = "isTwoFactorEnabled")
    private boolean isTwoFactorEnabled;

    @Field(name = "isKycVerified")
    private boolean isKycVerified;

    @Field(name = "isKycSubmitted")
    private boolean isKycSubmitted;

    @Field(name = "address")
    private Address address;

    @NotNull
    @Field(name = "isAdminUser")
    private String isAdmin;

    @NotNull
    @Field
    private Date createdOn;

    @NotNull
    @Field(name = "isOauthAccount")
    private String isOauthAccount = "N";

    @Field(name = "deletedFlag")
    private String deletedFlag;

    @Field(name = "credentialsExpiryDate")
    private LocalDateTime credentialsExpiryDate;

    @Field(name = "isAccountExpired")
    private boolean isAccountExpired;

    @Field(name = "isAccountLocked")
    private boolean isAccountLocked;

}
