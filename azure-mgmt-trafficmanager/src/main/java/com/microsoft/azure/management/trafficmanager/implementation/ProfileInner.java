/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.implementation;

import com.microsoft.azure.management.trafficmanager.DnsConfig;
import com.microsoft.azure.management.trafficmanager.MonitorConfig;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Class representing a Traffic Manager profile.
 */
@JsonFlatten
public class ProfileInner extends Resource {
    /**
     * Gets or sets the status of the Traffic Manager profile.  Possible values
     * are 'Enabled' and 'Disabled'.
     */
    @JsonProperty(value = "properties.profileStatus")
    private String profileStatus;

    /**
     * Gets or sets the traffic routing method of the Traffic Manager profile.
     * Possible values are 'Performance', 'Weighted', or 'Priority'.
     */
    @JsonProperty(value = "properties.trafficRoutingMethod")
    private String trafficRoutingMethod;

    /**
     * Gets or sets the DNS settings of the Traffic Manager profile.
     */
    @JsonProperty(value = "properties.dnsConfig")
    private DnsConfig dnsConfig;

    /**
     * Gets or sets the endpoint monitoring settings of the Traffic Manager
     * profile.
     */
    @JsonProperty(value = "properties.monitorConfig")
    private MonitorConfig monitorConfig;

    /**
     * Gets or sets the list of endpoints in the Traffic Manager profile.
     */
    @JsonProperty(value = "properties.endpoints")
    private List<EndpointInner> endpoints;

    /**
     * Get the profileStatus value.
     *
     * @return the profileStatus value
     */
    public String profileStatus() {
        return this.profileStatus;
    }

    /**
     * Set the profileStatus value.
     *
     * @param profileStatus the profileStatus value to set
     * @return the ProfileInner object itself.
     */
    public ProfileInner withProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
        return this;
    }

    /**
     * Get the trafficRoutingMethod value.
     *
     * @return the trafficRoutingMethod value
     */
    public String trafficRoutingMethod() {
        return this.trafficRoutingMethod;
    }

    /**
     * Set the trafficRoutingMethod value.
     *
     * @param trafficRoutingMethod the trafficRoutingMethod value to set
     * @return the ProfileInner object itself.
     */
    public ProfileInner withTrafficRoutingMethod(String trafficRoutingMethod) {
        this.trafficRoutingMethod = trafficRoutingMethod;
        return this;
    }

    /**
     * Get the dnsConfig value.
     *
     * @return the dnsConfig value
     */
    public DnsConfig dnsConfig() {
        return this.dnsConfig;
    }

    /**
     * Set the dnsConfig value.
     *
     * @param dnsConfig the dnsConfig value to set
     * @return the ProfileInner object itself.
     */
    public ProfileInner withDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }

    /**
     * Get the monitorConfig value.
     *
     * @return the monitorConfig value
     */
    public MonitorConfig monitorConfig() {
        return this.monitorConfig;
    }

    /**
     * Set the monitorConfig value.
     *
     * @param monitorConfig the monitorConfig value to set
     * @return the ProfileInner object itself.
     */
    public ProfileInner withMonitorConfig(MonitorConfig monitorConfig) {
        this.monitorConfig = monitorConfig;
        return this;
    }

    /**
     * Get the endpoints value.
     *
     * @return the endpoints value
     */
    public List<EndpointInner> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints value.
     *
     * @param endpoints the endpoints value to set
     * @return the ProfileInner object itself.
     */
    public ProfileInner withEndpoints(List<EndpointInner> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

}
