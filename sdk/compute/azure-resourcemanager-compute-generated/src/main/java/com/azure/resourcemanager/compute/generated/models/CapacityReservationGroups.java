// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of CapacityReservationGroups. */
public interface CapacityReservationGroups {
    /**
     * The operation to delete a capacity reservation group. This operation is allowed only if all the associated
     * resources are disassociated from the reservation group and all capacity reservations under the reservation group
     * have also been deleted. Please refer to https://aka.ms/CapacityReservation for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String capacityReservationGroupName);

    /**
     * The operation to delete a capacity reservation group. This operation is allowed only if all the associated
     * resources are disassociated from the reservation group and all capacity reservations under the reservation group
     * have also been deleted. Please refer to https://aka.ms/CapacityReservation for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String capacityReservationGroupName, Context context);

    /**
     * The operation that retrieves information about a capacity reservation group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     *     assigned to.
     */
    CapacityReservationGroup getByResourceGroup(String resourceGroupName, String capacityReservationGroupName);

    /**
     * The operation that retrieves information about a capacity reservation group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param expand The expand expression to apply on the operation. 'InstanceView' will retrieve the list of instance
     *     views of the capacity reservations under the capacity reservation group which is a snapshot of the runtime
     *     properties of a capacity reservation that is managed by the platform and can change outside of control plane
     *     operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     *     assigned to along with {@link Response}.
     */
    Response<CapacityReservationGroup> getByResourceGroupWithResponse(
        String resourceGroupName,
        String capacityReservationGroupName,
        CapacityReservationGroupInstanceViewTypes expand,
        Context context);

    /**
     * Lists all of the capacity reservation groups in the specified resource group. Use the nextLink property in the
     * response to get the next page of capacity reservation groups.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CapacityReservationGroup> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the capacity reservation groups in the specified resource group. Use the nextLink property in the
     * response to get the next page of capacity reservation groups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expand The expand expression to apply on the operation. Based on the expand param(s) specified we return
     *     Virtual Machine or ScaleSet VM Instance or both resource Ids which are associated to capacity reservation
     *     group in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CapacityReservationGroup> listByResourceGroup(
        String resourceGroupName, ExpandTypesForGetCapacityReservationGroups expand, Context context);

    /**
     * Lists all of the capacity reservation groups in the subscription. Use the nextLink property in the response to
     * get the next page of capacity reservation groups.
     *
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CapacityReservationGroup> list();

    /**
     * Lists all of the capacity reservation groups in the subscription. Use the nextLink property in the response to
     * get the next page of capacity reservation groups.
     *
     * @param expand The expand expression to apply on the operation. Based on the expand param(s) specified we return
     *     Virtual Machine or ScaleSet VM Instance or both resource Ids which are associated to capacity reservation
     *     group in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CapacityReservationGroup> list(ExpandTypesForGetCapacityReservationGroups expand, Context context);

    /**
     * The operation that retrieves information about a capacity reservation group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     *     assigned to along with {@link Response}.
     */
    CapacityReservationGroup getById(String id);

    /**
     * The operation that retrieves information about a capacity reservation group.
     *
     * @param id the resource ID.
     * @param expand The expand expression to apply on the operation. 'InstanceView' will retrieve the list of instance
     *     views of the capacity reservations under the capacity reservation group which is a snapshot of the runtime
     *     properties of a capacity reservation that is managed by the platform and can change outside of control plane
     *     operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     *     assigned to along with {@link Response}.
     */
    Response<CapacityReservationGroup> getByIdWithResponse(
        String id, CapacityReservationGroupInstanceViewTypes expand, Context context);

    /**
     * The operation to delete a capacity reservation group. This operation is allowed only if all the associated
     * resources are disassociated from the reservation group and all capacity reservations under the reservation group
     * have also been deleted. Please refer to https://aka.ms/CapacityReservation for more details.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The operation to delete a capacity reservation group. This operation is allowed only if all the associated
     * resources are disassociated from the reservation group and all capacity reservations under the reservation group
     * have also been deleted. Please refer to https://aka.ms/CapacityReservation for more details.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CapacityReservationGroup resource.
     *
     * @param name resource name.
     * @return the first stage of the new CapacityReservationGroup definition.
     */
    CapacityReservationGroup.DefinitionStages.Blank define(String name);
}
