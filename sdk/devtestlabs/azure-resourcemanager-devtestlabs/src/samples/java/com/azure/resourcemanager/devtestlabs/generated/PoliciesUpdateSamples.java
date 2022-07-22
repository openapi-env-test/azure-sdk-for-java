// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.models.Policy;
import java.util.HashMap;
import java.util.Map;

/** Samples for Policies Update. */
public final class PoliciesUpdateSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2021-09-01/examples/Policies_Update.json
     */
    /**
     * Sample code: Policies_Update.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void policiesUpdate(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        Policy resource =
            manager
                .policies()
                .getWithResponse(
                    "resourceGroupName", "{labName}", "{policySetName}", "{policyName}", null, Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tagName1", "tagValue1")).apply();
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
