// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.Sku;
import java.util.HashMap;
import java.util.Map;

/** Samples for DedicatedHosts CreateOrUpdate. */
public final class DedicatedHostsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/CreateOrUpdateADedicatedHost.json
     */
    /**
     * Sample code: Create or update a dedicated host .
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateADedicatedHost(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .dedicatedHosts()
            .define("myDedicatedHost")
            .withRegion("westus")
            .withExistingHostGroup("myResourceGroup", "myDedicatedHostGroup")
            .withSku(new Sku().withName("DSv3-Type1"))
            .withTags(mapOf("department", "HR"))
            .withPlatformFaultDomain(1)
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
