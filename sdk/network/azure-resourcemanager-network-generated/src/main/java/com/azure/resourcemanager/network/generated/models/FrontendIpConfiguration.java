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

/** Frontend IP address of the load balancer. */
@JsonFlatten
@Fluent
public class FrontendIpConfiguration extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FrontendIpConfiguration.class);

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
     * Gets or sets the IP address of the Load Balancer.This is only specified
     * if a specific private IP address shall be allocated from the subnet
     * specified in subnetRef
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIpAddress;

    /*
     * Gets or sets PrivateIP allocation method (Static/Dynamic)
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IpAllocationMethod privateIpAllocationMethod;

    /*
     * Gets or sets the reference of the subnet resource.A subnet from where
     * the load balancer gets its private frontend address
     */
    @JsonProperty(value = "properties.subnet")
    private SubResource subnet;

    /*
     * Gets or sets the reference of the PublicIP resource
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private SubResource publicIpAddress;

    /*
     * Read only.Inbound rules URIs that use this frontend IP
     */
    @JsonProperty(value = "properties.inboundNatRules")
    private List<SubResource> inboundNatRules;

    /*
     * Read only.Inbound pools URIs that use this frontend IP
     */
    @JsonProperty(value = "properties.inboundNatPools")
    private List<SubResource> inboundNatPools;

    /*
     * Read only.Outbound rules URIs that use this frontend IP
     */
    @JsonProperty(value = "properties.outboundNatRules")
    private List<SubResource> outboundNatRules;

    /*
     * Gets Load Balancing rules URIs that use this frontend IP
     */
    @JsonProperty(value = "properties.loadBalancingRules")
    private List<SubResource> loadBalancingRules;

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
     * @return the FrontendIpConfiguration object itself.
     */
    public FrontendIpConfiguration withName(String name) {
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
     * @return the FrontendIpConfiguration object itself.
     */
    public FrontendIpConfiguration withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the privateIpAddress property: Gets or sets the IP address of the Load Balancer.This is only specified if a
     * specific private IP address shall be allocated from the subnet specified in subnetRef.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: Gets or sets the IP address of the Load Balancer.This is only specified if a
     * specific private IP address shall be allocated from the subnet specified in subnetRef.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the FrontendIpConfiguration object itself.
     */
    public FrontendIpConfiguration withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: Gets or sets PrivateIP allocation method (Static/Dynamic).
     *
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: Gets or sets PrivateIP allocation method (Static/Dynamic).
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the FrontendIpConfiguration object itself.
     */
    public FrontendIpConfiguration withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: Gets or sets the reference of the subnet resource.A subnet from where the load balancer
     * gets its private frontend address.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Gets or sets the reference of the subnet resource.A subnet from where the load balancer
     * gets its private frontend address.
     *
     * @param subnet the subnet value to set.
     * @return the FrontendIpConfiguration object itself.
     */
    public FrontendIpConfiguration withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIpAddress property: Gets or sets the reference of the PublicIP resource.
     *
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: Gets or sets the reference of the PublicIP resource.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the FrontendIpConfiguration object itself.
     */
    public FrontendIpConfiguration withPublicIpAddress(SubResource publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the inboundNatRules property: Read only.Inbound rules URIs that use this frontend IP.
     *
     * @return the inboundNatRules value.
     */
    public List<SubResource> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Set the inboundNatRules property: Read only.Inbound rules URIs that use this frontend IP.
     *
     * @param inboundNatRules the inboundNatRules value to set.
     * @return the FrontendIpConfiguration object itself.
     */
    public FrontendIpConfiguration withInboundNatRules(List<SubResource> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
        return this;
    }

    /**
     * Get the inboundNatPools property: Read only.Inbound pools URIs that use this frontend IP.
     *
     * @return the inboundNatPools value.
     */
    public List<SubResource> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Set the inboundNatPools property: Read only.Inbound pools URIs that use this frontend IP.
     *
     * @param inboundNatPools the inboundNatPools value to set.
     * @return the FrontendIpConfiguration object itself.
     */
    public FrontendIpConfiguration withInboundNatPools(List<SubResource> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
        return this;
    }

    /**
     * Get the outboundNatRules property: Read only.Outbound rules URIs that use this frontend IP.
     *
     * @return the outboundNatRules value.
     */
    public List<SubResource> outboundNatRules() {
        return this.outboundNatRules;
    }

    /**
     * Set the outboundNatRules property: Read only.Outbound rules URIs that use this frontend IP.
     *
     * @param outboundNatRules the outboundNatRules value to set.
     * @return the FrontendIpConfiguration object itself.
     */
    public FrontendIpConfiguration withOutboundNatRules(List<SubResource> outboundNatRules) {
        this.outboundNatRules = outboundNatRules;
        return this;
    }

    /**
     * Get the loadBalancingRules property: Gets Load Balancing rules URIs that use this frontend IP.
     *
     * @return the loadBalancingRules value.
     */
    public List<SubResource> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Set the loadBalancingRules property: Gets Load Balancing rules URIs that use this frontend IP.
     *
     * @param loadBalancingRules the loadBalancingRules value to set.
     * @return the FrontendIpConfiguration object itself.
     */
    public FrontendIpConfiguration withLoadBalancingRules(List<SubResource> loadBalancingRules) {
        this.loadBalancingRules = loadBalancingRules;
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
     * @return the FrontendIpConfiguration object itself.
     */
    public FrontendIpConfiguration withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FrontendIpConfiguration withId(String id) {
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
