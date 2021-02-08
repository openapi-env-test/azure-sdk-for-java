// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The service objectives capability. */
@JsonFlatten
@Immutable
public class ServiceObjectiveCapability {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceObjectiveCapability.class);

    /*
     * The service objective name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The status of the service objective.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The unique ID of the service objective.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * The list of supported maximum database sizes for this service objective.
     */
    @JsonProperty(value = "supportedMaxSizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaxSizeCapability> supportedMaxSizes;

    /*
     * The included (free) max size for this service level objective.
     */
    @JsonProperty(value = "includedMaxSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability includedMaxSize;

    /*
     * Unit type used to measure service objective performance level.
     */
    @JsonProperty(value = "performanceLevel.unit", access = JsonProperty.Access.WRITE_ONLY)
    private PerformanceLevelUnit unit;

    /*
     * Performance level value.
     */
    @JsonProperty(value = "performanceLevel.value", access = JsonProperty.Access.WRITE_ONLY)
    private Integer value;

    /**
     * Get the name property: The service objective name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the status property: The status of the service objective.
     *
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the id property: The unique ID of the service objective.
     *
     * @return the id value.
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get the supportedMaxSizes property: The list of supported maximum database sizes for this service objective.
     *
     * @return the supportedMaxSizes value.
     */
    public List<MaxSizeCapability> supportedMaxSizes() {
        return this.supportedMaxSizes;
    }

    /**
     * Get the includedMaxSize property: The included (free) max size for this service level objective.
     *
     * @return the includedMaxSize value.
     */
    public MaxSizeCapability includedMaxSize() {
        return this.includedMaxSize;
    }

    /**
     * Get the unit property: Unit type used to measure service objective performance level.
     *
     * @return the unit value.
     */
    public PerformanceLevelUnit unit() {
        return this.unit;
    }

    /**
     * Get the value property: Performance level value.
     *
     * @return the value value.
     */
    public Integer value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedMaxSizes() != null) {
            supportedMaxSizes().forEach(e -> e.validate());
        }
        if (includedMaxSize() != null) {
            includedMaxSize().validate();
        }
    }
}
