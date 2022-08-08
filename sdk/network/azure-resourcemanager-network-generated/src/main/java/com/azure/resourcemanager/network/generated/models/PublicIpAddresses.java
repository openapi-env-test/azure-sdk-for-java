// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PublicIpAddresses. */
public interface PublicIpAddresses {
    /**
     * Gets information about all public IP addresses on a cloud service level.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses on a cloud service level as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<PublicIpAddress> listCloudServicePublicIpAddresses(String resourceGroupName, String cloudServiceName);

    /**
     * Gets information about all public IP addresses on a cloud service level.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses on a cloud service level as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<PublicIpAddress> listCloudServicePublicIpAddresses(
        String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Gets information about all public IP addresses in a role instance IP configuration in a cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @param roleInstanceName The name of role instance.
     * @param networkInterfaceName The network interface name.
     * @param ipConfigurationName The IP configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses in a role instance IP configuration in a cloud service as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<PublicIpAddress> listCloudServiceRoleInstancePublicIpAddresses(
        String resourceGroupName,
        String cloudServiceName,
        String roleInstanceName,
        String networkInterfaceName,
        String ipConfigurationName);

    /**
     * Gets information about all public IP addresses in a role instance IP configuration in a cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @param roleInstanceName The name of role instance.
     * @param networkInterfaceName The network interface name.
     * @param ipConfigurationName The IP configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses in a role instance IP configuration in a cloud service as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<PublicIpAddress> listCloudServiceRoleInstancePublicIpAddresses(
        String resourceGroupName,
        String cloudServiceName,
        String roleInstanceName,
        String networkInterfaceName,
        String ipConfigurationName,
        Context context);

    /**
     * Get the specified public IP address in a cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @param roleInstanceName The role instance name.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the IP configuration.
     * @param publicIpAddressName The name of the public IP Address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a cloud service.
     */
    PublicIpAddress getCloudServicePublicIpAddress(
        String resourceGroupName,
        String cloudServiceName,
        String roleInstanceName,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName);

    /**
     * Get the specified public IP address in a cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @param roleInstanceName The role instance name.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the IP configuration.
     * @param publicIpAddressName The name of the public IP Address.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a cloud service along with {@link Response}.
     */
    Response<PublicIpAddress> getCloudServicePublicIpAddressWithResponse(
        String resourceGroupName,
        String cloudServiceName,
        String roleInstanceName,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName,
        String expand,
        Context context);

    /**
     * Deletes the specified public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String publicIpAddressName);

    /**
     * Deletes the specified public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String publicIpAddressName, Context context);

    /**
     * Gets the specified public IP address in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a specified resource group.
     */
    PublicIpAddress getByResourceGroup(String resourceGroupName, String publicIpAddressName);

    /**
     * Gets the specified public IP address in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a specified resource group along with {@link Response}.
     */
    Response<PublicIpAddress> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpAddressName, String expand, Context context);

    /**
     * Gets all the public IP addresses in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP addresses in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PublicIpAddress> list();

    /**
     * Gets all the public IP addresses in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP addresses in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PublicIpAddress> list(Context context);

    /**
     * Gets all public IP addresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP addresses in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all public IP addresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP addresses in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets information about all public IP addresses on a virtual machine scale set level.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses on a virtual machine scale set level as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<PublicIpAddress> listVirtualMachineScaleSetPublicIpAddresses(
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
     * @return information about all public IP addresses on a virtual machine scale set level as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<PublicIpAddress> listVirtualMachineScaleSetPublicIpAddresses(
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
     *     scale set as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PublicIpAddress> listVirtualMachineScaleSetVMPublicIpAddresses(
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
     *     scale set as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PublicIpAddress> listVirtualMachineScaleSetVMPublicIpAddresses(
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
    PublicIpAddress getVirtualMachineScaleSetPublicIpAddress(
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
     * @return the specified public IP address in a virtual machine scale set along with {@link Response}.
     */
    Response<PublicIpAddress> getVirtualMachineScaleSetPublicIpAddressWithResponse(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName,
        String expand,
        Context context);

    /**
     * Gets the specified public IP address in a specified resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a specified resource group along with {@link Response}.
     */
    PublicIpAddress getById(String id);

    /**
     * Gets the specified public IP address in a specified resource group.
     *
     * @param id the resource ID.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a specified resource group along with {@link Response}.
     */
    Response<PublicIpAddress> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Deletes the specified public IP address.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified public IP address.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PublicIpAddress resource.
     *
     * @param name resource name.
     * @return the first stage of the new PublicIpAddress definition.
     */
    PublicIpAddress.DefinitionStages.Blank define(String name);
}
