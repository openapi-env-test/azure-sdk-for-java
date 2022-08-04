// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.CloudService;
import java.util.HashMap;
import java.util.Map;

/** Samples for CloudServices Update. */
public final class CloudServicesUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-04-04/CloudServiceRP/examples/CloudService_Update_ToIncludeTags.json
     */
    /**
     * Sample code: Update existing Cloud Service to add tags.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateExistingCloudServiceToAddTags(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        CloudService resource =
            manager.cloudServices().getByResourceGroupWithResponse("ConstosoRG", "{cs-name}", Context.NONE).getValue();
        resource.update().withTags(mapOf("Documentation", "RestAPI")).apply();
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
