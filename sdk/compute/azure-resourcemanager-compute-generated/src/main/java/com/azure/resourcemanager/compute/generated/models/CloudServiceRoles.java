// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of CloudServiceRoles. */
public interface CloudServiceRoles {
    /**
     * Gets a role from a cloud service.
     *
     * @param roleName Name of the role.
     * @param resourceGroupName The resourceGroupName parameter.
     * @param cloudServiceName The cloudServiceName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role from a cloud service.
     */
    CloudServiceRole get(String roleName, String resourceGroupName, String cloudServiceName);

    /**
     * Gets a role from a cloud service.
     *
     * @param roleName Name of the role.
     * @param resourceGroupName The resourceGroupName parameter.
     * @param cloudServiceName The cloudServiceName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role from a cloud service along with {@link Response}.
     */
    Response<CloudServiceRole> getWithResponse(
        String roleName, String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Gets a list of all roles in a cloud service. Use nextLink property in the response to get the next page of roles.
     * Do this till nextLink is null to fetch all the roles.
     *
     * @param resourceGroupName The resourceGroupName parameter.
     * @param cloudServiceName The cloudServiceName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all roles in a cloud service as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CloudServiceRole> list(String resourceGroupName, String cloudServiceName);

    /**
     * Gets a list of all roles in a cloud service. Use nextLink property in the response to get the next page of roles.
     * Do this till nextLink is null to fetch all the roles.
     *
     * @param resourceGroupName The resourceGroupName parameter.
     * @param cloudServiceName The cloudServiceName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all roles in a cloud service as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CloudServiceRole> list(String resourceGroupName, String cloudServiceName, Context context);
}
