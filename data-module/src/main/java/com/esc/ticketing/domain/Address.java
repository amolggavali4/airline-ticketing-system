package com.esc.ticketing.domain;


import com.esc.ticketing.domain.enums.AddressType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address extends BaseEntity{

    @Column
    private String addressLine1;
    @Column
    private String addressLine2;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String country;
    @Column
    private AddressType addressType;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
