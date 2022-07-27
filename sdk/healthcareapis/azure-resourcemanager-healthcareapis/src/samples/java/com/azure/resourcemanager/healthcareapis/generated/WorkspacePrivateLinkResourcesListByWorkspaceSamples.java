// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.Context;

/** Samples for WorkspacePrivateLinkResources ListByWorkspace. */
public final class WorkspacePrivateLinkResourcesListByWorkspaceSamples {
    /*
     * x-ms-original-file: specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/preview/2022-10-01-preview/examples/privatelink/PrivateLinkResourcesListByWorkspace.json
     */
    /**
     * Sample code: WorkspacePrivateLinkResources_ListGroupIds.
     *
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void workspacePrivateLinkResourcesListGroupIds(
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.workspacePrivateLinkResources().listByWorkspace("testRG", "workspace1", Context.NONE);
    }
}
