// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayBackendHealthServerInner;

/** An immutable client-side representation of ApplicationGatewayBackendHealthServer. */
public interface ApplicationGatewayBackendHealthServer {
    /**
     * Gets the address property: IP address or FQDN of backend server.
     *
     * @return the address value.
     */
    String address();

    /**
     * Gets the ipConfiguration property: Reference of IP configuration of backend server.
     *
     * @return the ipConfiguration value.
     */
    NetworkInterfaceIpConfiguration ipConfiguration();

    /**
     * Gets the health property: Health of backend server.
     *
     * @return the health value.
     */
    ApplicationGatewayBackendHealthServerHealth health();

    /**
     * Gets the healthProbeLog property: Health Probe Log.
     *
     * @return the healthProbeLog value.
     */
    String healthProbeLog();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayBackendHealthServerInner object.
     *
     * @return the inner object.
     */
    ApplicationGatewayBackendHealthServerInner innerModel();
}
