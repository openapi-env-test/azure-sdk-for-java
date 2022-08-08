// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.models.ScopedResource;

/** Samples for PrivateLinkScopedResources CreateOrUpdate. */
public final class PrivateLinkScopedResourcesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2021-07-01-preview/examples/PrivateLinkScopedResourceUpdate.json
     */
    /**
     * Sample code: Update a scoped resource in a private link scope.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void updateAScopedResourceInAPrivateLinkScope(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        ScopedResource resource =
            manager
                .privateLinkScopedResources()
                .getWithResponse("MyResourceGroup", "MyPrivateLinkScope", "scoped-resource-name", Context.NONE)
                .getValue();
        resource
            .update()
            .withLinkedResourceId(
                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/MyResourceGroup/providers/Microsoft.Insights/components/my-component")
            .apply();
    }
}
