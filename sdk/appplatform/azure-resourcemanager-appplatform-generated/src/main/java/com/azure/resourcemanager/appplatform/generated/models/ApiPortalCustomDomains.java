// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ApiPortalCustomDomains. */
public interface ApiPortalCustomDomains {
    /**
     * Get the API portal custom domain.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param apiPortalName The name of API portal.
     * @param domainName The name of the API portal custom domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API portal custom domain.
     */
    ApiPortalCustomDomainResource get(
        String resourceGroupName, String serviceName, String apiPortalName, String domainName);

    /**
     * Get the API portal custom domain.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param apiPortalName The name of API portal.
     * @param domainName The name of the API portal custom domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API portal custom domain along with {@link Response}.
     */
    Response<ApiPortalCustomDomainResource> getWithResponse(
        String resourceGroupName, String serviceName, String apiPortalName, String domainName, Context context);

    /**
     * Delete the API portal custom domain.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param apiPortalName The name of API portal.
     * @param domainName The name of the API portal custom domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String apiPortalName, String domainName);

    /**
     * Delete the API portal custom domain.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param apiPortalName The name of API portal.
     * @param domainName The name of the API portal custom domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String apiPortalName, String domainName, Context context);

    /**
     * Handle requests to list all API portal custom domains.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param apiPortalName The name of API portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of API portal custom domain resources and a possible link for next set as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<ApiPortalCustomDomainResource> list(
        String resourceGroupName, String serviceName, String apiPortalName);

    /**
     * Handle requests to list all API portal custom domains.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param apiPortalName The name of API portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of API portal custom domain resources and a possible link for next set as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<ApiPortalCustomDomainResource> list(
        String resourceGroupName, String serviceName, String apiPortalName, Context context);

    /**
     * Get the API portal custom domain.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API portal custom domain along with {@link Response}.
     */
    ApiPortalCustomDomainResource getById(String id);

    /**
     * Get the API portal custom domain.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API portal custom domain along with {@link Response}.
     */
    Response<ApiPortalCustomDomainResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete the API portal custom domain.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete the API portal custom domain.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ApiPortalCustomDomainResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ApiPortalCustomDomainResource definition.
     */
    ApiPortalCustomDomainResource.DefinitionStages.Blank define(String name);
}
