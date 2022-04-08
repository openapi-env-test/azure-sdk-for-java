// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInner;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.AdditionalUnattendContent;
import com.azure.resourcemanager.compute.generated.models.ApiEntityReference;
import com.azure.resourcemanager.compute.generated.models.BootDiagnostics;
import com.azure.resourcemanager.compute.generated.models.CachingTypes;
import com.azure.resourcemanager.compute.generated.models.ComponentNames;
import com.azure.resourcemanager.compute.generated.models.DataDisk;
import com.azure.resourcemanager.compute.generated.models.DeleteOptions;
import com.azure.resourcemanager.compute.generated.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.generated.models.DiffDiskOptions;
import com.azure.resourcemanager.compute.generated.models.DiffDiskPlacement;
import com.azure.resourcemanager.compute.generated.models.DiffDiskSettings;
import com.azure.resourcemanager.compute.generated.models.DiskCreateOptionTypes;
import com.azure.resourcemanager.compute.generated.models.DiskDeleteOptionTypes;
import com.azure.resourcemanager.compute.generated.models.DiskDetachOptionTypes;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetParameters;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSettings;
import com.azure.resourcemanager.compute.generated.models.HardwareProfile;
import com.azure.resourcemanager.compute.generated.models.ImageReference;
import com.azure.resourcemanager.compute.generated.models.IpVersion;
import com.azure.resourcemanager.compute.generated.models.IpVersions;
import com.azure.resourcemanager.compute.generated.models.KeyVaultKeyReference;
import com.azure.resourcemanager.compute.generated.models.KeyVaultSecretReference;
import com.azure.resourcemanager.compute.generated.models.LinuxConfiguration;
import com.azure.resourcemanager.compute.generated.models.LinuxPatchAssessmentMode;
import com.azure.resourcemanager.compute.generated.models.LinuxPatchSettings;
import com.azure.resourcemanager.compute.generated.models.LinuxVMGuestPatchMode;
import com.azure.resourcemanager.compute.generated.models.ManagedDiskParameters;
import com.azure.resourcemanager.compute.generated.models.NetworkApiVersion;
import com.azure.resourcemanager.compute.generated.models.NetworkInterfaceReference;
import com.azure.resourcemanager.compute.generated.models.NetworkProfile;
import com.azure.resourcemanager.compute.generated.models.OSDisk;
import com.azure.resourcemanager.compute.generated.models.OSProfile;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.PassNames;
import com.azure.resourcemanager.compute.generated.models.PatchSettings;
import com.azure.resourcemanager.compute.generated.models.Plan;
import com.azure.resourcemanager.compute.generated.models.ProtocolTypes;
import com.azure.resourcemanager.compute.generated.models.PublicIpAddressSku;
import com.azure.resourcemanager.compute.generated.models.PublicIpAddressSkuName;
import com.azure.resourcemanager.compute.generated.models.PublicIpAddressSkuTier;
import com.azure.resourcemanager.compute.generated.models.PublicIpAllocationMethod;
import com.azure.resourcemanager.compute.generated.models.SecurityProfile;
import com.azure.resourcemanager.compute.generated.models.SecurityTypes;
import com.azure.resourcemanager.compute.generated.models.SettingNames;
import com.azure.resourcemanager.compute.generated.models.SshConfiguration;
import com.azure.resourcemanager.compute.generated.models.SshPublicKey;
import com.azure.resourcemanager.compute.generated.models.StorageAccountTypes;
import com.azure.resourcemanager.compute.generated.models.StorageProfile;
import com.azure.resourcemanager.compute.generated.models.UefiSettings;
import com.azure.resourcemanager.compute.generated.models.VMSizeProperties;
import com.azure.resourcemanager.compute.generated.models.VirtualHardDisk;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineIpTag;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineNetworkInterfaceConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineNetworkInterfaceDnsSettingsConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineNetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachinePublicIpAddressConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachinePublicIpAddressDnsSettingsConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetIpConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetIpTag;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetNetworkConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetNetworkConfigurationDnsSettings;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetPublicIpAddressConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMNetworkProfileConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMProtectionPolicy;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineSizeTypes;
import com.azure.resourcemanager.compute.generated.models.WinRMConfiguration;
import com.azure.resourcemanager.compute.generated.models.WinRMListener;
import com.azure.resourcemanager.compute.generated.models.WindowsConfiguration;
import com.azure.resourcemanager.compute.generated.models.WindowsPatchAssessmentMode;
import com.azure.resourcemanager.compute.generated.models.WindowsVMGuestPatchMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualMachineScaleSetVMs Update. */
public final class VirtualMachineScaleSetVMsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachineScaleSetVMs_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVMs_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetVMsUpdateMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMs()
            .update(
                "rgcompute",
                "aaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaa",
                new VirtualMachineScaleSetVMInner().withLocation("westus"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachineScaleSetVMs_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVMs_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetVMsUpdateMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMs()
            .update(
                "rgcompute",
                "aaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                new VirtualMachineScaleSetVMInner()
                    .withLocation("westus")
                    .withTags(mapOf())
                    .withPlan(
                        new Plan()
                            .withName("aaaaaaaaaa")
                            .withPublisher("aaaaaaaaaaaaaaaaaaaaaa")
                            .withProduct("aaaaaaaaaaaaaaaaaaaa")
                            .withPromotionCode("aaaaaaaaaaaaaaaaaaaa"))
                    .withHardwareProfile(
                        new HardwareProfile()
                            .withVmSize(VirtualMachineSizeTypes.BASIC_A0)
                            .withVmSizeProperties(new VMSizeProperties().withVCpusAvailable(9).withVCpusPerCore(12)))
                    .withStorageProfile(
                        new StorageProfile()
                            .withImageReference(
                                new ImageReference()
                                    .withId("a")
                                    .withPublisher("MicrosoftWindowsServer")
                                    .withOffer("WindowsServer")
                                    .withSku("2012-R2-Datacenter")
                                    .withVersion("4.127.20180315")
                                    .withSharedGalleryImageId("aaaaaaaaaaaaaaaaaaaa"))
                            .withOsDisk(
                                new OSDisk()
                                    .withOsType(OperatingSystemTypes.WINDOWS)
                                    .withEncryptionSettings(
                                        new DiskEncryptionSettings()
                                            .withDiskEncryptionKey(
                                                new KeyVaultSecretReference()
                                                    .withSecretUrl("aaaaaaaa")
                                                    .withSourceVault(
                                                        new SubResource()
                                                            .withId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")))
                                            .withKeyEncryptionKey(
                                                new KeyVaultKeyReference()
                                                    .withKeyUrl("aaaaaaaaaaaaaa")
                                                    .withSourceVault(
                                                        new SubResource()
                                                            .withId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")))
                                            .withEnabled(true))
                                    .withName("vmss3176_vmss3176_0_OsDisk_1_6d72b805e50e4de6830303c5055077fc")
                                    .withVhd(
                                        new VirtualHardDisk()
                                            .withUri(
                                                "https://{storageAccountName}.blob.core.windows.net/{containerName}/{vhdName}.vhd"))
                                    .withImage(
                                        new VirtualHardDisk()
                                            .withUri(
                                                "https://{storageAccountName}.blob.core.windows.net/{containerName}/{vhdName}.vhd"))
                                    .withCaching(CachingTypes.NONE)
                                    .withWriteAcceleratorEnabled(true)
                                    .withDiffDiskSettings(
                                        new DiffDiskSettings()
                                            .withOption(DiffDiskOptions.LOCAL)
                                            .withPlacement(DiffDiskPlacement.CACHE_DISK))
                                    .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                                    .withDiskSizeGB(127)
                                    .withManagedDisk(
                                        new ManagedDiskParameters()
                                            .withId(
                                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/vmss3176_vmss3176_0_OsDisk_1_6d72b805e50e4de6830303c5055077fc")
                                            .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                            .withDiskEncryptionSet(
                                                new DiskEncryptionSetParameters().withId("aaaaaaaaaaaa")))
                                    .withDeleteOption(DiskDeleteOptionTypes.DELETE))
                            .withDataDisks(
                                Arrays
                                    .asList(
                                        new DataDisk()
                                            .withLun(1)
                                            .withName("vmss3176_vmss3176_0_disk2_6c4f554bdafa49baa780eb2d128ff39d")
                                            .withVhd(
                                                new VirtualHardDisk()
                                                    .withUri(
                                                        "https://{storageAccountName}.blob.core.windows.net/{containerName}/{vhdName}.vhd"))
                                            .withImage(
                                                new VirtualHardDisk()
                                                    .withUri(
                                                        "https://{storageAccountName}.blob.core.windows.net/{containerName}/{vhdName}.vhd"))
                                            .withCaching(CachingTypes.NONE)
                                            .withWriteAcceleratorEnabled(true)
                                            .withCreateOption(DiskCreateOptionTypes.EMPTY)
                                            .withDiskSizeGB(128)
                                            .withManagedDisk(
                                                new ManagedDiskParameters()
                                                    .withId(
                                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/vmss3176_vmss3176_0_disk2_6c4f554bdafa49baa780eb2d128ff39d")
                                                    .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                                    .withDiskEncryptionSet(
                                                        new DiskEncryptionSetParameters().withId("aaaaaaaaaaaa")))
                                            .withToBeDetached(true)
                                            .withDetachOption(DiskDetachOptionTypes.FORCE_DETACH)
                                            .withDeleteOption(DiskDeleteOptionTypes.DELETE))))
                    .withAdditionalCapabilities(
                        new AdditionalCapabilities().withUltraSsdEnabled(true).withHibernationEnabled(true))
                    .withOsProfile(
                        new OSProfile()
                            .withComputerName("test000000")
                            .withAdminUsername("Foo12")
                            .withAdminPassword("aaaaaaaaaaaaaaaa")
                            .withCustomData("aaaa")
                            .withWindowsConfiguration(
                                new WindowsConfiguration()
                                    .withProvisionVMAgent(true)
                                    .withEnableAutomaticUpdates(true)
                                    .withTimeZone("aaaaaaaaaaaaaaaaaaaaaaaaaaa")
                                    .withAdditionalUnattendContent(
                                        Arrays
                                            .asList(
                                                new AdditionalUnattendContent()
                                                    .withPassName(PassNames.OOBE_SYSTEM)
                                                    .withComponentName(ComponentNames.MICROSOFT_WINDOWS_SHELL_SETUP)
                                                    .withSettingName(SettingNames.AUTO_LOGON)
                                                    .withContent("aaaaaaaaaaaaaaaaaaaa")))
                                    .withPatchSettings(
                                        new PatchSettings()
                                            .withPatchMode(WindowsVMGuestPatchMode.MANUAL)
                                            .withEnableHotpatching(true)
                                            .withAssessmentMode(WindowsPatchAssessmentMode.IMAGE_DEFAULT))
                                    .withWinRM(
                                        new WinRMConfiguration()
                                            .withListeners(
                                                Arrays
                                                    .asList(
                                                        new WinRMListener()
                                                            .withProtocol(ProtocolTypes.HTTP)
                                                            .withCertificateUrl("aaaaaaaaaaaaaaaaaaaaaa")))))
                            .withLinuxConfiguration(
                                new LinuxConfiguration()
                                    .withDisablePasswordAuthentication(true)
                                    .withSsh(
                                        new SshConfiguration()
                                            .withPublicKeys(
                                                Arrays
                                                    .asList(new SshPublicKey().withPath("aaa").withKeyData("aaaaaa"))))
                                    .withProvisionVMAgent(true)
                                    .withPatchSettings(
                                        new LinuxPatchSettings()
                                            .withPatchMode(LinuxVMGuestPatchMode.IMAGE_DEFAULT)
                                            .withAssessmentMode(LinuxPatchAssessmentMode.IMAGE_DEFAULT)))
                            .withSecrets(Arrays.asList())
                            .withAllowExtensionOperations(true)
                            .withRequireGuestProvisionSignal(true))
                    .withSecurityProfile(
                        new SecurityProfile()
                            .withUefiSettings(new UefiSettings().withSecureBootEnabled(true).withVTpmEnabled(true))
                            .withEncryptionAtHost(true)
                            .withSecurityType(SecurityTypes.TRUSTED_LAUNCH))
                    .withNetworkProfile(
                        new NetworkProfile()
                            .withNetworkInterfaces(
                                Arrays
                                    .asList(
                                        new NetworkInterfaceReference()
                                            .withId(
                                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachineScaleSets/{vmss-name}/virtualMachines/0/networkInterfaces/vmsstestnetconfig5415")
                                            .withPrimary(true)
                                            .withDeleteOption(DeleteOptions.DELETE)))
                            .withNetworkApiVersion(NetworkApiVersion.TWO_ZERO_TWO_ZERO_ONE_ONE_ZERO_ONE)
                            .withNetworkInterfaceConfigurations(
                                Arrays
                                    .asList(
                                        new VirtualMachineNetworkInterfaceConfiguration()
                                            .withName("aaaaaaaaaaa")
                                            .withPrimary(true)
                                            .withDeleteOption(DeleteOptions.DELETE)
                                            .withEnableAcceleratedNetworking(true)
                                            .withEnableFpga(true)
                                            .withEnableIpForwarding(true)
                                            .withNetworkSecurityGroup(
                                                new SubResource()
                                                    .withId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}"))
                                            .withDnsSettings(
                                                new VirtualMachineNetworkInterfaceDnsSettingsConfiguration()
                                                    .withDnsServers(Arrays.asList("aaaaaa")))
                                            .withIpConfigurations(
                                                Arrays
                                                    .asList(
                                                        new VirtualMachineNetworkInterfaceIpConfiguration()
                                                            .withName("aa")
                                                            .withSubnet(
                                                                new SubResource()
                                                                    .withId(
                                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}"))
                                                            .withPrimary(true)
                                                            .withPublicIpAddressConfiguration(
                                                                new VirtualMachinePublicIpAddressConfiguration()
                                                                    .withName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                                                                    .withSku(
                                                                        new PublicIpAddressSku()
                                                                            .withName(PublicIpAddressSkuName.BASIC)
                                                                            .withTier(PublicIpAddressSkuTier.REGIONAL))
                                                                    .withIdleTimeoutInMinutes(2)
                                                                    .withDeleteOption(DeleteOptions.DELETE)
                                                                    .withDnsSettings(
                                                                        new VirtualMachinePublicIpAddressDnsSettingsConfiguration()
                                                                            .withDomainNameLabel(
                                                                                "aaaaaaaaaaaaaaaaaaaaaaaaa"))
                                                                    .withIpTags(
                                                                        Arrays
                                                                            .asList(
                                                                                new VirtualMachineIpTag()
                                                                                    .withIpTagType(
                                                                                        "aaaaaaaaaaaaaaaaaaaaaaaaa")
                                                                                    .withTag("aaaaaaaaaaaaaaaaaaaa")))
                                                                    .withPublicIpPrefix(
                                                                        new SubResource()
                                                                            .withId(
                                                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}"))
                                                                    .withPublicIpAddressVersion(IpVersions.IPV4)
                                                                    .withPublicIpAllocationMethod(
                                                                        PublicIpAllocationMethod.DYNAMIC))
                                                            .withPrivateIpAddressVersion(IpVersions.IPV4)
                                                            .withApplicationSecurityGroups(
                                                                Arrays
                                                                    .asList(
                                                                        new SubResource()
                                                                            .withId(
                                                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")))
                                                            .withApplicationGatewayBackendAddressPools(
                                                                Arrays
                                                                    .asList(
                                                                        new SubResource()
                                                                            .withId(
                                                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")))
                                                            .withLoadBalancerBackendAddressPools(
                                                                Arrays
                                                                    .asList(
                                                                        new SubResource()
                                                                            .withId(
                                                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")))))
                                            .withDscpConfiguration(
                                                new SubResource()
                                                    .withId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")))))
                    .withNetworkProfileConfiguration(
                        new VirtualMachineScaleSetVMNetworkProfileConfiguration()
                            .withNetworkInterfaceConfigurations(
                                Arrays
                                    .asList(
                                        new VirtualMachineScaleSetNetworkConfiguration()
                                            .withId("aaaaaaaa")
                                            .withName("vmsstestnetconfig5415")
                                            .withPrimary(true)
                                            .withEnableAcceleratedNetworking(true)
                                            .withEnableFpga(true)
                                            .withNetworkSecurityGroup(
                                                new SubResource()
                                                    .withId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}"))
                                            .withDnsSettings(
                                                new VirtualMachineScaleSetNetworkConfigurationDnsSettings()
                                                    .withDnsServers(Arrays.asList()))
                                            .withIpConfigurations(
                                                Arrays
                                                    .asList(
                                                        new VirtualMachineScaleSetIpConfiguration()
                                                            .withId("aaaaaaaaa")
                                                            .withName("vmsstestnetconfig9693")
                                                            .withSubnet(
                                                                new ApiEntityReference()
                                                                    .withId(
                                                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/vn4071/subnets/sn5503"))
                                                            .withPrimary(true)
                                                            .withPublicIpAddressConfiguration(
                                                                new VirtualMachineScaleSetPublicIpAddressConfiguration()
                                                                    .withName("aaaaaaaaaaaaaaaaaa")
                                                                    .withSku(
                                                                        new PublicIpAddressSku()
                                                                            .withName(PublicIpAddressSkuName.BASIC)
                                                                            .withTier(PublicIpAddressSkuTier.REGIONAL))
                                                                    .withIdleTimeoutInMinutes(18)
                                                                    .withDnsSettings(
                                                                        new VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings()
                                                                            .withDomainNameLabel("aaaaaaaaaaaaaaaaaa"))
                                                                    .withIpTags(
                                                                        Arrays
                                                                            .asList(
                                                                                new VirtualMachineScaleSetIpTag()
                                                                                    .withIpTagType("aaaaaaa")
                                                                                    .withTag(
                                                                                        "aaaaaaaaaaaaaaaaaaaaaaaaaaa")))
                                                                    .withPublicIpPrefix(
                                                                        new SubResource()
                                                                            .withId(
                                                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}"))
                                                                    .withPublicIpAddressVersion(IpVersion.IPV4)
                                                                    .withDeleteOption(DeleteOptions.DELETE))
                                                            .withPrivateIpAddressVersion(IpVersion.IPV4)
                                                            .withApplicationGatewayBackendAddressPools(
                                                                Arrays
                                                                    .asList(
                                                                        new SubResource()
                                                                            .withId(
                                                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")))
                                                            .withApplicationSecurityGroups(
                                                                Arrays
                                                                    .asList(
                                                                        new SubResource()
                                                                            .withId(
                                                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")))
                                                            .withLoadBalancerBackendAddressPools(
                                                                Arrays
                                                                    .asList(
                                                                        new SubResource()
                                                                            .withId(
                                                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")))
                                                            .withLoadBalancerInboundNatPools(
                                                                Arrays
                                                                    .asList(
                                                                        new SubResource()
                                                                            .withId(
                                                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")))))
                                            .withEnableIpForwarding(true)
                                            .withDeleteOption(DeleteOptions.DELETE))))
                    .withDiagnosticsProfile(
                        new DiagnosticsProfile()
                            .withBootDiagnostics(
                                new BootDiagnostics().withEnabled(true).withStorageUri("aaaaaaaaaaaaa")))
                    .withAvailabilitySet(
                        new SubResource()
                            .withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}"))
                    .withLicenseType("aaaaaaaaaa")
                    .withProtectionPolicy(
                        new VirtualMachineScaleSetVMProtectionPolicy()
                            .withProtectFromScaleIn(true)
                            .withProtectFromScaleSetActions(true))
                    .withUserData("RXhhbXBsZSBVc2VyRGF0YQ=="),
                Context.NONE);
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
