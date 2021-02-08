// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents metric limits set on a web app. */
@Fluent
public final class SiteLimits {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SiteLimits.class);

    /*
     * Maximum allowed CPU usage percentage
     */
    @JsonProperty(value = "maxPercentageCpu")
    private Double maxPercentageCpu;

    /*
     * Maximum allowed memory usage in MB
     */
    @JsonProperty(value = "maxMemoryInMb")
    private Long maxMemoryInMb;

    /*
     * Maximum allowed disk size usage in MB
     */
    @JsonProperty(value = "maxDiskSizeInMb")
    private Long maxDiskSizeInMb;

    /**
     * Get the maxPercentageCpu property: Maximum allowed CPU usage percentage.
     *
     * @return the maxPercentageCpu value.
     */
    public Double maxPercentageCpu() {
        return this.maxPercentageCpu;
    }

    /**
     * Set the maxPercentageCpu property: Maximum allowed CPU usage percentage.
     *
     * @param maxPercentageCpu the maxPercentageCpu value to set.
     * @return the SiteLimits object itself.
     */
    public SiteLimits withMaxPercentageCpu(Double maxPercentageCpu) {
        this.maxPercentageCpu = maxPercentageCpu;
        return this;
    }

    /**
     * Get the maxMemoryInMb property: Maximum allowed memory usage in MB.
     *
     * @return the maxMemoryInMb value.
     */
    public Long maxMemoryInMb() {
        return this.maxMemoryInMb;
    }

    /**
     * Set the maxMemoryInMb property: Maximum allowed memory usage in MB.
     *
     * @param maxMemoryInMb the maxMemoryInMb value to set.
     * @return the SiteLimits object itself.
     */
    public SiteLimits withMaxMemoryInMb(Long maxMemoryInMb) {
        this.maxMemoryInMb = maxMemoryInMb;
        return this;
    }

    /**
     * Get the maxDiskSizeInMb property: Maximum allowed disk size usage in MB.
     *
     * @return the maxDiskSizeInMb value.
     */
    public Long maxDiskSizeInMb() {
        return this.maxDiskSizeInMb;
    }

    /**
     * Set the maxDiskSizeInMb property: Maximum allowed disk size usage in MB.
     *
     * @param maxDiskSizeInMb the maxDiskSizeInMb value to set.
     * @return the SiteLimits object itself.
     */
    public SiteLimits withMaxDiskSizeInMb(Long maxDiskSizeInMb) {
        this.maxDiskSizeInMb = maxDiskSizeInMb;
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
