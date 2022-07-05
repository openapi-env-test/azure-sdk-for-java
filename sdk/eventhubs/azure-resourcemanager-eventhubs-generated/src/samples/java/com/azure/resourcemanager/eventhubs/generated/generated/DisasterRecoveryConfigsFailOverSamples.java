// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.generated;

import com.azure.core.util.Context;

/** Samples for DisasterRecoveryConfigs FailOver. */
public final class DisasterRecoveryConfigsFailOverSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/stable/2021-11-01/examples/disasterRecoveryConfigs/EHAliasFailOver.json
     */
    /**
     * Sample code: EHAliasFailOver.
     *
     * @param manager Entry point to EventHubsManager.
     */
    public static void eHAliasFailOver(com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager
            .disasterRecoveryConfigs()
            .failOverWithResponse(
                "exampleResourceGroup", "sdk-Namespace-8859", "sdk-DisasterRecovery-3814", Context.NONE);
    }
}
