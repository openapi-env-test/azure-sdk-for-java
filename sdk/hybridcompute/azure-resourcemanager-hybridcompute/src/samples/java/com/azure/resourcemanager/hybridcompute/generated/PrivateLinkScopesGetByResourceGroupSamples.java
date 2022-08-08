// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkScopes GetByResourceGroup. */
public final class PrivateLinkScopesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2022-05-10-preview/examples/PrivateLinkScopesGet.json
     */
    /**
     * Sample code: PrivateLinkScopeGet.
     *
     * @param manager Entry point to HybridComputeManager.
     */
    public static void privateLinkScopeGet(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager
            .privateLinkScopes()
            .getByResourceGroupWithResponse("my-resource-group", "my-privatelinkscope", Context.NONE);
    }
}
