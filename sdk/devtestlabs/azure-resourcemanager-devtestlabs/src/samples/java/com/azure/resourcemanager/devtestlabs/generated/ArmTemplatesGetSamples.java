// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.Context;

/** Samples for ArmTemplates Get. */
public final class ArmTemplatesGetSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2021-09-01/examples/ArmTemplates_Get.json
     */
    /**
     * Sample code: ArmTemplates_Get.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void armTemplatesGet(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .armTemplates()
            .getWithResponse(
                "resourceGroupName", "{labName}", "{artifactSourceName}", "{armTemplateName}", null, Context.NONE);
    }
}
