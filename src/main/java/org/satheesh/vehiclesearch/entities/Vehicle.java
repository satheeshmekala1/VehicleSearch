package org.satheesh.vehiclesearch.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
    @Embedded
    private VehicleDetails vehicleDetails;
    @ElementCollection
    @JoinTable(name= "vehicle_exterior",
    joinColumns = @JoinColumn(name = "vehicle_id"))
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Collection<Exterior> exterior = new ArrayList<>();

    @ElementCollection
    @JoinTable(name= "vehicle_interior",
            joinColumns = @JoinColumn(name = "vehicle_id"))
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Collection<Exterior> interior = new ArrayList<>();
    @OneToOne
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private VehiclePrice vehiclePrice;

    public Vehicle() {
    }

    public Vehicle(int vehicleId, VehicleDetails vehicleDetails, Collection<Exterior> exterior, Collection<Exterior> interior, VehiclePrice vehiclePrice) {
        this.vehicleId = vehicleId;
        this.vehicleDetails = vehicleDetails;
        this.exterior = exterior;
        this.interior = interior;
        this.vehiclePrice = vehiclePrice;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public VehicleDetails getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(VehicleDetails vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public Collection<Exterior> getExterior() {
        return exterior;
    }

    public void setExterior(Collection<Exterior> exterior) {
        this.exterior = exterior;
    }

    public Collection<Exterior> getInterior() {
        return interior;
    }

    public void setInterior(Collection<Exterior> interior) {
        this.interior = interior;
    }

    public VehiclePrice getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(VehiclePrice vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    @JsonProperty("exterior")
    public List<String> getExteriorAsStrList(){
        return this.exterior
                .stream()
                .map(Exterior::getFeatureName)
                .collect(Collectors.toList());
    }

    @JsonProperty("interior")
    public List<String> getInteriorAsStrList(){
        return this.interior
                .stream()
                .map(Exterior::getFeatureName)
                .collect(Collectors.toList());
    }
    @JsonProperty("vehiclePrice")
    public Map<String, String> getFormattedVehiclePrice(){
        Map<String, String> map = new HashMap<>();
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CANADA);
        if(vehiclePrice != null) {
            map.put("MSRP", format.format(vehiclePrice.getMSRP()));
            map.put("Savings", format.format(vehiclePrice.getSavings()));
            map.put("finalPrice", format.format(vehiclePrice.getFinalPrice()));
        }
        return map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehicleId == vehicle.vehicleId &&
                vehicleDetails.equals(vehicle.vehicleDetails) &&
                exterior.equals(vehicle.exterior) &&
                interior.equals(vehicle.interior) &&
                vehiclePrice.equals(vehicle.vehiclePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId, vehicleDetails, exterior, interior, vehiclePrice);
    }
}
