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
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in PublicIpAddressesClient. */
public interface PublicIpAddressesClient {
    /**
     * Deletes the specified public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String publicIpAddressName);

    /**
     * Deletes the specified public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String publicIpAddressName, Context context);

    /**
     * Deletes the specified public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String publicIpAddressName);

    /**
     * Deletes the specified public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String publicIpAddressName, Context context);

    /**
     * Gets the specified public IP address in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PublicIpAddressInner getByResourceGroup(String resourceGroupName, String publicIpAddressName);

    /**
     * Gets the specified public IP address in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PublicIpAddressInner> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpAddressName, String expand, Context context);

    /**
     * Creates or updates a static or dynamic public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param parameters Parameters supplied to the create or update public IP address operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP address resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PublicIpAddressInner>, PublicIpAddressInner> beginCreateOrUpdate(
        String resourceGroupName, String publicIpAddressName, PublicIpAddressInner parameters);

    /**
     * Creates or updates a static or dynamic public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param parameters Parameters supplied to the create or update public IP address operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP address resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PublicIpAddressInner>, PublicIpAddressInner> beginCreateOrUpdate(
        String resourceGroupName, String publicIpAddressName, PublicIpAddressInner parameters, Context context);

    /**
     * Creates or updates a static or dynamic public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param parameters Parameters supplied to the create or update public IP address operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP address resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PublicIpAddressInner createOrUpdate(
        String resourceGroupName, String publicIpAddressName, PublicIpAddressInner parameters);

    /**
     * Creates or updates a static or dynamic public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param parameters Parameters supplied to the create or update public IP address operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP address resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PublicIpAddressInner createOrUpdate(
        String resourceGroupName, String publicIpAddressName, PublicIpAddressInner parameters, Context context);

    /**
     * Updates public IP address tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param parameters Parameters supplied to update public IP address tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP address resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PublicIpAddressInner>, PublicIpAddressInner> beginUpdateTags(
        String resourceGroupName, String publicIpAddressName, TagsObject parameters);

    /**
     * Updates public IP address tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param parameters Parameters supplied to update public IP address tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP address resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PublicIpAddressInner>, PublicIpAddressInner> beginUpdateTags(
        String resourceGroupName, String publicIpAddressName, TagsObject parameters, Context context);

    /**
     * Updates public IP address tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param parameters Parameters supplied to update public IP address tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP address resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PublicIpAddressInner updateTags(String resourceGroupName, String publicIpAddressName, TagsObject parameters);

    /**
     * Updates public IP address tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param parameters Parameters supplied to update public IP address tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP address resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PublicIpAddressInner updateTags(
        String resourceGroupName, String publicIpAddressName, TagsObject parameters, Context context);

    /**
     * Gets all the public IP addresses in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP addresses in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpAddressInner> list();

    /**
     * Gets all the public IP addresses in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP addresses in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpAddressInner> list(Context context);

    /**
     * Gets all public IP addresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP addresses in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpAddressInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all public IP addresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP addresses in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpAddressInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets information about all public IP addresses on a virtual machine scale set level.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses on a virtual machine scale set level.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpAddressInner> listVirtualMachineScaleSetPublicIpAddresses(
        String resourceGroupName, String virtualMachineScaleSetName);

    /**
     * Gets information about all public IP addresses on a virtual machine scale set level.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses on a virtual machine scale set level.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpAddressInner> listVirtualMachineScaleSetPublicIpAddresses(
        String resourceGroupName, String virtualMachineScaleSetName, Context context);

    /**
     * Gets information about all public IP addresses in a virtual machine IP configuration in a virtual machine scale
     * set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The network interface name.
     * @param ipConfigurationName The IP configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses in a virtual machine IP configuration in a virtual machine
     *     scale set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpAddressInner> listVirtualMachineScaleSetVMPublicIpAddresses(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName);

    /**
     * Gets information about all public IP addresses in a virtual machine IP configuration in a virtual machine scale
     * set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The network interface name.
     * @param ipConfigurationName The IP configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses in a virtual machine IP configuration in a virtual machine
     *     scale set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpAddressInner> listVirtualMachineScaleSetVMPublicIpAddresses(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        Context context);

    /**
     * Get the specified public IP address in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the IP configuration.
     * @param publicIpAddressName The name of the public IP Address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a virtual machine scale set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PublicIpAddressInner getVirtualMachineScaleSetPublicIpAddress(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName);

    /**
     * Get the specified public IP address in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the IP configuration.
     * @param publicIpAddressName The name of the public IP Address.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a virtual machine scale set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PublicIpAddressInner> getVirtualMachineScaleSetPublicIpAddressWithResponse(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName,
        String expand,
        Context context);
}
