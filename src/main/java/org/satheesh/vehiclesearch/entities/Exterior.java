package org.satheesh.vehiclesearch.entities;

import javax.persistence.*;

@Embeddable
public class Exterior {

    @Column(name = "feature_name")
    private String featureName;

    public Exterior() {
    }

    public Exterior(String featureName) {
        this.featureName = featureName;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }
}
