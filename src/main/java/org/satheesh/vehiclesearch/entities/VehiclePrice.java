package org.satheesh.vehiclesearch.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehiclePrice {

    @Id
    @JsonIgnore
    private int id;
    @Column(scale = 2)
    private double MSRP;
    @Column(scale = 2)
    private double Savings;
    @Column(name = "finalprice", scale = 2)
    private double finalPrice;

    public VehiclePrice() {
    }

    public VehiclePrice(int id, double MSRP, double savings, double finalPrice) {
        this.id = id;
        this.MSRP = MSRP;
        Savings = savings;
        this.finalPrice = finalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMSRP() {
        return MSRP;
    }

    public void setMSRP(double MSRP) {
        this.MSRP = MSRP;
    }

    public double getSavings() {
        return Savings;
    }

    public void setSavings(double savings) {
        Savings = savings;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
}
