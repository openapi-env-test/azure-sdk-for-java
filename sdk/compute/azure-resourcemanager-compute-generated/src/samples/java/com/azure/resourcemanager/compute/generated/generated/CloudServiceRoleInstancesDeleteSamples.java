// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for CloudServiceRoleInstances Delete. */
public final class CloudServiceRoleInstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-04-04/CloudServiceRP/examples/CloudServiceRoleInstance_Delete.json
     */
    /**
     * Sample code: Delete Cloud Service Role Instance.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteCloudServiceRoleInstance(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.cloudServiceRoleInstances().delete("{roleInstance-name}", "ConstosoRG", "{cs-name}", Context.NONE);
    }
}
