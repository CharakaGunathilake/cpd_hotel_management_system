package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="address")
public class Address {
    @Id
    @Column(name="address_id", length=80)
    private String addressId;

    @Column(name="address_line", nullable = false, length = 250)
    private String addressLine;

    @Column(name="city", nullable = false, length = 100)
    private String city;

    @Column(name="country", nullable = false, length = 100)
    private String country;

    @Column(name="longitude", nullable = false)
    private BigDecimal longitude;

    @Column(name="latitude", nullable = false)
    private BigDecimal latitude;

    @OneToOne
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;
}
