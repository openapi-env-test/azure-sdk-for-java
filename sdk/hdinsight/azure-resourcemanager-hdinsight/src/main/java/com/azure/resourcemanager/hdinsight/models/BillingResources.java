// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The billing resources. */
@Fluent
public final class BillingResources {
    /*
     * The region or location.
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * The billing meter information.
     */
    @JsonProperty(value = "billingMeters")
    private List<BillingMeters> billingMeters;

    /*
     * The managed disk billing information.
     */
    @JsonProperty(value = "diskBillingMeters")
    private List<DiskBillingMeters> diskBillingMeters;

    /**
     * Get the region property: The region or location.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: The region or location.
     *
     * @param region the region value to set.
     * @return the BillingResources object itself.
     */
    public BillingResources withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the billingMeters property: The billing meter information.
     *
     * @return the billingMeters value.
     */
    public List<BillingMeters> billingMeters() {
        return this.billingMeters;
    }

    /**
     * Set the billingMeters property: The billing meter information.
     *
     * @param billingMeters the billingMeters value to set.
     * @return the BillingResources object itself.
     */
    public BillingResources withBillingMeters(List<BillingMeters> billingMeters) {
        this.billingMeters = billingMeters;
        return this;
    }

    /**
     * Get the diskBillingMeters property: The managed disk billing information.
     *
     * @return the diskBillingMeters value.
     */
    public List<DiskBillingMeters> diskBillingMeters() {
        return this.diskBillingMeters;
    }

    /**
     * Set the diskBillingMeters property: The managed disk billing information.
     *
     * @param diskBillingMeters the diskBillingMeters value to set.
     * @return the BillingResources object itself.
     */
    public BillingResources withDiskBillingMeters(List<DiskBillingMeters> diskBillingMeters) {
        this.diskBillingMeters = diskBillingMeters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (billingMeters() != null) {
            billingMeters().forEach(e -> e.validate());
        }
        if (diskBillingMeters() != null) {
            diskBillingMeters().forEach(e -> e.validate());
        }
    }
}
