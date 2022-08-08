// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.DdosCustomPolicy;
import java.util.HashMap;
import java.util.Map;

/** Samples for DdosCustomPolicies UpdateTags. */
public final class DdosCustomPoliciesUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/DdosCustomPolicyUpdateTags.json
     */
    /**
     * Sample code: DDoS Custom policy Update tags.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void dDoSCustomPolicyUpdateTags(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        DdosCustomPolicy resource =
            manager
                .ddosCustomPolicies()
                .getByResourceGroupWithResponse("rg1", "test-ddos-custom-policy", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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
