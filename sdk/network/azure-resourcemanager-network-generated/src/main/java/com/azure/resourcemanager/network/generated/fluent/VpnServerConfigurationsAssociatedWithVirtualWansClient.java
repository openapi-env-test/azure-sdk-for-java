// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.VpnServerConfigurationsResponseInner;

/**
 * An instance of this class provides access to all the operations defined in
 * VpnServerConfigurationsAssociatedWithVirtualWansClient.
 */
public interface VpnServerConfigurationsAssociatedWithVirtualWansClient {
    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VpnServerConfigurationsResponseInner>, VpnServerConfigurationsResponseInner> beginList(
        String resourceGroupName, String virtualWanName);

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VpnServerConfigurationsResponseInner>, VpnServerConfigurationsResponseInner> beginList(
        String resourceGroupName, String virtualWanName, Context context);

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnServerConfigurationsResponseInner list(String resourceGroupName, String virtualWanName);

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnServerConfigurationsResponseInner list(String resourceGroupName, String virtualWanName, Context context);
}
