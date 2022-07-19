// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewDefaultSettings Get. */
public final class ScopeAccessReviewDefaultSettingsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewDefaultSettings.json
     */
    /**
     * Sample code: GetAccessReviewDefaultSettings.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewDefaultSettings(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewDefaultSettings()
            .getWithResponse("subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d", Context.NONE);
    }
}
