// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.EffectiveNetworkSecurityGroupListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.EffectiveRouteListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceInner;

/** An instance of this class provides access to all the operations defined in NetworkInterfacesClient. */
public interface NetworkInterfacesClient {
    /**
     * Deletes the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkInterfaceName);

    /**
     * Deletes the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkInterfaceName, Context context);

    /**
     * Deletes the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkInterfaceName);

    /**
     * Deletes the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkInterfaceName, Context context);

    /**
     * Gets information about the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkInterfaceInner getByResourceGroup(String resourceGroupName, String networkInterfaceName);

    /**
     * Gets information about the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkInterfaceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String networkInterfaceName, String expand, Context context);

    /**
     * Creates or updates a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param parameters Parameters supplied to the create or update network interface operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a network interface in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkInterfaceInner>, NetworkInterfaceInner> beginCreateOrUpdate(
        String resourceGroupName, String networkInterfaceName, NetworkInterfaceInner parameters);

    /**
     * Creates or updates a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param parameters Parameters supplied to the create or update network interface operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a network interface in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkInterfaceInner>, NetworkInterfaceInner> beginCreateOrUpdate(
        String resourceGroupName, String networkInterfaceName, NetworkInterfaceInner parameters, Context context);

    /**
     * Creates or updates a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param parameters Parameters supplied to the create or update network interface operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a network interface in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkInterfaceInner createOrUpdate(
        String resourceGroupName, String networkInterfaceName, NetworkInterfaceInner parameters);

    /**
     * Creates or updates a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param parameters Parameters supplied to the create or update network interface operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a network interface in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkInterfaceInner createOrUpdate(
        String resourceGroupName, String networkInterfaceName, NetworkInterfaceInner parameters, Context context);

    /**
     * Gets all network interfaces in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkInterfaceInner> list();

    /**
     * Gets all network interfaces in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkInterfaceInner> list(Context context);

    /**
     * Gets all network interfaces in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkInterfaceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all network interfaces in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkInterfaceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all route tables applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables applied to a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<EffectiveRouteListResultInner>, EffectiveRouteListResultInner> beginGetEffectiveRouteTable(
        String resourceGroupName, String networkInterfaceName);

    /**
     * Gets all route tables applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables applied to a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<EffectiveRouteListResultInner>, EffectiveRouteListResultInner> beginGetEffectiveRouteTable(
        String resourceGroupName, String networkInterfaceName, Context context);

    /**
     * Gets all route tables applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables applied to a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EffectiveRouteListResultInner getEffectiveRouteTable(String resourceGroupName, String networkInterfaceName);

    /**
     * Gets all route tables applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables applied to a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EffectiveRouteListResultInner getEffectiveRouteTable(
        String resourceGroupName, String networkInterfaceName, Context context);

    /**
     * Gets all network security groups applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups applied to a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<EffectiveNetworkSecurityGroupListResultInner>, EffectiveNetworkSecurityGroupListResultInner>
        beginListEffectiveNetworkSecurityGroups(String resourceGroupName, String networkInterfaceName);

    /**
     * Gets all network security groups applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups applied to a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<EffectiveNetworkSecurityGroupListResultInner>, EffectiveNetworkSecurityGroupListResultInner>
        beginListEffectiveNetworkSecurityGroups(String resourceGroupName, String networkInterfaceName, Context context);

    /**
     * Gets all network security groups applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups applied to a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EffectiveNetworkSecurityGroupListResultInner listEffectiveNetworkSecurityGroups(
        String resourceGroupName, String networkInterfaceName);

    /**
     * Gets all network security groups applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups applied to a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EffectiveNetworkSecurityGroupListResultInner listEffectiveNetworkSecurityGroups(
        String resourceGroupName, String networkInterfaceName, Context context);

    /**
     * Gets information about all network interfaces in a virtual machine in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all network interfaces in a virtual machine in a virtual machine scale set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkInterfaceInner> listVirtualMachineScaleSetVMNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex);

    /**
     * Gets information about all network interfaces in a virtual machine in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all network interfaces in a virtual machine in a virtual machine scale set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkInterfaceInner> listVirtualMachineScaleSetVMNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, Context context);

    /**
     * Gets all network interfaces in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a virtual machine scale set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkInterfaceInner> listVirtualMachineScaleSetNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName);

    /**
     * Gets all network interfaces in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a virtual machine scale set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkInterfaceInner> listVirtualMachineScaleSetNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName, Context context);

    /**
     * Get the specified network interface in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface in a virtual machine scale set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkInterfaceInner getVirtualMachineScaleSetNetworkInterface(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName);

    /**
     * Get the specified network interface in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface in a virtual machine scale set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkInterfaceInner> getVirtualMachineScaleSetNetworkInterfaceWithResponse(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String expand,
        Context context);
}
