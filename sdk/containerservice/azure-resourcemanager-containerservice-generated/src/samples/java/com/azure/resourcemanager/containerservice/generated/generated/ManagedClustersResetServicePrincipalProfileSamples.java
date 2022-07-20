// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterServicePrincipalProfile;

/** Samples for ManagedClusters ResetServicePrincipalProfile. */
public final class ManagedClustersResetServicePrincipalProfileSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/ManagedClustersResetServicePrincipalProfile.json
     */
    /**
     * Sample code: Reset Service Principal Profile.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void resetServicePrincipalProfile(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .managedClusters()
            .resetServicePrincipalProfile(
                "rg1",
                "clustername1",
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("secret"),
                Context.NONE);
    }
}
