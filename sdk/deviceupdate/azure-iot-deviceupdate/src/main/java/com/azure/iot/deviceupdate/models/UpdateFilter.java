package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update filter. */
@Fluent
public final class UpdateFilter {
    /*
     * Update isDeployable property.
     */
    @JsonProperty(value = "isDeployable")
    private Boolean isDeployable;

    /**
     * Get the isDeployable property: Update isDeployable property.
     *
     * @return the isDeployable value.
     */
    public Boolean isDeployable() {
        return this.isDeployable;
    }

    /**
     * Set the isDeployable property: Update isDeployable property.
     *
     * @param isDeployable the isDeployable value to set.
     * @return the UpdateFilter object itself.
     */
    public UpdateFilter setIsDeployable(Boolean isDeployable) {
        this.isDeployable = isDeployable;
        return this;
    }
}
