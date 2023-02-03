// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationSecurityGroups Delete. */
public final class ApplicationSecurityGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ApplicationSecurityGroupDelete.json
     */
    /**
     * Sample code: Delete application security group.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteApplicationSecurityGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationSecurityGroups().delete("rg1", "test-asg", Context.NONE);
    }
}
