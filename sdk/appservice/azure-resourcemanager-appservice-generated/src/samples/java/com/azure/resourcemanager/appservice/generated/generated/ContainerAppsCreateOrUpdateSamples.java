// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.resourcemanager.appservice.generated.models.Configuration;
import com.azure.resourcemanager.appservice.generated.models.Container;
import com.azure.resourcemanager.appservice.generated.models.CustomScaleRule;
import com.azure.resourcemanager.appservice.generated.models.Dapr;
import com.azure.resourcemanager.appservice.generated.models.Ingress;
import com.azure.resourcemanager.appservice.generated.models.Scale;
import com.azure.resourcemanager.appservice.generated.models.ScaleRule;
import com.azure.resourcemanager.appservice.generated.models.Template;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ContainerApps CreateOrUpdate. */
public final class ContainerAppsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/CreateOrUpdateContainerApp.json
     */
    /**
     * Sample code: Create or Update Container App.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void createOrUpdateContainerApp(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .containerApps()
            .define("testcontainerApp0")
            .withRegion("East US")
            .withExistingResourceGroup("rg")
            .withKind("containerApp")
            .withKubeEnvironmentId(
                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.Web/kubeEnvironments/demokube")
            .withConfiguration(new Configuration().withIngress(new Ingress().withExternal(true).withTargetPort(3000)))
            .withTemplate(
                new Template()
                    .withContainers(
                        Arrays
                            .asList(
                                new Container().withImage("repo/testcontainerApp0:v1").withName("testcontainerApp0")))
                    .withScale(
                        new Scale()
                            .withMinReplicas(1)
                            .withMaxReplicas(5)
                            .withRules(
                                Arrays
                                    .asList(
                                        new ScaleRule()
                                            .withName("httpscalingrule")
                                            .withCustom(
                                                new CustomScaleRule()
                                                    .withType("http")
                                                    .withMetadata(mapOf("concurrentRequests", "50"))))))
                    .withDapr(new Dapr().withEnabled(true).withAppPort(3000)))
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
