// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.generated;

import com.azure.resourcemanager.storage.generated.models.CorsRule;
import com.azure.resourcemanager.storage.generated.models.CorsRuleAllowedMethodsItem;
import com.azure.resourcemanager.storage.generated.models.CorsRules;
import com.azure.resourcemanager.storage.generated.models.Multichannel;
import com.azure.resourcemanager.storage.generated.models.ProtocolSettings;
import com.azure.resourcemanager.storage.generated.models.SmbSetting;
import java.util.Arrays;

/** Samples for FileServices SetServiceProperties. */
public final class FileServicesSetServicePropertiesSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/FileServicesPut.json
     */
    /**
     * Sample code: PutFileServices.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void putFileServices(com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .fileServices()
            .define()
            .withExistingStorageAccount("res4410", "sto8607")
            .withCors(
                new CorsRules()
                    .withCorsRules(
                        Arrays
                            .asList(
                                new CorsRule()
                                    .withAllowedOrigins(
                                        Arrays.asList("http://www.contoso.com", "http://www.fabrikam.com"))
                                    .withAllowedMethods(
                                        Arrays
                                            .asList(
                                                CorsRuleAllowedMethodsItem.GET,
                                                CorsRuleAllowedMethodsItem.HEAD,
                                                CorsRuleAllowedMethodsItem.POST,
                                                CorsRuleAllowedMethodsItem.OPTIONS,
                                                CorsRuleAllowedMethodsItem.MERGE,
                                                CorsRuleAllowedMethodsItem.PUT))
                                    .withMaxAgeInSeconds(100)
                                    .withExposedHeaders(Arrays.asList("x-ms-meta-*"))
                                    .withAllowedHeaders(
                                        Arrays.asList("x-ms-meta-abc", "x-ms-meta-data*", "x-ms-meta-target*")),
                                new CorsRule()
                                    .withAllowedOrigins(Arrays.asList("*"))
                                    .withAllowedMethods(Arrays.asList(CorsRuleAllowedMethodsItem.GET))
                                    .withMaxAgeInSeconds(2)
                                    .withExposedHeaders(Arrays.asList("*"))
                                    .withAllowedHeaders(Arrays.asList("*")),
                                new CorsRule()
                                    .withAllowedOrigins(
                                        Arrays.asList("http://www.abc23.com", "https://www.fabrikam.com/*"))
                                    .withAllowedMethods(
                                        Arrays.asList(CorsRuleAllowedMethodsItem.GET, CorsRuleAllowedMethodsItem.PUT))
                                    .withMaxAgeInSeconds(2000)
                                    .withExposedHeaders(
                                        Arrays.asList("x-ms-meta-abc", "x-ms-meta-data*", "x-ms-meta-target*"))
                                    .withAllowedHeaders(Arrays.asList("x-ms-meta-12345675754564*")))))
            .create();
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/FileServicesPut_EnableSecureSmbFeatures.json
     */
    /**
     * Sample code: PutFileServices_EnableSecureSmbFeatures.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void putFileServicesEnableSecureSmbFeatures(
        com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .fileServices()
            .define()
            .withExistingStorageAccount("res4410", "sto8607")
            .withProtocolSettings(
                new ProtocolSettings()
                    .withSmb(
                        new SmbSetting()
                            .withVersions("SMB2.1;SMB3.0;SMB3.1.1")
                            .withAuthenticationMethods("NTLMv2;Kerberos")
                            .withKerberosTicketEncryption("RC4-HMAC;AES-256")
                            .withChannelEncryption("AES-128-CCM;AES-128-GCM;AES-256-GCM")))
            .create();
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/FileServicesPut_EnableSMBMultichannel.json
     */
    /**
     * Sample code: PutFileServices_EnableSMBMultichannel.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void putFileServicesEnableSMBMultichannel(
        com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .fileServices()
            .define()
            .withExistingStorageAccount("res4410", "sto8607")
            .withProtocolSettings(
                new ProtocolSettings().withSmb(new SmbSetting().withMultichannel(new Multichannel().withEnabled(true))))
            .create();
    }
}
