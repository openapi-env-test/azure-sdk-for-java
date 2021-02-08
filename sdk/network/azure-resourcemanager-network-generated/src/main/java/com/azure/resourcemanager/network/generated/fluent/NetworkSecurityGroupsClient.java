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
import com.azure.resourcemanager.network.generated.fluent.models.NetworkSecurityGroupInner;

/** An instance of this class provides access to all the operations defined in NetworkSecurityGroupsClient. */
public interface NetworkSecurityGroupsClient {
    /**
     * The Delete NetworkSecurityGroup operation deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkSecurityGroupName);

    /**
     * The Delete NetworkSecurityGroup operation deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkSecurityGroupName, Context context);

    /**
     * The Delete NetworkSecurityGroup operation deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkSecurityGroupName);

    /**
     * The Delete NetworkSecurityGroup operation deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkSecurityGroupName, Context context);

    /**
     * The Get NetworkSecurityGroups operation retrieves information about the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkSecurityGroupInner getByResourceGroup(String resourceGroupName, String networkSecurityGroupName);

    /**
     * The Get NetworkSecurityGroups operation retrieves information about the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkSecurityGroupInner> getByResourceGroupWithResponse(
        String resourceGroupName, String networkSecurityGroupName, Context context);

    /**
     * The Put NetworkSecurityGroup operation creates/updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create/update Network Security Group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkSecurityGroupInner>, NetworkSecurityGroupInner> beginCreateOrUpdate(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroupInner parameters);

    /**
     * The Put NetworkSecurityGroup operation creates/updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create/update Network Security Group operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkSecurityGroupInner>, NetworkSecurityGroupInner> beginCreateOrUpdate(
        String resourceGroupName,
        String networkSecurityGroupName,
        NetworkSecurityGroupInner parameters,
        Context context);

    /**
     * The Put NetworkSecurityGroup operation creates/updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create/update Network Security Group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkSecurityGroupInner createOrUpdate(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroupInner parameters);

    /**
     * The Put NetworkSecurityGroup operation creates/updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create/update Network Security Group operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkSecurityGroupInner createOrUpdate(
        String resourceGroupName,
        String networkSecurityGroupName,
        NetworkSecurityGroupInner parameters,
        Context context);

    /**
     * The list NetworkSecurityGroups returns all network security groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkSecurityGroups Api service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkSecurityGroupInner> list();

    /**
     * The list NetworkSecurityGroups returns all network security groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkSecurityGroups Api service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkSecurityGroupInner> list(Context context);

    /**
     * The list NetworkSecurityGroups returns all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkSecurityGroups Api service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkSecurityGroupInner> listByResourceGroup(String resourceGroupName);

    /**
     * The list NetworkSecurityGroups returns all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkSecurityGroups Api service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkSecurityGroupInner> listByResourceGroup(String resourceGroupName, Context context);
}
