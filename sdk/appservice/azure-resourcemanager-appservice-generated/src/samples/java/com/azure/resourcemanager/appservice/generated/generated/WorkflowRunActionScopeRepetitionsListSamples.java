// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for WorkflowRunActionScopeRepetitions List. */
public final class WorkflowRunActionScopeRepetitionsListSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/WorkflowRunActionScopeRepetitions_List.json
     */
    /**
     * Sample code: List the scoped repetitions.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void listTheScopedRepetitions(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .workflowRunActionScopeRepetitions()
            .list(
                "testResourceGroup",
                "test-name",
                "testFlow",
                "08586776228332053161046300351",
                "for_each",
                Context.NONE);
    }
}
