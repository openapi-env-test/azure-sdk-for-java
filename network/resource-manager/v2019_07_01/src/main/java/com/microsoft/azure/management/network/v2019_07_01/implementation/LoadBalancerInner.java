/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.management.network.v2019_07_01.LoadBalancerSku;
import java.util.List;
import com.microsoft.azure.management.network.v2019_07_01.InboundNatPool;
import com.microsoft.azure.management.network.v2019_07_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * LoadBalancer resource.
 */
@JsonFlatten
@SkipParentValidation
public class LoadBalancerInner extends Resource {
    /**
     * The load balancer SKU.
     */
    @JsonProperty(value = "sku")
    private LoadBalancerSku sku;

    /**
     * Object representing the frontend IPs to be used for the load balancer.
     */
    @JsonProperty(value = "properties.frontendIPConfigurations")
    private List<FrontendIPConfigurationInner> frontendIPConfigurations;

    /**
     * Collection of backend address pools used by a load balancer.
     */
    @JsonProperty(value = "properties.backendAddressPools")
    private List<BackendAddressPoolInner> backendAddressPools;

    /**
     * Object collection representing the load balancing rules Gets the
     * provisioning.
     */
    @JsonProperty(value = "properties.loadBalancingRules")
    private List<LoadBalancingRuleInner> loadBalancingRules;

    /**
     * Collection of probe objects used in the load balancer.
     */
    @JsonProperty(value = "properties.probes")
    private List<ProbeInner> probes;

    /**
     * Collection of inbound NAT Rules used by a load balancer. Defining
     * inbound NAT rules on your load balancer is mutually exclusive with
     * defining an inbound NAT pool. Inbound NAT pools are referenced from
     * virtual machine scale sets. NICs that are associated with individual
     * virtual machines cannot reference an Inbound NAT pool. They have to
     * reference individual inbound NAT rules.
     */
    @JsonProperty(value = "properties.inboundNatRules")
    private List<InboundNatRuleInner> inboundNatRules;

    /**
     * Defines an external port range for inbound NAT to a single backend port
     * on NICs associated with a load balancer. Inbound NAT rules are created
     * automatically for each NIC associated with the Load Balancer using an
     * external port from this range. Defining an Inbound NAT pool on your Load
     * Balancer is mutually exclusive with defining inbound Nat rules. Inbound
     * NAT pools are referenced from virtual machine scale sets. NICs that are
     * associated with individual virtual machines cannot reference an inbound
     * NAT pool. They have to reference individual inbound NAT rules.
     */
    @JsonProperty(value = "properties.inboundNatPools")
    private List<InboundNatPool> inboundNatPools;

    /**
     * The outbound rules.
     */
    @JsonProperty(value = "properties.outboundRules")
    private List<OutboundRuleInner> outboundRules;

    /**
     * The resource GUID property of the load balancer resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * The provisioning state of the load balancer resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the load balancer SKU.
     *
     * @return the sku value
     */
    public LoadBalancerSku sku() {
        return this.sku;
    }

    /**
     * Set the load balancer SKU.
     *
     * @param sku the sku value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withSku(LoadBalancerSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get object representing the frontend IPs to be used for the load balancer.
     *
     * @return the frontendIPConfigurations value
     */
    public List<FrontendIPConfigurationInner> frontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    /**
     * Set object representing the frontend IPs to be used for the load balancer.
     *
     * @param frontendIPConfigurations the frontendIPConfigurations value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withFrontendIPConfigurations(List<FrontendIPConfigurationInner> frontendIPConfigurations) {
        this.frontendIPConfigurations = frontendIPConfigurations;
        return this;
    }

    /**
     * Get collection of backend address pools used by a load balancer.
     *
     * @return the backendAddressPools value
     */
    public List<BackendAddressPoolInner> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set collection of backend address pools used by a load balancer.
     *
     * @param backendAddressPools the backendAddressPools value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withBackendAddressPools(List<BackendAddressPoolInner> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Get object collection representing the load balancing rules Gets the provisioning.
     *
     * @return the loadBalancingRules value
     */
    public List<LoadBalancingRuleInner> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Set object collection representing the load balancing rules Gets the provisioning.
     *
     * @param loadBalancingRules the loadBalancingRules value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withLoadBalancingRules(List<LoadBalancingRuleInner> loadBalancingRules) {
        this.loadBalancingRules = loadBalancingRules;
        return this;
    }

    /**
     * Get collection of probe objects used in the load balancer.
     *
     * @return the probes value
     */
    public List<ProbeInner> probes() {
        return this.probes;
    }

    /**
     * Set collection of probe objects used in the load balancer.
     *
     * @param probes the probes value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withProbes(List<ProbeInner> probes) {
        this.probes = probes;
        return this;
    }

    /**
     * Get collection of inbound NAT Rules used by a load balancer. Defining inbound NAT rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     *
     * @return the inboundNatRules value
     */
    public List<InboundNatRuleInner> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Set collection of inbound NAT Rules used by a load balancer. Defining inbound NAT rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     *
     * @param inboundNatRules the inboundNatRules value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withInboundNatRules(List<InboundNatRuleInner> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
        return this;
    }

    /**
     * Get defines an external port range for inbound NAT to a single backend port on NICs associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have to reference individual inbound NAT rules.
     *
     * @return the inboundNatPools value
     */
    public List<InboundNatPool> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Set defines an external port range for inbound NAT to a single backend port on NICs associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have to reference individual inbound NAT rules.
     *
     * @param inboundNatPools the inboundNatPools value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withInboundNatPools(List<InboundNatPool> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
        return this;
    }

    /**
     * Get the outbound rules.
     *
     * @return the outboundRules value
     */
    public List<OutboundRuleInner> outboundRules() {
        return this.outboundRules;
    }

    /**
     * Set the outbound rules.
     *
     * @param outboundRules the outboundRules value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withOutboundRules(List<OutboundRuleInner> outboundRules) {
        this.outboundRules = outboundRules;
        return this;
    }

    /**
     * Get the resource GUID property of the load balancer resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resource GUID property of the load balancer resource.
     *
     * @param resourceGuid the resourceGuid value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioning state of the load balancer resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the load balancer resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withId(String id) {
        this.id = id;
        return this;
    }

}
