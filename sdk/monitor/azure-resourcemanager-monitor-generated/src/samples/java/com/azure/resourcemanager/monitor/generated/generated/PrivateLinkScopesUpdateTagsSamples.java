// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.models.AzureMonitorPrivateLinkScope;
import java.util.HashMap;
import java.util.Map;

/** Samples for PrivateLinkScopes UpdateTags. */
public final class PrivateLinkScopesUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2021-07-01-preview/examples/PrivateLinkScopesUpdateTagsOnly.json
     */
    /**
     * Sample code: PrivateLinkScopeUpdateTagsOnly.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void privateLinkScopeUpdateTagsOnly(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        AzureMonitorPrivateLinkScope resource =
            manager
                .privateLinkScopes()
                .getByResourceGroupWithResponse("my-resource-group", "my-privatelinkscope", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("Tag1", "Value1", "Tag2", "Value2")).apply();
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
