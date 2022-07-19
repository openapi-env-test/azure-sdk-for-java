// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.InstancePoolLicenseType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of an instance pool. */
@Fluent
public final class InstancePoolProperties {
    /*
     * Resource ID of the subnet to place this instance pool in.
     */
    @JsonProperty(value = "subnetId", required = true)
    private String subnetId;

    /*
     * Count of vCores belonging to this instance pool.
     */
    @JsonProperty(value = "vCores", required = true)
    private int vCores;

    /*
     * The license type. Possible values are 'LicenseIncluded' (price for SQL
     * license is included) and 'BasePrice' (without SQL license price).
     */
    @JsonProperty(value = "licenseType", required = true)
    private InstancePoolLicenseType licenseType;

    /**
     * Get the subnetId property: Resource ID of the subnet to place this instance pool in.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: Resource ID of the subnet to place this instance pool in.
     *
     * @param subnetId the subnetId value to set.
     * @return the InstancePoolProperties object itself.
     */
    public InstancePoolProperties withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the vCores property: Count of vCores belonging to this instance pool.
     *
     * @return the vCores value.
     */
    public int vCores() {
        return this.vCores;
    }

    /**
     * Set the vCores property: Count of vCores belonging to this instance pool.
     *
     * @param vCores the vCores value to set.
     * @return the InstancePoolProperties object itself.
     */
    public InstancePoolProperties withVCores(int vCores) {
        this.vCores = vCores;
        return this;
    }

    /**
     * Get the licenseType property: The license type. Possible values are 'LicenseIncluded' (price for SQL license is
     * included) and 'BasePrice' (without SQL license price).
     *
     * @return the licenseType value.
     */
    public InstancePoolLicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type. Possible values are 'LicenseIncluded' (price for SQL license is
     * included) and 'BasePrice' (without SQL license price).
     *
     * @param licenseType the licenseType value to set.
     * @return the InstancePoolProperties object itself.
     */
    public InstancePoolProperties withLicenseType(InstancePoolLicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnetId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property subnetId in model InstancePoolProperties"));
        }
        if (licenseType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property licenseType in model InstancePoolProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InstancePoolProperties.class);
}
