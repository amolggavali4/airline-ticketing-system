package com.esc.ticketing.domain;

import com.esc.ticketing.domain.enums.UserType;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString(exclude = "addresses")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User extends BaseEntity{
    @Column
    private String name;
    @Column
    private String emailAddress;
    @Column
    private Long contactNo;
    @Column
    private UserType userType;
    @EqualsAndHashCode.Exclude
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Address> addresses = new HashSet<>();

}
