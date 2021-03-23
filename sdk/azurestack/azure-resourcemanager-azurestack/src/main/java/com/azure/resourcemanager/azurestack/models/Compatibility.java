// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Product compatibility. */
@Fluent
public final class Compatibility {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Compatibility.class);

    /*
     * Tells if product is compatible with current device
     */
    @JsonProperty(value = "isCompatible")
    private Boolean isCompatible;

    /*
     * Short error message if any compatibility issues are found
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Full error message if any compatibility issues are found
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * List of all issues found
     */
    @JsonProperty(value = "issues")
    private List<CompatibilityIssue> issues;

    /**
     * Get the isCompatible property: Tells if product is compatible with current device.
     *
     * @return the isCompatible value.
     */
    public Boolean isCompatible() {
        return this.isCompatible;
    }

    /**
     * Set the isCompatible property: Tells if product is compatible with current device.
     *
     * @param isCompatible the isCompatible value to set.
     * @return the Compatibility object itself.
     */
    public Compatibility withIsCompatible(Boolean isCompatible) {
        this.isCompatible = isCompatible;
        return this;
    }

    /**
     * Get the message property: Short error message if any compatibility issues are found.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Short error message if any compatibility issues are found.
     *
     * @param message the message value to set.
     * @return the Compatibility object itself.
     */
    public Compatibility withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the description property: Full error message if any compatibility issues are found.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Full error message if any compatibility issues are found.
     *
     * @param description the description value to set.
     * @return the Compatibility object itself.
     */
    public Compatibility withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the issues property: List of all issues found.
     *
     * @return the issues value.
     */
    public List<CompatibilityIssue> issues() {
        return this.issues;
    }

    /**
     * Set the issues property: List of all issues found.
     *
     * @param issues the issues value to set.
     * @return the Compatibility object itself.
     */
    public Compatibility withIssues(List<CompatibilityIssue> issues) {
        this.issues = issues;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
