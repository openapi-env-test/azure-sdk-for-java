// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Outbound NAT pool of the loadbalancer. */
@JsonFlatten
@Fluent
public class OutboundNatRule extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OutboundNatRule.class);

    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Gets or sets the number of outbound ports to be used for SNAT
     */
    @JsonProperty(value = "properties.allocatedOutboundPorts")
    private Integer allocatedOutboundPorts;

    /*
     * Gets or sets Frontend IP addresses of the load balancer
     */
    @JsonProperty(value = "properties.frontendIPConfigurations")
    private List<SubResource> frontendIpConfigurations;

    /*
     * Gets or sets a reference to a pool of DIPs. Outbound traffic is randomly
     * load balanced across IPs in the backend IPs
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /*
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the OutboundNatRule object itself.
     */
    public OutboundNatRule withName(String name) {
        this.name = name;
        return this;
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
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the OutboundNatRule object itself.
     */
    public OutboundNatRule withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the allocatedOutboundPorts property: Gets or sets the number of outbound ports to be used for SNAT.
     *
     * @return the allocatedOutboundPorts value.
     */
    public Integer allocatedOutboundPorts() {
        return this.allocatedOutboundPorts;
    }

    /**
     * Set the allocatedOutboundPorts property: Gets or sets the number of outbound ports to be used for SNAT.
     *
     * @param allocatedOutboundPorts the allocatedOutboundPorts value to set.
     * @return the OutboundNatRule object itself.
     */
    public OutboundNatRule withAllocatedOutboundPorts(Integer allocatedOutboundPorts) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
        return this;
    }

    /**
     * Get the frontendIpConfigurations property: Gets or sets Frontend IP addresses of the load balancer.
     *
     * @return the frontendIpConfigurations value.
     */
    public List<SubResource> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: Gets or sets Frontend IP addresses of the load balancer.
     *
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the OutboundNatRule object itself.
     */
    public OutboundNatRule withFrontendIpConfigurations(List<SubResource> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Get the backendAddressPool property: Gets or sets a reference to a pool of DIPs. Outbound traffic is randomly
     * load balanced across IPs in the backend IPs.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Gets or sets a reference to a pool of DIPs. Outbound traffic is randomly
     * load balanced across IPs in the backend IPs.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the OutboundNatRule object itself.
     */
    public OutboundNatRule withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the provisioningState property: Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the OutboundNatRule object itself.
     */
    public OutboundNatRule withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OutboundNatRule withId(String id) {
        super.withId(id);
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
