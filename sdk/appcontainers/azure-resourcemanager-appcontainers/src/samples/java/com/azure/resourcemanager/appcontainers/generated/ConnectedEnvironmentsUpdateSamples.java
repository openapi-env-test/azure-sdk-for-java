// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;

/** Samples for ConnectedEnvironments Update. */
public final class ConnectedEnvironmentsUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironments_Patch.json
     */
    /**
     * Sample code: Patch Managed Environment.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void patchManagedEnvironment(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironments().updateWithResponse("examplerg", "testenv", Context.NONE);
    }
}
