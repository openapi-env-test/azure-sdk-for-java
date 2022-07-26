// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A load balancer configuration for an availability group listener. */
@Fluent
public final class LoadBalancerConfiguration {
    /*
     * Private IP address.
     */
    @JsonProperty(value = "privateIpAddress")
    private PrivateIpAddress privateIpAddress;

    /*
     * Resource id of the public IP.
     */
    @JsonProperty(value = "publicIpAddressResourceId")
    private String publicIpAddressResourceId;

    /*
     * Resource id of the load balancer.
     */
    @JsonProperty(value = "loadBalancerResourceId")
    private String loadBalancerResourceId;

    /*
     * Probe port.
     */
    @JsonProperty(value = "probePort")
    private Integer probePort;

    /*
     * List of the SQL virtual machine instance resource id's that are enrolled
     * into the availability group listener.
     */
    @JsonProperty(value = "sqlVirtualMachineInstances")
    private List<String> sqlVirtualMachineInstances;

    /**
     * Get the privateIpAddress property: Private IP address.
     *
     * @return the privateIpAddress value.
     */
    public PrivateIpAddress privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: Private IP address.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withPrivateIpAddress(PrivateIpAddress privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the publicIpAddressResourceId property: Resource id of the public IP.
     *
     * @return the publicIpAddressResourceId value.
     */
    public String publicIpAddressResourceId() {
        return this.publicIpAddressResourceId;
    }

    /**
     * Set the publicIpAddressResourceId property: Resource id of the public IP.
     *
     * @param publicIpAddressResourceId the publicIpAddressResourceId value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withPublicIpAddressResourceId(String publicIpAddressResourceId) {
        this.publicIpAddressResourceId = publicIpAddressResourceId;
        return this;
    }

    /**
     * Get the loadBalancerResourceId property: Resource id of the load balancer.
     *
     * @return the loadBalancerResourceId value.
     */
    public String loadBalancerResourceId() {
        return this.loadBalancerResourceId;
    }

    /**
     * Set the loadBalancerResourceId property: Resource id of the load balancer.
     *
     * @param loadBalancerResourceId the loadBalancerResourceId value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withLoadBalancerResourceId(String loadBalancerResourceId) {
        this.loadBalancerResourceId = loadBalancerResourceId;
        return this;
    }

    /**
     * Get the probePort property: Probe port.
     *
     * @return the probePort value.
     */
    public Integer probePort() {
        return this.probePort;
    }

    /**
     * Set the probePort property: Probe port.
     *
     * @param probePort the probePort value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withProbePort(Integer probePort) {
        this.probePort = probePort;
        return this;
    }

    /**
     * Get the sqlVirtualMachineInstances property: List of the SQL virtual machine instance resource id's that are
     * enrolled into the availability group listener.
     *
     * @return the sqlVirtualMachineInstances value.
     */
    public List<String> sqlVirtualMachineInstances() {
        return this.sqlVirtualMachineInstances;
    }

    /**
     * Set the sqlVirtualMachineInstances property: List of the SQL virtual machine instance resource id's that are
     * enrolled into the availability group listener.
     *
     * @param sqlVirtualMachineInstances the sqlVirtualMachineInstances value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withSqlVirtualMachineInstances(List<String> sqlVirtualMachineInstances) {
        this.sqlVirtualMachineInstances = sqlVirtualMachineInstances;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateIpAddress() != null) {
            privateIpAddress().validate();
        }
    }
}
