// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/preview/2022-10-01-preview/examples/legacy/ServiceDeletePrivateEndpointConnection.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Delete.
     *
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void privateEndpointConnectionsDelete(
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.privateEndpointConnections().delete("rgname", "service1", "myConnection", Context.NONE);
    }
}
