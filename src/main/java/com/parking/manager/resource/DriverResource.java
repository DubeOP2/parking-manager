package com.parking.manager.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import com.parking.manager.model.Driver;
import com.parking.manager.service.DriverService;

import java.util.List;

@Path("/drivers")
public class DriverResource {
    @Inject
    DriverService driverService;

    @POST
    public Driver save(Driver driver) {
        return driverService.save(driver);

    }
    @GET
    public List<Driver> findAllDrivers(){
        return driverService.findAll();
    }
}
