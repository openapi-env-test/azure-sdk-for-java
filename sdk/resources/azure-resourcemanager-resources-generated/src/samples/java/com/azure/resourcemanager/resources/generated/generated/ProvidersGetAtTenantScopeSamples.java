// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.generated;

/** Samples for Providers GetAtTenantScope. */
public final class ProvidersGetAtTenantScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2021-04-01/examples/GetNamedProviderAtTenant.json
     */
    /**
     * Sample code: Get a resource provider at tenant scope.
     *
     * @param manager Entry point to ResourceManager.
     */
    public static void getAResourceProviderAtTenantScope(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager
            .providers()
            .getAtTenantScopeWithResponse(
                "Microsoft.Storage", "resourceTypes/aliases", com.azure.core.util.Context.NONE);
    }
}
