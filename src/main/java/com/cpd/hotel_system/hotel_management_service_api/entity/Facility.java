package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facilityId;

    @Column(length = 100, nullable = false, name = "name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
}
