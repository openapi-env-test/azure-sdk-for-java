// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.contoso_cdn.fluent.models.SecretInner;
import com.azure.resourcemanager.contoso_cdn.models.SecretProperties;

/** An instance of this class provides access to all the operations defined in SecretsClient. */
public interface SecretsClient {
    /**
     * Lists existing AzureFrontDoor secrets.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list secrets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecretInner> listByProfile(String resourceGroupName, String profileName);

    /**
     * Lists existing AzureFrontDoor secrets.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list secrets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecretInner> listByProfile(String resourceGroupName, String profileName, Context context);

    /**
     * Gets an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing Secret within a profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner get(String resourceGroupName, String profileName, String secretName);

    /**
     * Gets an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing Secret within a profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecretInner> getWithResponse(
        String resourceGroupName, String profileName, String secretName, Context context);

    /**
     * Creates a new Secret within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @param secret The Secret properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Secret name mapping to the any Secret or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SecretInner>, SecretInner> beginCreate(
        String resourceGroupName, String profileName, String secretName, SecretInner secret);

    /**
     * Creates a new Secret within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @param secret The Secret properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Secret name mapping to the any Secret or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SecretInner>, SecretInner> beginCreate(
        String resourceGroupName, String profileName, String secretName, SecretInner secret, Context context);

    /**
     * Creates a new Secret within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @param secret The Secret properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Secret name mapping to the any Secret or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner create(String resourceGroupName, String profileName, String secretName, SecretInner secret);

    /**
     * Creates a new Secret within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @param secret The Secret properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Secret name mapping to the any Secret or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner create(
        String resourceGroupName, String profileName, String secretName, SecretInner secret, Context context);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @param secretProperties Secret properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Secret name mapping to the any Secret or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SecretInner>, SecretInner> beginUpdate(
        String resourceGroupName, String profileName, String secretName, SecretProperties secretProperties);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @param secretProperties Secret properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Secret name mapping to the any Secret or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SecretInner>, SecretInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String secretName,
        SecretProperties secretProperties,
        Context context);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @param secretProperties Secret properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Secret name mapping to the any Secret or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner update(
        String resourceGroupName, String profileName, String secretName, SecretProperties secretProperties);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @param secretProperties Secret properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Secret name mapping to the any Secret or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner update(
        String resourceGroupName,
        String profileName,
        String secretName,
        SecretProperties secretProperties,
        Context context);

    /**
     * Deletes an existing Secret within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String profileName, String secretName);

    /**
     * Deletes an existing Secret within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String secretName, Context context);

    /**
     * Deletes an existing Secret within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String secretName);

    /**
     * Deletes an existing Secret within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param secretName Name of the Secret under the profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String secretName, Context context);
}
