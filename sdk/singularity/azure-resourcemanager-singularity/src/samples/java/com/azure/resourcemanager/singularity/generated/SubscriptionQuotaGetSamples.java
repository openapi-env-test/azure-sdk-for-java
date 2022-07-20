// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.generated;

import com.azure.core.util.Context;

/** Samples for SubscriptionQuota Get. */
public final class SubscriptionQuotaGetSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/get.json
     */
    /**
     * Sample code: SubscriptionQuotaGet.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void subscriptionQuotaGet(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.subscriptionQuotas().getWithResponse("myownerSubscriptionId", Context.NONE);
    }
}
