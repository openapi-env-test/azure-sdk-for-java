// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

import com.azure.core.util.Context;

/** Samples for RuleSets ListResourceUsage. */
public final class RuleSetsListResourceUsageSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/RuleSets_ListResourceUsage.json
     */
    /**
     * Sample code: RuleSets_ListResourceUsage.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void ruleSetsListResourceUsage(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager.ruleSets().listResourceUsage("RG", "profile1", "ruleSet1", Context.NONE);
    }
}
