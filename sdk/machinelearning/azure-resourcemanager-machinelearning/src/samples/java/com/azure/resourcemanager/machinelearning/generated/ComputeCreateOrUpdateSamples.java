// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.resourcemanager.machinelearning.models.Aks;
import com.azure.resourcemanager.machinelearning.models.AksSchemaProperties;
import com.azure.resourcemanager.machinelearning.models.AmlCompute;
import com.azure.resourcemanager.machinelearning.models.AmlComputeProperties;
import com.azure.resourcemanager.machinelearning.models.ApplicationSharingPolicy;
import com.azure.resourcemanager.machinelearning.models.AssignedUser;
import com.azure.resourcemanager.machinelearning.models.ComputeInstance;
import com.azure.resourcemanager.machinelearning.models.ComputeInstanceAuthorizationType;
import com.azure.resourcemanager.machinelearning.models.ComputeInstanceProperties;
import com.azure.resourcemanager.machinelearning.models.ComputeInstanceSshSettings;
import com.azure.resourcemanager.machinelearning.models.CustomService;
import com.azure.resourcemanager.machinelearning.models.DataFactory;
import com.azure.resourcemanager.machinelearning.models.Docker;
import com.azure.resourcemanager.machinelearning.models.Endpoint;
import com.azure.resourcemanager.machinelearning.models.EnvironmentVariable;
import com.azure.resourcemanager.machinelearning.models.EnvironmentVariableType;
import com.azure.resourcemanager.machinelearning.models.Image;
import com.azure.resourcemanager.machinelearning.models.ImageType;
import com.azure.resourcemanager.machinelearning.models.InstanceTypeSchema;
import com.azure.resourcemanager.machinelearning.models.InstanceTypeSchemaResources;
import com.azure.resourcemanager.machinelearning.models.Kubernetes;
import com.azure.resourcemanager.machinelearning.models.KubernetesProperties;
import com.azure.resourcemanager.machinelearning.models.OsType;
import com.azure.resourcemanager.machinelearning.models.PersonalComputeInstanceSettings;
import com.azure.resourcemanager.machinelearning.models.Protocol;
import com.azure.resourcemanager.machinelearning.models.RemoteLoginPortPublicAccess;
import com.azure.resourcemanager.machinelearning.models.ResourceId;
import com.azure.resourcemanager.machinelearning.models.ScaleSettings;
import com.azure.resourcemanager.machinelearning.models.SshPublicAccess;
import com.azure.resourcemanager.machinelearning.models.VirtualMachineImage;
import com.azure.resourcemanager.machinelearning.models.VmPriority;
import com.azure.resourcemanager.machinelearning.models.VolumeDefinition;
import com.azure.resourcemanager.machinelearning.models.VolumeDefinitionType;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Compute CreateOrUpdate. */
public final class ComputeCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/Compute/createOrUpdate/BasicAKSCompute.json
     */
    /**
     * Sample code: Create an AKS Compute.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createAnAKSCompute(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .computes()
            .define("compute123")
            .withExistingWorkspace("testrg123", "workspaces123")
            .withRegion("eastus")
            .withProperties(new Aks())
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/Compute/createOrUpdate/AKSCompute.json
     */
    /**
     * Sample code: Update an AKS Compute.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void updateAnAKSCompute(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .computes()
            .define("compute123")
            .withExistingWorkspace("testrg123", "workspaces123")
            .withRegion("eastus")
            .withProperties(
                new Aks()
                    .withDescription("some compute")
                    .withResourceId(
                        "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourcegroups/testrg123/providers/Microsoft.ContainerService/managedClusters/compute123-56826-c9b00420020b2")
                    .withProperties(new AksSchemaProperties().withAgentCount(4)))
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/Compute/createOrUpdate/KubernetesCompute.json
     */
    /**
     * Sample code: Attach a Kubernetes Compute.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void attachAKubernetesCompute(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .computes()
            .define("compute123")
            .withExistingWorkspace("testrg123", "workspaces123")
            .withRegion("eastus")
            .withProperties(
                new Kubernetes()
                    .withDescription("some compute")
                    .withResourceId(
                        "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourcegroups/testrg123/providers/Microsoft.ContainerService/managedClusters/compute123-56826-c9b00420020b2")
                    .withProperties(
                        new KubernetesProperties()
                            .withNamespace("default")
                            .withDefaultInstanceType("defaultInstanceType")
                            .withInstanceTypes(
                                mapOf(
                                    "defaultInstanceType",
                                    new InstanceTypeSchema()
                                        .withResources(
                                            new InstanceTypeSchemaResources()
                                                .withRequests(
                                                    mapOf("cpu", "1", "memory", "4Gi", "nvidia.com/gpu", null))
                                                .withLimits(
                                                    mapOf("cpu", "1", "memory", "4Gi", "nvidia.com/gpu", null)))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/Compute/createOrUpdate/BasicAmlCompute.json
     */
    /**
     * Sample code: Create a AML Compute.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createAAMLCompute(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .computes()
            .define("compute123")
            .withExistingWorkspace("testrg123", "workspaces123")
            .withRegion("eastus")
            .withProperties(
                new AmlCompute()
                    .withProperties(
                        new AmlComputeProperties()
                            .withOsType(OsType.WINDOWS)
                            .withVmSize("STANDARD_NC6")
                            .withVmPriority(VmPriority.DEDICATED)
                            .withVirtualMachineImage(
                                new VirtualMachineImage()
                                    .withId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Compute/galleries/myImageGallery/images/myImageDefinition/versions/0.0.1"))
                            .withIsolatedNetwork(false)
                            .withScaleSettings(
                                new ScaleSettings()
                                    .withMaxNodeCount(1)
                                    .withMinNodeCount(0)
                                    .withNodeIdleTimeBeforeScaleDown(Duration.parse("PT5M")))
                            .withRemoteLoginPortPublicAccess(RemoteLoginPortPublicAccess.NOT_SPECIFIED)
                            .withEnableNodePublicIp(true)))
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/Compute/createOrUpdate/ComputeInstance.json
     */
    /**
     * Sample code: Create an ComputeInstance Compute.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createAnComputeInstanceCompute(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .computes()
            .define("compute123")
            .withExistingWorkspace("testrg123", "workspaces123")
            .withRegion("eastus")
            .withProperties(
                new ComputeInstance()
                    .withProperties(
                        new ComputeInstanceProperties()
                            .withVmSize("STANDARD_NC6")
                            .withSubnet(new ResourceId().withId("test-subnet-resource-id"))
                            .withApplicationSharingPolicy(ApplicationSharingPolicy.PERSONAL)
                            .withSshSettings(
                                new ComputeInstanceSshSettings().withSshPublicAccess(SshPublicAccess.DISABLED))
                            .withCustomServices(
                                Arrays
                                    .asList(
                                        new CustomService()
                                            .withName("rstudio-workbench")
                                            .withImage(
                                                new Image()
                                                    .withType(ImageType.DOCKER)
                                                    .withReference("ghcr.io/azure/rstudio-workbench:latest")
                                                    .withAdditionalProperties(mapOf()))
                                            .withEnvironmentVariables(
                                                mapOf(
                                                    "RSP_LICENSE",
                                                    new EnvironmentVariable()
                                                        .withType(EnvironmentVariableType.LOCAL)
                                                        .withValue("XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX")
                                                        .withAdditionalProperties(mapOf())))
                                            .withDocker(
                                                new Docker().withPrivileged(true).withAdditionalProperties(mapOf()))
                                            .withEndpoints(
                                                Arrays
                                                    .asList(
                                                        new Endpoint()
                                                            .withProtocol(Protocol.HTTP)
                                                            .withName("connect")
                                                            .withTarget(8787)
                                                            .withPublished(4444)))
                                            .withVolumes(
                                                Arrays
                                                    .asList(
                                                        new VolumeDefinition()
                                                            .withType(VolumeDefinitionType.BIND)
                                                            .withReadOnly(true)
                                                            .withSource("/mnt/azureuser/")
                                                            .withTarget("/home/testuser/")))
                                            .withAdditionalProperties(mapOf())))
                            .withComputeInstanceAuthorizationType(ComputeInstanceAuthorizationType.PERSONAL)
                            .withPersonalComputeInstanceSettings(
                                new PersonalComputeInstanceSettings()
                                    .withAssignedUser(
                                        new AssignedUser()
                                            .withObjectId("00000000-0000-0000-0000-000000000000")
                                            .withTenantId("00000000-0000-0000-0000-000000000000")))))
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/Compute/createOrUpdate/ComputeInstanceMinimal.json
     */
    /**
     * Sample code: Create an ComputeInstance Compute with minimal inputs.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createAnComputeInstanceComputeWithMinimalInputs(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .computes()
            .define("compute123")
            .withExistingWorkspace("testrg123", "workspaces123")
            .withRegion("eastus")
            .withProperties(
                new ComputeInstance().withProperties(new ComputeInstanceProperties().withVmSize("STANDARD_NC6")))
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/Compute/createOrUpdate/AmlCompute.json
     */
    /**
     * Sample code: Update a AML Compute.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void updateAAMLCompute(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .computes()
            .define("compute123")
            .withExistingWorkspace("testrg123", "workspaces123")
            .withRegion("eastus")
            .withProperties(
                new AmlCompute()
                    .withDescription("some compute")
                    .withProperties(
                        new AmlComputeProperties()
                            .withScaleSettings(
                                new ScaleSettings()
                                    .withMaxNodeCount(4)
                                    .withMinNodeCount(4)
                                    .withNodeIdleTimeBeforeScaleDown(Duration.parse("PT5M")))))
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/Compute/createOrUpdate/BasicDataFactoryCompute.json
     */
    /**
     * Sample code: Create a DataFactory Compute.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createADataFactoryCompute(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .computes()
            .define("compute123")
            .withExistingWorkspace("testrg123", "workspaces123")
            .withRegion("eastus")
            .withProperties(new DataFactory())
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
