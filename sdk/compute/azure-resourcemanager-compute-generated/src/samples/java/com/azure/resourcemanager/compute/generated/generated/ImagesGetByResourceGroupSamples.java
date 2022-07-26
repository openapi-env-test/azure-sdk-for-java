// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for Images GetByResourceGroup. */
public final class ImagesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_Get.json
     */
    /**
     * Sample code: Get information about a virtual machine image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutAVirtualMachineImage(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.images().getByResourceGroupWithResponse("myResourceGroup", "myImage", null, Context.NONE);
    }
}
