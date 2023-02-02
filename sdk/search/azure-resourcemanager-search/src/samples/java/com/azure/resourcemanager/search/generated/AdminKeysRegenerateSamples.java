// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.search.models.AdminKeyKind;

/** Samples for AdminKeys Regenerate. */
public final class AdminKeysRegenerateSamples {
    /*
     * x-ms-original-file: specification/search/resource-manager/Microsoft.Search/stable/2022-09-01/examples/SearchRegenerateAdminKey.json
     */
    /**
     * Sample code: SearchRegenerateAdminKey.
     *
     * @param manager Entry point to SearchManager.
     */
    public static void searchRegenerateAdminKey(com.azure.resourcemanager.search.SearchManager manager) {
        manager.adminKeys().regenerateWithResponse("rg1", "mysearchservice", AdminKeyKind.PRIMARY, null, Context.NONE);
    }
}
