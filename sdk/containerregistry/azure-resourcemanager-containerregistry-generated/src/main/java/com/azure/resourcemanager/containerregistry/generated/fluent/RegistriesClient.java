// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryListCredentialsResultInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryNameStatusInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryUsageListResultInner;
import com.azure.resourcemanager.containerregistry.generated.models.ImportImageParameters;
import com.azure.resourcemanager.containerregistry.generated.models.RegenerateCredentialParameters;
import com.azure.resourcemanager.containerregistry.generated.models.RegistryNameCheckRequest;
import com.azure.resourcemanager.containerregistry.generated.models.RegistryUpdateParameters;

/** An instance of this class provides access to all the operations defined in RegistriesClient. */
public interface RegistriesClient {
    /**
     * Copies an image to this container registry from the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param parameters The parameters specifying the image to copy and the source container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginImportImage(
        String resourceGroupName, String registryName, ImportImageParameters parameters);

    /**
     * Copies an image to this container registry from the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param parameters The parameters specifying the image to copy and the source container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginImportImage(
        String resourceGroupName, String registryName, ImportImageParameters parameters, Context context);

    /**
     * Copies an image to this container registry from the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param parameters The parameters specifying the image to copy and the source container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void importImage(String resourceGroupName, String registryName, ImportImageParameters parameters);

    /**
     * Copies an image to this container registry from the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param parameters The parameters specifying the image to copy and the source container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void importImage(String resourceGroupName, String registryName, ImportImageParameters parameters, Context context);

    /**
     * Checks whether the container registry name is available for use. The name must contain only alphanumeric
     * characters, be globally unique, and between 5 and 50 characters in length.
     *
     * @param registryNameCheckRequest The object containing information for the availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a container registry name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistryNameStatusInner checkNameAvailability(RegistryNameCheckRequest registryNameCheckRequest);

    /**
     * Checks whether the container registry name is available for use. The name must contain only alphanumeric
     * characters, be globally unique, and between 5 and 50 characters in length.
     *
     * @param registryNameCheckRequest The object containing information for the availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a container registry name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RegistryNameStatusInner> checkNameAvailabilityWithResponse(
        RegistryNameCheckRequest registryNameCheckRequest, Context context);

    /**
     * Gets the properties of the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistryInner getByResourceGroup(String resourceGroupName, String registryName);

    /**
     * Gets the properties of the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RegistryInner> getByResourceGroupWithResponse(
        String resourceGroupName, String registryName, Context context);

    /**
     * Creates a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param registry The parameters for creating a container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RegistryInner>, RegistryInner> beginCreate(
        String resourceGroupName, String registryName, RegistryInner registry);

    /**
     * Creates a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param registry The parameters for creating a container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RegistryInner>, RegistryInner> beginCreate(
        String resourceGroupName, String registryName, RegistryInner registry, Context context);

    /**
     * Creates a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param registry The parameters for creating a container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistryInner create(String resourceGroupName, String registryName, RegistryInner registry);

    /**
     * Creates a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param registry The parameters for creating a container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistryInner create(String resourceGroupName, String registryName, RegistryInner registry, Context context);

    /**
     * Deletes a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String registryName);

    /**
     * Deletes a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String registryName, Context context);

    /**
     * Deletes a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName);

    /**
     * Deletes a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, Context context);

    /**
     * Updates a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param registryUpdateParameters The parameters for updating a container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RegistryInner>, RegistryInner> beginUpdate(
        String resourceGroupName, String registryName, RegistryUpdateParameters registryUpdateParameters);

    /**
     * Updates a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param registryUpdateParameters The parameters for updating a container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RegistryInner>, RegistryInner> beginUpdate(
        String resourceGroupName,
        String registryName,
        RegistryUpdateParameters registryUpdateParameters,
        Context context);

    /**
     * Updates a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param registryUpdateParameters The parameters for updating a container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistryInner update(
        String resourceGroupName, String registryName, RegistryUpdateParameters registryUpdateParameters);

    /**
     * Updates a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param registryUpdateParameters The parameters for updating a container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistryInner update(
        String resourceGroupName,
        String registryName,
        RegistryUpdateParameters registryUpdateParameters,
        Context context);

    /**
     * Lists all the container registries under the specified resource group.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list container registries.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RegistryInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the container registries under the specified resource group.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list container registries.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RegistryInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the container registries under the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list container registries.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RegistryInner> list();

    /**
     * Lists all the container registries under the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list container registries.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RegistryInner> list(Context context);

    /**
     * Lists the login credentials for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListCredentials operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistryListCredentialsResultInner listCredentials(String resourceGroupName, String registryName);

    /**
     * Lists the login credentials for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListCredentials operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RegistryListCredentialsResultInner> listCredentialsWithResponse(
        String resourceGroupName, String registryName, Context context);

    /**
     * Regenerates one of the login credentials for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param regenerateCredentialParameters Specifies name of the password which should be regenerated -- password or
     *     password2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListCredentials operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistryListCredentialsResultInner regenerateCredential(
        String resourceGroupName, String registryName, RegenerateCredentialParameters regenerateCredentialParameters);

    /**
     * Regenerates one of the login credentials for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param regenerateCredentialParameters Specifies name of the password which should be regenerated -- password or
     *     password2.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListCredentials operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RegistryListCredentialsResultInner> regenerateCredentialWithResponse(
        String resourceGroupName,
        String registryName,
        RegenerateCredentialParameters regenerateCredentialParameters,
        Context context);

    /**
     * Gets the quota usages for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota usages for the specified container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistryUsageListResultInner listUsages(String resourceGroupName, String registryName);

    /**
     * Gets the quota usages for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota usages for the specified container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RegistryUsageListResultInner> listUsagesWithResponse(
        String resourceGroupName, String registryName, Context context);

    /**
     * Lists the private link resources for a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list private link resources for a container registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> listPrivateLinkResources(String resourceGroupName, String registryName);

    /**
     * Lists the private link resources for a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list private link resources for a container registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> listPrivateLinkResources(
        String resourceGroupName, String registryName, Context context);
}
