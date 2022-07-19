// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.Context;

/** Samples for IotHubResource GetByResourceGroup. */
public final class IotHubResourceGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/preview/2022-03-15-preview/examples/iothub_get.json
     */
    /**
     * Sample code: IotHubResource_Get.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void iotHubResourceGet(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager.iotHubResources().getByResourceGroupWithResponse("myResourceGroup", "testHub", Context.NONE);
    }
}
