package com.esc.ticketing.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@Entity
public class Flight extends BaseEntity{

    @Column
    private String flightName;
    @Column
    private Date departureDate;
    @Column
    private Date arrivalDate;
    @Column
    private String countryFrom;
    @Column
    private String cityFrom;
    @Column
    private String countryTo;
    @Column
    private City cityTo;
}
