// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration properties for apps environment to join a Virtual Network. */
@Fluent
public final class VnetConfiguration {
    /*
     * Boolean indicating the environment only has an internal load balancer.
     * These environments do not have a public static IP resource. They must
     * provide runtimeSubnetId and infrastructureSubnetId if enabling this
     * property
     */
    @JsonProperty(value = "internal")
    private Boolean internal;

    /*
     * Resource ID of a subnet for infrastructure components. This subnet must
     * be in the same VNET as the subnet defined in runtimeSubnetId. Must not
     * overlap with any other provided IP ranges.
     */
    @JsonProperty(value = "infrastructureSubnetId")
    private String infrastructureSubnetId;

    /*
     * Resource ID of a subnet that Container App containers are injected into.
     * This subnet must be in the same VNET as the subnet defined in
     * infrastructureSubnetId. Must not overlap with any other provided IP
     * ranges.
     */
    @JsonProperty(value = "runtimeSubnetId")
    private String runtimeSubnetId;

    /*
     * CIDR notation IP range assigned to the Docker bridge, network. Must not
     * overlap with any other provided IP ranges.
     */
    @JsonProperty(value = "dockerBridgeCidr")
    private String dockerBridgeCidr;

    /*
     * IP range in CIDR notation that can be reserved for environment
     * infrastructure IP addresses. Must not overlap with any other provided IP
     * ranges.
     */
    @JsonProperty(value = "platformReservedCidr")
    private String platformReservedCidr;

    /*
     * An IP address from the IP range defined by platformReservedCidr that
     * will be reserved for the internal DNS server.
     */
    @JsonProperty(value = "platformReservedDnsIP")
    private String platformReservedDnsIp;

    /**
     * Get the internal property: Boolean indicating the environment only has an internal load balancer. These
     * environments do not have a public static IP resource. They must provide runtimeSubnetId and
     * infrastructureSubnetId if enabling this property.
     *
     * @return the internal value.
     */
    public Boolean internal() {
        return this.internal;
    }

    /**
     * Set the internal property: Boolean indicating the environment only has an internal load balancer. These
     * environments do not have a public static IP resource. They must provide runtimeSubnetId and
     * infrastructureSubnetId if enabling this property.
     *
     * @param internal the internal value to set.
     * @return the VnetConfiguration object itself.
     */
    public VnetConfiguration withInternal(Boolean internal) {
        this.internal = internal;
        return this;
    }

    /**
     * Get the infrastructureSubnetId property: Resource ID of a subnet for infrastructure components. This subnet must
     * be in the same VNET as the subnet defined in runtimeSubnetId. Must not overlap with any other provided IP ranges.
     *
     * @return the infrastructureSubnetId value.
     */
    public String infrastructureSubnetId() {
        return this.infrastructureSubnetId;
    }

    /**
     * Set the infrastructureSubnetId property: Resource ID of a subnet for infrastructure components. This subnet must
     * be in the same VNET as the subnet defined in runtimeSubnetId. Must not overlap with any other provided IP ranges.
     *
     * @param infrastructureSubnetId the infrastructureSubnetId value to set.
     * @return the VnetConfiguration object itself.
     */
    public VnetConfiguration withInfrastructureSubnetId(String infrastructureSubnetId) {
        this.infrastructureSubnetId = infrastructureSubnetId;
        return this;
    }

    /**
     * Get the runtimeSubnetId property: Resource ID of a subnet that Container App containers are injected into. This
     * subnet must be in the same VNET as the subnet defined in infrastructureSubnetId. Must not overlap with any other
     * provided IP ranges.
     *
     * @return the runtimeSubnetId value.
     */
    public String runtimeSubnetId() {
        return this.runtimeSubnetId;
    }

    /**
     * Set the runtimeSubnetId property: Resource ID of a subnet that Container App containers are injected into. This
     * subnet must be in the same VNET as the subnet defined in infrastructureSubnetId. Must not overlap with any other
     * provided IP ranges.
     *
     * @param runtimeSubnetId the runtimeSubnetId value to set.
     * @return the VnetConfiguration object itself.
     */
    public VnetConfiguration withRuntimeSubnetId(String runtimeSubnetId) {
        this.runtimeSubnetId = runtimeSubnetId;
        return this;
    }

    /**
     * Get the dockerBridgeCidr property: CIDR notation IP range assigned to the Docker bridge, network. Must not
     * overlap with any other provided IP ranges.
     *
     * @return the dockerBridgeCidr value.
     */
    public String dockerBridgeCidr() {
        return this.dockerBridgeCidr;
    }

    /**
     * Set the dockerBridgeCidr property: CIDR notation IP range assigned to the Docker bridge, network. Must not
     * overlap with any other provided IP ranges.
     *
     * @param dockerBridgeCidr the dockerBridgeCidr value to set.
     * @return the VnetConfiguration object itself.
     */
    public VnetConfiguration withDockerBridgeCidr(String dockerBridgeCidr) {
        this.dockerBridgeCidr = dockerBridgeCidr;
        return this;
    }

    /**
     * Get the platformReservedCidr property: IP range in CIDR notation that can be reserved for environment
     * infrastructure IP addresses. Must not overlap with any other provided IP ranges.
     *
     * @return the platformReservedCidr value.
     */
    public String platformReservedCidr() {
        return this.platformReservedCidr;
    }

    /**
     * Set the platformReservedCidr property: IP range in CIDR notation that can be reserved for environment
     * infrastructure IP addresses. Must not overlap with any other provided IP ranges.
     *
     * @param platformReservedCidr the platformReservedCidr value to set.
     * @return the VnetConfiguration object itself.
     */
    public VnetConfiguration withPlatformReservedCidr(String platformReservedCidr) {
        this.platformReservedCidr = platformReservedCidr;
        return this;
    }

    /**
     * Get the platformReservedDnsIp property: An IP address from the IP range defined by platformReservedCidr that will
     * be reserved for the internal DNS server.
     *
     * @return the platformReservedDnsIp value.
     */
    public String platformReservedDnsIp() {
        return this.platformReservedDnsIp;
    }

    /**
     * Set the platformReservedDnsIp property: An IP address from the IP range defined by platformReservedCidr that will
     * be reserved for the internal DNS server.
     *
     * @param platformReservedDnsIp the platformReservedDnsIp value to set.
     * @return the VnetConfiguration object itself.
     */
    public VnetConfiguration withPlatformReservedDnsIp(String platformReservedDnsIp) {
        this.platformReservedDnsIp = platformReservedDnsIp;
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
