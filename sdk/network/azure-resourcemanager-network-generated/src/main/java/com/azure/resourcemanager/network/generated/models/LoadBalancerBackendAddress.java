// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.LoadBalancerBackendAddressPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Load balancer backend addresses. */
@Fluent
public final class LoadBalancerBackendAddress {
    /*
     * Properties of load balancer backend address pool.
     */
    @JsonProperty(value = "properties")
    private LoadBalancerBackendAddressPropertiesFormat innerProperties;

    /*
     * Name of the backend address.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the innerProperties property: Properties of load balancer backend address pool.
     *
     * @return the innerProperties value.
     */
    private LoadBalancerBackendAddressPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the backend address.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the backend address.
     *
     * @param name the name value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the virtualNetwork property: Reference to an existing virtual network.
     *
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetwork();
    }

    /**
     * Set the virtualNetwork property: Reference to an existing virtual network.
     *
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withVirtualNetwork(SubResource virtualNetwork) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerBackendAddressPropertiesFormat();
        }
        this.innerProperties().withVirtualNetwork(virtualNetwork);
        return this;
    }

    /**
     * Get the subnet property: Reference to an existing subnet.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: Reference to an existing subnet.
     *
     * @param subnet the subnet value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withSubnet(SubResource subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerBackendAddressPropertiesFormat();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the ipAddress property: IP Address belonging to the referenced virtual network.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().ipAddress();
    }

    /**
     * Set the ipAddress property: IP Address belonging to the referenced virtual network.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withIpAddress(String ipAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerBackendAddressPropertiesFormat();
        }
        this.innerProperties().withIpAddress(ipAddress);
        return this;
    }

    /**
     * Get the networkInterfaceIpConfiguration property: Reference to IP address defined in network interfaces.
     *
     * @return the networkInterfaceIpConfiguration value.
     */
    public SubResource networkInterfaceIpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().networkInterfaceIpConfiguration();
    }

    /**
     * Get the loadBalancerFrontendIpConfiguration property: Reference to the frontend ip address configuration defined
     * in regional loadbalancer.
     *
     * @return the loadBalancerFrontendIpConfiguration value.
     */
    public SubResource loadBalancerFrontendIpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerFrontendIpConfiguration();
    }

    /**
     * Set the loadBalancerFrontendIpConfiguration property: Reference to the frontend ip address configuration defined
     * in regional loadbalancer.
     *
     * @param loadBalancerFrontendIpConfiguration the loadBalancerFrontendIpConfiguration value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withLoadBalancerFrontendIpConfiguration(
        SubResource loadBalancerFrontendIpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerBackendAddressPropertiesFormat();
        }
        this.innerProperties().withLoadBalancerFrontendIpConfiguration(loadBalancerFrontendIpConfiguration);
        return this;
    }

    /**
     * Get the inboundNatRulesPortMapping property: Collection of inbound NAT rule port mappings.
     *
     * @return the inboundNatRulesPortMapping value.
     */
    public List<NatRulePortMapping> inboundNatRulesPortMapping() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundNatRulesPortMapping();
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
