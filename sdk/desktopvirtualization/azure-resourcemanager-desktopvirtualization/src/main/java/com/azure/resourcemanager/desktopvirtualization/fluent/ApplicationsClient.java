// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationInner;
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationPatch;

/** An instance of this class provides access to all the operations defined in ApplicationsClient. */
public interface ApplicationsClient {
    /**
     * Get an application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param applicationName The name of the application within the specified application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInner get(String resourceGroupName, String applicationGroupName, String applicationName);

    /**
     * Get an application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param applicationName The name of the application within the specified application group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInner> getWithResponse(
        String resourceGroupName, String applicationGroupName, String applicationName, Context context);

    /**
     * Create or update an application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param applicationName The name of the application within the specified application group.
     * @param application Object containing Application definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schema for Application properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInner createOrUpdate(
        String resourceGroupName, String applicationGroupName, String applicationName, ApplicationInner application);

    /**
     * Create or update an application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param applicationName The name of the application within the specified application group.
     * @param application Object containing Application definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schema for Application properties along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String applicationGroupName,
        String applicationName,
        ApplicationInner application,
        Context context);

    /**
     * Remove an application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param applicationName The name of the application within the specified application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String applicationGroupName, String applicationName);

    /**
     * Remove an application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param applicationName The name of the application within the specified application group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String applicationGroupName, String applicationName, Context context);

    /**
     * Update an application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param applicationName The name of the application within the specified application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schema for Application properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInner update(String resourceGroupName, String applicationGroupName, String applicationName);

    /**
     * Update an application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param applicationName The name of the application within the specified application group.
     * @param application Object containing Application definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schema for Application properties along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInner> updateWithResponse(
        String resourceGroupName,
        String applicationGroupName,
        String applicationName,
        ApplicationPatch application,
        Context context);

    /**
     * List applications.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return applicationList as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationInner> list(String resourceGroupName, String applicationGroupName);

    /**
     * List applications.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return applicationList as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationInner> list(String resourceGroupName, String applicationGroupName, Context context);
}
