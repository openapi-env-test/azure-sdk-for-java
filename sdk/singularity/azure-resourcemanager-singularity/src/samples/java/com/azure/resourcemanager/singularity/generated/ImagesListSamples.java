// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.generated;

import com.azure.core.util.Context;

/** Samples for Images List. */
public final class ImagesListSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/list.json
     */
    /**
     * Sample code: ImagesList.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void imagesList(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.images().list(Context.NONE);
    }
}
