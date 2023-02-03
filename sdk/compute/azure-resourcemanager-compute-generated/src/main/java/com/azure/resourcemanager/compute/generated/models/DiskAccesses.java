// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.PrivateEndpointConnectionInner;

/** Resource collection API of DiskAccesses. */
public interface DiskAccesses {
    /**
     * Gets information about a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk access resource along with {@link Response}.
     */
    Response<DiskAccess> getByResourceGroupWithResponse(
        String resourceGroupName, String diskAccessName, Context context);

    /**
     * Gets information about a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk access resource.
     */
    DiskAccess getByResourceGroup(String resourceGroupName, String diskAccessName);

    /**
     * Deletes a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String diskAccessName);

    /**
     * Deletes a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String diskAccessName, Context context);

    /**
     * Lists all the disk access resources under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskAccess> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the disk access resources under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskAccess> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the disk access resources under a subscription.
     *
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskAccess> list();

    /**
     * Lists all the disk access resources under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskAccess> list(Context context);

    /**
     * Gets the private link resources possible under disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources possible under disk access resource along with {@link Response}.
     */
    Response<PrivateLinkResourceListResult> getPrivateLinkResourcesWithResponse(
        String resourceGroupName, String diskAccessName, Context context);

    /**
     * Gets the private link resources possible under disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources possible under disk access resource.
     */
    PrivateLinkResourceListResult getPrivateLinkResources(String resourceGroupName, String diskAccessName);

    /**
     * Approve or reject a private endpoint connection under disk access resource, this can't be used to create a new
     * private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection private endpoint connection object supplied in the body of the Put private
     *     endpoint connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    PrivateEndpointConnection updateAPrivateEndpointConnection(
        String resourceGroupName,
        String diskAccessName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection);

    /**
     * Approve or reject a private endpoint connection under disk access resource, this can't be used to create a new
     * private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection private endpoint connection object supplied in the body of the Put private
     *     endpoint connection operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    PrivateEndpointConnection updateAPrivateEndpointConnection(
        String resourceGroupName,
        String diskAccessName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection,
        Context context);

    /**
     * Gets information about a private endpoint connection under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a private endpoint connection under a disk access resource along with {@link Response}.
     */
    Response<PrivateEndpointConnection> getAPrivateEndpointConnectionWithResponse(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName, Context context);

    /**
     * Gets information about a private endpoint connection under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a private endpoint connection under a disk access resource.
     */
    PrivateEndpointConnection getAPrivateEndpointConnection(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAPrivateEndpointConnection(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAPrivateEndpointConnection(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName, Context context);

    /**
     * List information about private endpoint connections under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnection> listPrivateEndpointConnections(
        String resourceGroupName, String diskAccessName);

    /**
     * List information about private endpoint connections under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The maximum
     *     name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnection> listPrivateEndpointConnections(
        String resourceGroupName, String diskAccessName, Context context);

    /**
     * Gets information about a disk access resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk access resource along with {@link Response}.
     */
    DiskAccess getById(String id);

    /**
     * Gets information about a disk access resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk access resource along with {@link Response}.
     */
    Response<DiskAccess> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a disk access resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a disk access resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DiskAccess resource.
     *
     * @param name resource name.
     * @return the first stage of the new DiskAccess definition.
     */
    DiskAccess.DefinitionStages.Blank define(String name);
}
