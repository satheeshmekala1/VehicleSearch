package org.satheesh.vehiclesearch.repo;

import org.satheesh.vehiclesearch.entities.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Collection;

@Service
public class VehicleCustomRepositoryImpl implements VehicleCustomRepository{

    private EntityManager entityManager;

    @Autowired
    public VehicleCustomRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Collection<Vehicle> getVehiclesByExteriorOrInterior(String exterior, String interior) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Vehicle> criteriaQuery = criteriaBuilder.createQuery(Vehicle.class);
        return null;
    }
}
