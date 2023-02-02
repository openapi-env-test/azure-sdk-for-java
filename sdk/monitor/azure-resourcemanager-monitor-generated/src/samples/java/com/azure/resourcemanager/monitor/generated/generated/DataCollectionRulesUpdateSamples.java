// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionRuleResource;
import java.util.HashMap;
import java.util.Map;

/** Samples for DataCollectionRules Update. */
public final class DataCollectionRulesUpdateSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2021-09-01-preview/examples/DataCollectionRulesUpdate.json
     */
    /**
     * Sample code: Update data collection rule.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void updateDataCollectionRule(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        DataCollectionRuleResource resource =
            manager
                .dataCollectionRules()
                .getByResourceGroupWithResponse("myResourceGroup", "myCollectionRule", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "A", "tag2", "B", "tag3", "C")).apply();
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
