// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.compute.generated.models.InstanceViewStatus;
import com.azure.resourcemanager.compute.generated.models.StatusLevelTypes;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionInstanceView;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualMachineExtensions CreateOrUpdate. */
public final class VirtualMachineExtensionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachineExtensions_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensions_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionsCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineExtensions()
            .define("aaaaaaaaaaaaaaaaaaaaaaaa")
            .withRegion("westus")
            .withExistingVirtualMachine("rgcompute", "aaaa")
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachineExtensions_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensions_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionsCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) throws IOException {
        manager
            .virtualMachineExtensions()
            .define("aaaaaaaaaaaaa")
            .withRegion("westus")
            .withExistingVirtualMachine("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaa")
            .withTags(mapOf("key9183", "aa"))
            .withForceUpdateTag("a")
            .withPublisher("extPublisher")
            .withTypePropertiesType("extType")
            .withTypeHandlerVersion("1.2")
            .withAutoUpgradeMinorVersion(true)
            .withEnableAutomaticUpgrade(true)
            .withSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
            .withProtectedSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
            .withInstanceView(
                new VirtualMachineExtensionInstanceView()
                    .withName("aaaaaaaaaaaaaaaaa")
                    .withType("aaaaaaaaa")
                    .withTypeHandlerVersion("aaaaaaaaaaaaaaaaaaaaaaaaaa")
                    .withSubstatuses(
                        Arrays
                            .asList(
                                new InstanceViewStatus()
                                    .withCode("aaaaaaaaaaaaaaaaaaaaaaa")
                                    .withLevel(StatusLevelTypes.INFO)
                                    .withDisplayStatus("aaaaaa")
                                    .withMessage("a")
                                    .withTime(OffsetDateTime.parse("2021-11-30T12:58:26.522Z"))))
                    .withStatuses(
                        Arrays
                            .asList(
                                new InstanceViewStatus()
                                    .withCode("aaaaaaaaaaaaaaaaaaaaaaa")
                                    .withLevel(StatusLevelTypes.INFO)
                                    .withDisplayStatus("aaaaaa")
                                    .withMessage("a")
                                    .withTime(OffsetDateTime.parse("2021-11-30T12:58:26.522Z")))))
            .withSuppressFailures(true)
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
