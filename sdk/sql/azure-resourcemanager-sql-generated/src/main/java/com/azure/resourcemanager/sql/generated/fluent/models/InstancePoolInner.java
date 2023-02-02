// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.sql.generated.models.InstancePoolLicenseType;
import com.azure.resourcemanager.sql.generated.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An Azure SQL instance pool. */
@Fluent
public final class InstancePoolInner extends Resource {
    /*
     * The name and tier of the SKU.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private InstancePoolProperties innerProperties;

    /** Creates an instance of InstancePoolInner class. */
    public InstancePoolInner() {
    }

    /**
     * Get the sku property: The name and tier of the SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The name and tier of the SKU.
     *
     * @param sku the sku value to set.
     * @return the InstancePoolInner object itself.
     */
    public InstancePoolInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private InstancePoolProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public InstancePoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InstancePoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the subnetId property: Resource ID of the subnet to place this instance pool in.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().subnetId();
    }

    /**
     * Set the subnetId property: Resource ID of the subnet to place this instance pool in.
     *
     * @param subnetId the subnetId value to set.
     * @return the InstancePoolInner object itself.
     */
    public InstancePoolInner withSubnetId(String subnetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InstancePoolProperties();
        }
        this.innerProperties().withSubnetId(subnetId);
        return this;
    }

    /**
     * Get the vCores property: Count of vCores belonging to this instance pool.
     *
     * @return the vCores value.
     */
    public Integer vCores() {
        return this.innerProperties() == null ? null : this.innerProperties().vCores();
    }

    /**
     * Set the vCores property: Count of vCores belonging to this instance pool.
     *
     * @param vCores the vCores value to set.
     * @return the InstancePoolInner object itself.
     */
    public InstancePoolInner withVCores(Integer vCores) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InstancePoolProperties();
        }
        this.innerProperties().withVCores(vCores);
        return this;
    }

    /**
     * Get the licenseType property: The license type. Possible values are 'LicenseIncluded' (price for SQL license is
     * included) and 'BasePrice' (without SQL license price).
     *
     * @return the licenseType value.
     */
    public InstancePoolLicenseType licenseType() {
        return this.innerProperties() == null ? null : this.innerProperties().licenseType();
    }

    /**
     * Set the licenseType property: The license type. Possible values are 'LicenseIncluded' (price for SQL license is
     * included) and 'BasePrice' (without SQL license price).
     *
     * @param licenseType the licenseType value to set.
     * @return the InstancePoolInner object itself.
     */
    public InstancePoolInner withLicenseType(InstancePoolLicenseType licenseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InstancePoolProperties();
        }
        this.innerProperties().withLicenseType(licenseType);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
