// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated;

import com.azure.core.util.Context;

/** Samples for QueryKeys Create. */
public final class QueryKeysCreateSamples {
    /*
     * x-ms-original-file: specification/search/resource-manager/Microsoft.Search/stable/2022-09-01/examples/SearchCreateQueryKey.json
     */
    /**
     * Sample code: SearchCreateQueryKey.
     *
     * @param manager Entry point to SearchManager.
     */
    public static void searchCreateQueryKey(com.azure.resourcemanager.search.SearchManager manager) {
        manager
            .queryKeys()
            .createWithResponse("rg1", "mysearchservice", "Query key for browser-based clients", null, Context.NONE);
    }
}
