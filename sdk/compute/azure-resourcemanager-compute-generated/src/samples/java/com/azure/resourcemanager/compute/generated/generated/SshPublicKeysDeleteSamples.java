// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for SshPublicKeys Delete. */
public final class SshPublicKeysDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/SshPublicKeys_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: SshPublicKeys_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void sshPublicKeysDeleteMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sshPublicKeys().deleteWithResponse("rgcompute", "aaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/SshPublicKeys_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: SshPublicKeys_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void sshPublicKeysDeleteMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sshPublicKeys().deleteWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaa", Context.NONE);
    }
}
