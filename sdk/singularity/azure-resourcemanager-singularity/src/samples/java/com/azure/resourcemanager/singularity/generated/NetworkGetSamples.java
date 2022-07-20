// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.generated;

import com.azure.core.util.Context;

/** Samples for Network Get. */
public final class NetworkGetSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/get.json
     */
    /**
     * Sample code: NetworkGet.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void networkGet(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .networks()
            .getWithResponse("myresourceGroupName", "myaccountName", "mynetworkResourceName", Context.NONE);
    }
}
