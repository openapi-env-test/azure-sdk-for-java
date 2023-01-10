// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.Context;

/** Resource collection API of DeviceCapacityChecks. */
public interface DeviceCapacityChecks {
    /**
     * Posts the device capacity request info to check feasibility.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void checkResourceCreationFeasibility(
        String resourceGroupName, String deviceName, DeviceCapacityRequestInfo deviceCapacityRequestInfo);

    /**
     * Posts the device capacity request info to check feasibility.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @param capacityName The capacity name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void checkResourceCreationFeasibility(
        String resourceGroupName,
        String deviceName,
        DeviceCapacityRequestInfo deviceCapacityRequestInfo,
        String capacityName,
        Context context);
}
