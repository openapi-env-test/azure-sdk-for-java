// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.machinelearning.models.BatchDeploymentProperties;
import com.azure.resourcemanager.machinelearning.models.BatchLoggingLevel;
import com.azure.resourcemanager.machinelearning.models.BatchOutputAction;
import com.azure.resourcemanager.machinelearning.models.BatchRetrySettings;
import com.azure.resourcemanager.machinelearning.models.CodeConfiguration;
import com.azure.resourcemanager.machinelearning.models.IdAssetReference;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.ResourceConfiguration;
import com.azure.resourcemanager.machinelearning.models.Sku;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import com.azure.resourcemanager.machinelearning.models.UserAssignedIdentity;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/** Samples for BatchDeployments CreateOrUpdate. */
public final class BatchDeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/BatchDeployment/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Batch Deployment.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateBatchDeployment(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) throws IOException {
        manager
            .batchDeployments()
            .define("testDeploymentName")
            .withRegion("string")
            .withExistingBatchEndpoint("test-rg", "my-aml-workspace", "testEndpointName")
            .withProperties(
                new BatchDeploymentProperties()
                    .withCodeConfiguration(new CodeConfiguration().withCodeId("string").withScoringScript("string"))
                    .withDescription("string")
                    .withEnvironmentId("string")
                    .withEnvironmentVariables(mapOf("string", "string"))
                    .withProperties(mapOf("string", "string"))
                    .withCompute("string")
                    .withErrorThreshold(1)
                    .withLoggingLevel(BatchLoggingLevel.INFO)
                    .withMaxConcurrencyPerInstance(1)
                    .withMiniBatchSize(1L)
                    .withModel(new IdAssetReference().withAssetId("string"))
                    .withOutputAction(BatchOutputAction.SUMMARY_ONLY)
                    .withOutputFileName("string")
                    .withResources(
                        new ResourceConfiguration()
                            .withInstanceCount(1)
                            .withInstanceType("string")
                            .withProperties(
                                mapOf(
                                    "string",
                                    SerializerFactory
                                        .createDefaultManagementSerializerAdapter()
                                        .deserialize(
                                            "{\"cd3c37dc-2876-4ca4-8a54-21bd7619724a\":null}",
                                            Object.class,
                                            SerializerEncoding.JSON))))
                    .withRetrySettings(new BatchRetrySettings().withMaxRetries(1).withTimeout(Duration.parse("PT5M"))))
            .withTags(mapOf())
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                    .withUserAssignedIdentities(mapOf("string", new UserAssignedIdentity())))
            .withKind("string")
            .withSku(
                new Sku()
                    .withName("string")
                    .withTier(SkuTier.FREE)
                    .withSize("string")
                    .withFamily("string")
                    .withCapacity(1))
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
