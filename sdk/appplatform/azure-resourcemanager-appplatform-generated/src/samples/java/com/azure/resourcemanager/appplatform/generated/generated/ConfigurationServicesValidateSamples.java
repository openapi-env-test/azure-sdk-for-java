// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.ConfigurationServiceGitProperty;
import com.azure.resourcemanager.appplatform.generated.models.ConfigurationServiceGitRepository;
import com.azure.resourcemanager.appplatform.generated.models.ConfigurationServiceSettings;
import java.util.Arrays;

/** Samples for ConfigurationServices Validate. */
public final class ConfigurationServicesValidateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2022-01-01-preview/examples/ConfigurationServices_Validate.json
     */
    /**
     * Sample code: ConfigurationServices_Validate.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void configurationServicesValidate(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .configurationServices()
            .validate(
                "myResourceGroup",
                "myservice",
                "default",
                new ConfigurationServiceSettings()
                    .withGitProperty(
                        new ConfigurationServiceGitProperty()
                            .withRepositories(
                                Arrays
                                    .asList(
                                        new ConfigurationServiceGitRepository()
                                            .withName("fake")
                                            .withPatterns(Arrays.asList("app/dev"))
                                            .withUri("https://github.com/fake-user/fake-repository")
                                            .withLabel("master")))),
                Context.NONE);
    }
}
