package com.parking.manager.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import com.parking.manager.model.Driver;

import java.util.List;

@ApplicationScoped
public class DriverService {

    @Inject
    EntityManager em;

    @Transactional
    public Driver save(Driver driver){
        em.persist(driver);
        return driver;
    }
    public List<Driver> findAll(){
        return em.createQuery("from Driver", Driver.class).getResultList();
    }
}
