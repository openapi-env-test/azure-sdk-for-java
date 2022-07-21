// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetParametersProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The required set of inputs to validate a VNET. */
@Fluent
public final class VnetParameters extends ProxyOnlyResource {
    /*
     * VnetParameters resource specific properties
     */
    @JsonProperty(value = "properties")
    private VnetParametersProperties innerProperties;

    /**
     * Get the innerProperties property: VnetParameters resource specific properties.
     *
     * @return the innerProperties value.
     */
    private VnetParametersProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public VnetParameters withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the vnetResourceGroup property: The Resource Group of the VNET to be validated.
     *
     * @return the vnetResourceGroup value.
     */
    public String vnetResourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().vnetResourceGroup();
    }

    /**
     * Set the vnetResourceGroup property: The Resource Group of the VNET to be validated.
     *
     * @param vnetResourceGroup the vnetResourceGroup value to set.
     * @return the VnetParameters object itself.
     */
    public VnetParameters withVnetResourceGroup(String vnetResourceGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetParametersProperties();
        }
        this.innerProperties().withVnetResourceGroup(vnetResourceGroup);
        return this;
    }

    /**
     * Get the vnetName property: The name of the VNET to be validated.
     *
     * @return the vnetName value.
     */
    public String vnetName() {
        return this.innerProperties() == null ? null : this.innerProperties().vnetName();
    }

    /**
     * Set the vnetName property: The name of the VNET to be validated.
     *
     * @param vnetName the vnetName value to set.
     * @return the VnetParameters object itself.
     */
    public VnetParameters withVnetName(String vnetName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetParametersProperties();
        }
        this.innerProperties().withVnetName(vnetName);
        return this;
    }

    /**
     * Get the vnetSubnetName property: The subnet name to be validated.
     *
     * @return the vnetSubnetName value.
     */
    public String vnetSubnetName() {
        return this.innerProperties() == null ? null : this.innerProperties().vnetSubnetName();
    }

    /**
     * Set the vnetSubnetName property: The subnet name to be validated.
     *
     * @param vnetSubnetName the vnetSubnetName value to set.
     * @return the VnetParameters object itself.
     */
    public VnetParameters withVnetSubnetName(String vnetSubnetName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetParametersProperties();
        }
        this.innerProperties().withVnetSubnetName(vnetSubnetName);
        return this;
    }

    /**
     * Get the subnetResourceId property: The ARM Resource ID of the subnet to validate.
     *
     * @return the subnetResourceId value.
     */
    public String subnetResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().subnetResourceId();
    }

    /**
     * Set the subnetResourceId property: The ARM Resource ID of the subnet to validate.
     *
     * @param subnetResourceId the subnetResourceId value to set.
     * @return the VnetParameters object itself.
     */
    public VnetParameters withSubnetResourceId(String subnetResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetParametersProperties();
        }
        this.innerProperties().withSubnetResourceId(subnetResourceId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
