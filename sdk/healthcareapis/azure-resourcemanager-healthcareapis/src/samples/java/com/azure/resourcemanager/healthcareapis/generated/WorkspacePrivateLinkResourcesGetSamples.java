// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.Context;

/** Samples for WorkspacePrivateLinkResources Get. */
public final class WorkspacePrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file: specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2022-06-01/examples/privatelink/WorkspacePrivateLinkResourceGet.json
     */
    /**
     * Sample code: WorkspacePrivateLinkResources_Get.
     *
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void workspacePrivateLinkResourcesGet(
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager
            .workspacePrivateLinkResources()
            .getWithResponse("testRG", "workspace1", "healthcareworkspace", Context.NONE);
    }
}
