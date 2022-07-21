// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for WorkflowTriggers ListCallbackUrl. */
public final class WorkflowTriggersListCallbackUrlSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/WorkflowTriggers_ListCallbackUrl.json
     */
    /**
     * Sample code: Get the callback URL for a trigger.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getTheCallbackURLForATrigger(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .workflowTriggers()
            .listCallbackUrlWithResponse("test-resource-group", "test-name", "test-workflow", "manual", Context.NONE);
    }
}
