package org.satheesh.vehiclesearch.controller;

import org.satheesh.vehiclesearch.entities.Vehicle;
import org.satheesh.vehiclesearch.exception.VehicleNotFoundException;
import org.satheesh.vehiclesearch.repo.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class VehicleController {

    private VehicleRepository repository;

    @Autowired
    public VehicleController(VehicleRepository repository){
        this.repository=repository;
    }
    @GetMapping("/")
    public String index(){
        return "This is Vehicle Information Service";
    }

    @PostMapping("/vehicleInfomation/submitVehicle")
    public ResponseEntity<VehicleMessage> submitVehicle(@RequestBody Vehicle vehicle){
        repository.save(vehicle);

        return ResponseEntity.ok().body(new VehicleMessage(
                HttpStatus.OK.getReasonPhrase(),
                200,
                vehicle.getVehicleId()+" submitted to database successfully"
        ));
    }

    @GetMapping("/getVehicleInfomation")
    public Collection<Vehicle> getVehicleInfomation() throws Exception {
        List<Vehicle> list = repository.findAll();
        if(list.size() == 0)
            throw new VehicleNotFoundException("Vehicle not found");
        return list;
    }

    @GetMapping("/getVehicleModelName/{modelName}")
    public Collection<Vehicle> getVehiclesbyModelName(@PathVariable(name = "modelName") String modelName) throws VehicleNotFoundException {
        List<Vehicle> list = repository.findByVehicleDetails_Model(modelName);
        if(list.size() == 0)
            throw new VehicleNotFoundException("Vehicle not found");
        return list;
    }

    @GetMapping("/getVehiclePrice/{from}/{to}")
    public Collection<Vehicle> getVehicleFromTo(@PathVariable(name = "from") double from,
                                          @PathVariable(name = "to") double to) throws VehicleNotFoundException {
        List<Vehicle> list = repository.findByVehiclePriceFinalPriceIsBetween(from, to);
        if(list.size() == 0)
            throw new VehicleNotFoundException("Vehicle not found");
        return list;
    }

    @GetMapping("/getVehicleFeature/{exterior}/{interior}")
    public Collection<Vehicle> getVehiclesMatchExteriorOrInterior(
            @PathVariable(name = "exterior") String exterior,
            @PathVariable(name = "interior") String interior) throws Exception {

        if(exterior.length() < 3 || interior.length() < 3)
            throw new RuntimeException("length of string accepted for {exterior}/{interior}parameter must be 3 or more.");

        List<Vehicle> list = repository.findByExteriorFeatureNameContainsOrInteriorFeatureNameContains(exterior,interior);
        if(list.size() == 0)
            throw new VehicleNotFoundException("Vehicle not found");
        return new HashSet<Vehicle>(list);
    }

}
