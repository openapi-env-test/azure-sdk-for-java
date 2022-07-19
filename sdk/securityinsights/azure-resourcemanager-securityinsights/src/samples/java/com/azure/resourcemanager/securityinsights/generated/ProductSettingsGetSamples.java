// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for ProductSettings Get. */
public final class ProductSettingsGetSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-07-01-preview/examples/settings/GetEyesOnSetting.json
     */
    /**
     * Sample code: Get EyesOn settings.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getEyesOnSettings(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.productSettings().getWithResponse("myRg", "myWorkspace", "EyesOn", Context.NONE);
    }
}
