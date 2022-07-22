// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.Context;

/** Samples for Secrets Get. */
public final class SecretsGetSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2021-09-01/examples/Secrets_Get.json
     */
    /**
     * Sample code: Secrets_Get.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void secretsGet(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .secrets()
            .getWithResponse("resourceGroupName", "{labName}", "{userName}", "{secretName}", null, Context.NONE);
    }
}
