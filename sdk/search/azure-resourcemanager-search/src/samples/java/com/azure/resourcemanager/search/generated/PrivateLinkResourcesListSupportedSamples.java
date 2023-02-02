// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResources ListSupported. */
public final class PrivateLinkResourcesListSupportedSamples {
    /*
     * x-ms-original-file: specification/search/resource-manager/Microsoft.Search/stable/2022-09-01/examples/ListSupportedPrivateLinkResources.json
     */
    /**
     * Sample code: ListSupportedPrivateLinkResources.
     *
     * @param manager Entry point to SearchManager.
     */
    public static void listSupportedPrivateLinkResources(com.azure.resourcemanager.search.SearchManager manager) {
        manager.privateLinkResources().listSupported("rg1", "mysearchservice", null, Context.NONE);
    }
}
