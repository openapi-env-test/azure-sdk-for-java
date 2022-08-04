// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.generated;

import java.util.Arrays;

/** Samples for TrustedAccessRoleBindings CreateOrUpdate. */
public final class TrustedAccessRoleBindingsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-07-02-preview/examples/TrustedAccessRoleBindings_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a trusted access role binding.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createOrUpdateATrustedAccessRoleBinding(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .trustedAccessRoleBindings()
            .define("binding1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withSourceResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/b/providers/Microsoft.MachineLearningServices/workspaces/c")
            .withRoles(
                Arrays
                    .asList(
                        "Microsoft.MachineLearningServices/workspaces/reader",
                        "Microsoft.MachineLearningServices/workspaces/writer"))
            .create();
    }
}
