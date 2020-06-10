package com.esc.ticketing.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@Entity
public class City extends BaseEntity{

    @Column
    private String name;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
