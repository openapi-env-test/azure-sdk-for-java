// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.Context;

/** Samples for Skus List. */
public final class SkusListSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/stable/2022-01-01/examples/SkusList.json
     */
    /**
     * Sample code: SkusList.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void skusList(com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.skus().list("westus", Context.NONE);
    }
}
