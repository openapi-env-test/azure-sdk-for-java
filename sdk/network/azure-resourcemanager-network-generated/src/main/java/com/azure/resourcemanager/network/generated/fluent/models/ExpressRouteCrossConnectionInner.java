// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitReference;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.ServiceProviderProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** ExpressRouteCrossConnection resource. */
@Fluent
public final class ExpressRouteCrossConnectionInner extends Resource {
    /*
     * Properties of the express route cross connection.
     */
    @JsonProperty(value = "properties")
    private ExpressRouteCrossConnectionProperties innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the express route cross connection.
     *
     * @return the innerProperties value.
     */
    private ExpressRouteCrossConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRouteCrossConnectionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRouteCrossConnectionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the primaryAzurePort property: The name of the primary port.
     *
     * @return the primaryAzurePort value.
     */
    public String primaryAzurePort() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryAzurePort();
    }

    /**
     * Get the secondaryAzurePort property: The name of the secondary port.
     *
     * @return the secondaryAzurePort value.
     */
    public String secondaryAzurePort() {
        return this.innerProperties() == null ? null : this.innerProperties().secondaryAzurePort();
    }

    /**
     * Get the stag property: The identifier of the circuit traffic.
     *
     * @return the stag value.
     */
    public Integer stag() {
        return this.innerProperties() == null ? null : this.innerProperties().stag();
    }

    /**
     * Get the peeringLocation property: The peering location of the ExpressRoute circuit.
     *
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().peeringLocation();
    }

    /**
     * Get the bandwidthInMbps property: The circuit bandwidth In Mbps.
     *
     * @return the bandwidthInMbps value.
     */
    public Integer bandwidthInMbps() {
        return this.innerProperties() == null ? null : this.innerProperties().bandwidthInMbps();
    }

    /**
     * Get the expressRouteCircuit property: The ExpressRouteCircuit.
     *
     * @return the expressRouteCircuit value.
     */
    public ExpressRouteCircuitReference expressRouteCircuit() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRouteCircuit();
    }

    /**
     * Set the expressRouteCircuit property: The ExpressRouteCircuit.
     *
     * @param expressRouteCircuit the expressRouteCircuit value to set.
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withExpressRouteCircuit(ExpressRouteCircuitReference expressRouteCircuit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionProperties();
        }
        this.innerProperties().withExpressRouteCircuit(expressRouteCircuit);
        return this;
    }

    /**
     * Get the serviceProviderProvisioningState property: The provisioning state of the circuit in the connectivity
     * provider system.
     *
     * @return the serviceProviderProvisioningState value.
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceProviderProvisioningState();
    }

    /**
     * Set the serviceProviderProvisioningState property: The provisioning state of the circuit in the connectivity
     * provider system.
     *
     * @param serviceProviderProvisioningState the serviceProviderProvisioningState value to set.
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withServiceProviderProvisioningState(
        ServiceProviderProvisioningState serviceProviderProvisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionProperties();
        }
        this.innerProperties().withServiceProviderProvisioningState(serviceProviderProvisioningState);
        return this;
    }

    /**
     * Get the serviceProviderNotes property: Additional read only notes set by the connectivity provider.
     *
     * @return the serviceProviderNotes value.
     */
    public String serviceProviderNotes() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceProviderNotes();
    }

    /**
     * Set the serviceProviderNotes property: Additional read only notes set by the connectivity provider.
     *
     * @param serviceProviderNotes the serviceProviderNotes value to set.
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withServiceProviderNotes(String serviceProviderNotes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionProperties();
        }
        this.innerProperties().withServiceProviderNotes(serviceProviderNotes);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route cross connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the peerings property: The list of peerings.
     *
     * @return the peerings value.
     */
    public List<ExpressRouteCrossConnectionPeeringInner> peerings() {
        return this.innerProperties() == null ? null : this.innerProperties().peerings();
    }

    /**
     * Set the peerings property: The list of peerings.
     *
     * @param peerings the peerings value to set.
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withPeerings(List<ExpressRouteCrossConnectionPeeringInner> peerings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCrossConnectionProperties();
        }
        this.innerProperties().withPeerings(peerings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
