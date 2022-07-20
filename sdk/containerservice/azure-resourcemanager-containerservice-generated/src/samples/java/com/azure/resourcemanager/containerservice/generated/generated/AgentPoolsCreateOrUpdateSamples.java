// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservice.generated.models.AgentPool;
import com.azure.resourcemanager.containerservice.generated.models.AgentPoolMode;
import com.azure.resourcemanager.containerservice.generated.models.Code;
import com.azure.resourcemanager.containerservice.generated.models.CreationData;
import com.azure.resourcemanager.containerservice.generated.models.GpuInstanceProfile;
import com.azure.resourcemanager.containerservice.generated.models.KubeletConfig;
import com.azure.resourcemanager.containerservice.generated.models.LinuxOSConfig;
import com.azure.resourcemanager.containerservice.generated.models.OSDiskType;
import com.azure.resourcemanager.containerservice.generated.models.OSType;
import com.azure.resourcemanager.containerservice.generated.models.Ossku;
import com.azure.resourcemanager.containerservice.generated.models.PowerState;
import com.azure.resourcemanager.containerservice.generated.models.ScaleSetEvictionPolicy;
import com.azure.resourcemanager.containerservice.generated.models.ScaleSetPriority;
import com.azure.resourcemanager.containerservice.generated.models.SysctlConfig;
import com.azure.resourcemanager.containerservice.generated.models.WorkloadRuntime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for AgentPools CreateOrUpdate. */
public final class AgentPoolsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_EnableFIPS.json
     */
    /**
     * Sample code: Create Agent Pool with FIPS enabled OS.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithFIPSEnabledOS(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withEnableFips(true)
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_GPUMIG.json
     */
    /**
     * Sample code: Create Agent Pool with GPUMIG.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithGPUMIG(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_ND96asr_v4")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withKubeletConfig(
                new KubeletConfig()
                    .withCpuManagerPolicy("static")
                    .withCpuCfsQuota(true)
                    .withCpuCfsQuotaPeriod("200ms")
                    .withImageGcHighThreshold(90)
                    .withImageGcLowThreshold(70)
                    .withTopologyManagerPolicy("best-effort")
                    .withAllowedUnsafeSysctls(Arrays.asList("kernel.msg*", "net.core.somaxconn"))
                    .withFailSwapOn(false))
            .withLinuxOSConfig(
                new LinuxOSConfig()
                    .withSysctls(
                        new SysctlConfig()
                            .withNetCoreWmemDefault(12345)
                            .withNetIpv4TcpTwReuse(true)
                            .withNetIpv4IpLocalPortRange("20000 60000")
                            .withKernelThreadsMax(99999))
                    .withTransparentHugePageEnabled("always")
                    .withTransparentHugePageDefrag("madvise")
                    .withSwapFileSizeMB(1500))
            .withGpuInstanceProfile(GpuInstanceProfile.MIG2G)
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_WindowsOSSKU.json
     */
    /**
     * Sample code: Create Agent Pool with Windows OSSKU.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithWindowsOSSKU(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("wnp2")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_D4s_v3")
            .withOsType(OSType.WINDOWS)
            .withOsSku(Ossku.WINDOWS2022)
            .withOrchestratorVersion("1.23.3")
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_DedicatedHostGroup.json
     */
    /**
     * Sample code: Create Agent Pool with Dedicated Host Group.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithDedicatedHostGroup(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withHostGroupId(
                "/subscriptions/subid1/resourcegroups/rg/providers/Microsoft.Compute/hostGroups/hostgroup1")
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_Update.json
     */
    /**
     * Sample code: Create/Update Agent Pool.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createUpdateAgentPool(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withTags(mapOf("name1", "val1"))
            .withCount(3)
            .withVmSize("Standard_DS1_v2")
            .withOsType(OSType.LINUX)
            .withMode(AgentPoolMode.USER)
            .withOrchestratorVersion("")
            .withScaleSetPriority(ScaleSetPriority.SPOT)
            .withScaleSetEvictionPolicy(ScaleSetEvictionPolicy.DELETE)
            .withNodeLabels(mapOf("key1", "val1"))
            .withNodeTaints(Arrays.asList("Key1=Value1:NoSchedule"))
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPools_Start.json
     */
    /**
     * Sample code: Start Agent Pool.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void startAgentPool(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withPowerState(new PowerState().withCode(Code.RUNNING))
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_EnableCustomCATrust.json
     */
    /**
     * Sample code: Create Agent Pool with CustomCATrust enabled.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithCustomCATrustEnabled(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withEnableCustomCATrust(true)
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_Spot.json
     */
    /**
     * Sample code: Create Spot Agent Pool.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createSpotAgentPool(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withTags(mapOf("name1", "val1"))
            .withCount(3)
            .withVmSize("Standard_DS1_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withScaleSetPriority(ScaleSetPriority.SPOT)
            .withScaleSetEvictionPolicy(ScaleSetEvictionPolicy.DELETE)
            .withNodeLabels(mapOf("key1", "val1"))
            .withNodeTaints(Arrays.asList("Key1=Value1:NoSchedule"))
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_Ephemeral.json
     */
    /**
     * Sample code: Create Agent Pool with Ephemeral OS Disk.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithEphemeralOSDisk(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsDiskSizeGB(64)
            .withOsDiskType(OSDiskType.EPHEMERAL)
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsAssociate_CRG.json
     */
    /**
     * Sample code: Associate Agent Pool with Capacity Reservation Group.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void associateAgentPoolWithCapacityReservationGroup(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withCapacityReservationGroupId(
                "/subscriptions/subid1/resourcegroups/rg1/providers//Microsoft.Compute/CapacityReservationGroups/crg1")
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_EnableEncryptionAtHost.json
     */
    /**
     * Sample code: Create Agent Pool with EncryptionAtHost enabled.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithEncryptionAtHostEnabled(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withEnableEncryptionAtHost(true)
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_EnableUltraSSD.json
     */
    /**
     * Sample code: Create Agent Pool with UltraSSD enabled.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithUltraSSDEnabled(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withEnableUltraSsd(true)
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_WasmWasi.json
     */
    /**
     * Sample code: Create Agent Pool with Krustlet and the WASI runtime.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithKrustletAndTheWASIRuntime(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsDiskSizeGB(64)
            .withWorkloadRuntime(WorkloadRuntime.WASM_WASI)
            .withOsType(OSType.LINUX)
            .withMode(AgentPoolMode.USER)
            .withOrchestratorVersion("")
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_Snapshot.json
     */
    /**
     * Sample code: Create Agent Pool using an agent pool snapshot.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolUsingAnAgentPoolSnapshot(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withEnableFips(true)
            .withCreationData(
                new CreationData()
                    .withSourceResourceId(
                        "/subscriptions/subid1/resourceGroups/rg1/providers/Microsoft.ContainerService/snapshots/snapshot1"))
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_PPG.json
     */
    /**
     * Sample code: Create Agent Pool with PPG.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithPPG(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withProximityPlacementGroupId(
                "/subscriptions/subid1/resourcegroups/rg1/providers//Microsoft.Compute/proximityPlacementGroups/ppg1")
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_CustomNodeConfig.json
     */
    /**
     * Sample code: Create Agent Pool with KubeletConfig and LinuxOSConfig.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithKubeletConfigAndLinuxOSConfig(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withKubeletConfig(
                new KubeletConfig()
                    .withCpuManagerPolicy("static")
                    .withCpuCfsQuota(true)
                    .withCpuCfsQuotaPeriod("200ms")
                    .withImageGcHighThreshold(90)
                    .withImageGcLowThreshold(70)
                    .withTopologyManagerPolicy("best-effort")
                    .withAllowedUnsafeSysctls(Arrays.asList("kernel.msg*", "net.core.somaxconn"))
                    .withFailSwapOn(false))
            .withLinuxOSConfig(
                new LinuxOSConfig()
                    .withSysctls(
                        new SysctlConfig()
                            .withNetCoreWmemDefault(12345)
                            .withNetIpv4TcpTwReuse(true)
                            .withNetIpv4IpLocalPortRange("20000 60000")
                            .withKernelThreadsMax(99999))
                    .withTransparentHugePageEnabled("always")
                    .withTransparentHugePageDefrag("madvise")
                    .withSwapFileSizeMB(1500))
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPools_Stop.json
     */
    /**
     * Sample code: Stop Agent Pool.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void stopAgentPool(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withPowerState(new PowerState().withCode(Code.STOPPED))
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_MessageOfTheDay.json
     */
    /**
     * Sample code: Create Agent Pool with Message of the Day.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithMessageOfTheDay(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsDiskSizeGB(64)
            .withMessageOfTheDay("Zm9vCg==")
            .withOsType(OSType.LINUX)
            .withMode(AgentPoolMode.USER)
            .withOrchestratorVersion("")
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPoolsCreate_OSSKU.json
     */
    /**
     * Sample code: Create Agent Pool with OSSKU.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithOSSKU(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOsSku(Ossku.CBLMARINER)
            .withOrchestratorVersion("")
            .withKubeletConfig(
                new KubeletConfig()
                    .withCpuManagerPolicy("static")
                    .withCpuCfsQuota(true)
                    .withCpuCfsQuotaPeriod("200ms")
                    .withImageGcHighThreshold(90)
                    .withImageGcLowThreshold(70)
                    .withTopologyManagerPolicy("best-effort")
                    .withAllowedUnsafeSysctls(Arrays.asList("kernel.msg*", "net.core.somaxconn"))
                    .withFailSwapOn(false))
            .withLinuxOSConfig(
                new LinuxOSConfig()
                    .withSysctls(
                        new SysctlConfig()
                            .withNetCoreWmemDefault(12345)
                            .withNetIpv4TcpTwReuse(true)
                            .withNetIpv4IpLocalPortRange("20000 60000")
                            .withKernelThreadsMax(99999))
                    .withTransparentHugePageEnabled("always")
                    .withTransparentHugePageDefrag("madvise")
                    .withSwapFileSizeMB(1500))
            .create();
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/AgentPools_Update.json
     */
    /**
     * Sample code: Update Agent Pool.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void updateAgentPool(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        AgentPool resource =
            manager.agentPools().getWithResponse("rg1", "clustername1", "agentpool1", Context.NONE).getValue();
        resource
            .update()
            .withCount(3)
            .withVmSize("Standard_DS1_v2")
            .withOsType(OSType.LINUX)
            .withMaxCount(2)
            .withMinCount(2)
            .withEnableAutoScaling(true)
            .withOrchestratorVersion("")
            .withScaleSetPriority(ScaleSetPriority.SPOT)
            .withScaleSetEvictionPolicy(ScaleSetEvictionPolicy.DELETE)
            .withNodeTaints(Arrays.asList("Key1=Value1:NoSchedule"))
            .apply();
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
