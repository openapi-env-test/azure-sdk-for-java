// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.Container;
import com.azure.resourcemanager.network.generated.models.ContainerNetworkInterfaceConfiguration;
import com.azure.resourcemanager.network.generated.models.ContainerNetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of container network interface. */
@Fluent
public final class ContainerNetworkInterfacePropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerNetworkInterfacePropertiesFormat.class);

    /*
     * Container network interface configuration from which this container
     * network interface is created.
     */
    @JsonProperty(value = "containerNetworkInterfaceConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration;

    /*
     * Reference to the container to which this container network interface is
     * attached.
     */
    @JsonProperty(value = "container")
    private Container container;

    /*
     * Reference to the ip configuration on this container nic.
     */
    @JsonProperty(value = "ipConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations;

    /*
     * The provisioning state of the container network interface resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the containerNetworkInterfaceConfiguration property: Container network interface configuration from which
     * this container network interface is created.
     *
     * @return the containerNetworkInterfaceConfiguration value.
     */
    public ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration() {
        return this.containerNetworkInterfaceConfiguration;
    }

    /**
     * Get the container property: Reference to the container to which this container network interface is attached.
     *
     * @return the container value.
     */
    public Container container() {
        return this.container;
    }

    /**
     * Set the container property: Reference to the container to which this container network interface is attached.
     *
     * @param container the container value to set.
     * @return the ContainerNetworkInterfacePropertiesFormat object itself.
     */
    public ContainerNetworkInterfacePropertiesFormat withContainer(Container container) {
        this.container = container;
        return this;
    }

    /**
     * Get the ipConfigurations property: Reference to the ip configuration on this container nic.
     *
     * @return the ipConfigurations value.
     */
    public List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get the provisioningState property: The provisioning state of the container network interface resource.
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
        if (containerNetworkInterfaceConfiguration() != null) {
            containerNetworkInterfaceConfiguration().validate();
        }
        if (container() != null) {
            container().validate();
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }
}
