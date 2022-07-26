// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for Bookmarks List. */
public final class BookmarksListSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/bookmarks/GetBookmarks.json
     */
    /**
     * Sample code: Get all bookmarks.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAllBookmarks(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.bookmarks().list("myRg", "myWorkspace", Context.NONE);
    }
}
