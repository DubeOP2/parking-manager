package com.parking.manager.model;

import jakarta.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue
    public Long id;
    public String licensePlate;
    public String type;

    @OneToOne
    @JoinColumn(name = "driver_id", unique = true)
    public Driver driver;
}