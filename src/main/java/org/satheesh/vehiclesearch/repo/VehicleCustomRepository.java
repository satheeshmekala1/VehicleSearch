package org.satheesh.vehiclesearch.repo;

import org.satheesh.vehiclesearch.entities.Vehicle;

import java.util.Collection;

public interface VehicleCustomRepository {
    public Collection<Vehicle> getVehiclesByExteriorOrInterior(String exterior, String interior);
}
