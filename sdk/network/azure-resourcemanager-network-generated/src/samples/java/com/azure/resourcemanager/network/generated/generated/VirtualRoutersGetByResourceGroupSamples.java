// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualRouters GetByResourceGroup. */
public final class VirtualRoutersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VirtualRouterGet.json
     */
    /**
     * Sample code: Get VirtualRouter.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVirtualRouter(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualRouters().getByResourceGroupWithResponse("rg1", "virtualRouter", null, Context.NONE);
    }
}
