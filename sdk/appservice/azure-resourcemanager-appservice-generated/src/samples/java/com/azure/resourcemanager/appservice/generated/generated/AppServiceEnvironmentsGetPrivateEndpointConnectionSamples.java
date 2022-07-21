// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for AppServiceEnvironments GetPrivateEndpointConnection. */
public final class AppServiceEnvironmentsGetPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/AppServiceEnvironments_GetPrivateEndpointConnection.json
     */
    /**
     * Sample code: Gets a private endpoint connection.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getsAPrivateEndpointConnection(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .appServiceEnvironments()
            .getPrivateEndpointConnectionWithResponse(
                "test-rg", "test-ase", "fa38656c-034e-43d8-adce-fe06ce039c98", Context.NONE);
    }
}
