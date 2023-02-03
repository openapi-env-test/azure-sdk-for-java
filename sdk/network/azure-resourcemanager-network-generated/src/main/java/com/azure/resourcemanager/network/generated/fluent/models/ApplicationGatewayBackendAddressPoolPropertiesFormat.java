// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendAddress;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of Backend Address Pool of an application gateway. */
@Fluent
public final class ApplicationGatewayBackendAddressPoolPropertiesFormat {
    /*
     * Collection of references to IPs defined in network interfaces.
     */
    @JsonProperty(value = "backendIPConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceIpConfigurationInner> backendIpConfigurations;

    /*
     * Backend addresses.
     */
    @JsonProperty(value = "backendAddresses")
    private List<ApplicationGatewayBackendAddress> backendAddresses;

    /*
     * The provisioning state of the backend address pool resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of ApplicationGatewayBackendAddressPoolPropertiesFormat class. */
    public ApplicationGatewayBackendAddressPoolPropertiesFormat() {
    }

    /**
     * Get the backendIpConfigurations property: Collection of references to IPs defined in network interfaces.
     *
     * @return the backendIpConfigurations value.
     */
    public List<NetworkInterfaceIpConfigurationInner> backendIpConfigurations() {
        return this.backendIpConfigurations;
    }

    /**
     * Get the backendAddresses property: Backend addresses.
     *
     * @return the backendAddresses value.
     */
    public List<ApplicationGatewayBackendAddress> backendAddresses() {
        return this.backendAddresses;
    }

    /**
     * Set the backendAddresses property: Backend addresses.
     *
     * @param backendAddresses the backendAddresses value to set.
     * @return the ApplicationGatewayBackendAddressPoolPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendAddressPoolPropertiesFormat withBackendAddresses(
        List<ApplicationGatewayBackendAddress> backendAddresses) {
        this.backendAddresses = backendAddresses;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the backend address pool resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backendIpConfigurations() != null) {
            backendIpConfigurations().forEach(e -> e.validate());
        }
        if (backendAddresses() != null) {
            backendAddresses().forEach(e -> e.validate());
        }
    }
}
