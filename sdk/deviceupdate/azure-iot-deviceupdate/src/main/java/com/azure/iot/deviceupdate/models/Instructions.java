package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Instructions model. */
@Fluent
public final class Instructions {
    /*
     * Collection of installation steps.
     */
    @JsonProperty(value = "steps", required = true)
    private List<Step> steps;

    /**
     * Get the steps property: Collection of installation steps.
     *
     * @return the steps value.
     */
    public List<Step> getSteps() {
        return this.steps;
    }

    /**
     * Set the steps property: Collection of installation steps.
     *
     * @param steps the steps value to set.
     * @return the Instructions object itself.
     */
    public Instructions setSteps(List<Step> steps) {
        this.steps = steps;
        return this;
    }
}
