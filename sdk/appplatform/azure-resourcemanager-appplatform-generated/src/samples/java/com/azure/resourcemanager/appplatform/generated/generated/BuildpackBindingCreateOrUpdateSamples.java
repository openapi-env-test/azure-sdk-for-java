// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.generated;

import com.azure.resourcemanager.appplatform.generated.models.BindingType;
import com.azure.resourcemanager.appplatform.generated.models.BuildpackBindingLaunchProperties;
import com.azure.resourcemanager.appplatform.generated.models.BuildpackBindingProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for BuildpackBinding CreateOrUpdate. */
public final class BuildpackBindingCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2022-01-01-preview/examples/BuildpackBinding_CreateOrUpdate.json
     */
    /**
     * Sample code: BuildpackBinding_CreateOrUpdate.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void buildpackBindingCreateOrUpdate(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .buildpackBindings()
            .define("myBuildpackBinding")
            .withExistingBuilder("myResourceGroup", "myservice", "default", "default")
            .withProperties(
                new BuildpackBindingProperties()
                    .withBindingType(BindingType.APPLICATION_INSIGHTS)
                    .withLaunchProperties(
                        new BuildpackBindingLaunchProperties()
                            .withProperties(mapOf("abc", "def", "any-string", "any-string", "sampling-rate", "12.0"))
                            .withSecrets(
                                mapOf(
                                    "connection-string",
                                    "XXXXXXXXXXXXXXXXX=XXXXXXXXXXXXX-XXXXXXXXXXXXXXXXXXX;XXXXXXXXXXXXXXXXX=XXXXXXXXXXXXXXXXXXX"))))
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
