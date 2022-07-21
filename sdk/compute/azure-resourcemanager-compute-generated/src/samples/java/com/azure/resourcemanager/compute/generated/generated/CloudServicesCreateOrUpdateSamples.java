// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.models.CloudServiceExtensionProfile;
import com.azure.resourcemanager.compute.generated.models.CloudServiceExtensionProperties;
import com.azure.resourcemanager.compute.generated.models.CloudServiceNetworkProfile;
import com.azure.resourcemanager.compute.generated.models.CloudServiceOsProfile;
import com.azure.resourcemanager.compute.generated.models.CloudServiceProperties;
import com.azure.resourcemanager.compute.generated.models.CloudServiceRoleProfile;
import com.azure.resourcemanager.compute.generated.models.CloudServiceRoleProfileProperties;
import com.azure.resourcemanager.compute.generated.models.CloudServiceRoleSku;
import com.azure.resourcemanager.compute.generated.models.CloudServiceUpgradeMode;
import com.azure.resourcemanager.compute.generated.models.CloudServiceVaultCertificate;
import com.azure.resourcemanager.compute.generated.models.CloudServiceVaultSecretGroup;
import com.azure.resourcemanager.compute.generated.models.Extension;
import com.azure.resourcemanager.compute.generated.models.LoadBalancerConfiguration;
import com.azure.resourcemanager.compute.generated.models.LoadBalancerConfigurationProperties;
import com.azure.resourcemanager.compute.generated.models.LoadBalancerFrontendIpConfiguration;
import com.azure.resourcemanager.compute.generated.models.LoadBalancerFrontendIpConfigurationProperties;
import java.util.Arrays;

