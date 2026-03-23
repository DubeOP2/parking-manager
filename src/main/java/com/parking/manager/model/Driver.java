package com.parking.manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToOne;

@Entity
public class Driver {
    @Id
    @GeneratedValue
    public Long id;
    public String name;
    public String phone;

    @OneToOne(mappedBy = "driver")
    public Vehicle vehicle;

}
