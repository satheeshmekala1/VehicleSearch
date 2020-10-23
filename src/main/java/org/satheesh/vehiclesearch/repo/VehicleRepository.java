package org.satheesh.vehiclesearch.repo;

import org.satheesh.vehiclesearch.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    public List<Vehicle> findByVehicleDetails_Model(String modelName);
    public List<Vehicle> findByVehiclePriceFinalPriceIsBetween(double from, double to);
    public List<Vehicle> findByExteriorFeatureNameContainsOrInteriorFeatureNameContains(String exterior, String interior);
}
