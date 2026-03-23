package com.parking.manager.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ParkingTicket {

    @Id
    @GeneratedValue
    public Long id;
    public LocalDateTime entryTime;
    public LocalDateTime exitTime;
    public double price;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    public Vehicle vehicle;
}