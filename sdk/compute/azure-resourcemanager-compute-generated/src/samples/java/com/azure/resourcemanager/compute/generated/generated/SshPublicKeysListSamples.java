// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for SshPublicKeys List. */
public final class SshPublicKeysListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/SshPublicKeys_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: SshPublicKeys_ListBySubscription_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void sshPublicKeysListBySubscriptionMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sshPublicKeys().list(Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/SshPublicKeys_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: SshPublicKeys_ListBySubscription_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void sshPublicKeysListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sshPublicKeys().list(Context.NONE);
    }
}
