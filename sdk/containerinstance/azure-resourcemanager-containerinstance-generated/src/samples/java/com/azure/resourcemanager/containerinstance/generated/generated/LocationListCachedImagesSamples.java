// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.generated;

import com.azure.core.util.Context;

/** Samples for Location ListCachedImages. */
public final class LocationListCachedImagesSamples {
    /*
     * x-ms-original-file: specification/containerinstance/resource-manager/Microsoft.ContainerInstance/stable/2022-04-01/examples/CachedImagesList.json
     */
    /**
     * Sample code: CachedImages.
     *
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void cachedImages(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.locations().listCachedImages("westcentralus", Context.NONE);
    }
}
