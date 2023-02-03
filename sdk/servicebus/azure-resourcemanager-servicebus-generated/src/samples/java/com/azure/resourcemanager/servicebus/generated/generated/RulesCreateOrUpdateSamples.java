// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.generated;

import com.azure.resourcemanager.servicebus.generated.models.CorrelationFilter;
import com.azure.resourcemanager.servicebus.generated.models.FilterType;
import com.azure.resourcemanager.servicebus.generated.models.SqlFilter;
import java.util.HashMap;
import java.util.Map;

/** Samples for Rules CreateOrUpdate. */
public final class RulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-10-01-preview/examples/Rules/RuleCreate_CorrelationFilter.json
     */
    /**
     * Sample code: RulesCreateCorrelationFilter.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void rulesCreateCorrelationFilter(
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager
            .rules()
            .define("sdk-Rules-6571")
            .withExistingResourceGroup(
                "resourceGroupName", "sdk-Namespace-1319", "sdk-Topics-2081", "sdk-Subscriptions-8691")
            .withFilterType(FilterType.CORRELATION_FILTER)
            .withCorrelationFilter(new CorrelationFilter().withProperties(mapOf("topicHint", "Crop")))
            .create();
    }

    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-10-01-preview/examples/Rules/RuleCreate.json
     */
    /**
     * Sample code: RulesCreateOrUpdate.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void rulesCreateOrUpdate(com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager
            .rules()
            .define("sdk-Rules-6571")
            .withExistingResourceGroup(
                "resourceGroupName", "sdk-Namespace-1319", "sdk-Topics-2081", "sdk-Subscriptions-8691")
            .create();
    }

    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-10-01-preview/examples/Rules/RuleCreate_SqlFilter.json
     */
    /**
     * Sample code: RulesCreateSqlFilter.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void rulesCreateSqlFilter(com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager
            .rules()
            .define("sdk-Rules-6571")
            .withExistingResourceGroup(
                "resourceGroupName", "sdk-Namespace-1319", "sdk-Topics-2081", "sdk-Subscriptions-8691")
            .withFilterType(FilterType.SQL_FILTER)
            .withSqlFilter(new SqlFilter().withSqlExpression("myproperty=test"))
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
