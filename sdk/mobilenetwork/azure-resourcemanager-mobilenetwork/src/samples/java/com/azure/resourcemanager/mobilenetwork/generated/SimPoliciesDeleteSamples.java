// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.Context;

/** Samples for SimPolicies Delete. */
public final class SimPoliciesDeleteSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2022-11-01/examples/SimPolicyDelete.json
     */
    /**
     * Sample code: Delete SIM policy.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void deleteSIMPolicy(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.simPolicies().delete("rg1", "testMobileNetwork", "testPolicy", Context.NONE);
    }
}
