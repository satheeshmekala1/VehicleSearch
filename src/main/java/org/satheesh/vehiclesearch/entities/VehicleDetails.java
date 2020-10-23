package org.satheesh.vehiclesearch.entities;

import javax.persistence.*;

@Embeddable
public class VehicleDetails {

    private String make;
    private String model;
    private String modelyear;
    private String bodystyle;
    private String engine;
    private String drivetype;
    private String color;
    private String MPG;

    public VehicleDetails() {
    }

    public VehicleDetails(String make, String model, String modelyear, String bodystyle, String engine, String drivetype, String color, String MPG) {
        this.make = make;
        this.model = model;
        this.modelyear = modelyear;
        this.bodystyle = bodystyle;
        this.engine = engine;
        this.drivetype = drivetype;
        this.color = color;
        this.MPG = MPG;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelyear() {
        return modelyear;
    }

    public void setModelyear(String modelyear) {
        this.modelyear = modelyear;
    }

    public String getBodystyle() {
        return bodystyle;
    }

    public void setBodystyle(String bodystyle) {
        this.bodystyle = bodystyle;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDrivetype() {
        return drivetype;
    }

    public void setDrivetype(String drivetype) {
        this.drivetype = drivetype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMPG() {
        return MPG;
    }

    public void setMPG(String MPG) {
        this.MPG = MPG;
    }
}
