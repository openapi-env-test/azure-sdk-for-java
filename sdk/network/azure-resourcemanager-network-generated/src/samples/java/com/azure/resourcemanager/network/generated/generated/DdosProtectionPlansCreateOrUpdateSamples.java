// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for DdosProtectionPlans CreateOrUpdate. */
public final class DdosProtectionPlansCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/DdosProtectionPlanCreate.json
     */
    /**
     * Sample code: Create DDoS protection plan.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createDDoSProtectionPlan(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .ddosProtectionPlans()
            .define("test-plan")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .create();
    }
}