/** Samples for CloudServices CreateOrUpdate. */
public final class CloudServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-04-04/CloudServiceRP/examples/CloudService_Create_WithSingleRole.json
     */
    /**
     * Sample code: Create New Cloud Service with Single Role.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createNewCloudServiceWithSingleRole(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .cloudServices()
            .define("{cs-name}")
            .withRegion("westus")
            .withExistingResourceGroup("ConstosoRG")
            .withProperties(
                new CloudServiceProperties()
                    .withPackageUrl("{PackageUrl}")
                    .withConfiguration("{ServiceConfiguration}")
                    .withUpgradeMode(CloudServiceUpgradeMode.AUTO)
                    .withRoleProfile(
                        new CloudServiceRoleProfile()
                            .withRoles(
                                Arrays
                                    .asList(
                                        new CloudServiceRoleProfileProperties()
                                            .withName("ContosoFrontend")
                                            .withSku(
                                                new CloudServiceRoleSku()
                                                    .withName("Standard_D1_v2")
                                                    .withTier("Standard")
                                                    .withCapacity(1L)))))
                    .withNetworkProfile(
                        new CloudServiceNetworkProfile()
                            .withLoadBalancerConfigurations(
                                Arrays
                                    .asList(
                                        new LoadBalancerConfiguration()
                                            .withName("myLoadBalancer")
                                            .withProperties(
                                                new LoadBalancerConfigurationProperties()
                                                    .withFrontendIpConfigurations(
                                                        Arrays
                                                            .asList(
                                                                new LoadBalancerFrontendIpConfiguration()
                                                                    .withName("myfe")
                                                                    .withProperties(
                                                                        new LoadBalancerFrontendIpConfigurationProperties()
                                                                            .withPublicIpAddress(
                                                                                new SubResource()
                                                                                    .withId(
                                                                                        "/subscriptions/{subscription-id}/resourceGroups/ConstosoRG/providers/Microsoft.Network/publicIPAddresses/myPublicIP"))))))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-04-04/CloudServiceRP/examples/CloudService_Create_WithSingleRoleAndCertificate.json
     */
    /**
     * Sample code: Create New Cloud Service with Single Role and Certificate from Key Vault.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createNewCloudServiceWithSingleRoleAndCertificateFromKeyVault(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .cloudServices()
            .define("{cs-name}")
            .withRegion("westus")
            .withExistingResourceGroup("ConstosoRG")
            .withProperties(
                new CloudServiceProperties()
                    .withPackageUrl("{PackageUrl}")
                    .withConfiguration("{ServiceConfiguration}")
                    .withUpgradeMode(CloudServiceUpgradeMode.AUTO)
                    .withRoleProfile(
                        new CloudServiceRoleProfile()
                            .withRoles(
                                Arrays
                                    .asList(
                                        new CloudServiceRoleProfileProperties()
                                            .withName("ContosoFrontend")
                                            .withSku(
                                                new CloudServiceRoleSku()
                                                    .withName("Standard_D1_v2")
                                                    .withTier("Standard")
                                                    .withCapacity(1L)))))
                    .withOsProfile(
                        new CloudServiceOsProfile()
                            .withSecrets(
                                Arrays
                                    .asList(
                                        new CloudServiceVaultSecretGroup()
                                            .withSourceVault(
                                                new SubResource()
                                                    .withId(
                                                        "/subscriptions/{subscription-id}/resourceGroups/ConstosoRG/providers/Microsoft.KeyVault/vaults/{keyvault-name}"))
                                            .withVaultCertificates(
                                                Arrays
                                                    .asList(
                                                        new CloudServiceVaultCertificate()
                                                            .withCertificateUrl(
                                                                "https://{keyvault-name}.vault.azure.net:443/secrets/ContosoCertificate/{secret-id}"))))))
                    .withNetworkProfile(
                        new CloudServiceNetworkProfile()
                            .withLoadBalancerConfigurations(
                                Arrays
                                    .asList(
                                        new LoadBalancerConfiguration()
                                            .withName("contosolb")
                                            .withProperties(
                                                new LoadBalancerConfigurationProperties()
                                                    .withFrontendIpConfigurations(
                                                        Arrays
                                                            .asList(
                                                                new LoadBalancerFrontendIpConfiguration()
                                                                    .withName("contosofe")
                                                                    .withProperties(
                                                                        new LoadBalancerFrontendIpConfigurationProperties()
                                                                            .withPublicIpAddress(
                                                                                new SubResource()
                                                                                    .withId(
                                                                                        "/subscriptions/{subscription-id}/resourceGroups/ConstosoRG/providers/Microsoft.Network/publicIPAddresses/contosopublicip"))))))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-04-04/CloudServiceRP/examples/CloudService_Create_WithSingleRoleAndRDP.json
     */
    /**
     * Sample code: Create New Cloud Service with Single Role and RDP Extension.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createNewCloudServiceWithSingleRoleAndRDPExtension(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .cloudServices()
            .define("{cs-name}")
            .withRegion("westus")
            .withExistingResourceGroup("ConstosoRG")
            .withProperties(
                new CloudServiceProperties()
                    .withPackageUrl("{PackageUrl}")
                    .withConfiguration("{ServiceConfiguration}")
                    .withUpgradeMode(CloudServiceUpgradeMode.AUTO)
                    .withRoleProfile(
                        new CloudServiceRoleProfile()
                            .withRoles(
                                Arrays
                                    .asList(
                                        new CloudServiceRoleProfileProperties()
                                            .withName("ContosoFrontend")
                                            .withSku(
                                                new CloudServiceRoleSku()
                                                    .withName("Standard_D1_v2")
                                                    .withTier("Standard")
                                                    .withCapacity(1L)))))
                    .withNetworkProfile(
                        new CloudServiceNetworkProfile()
                            .withLoadBalancerConfigurations(
                                Arrays
                                    .asList(
                                        new LoadBalancerConfiguration()
                                            .withName("contosolb")
                                            .withProperties(
                                                new LoadBalancerConfigurationProperties()
                                                    .withFrontendIpConfigurations(
                                                        Arrays
                                                            .asList(
                                                                new LoadBalancerFrontendIpConfiguration()
                                                                    .withName("contosofe")
                                                                    .withProperties(
                                                                        new LoadBalancerFrontendIpConfigurationProperties()
                                                                            .withPublicIpAddress(
                                                                                new SubResource()
                                                                                    .withId(
                                                                                        "/subscriptions/{subscription-id}/resourceGroups/ConstosoRG/providers/Microsoft.Network/publicIPAddresses/contosopublicip")))))))))
                    .withExtensionProfile(
                        new CloudServiceExtensionProfile()
                            .withExtensions(
                                Arrays
                                    .asList(
                                        new Extension()
                                            .withName("RDPExtension")
                                            .withProperties(
                                                new CloudServiceExtensionProperties()
                                                    .withPublisher("Microsoft.Windows.Azure.Extensions")
                                                    .withType("RDP")
                                                    .withTypeHandlerVersion("1.2")
                                                    .withAutoUpgradeMinorVersion(false)
                                                    .withSettings(
                                                        "<PublicConfig><UserName>UserAzure</UserName><Expiration>10/22/2021"
                                                            + " 15:05:45</Expiration></PublicConfig>")
                                                    .withProtectedSettings(
                                                        "<PrivateConfig><Password>{password}</Password></PrivateConfig>"))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-04-04/CloudServiceRP/examples/CloudService_Create_WithMultiRole.json
     */
    /**
     * Sample code: Create New Cloud Service with Multiple Roles.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createNewCloudServiceWithMultipleRoles(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .cloudServices()
            .define("{cs-name}")
            .withRegion("westus")
            .withExistingResourceGroup("ConstosoRG")
            .withProperties(
                new CloudServiceProperties()
                    .withPackageUrl("{PackageUrl}")
                    .withConfiguration("{ServiceConfiguration}")
                    .withUpgradeMode(CloudServiceUpgradeMode.AUTO)
                    .withRoleProfile(
                        new CloudServiceRoleProfile()
                            .withRoles(
                                Arrays
                                    .asList(
                                        new CloudServiceRoleProfileProperties()
                                            .withName("ContosoFrontend")
                                            .withSku(
                                                new CloudServiceRoleSku()
                                                    .withName("Standard_D1_v2")
                                                    .withTier("Standard")
                                                    .withCapacity(1L)),
                                        new CloudServiceRoleProfileProperties()
                                            .withName("ContosoBackend")
                                            .withSku(
                                                new CloudServiceRoleSku()
                                                    .withName("Standard_D1_v2")
                                                    .withTier("Standard")
                                                    .withCapacity(1L)))))
                    .withNetworkProfile(
                        new CloudServiceNetworkProfile()
                            .withLoadBalancerConfigurations(
                                Arrays
                                    .asList(
                                        new LoadBalancerConfiguration()
                                            .withName("contosolb")
                                            .withProperties(
                                                new LoadBalancerConfigurationProperties()
                                                    .withFrontendIpConfigurations(
                                                        Arrays
                                                            .asList(
                                                                new LoadBalancerFrontendIpConfiguration()
                                                                    .withName("contosofe")
                                                                    .withProperties(
                                                                        new LoadBalancerFrontendIpConfigurationProperties()
                                                                            .withPublicIpAddress(
                                                                                new SubResource()
                                                                                    .withId(
                                                                                        "/subscriptions/{subscription-id}/resourceGroups/ConstosoRG/providers/Microsoft.Network/publicIPAddresses/contosopublicip"))))))))))
            .create();
    }
}
