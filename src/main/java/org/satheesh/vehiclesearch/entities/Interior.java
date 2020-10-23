package org.satheesh.vehiclesearch.entities;

import javax.persistence.*;

@Embeddable
public class Interior {

    @Column(name = "feature_name")
    private String featureName;

    public Interior() {
    }

    public Interior(String featureName) {
        this.featureName = featureName;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }
}
