// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SecretValues. */
public interface SecretValues {
    /**
     * Gets the specified secret value resource.
     *
     * <p>Get the information about the specified named secret value resources. The information does not include the
     * actual value of the secret.
     *
     * @param resourceGroupName Azure resource group name.
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the specified named secret value resources along with {@link Response}.
     */
    Response<SecretValueResourceDescription> getWithResponse(
        String resourceGroupName, String secretResourceName, String secretValueResourceName, Context context);

    /**
     * Gets the specified secret value resource.
     *
     * <p>Get the information about the specified named secret value resources. The information does not include the
     * actual value of the secret.
     *
     * @param resourceGroupName Azure resource group name.
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the specified named secret value resources.
     */
    SecretValueResourceDescription get(
        String resourceGroupName, String secretResourceName, String secretValueResourceName);

    /**
     * Deletes the specified value of the named secret resource.
     *
     * <p>Deletes the secret value resource identified by the name. The name of the resource is typically the version
     * associated with that value. Deletion will fail if the specified value is in use.
     *
     * @param resourceGroupName Azure resource group name.
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String secretResourceName, String secretValueResourceName, Context context);

    /**
     * Deletes the specified value of the named secret resource.
     *
     * <p>Deletes the secret value resource identified by the name. The name of the resource is typically the version
     * associated with that value. Deletion will fail if the specified value is in use.
     *
     * @param resourceGroupName Azure resource group name.
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String secretResourceName, String secretValueResourceName);

    /**
     * List names of all values of the specified secret resource.
     *
     * <p>Gets information about all secret value resources of the specified secret resource. The information includes
     * the names of the secret value resources, but not the actual values.
     *
     * @param resourceGroupName Azure resource group name.
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all secret value resources of the specified secret resource as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<SecretValueResourceDescription> list(String resourceGroupName, String secretResourceName);

    /**
     * List names of all values of the specified secret resource.
     *
     * <p>Gets information about all secret value resources of the specified secret resource. The information includes
     * the names of the secret value resources, but not the actual values.
     *
     * @param resourceGroupName Azure resource group name.
     * @param secretResourceName The name of the secret resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all secret value resources of the specified secret resource as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<SecretValueResourceDescription> list(
        String resourceGroupName, String secretResourceName, Context context);

    /**
     * Lists the specified value of the secret resource.
     *
     * <p>Lists the decrypted value of the specified named value of the secret resource. This is a privileged operation.
     *
     * @param resourceGroupName Azure resource group name.
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type represents the unencrypted value of the secret along with {@link Response}.
     */
    Response<SecretValue> listValueWithResponse(
        String resourceGroupName, String secretResourceName, String secretValueResourceName, Context context);

    /**
     * Lists the specified value of the secret resource.
     *
     * <p>Lists the decrypted value of the specified named value of the secret resource. This is a privileged operation.
     *
     * @param resourceGroupName Azure resource group name.
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type represents the unencrypted value of the secret.
     */
    SecretValue listValue(String resourceGroupName, String secretResourceName, String secretValueResourceName);

    /**
     * Gets the specified secret value resource.
     *
     * <p>Get the information about the specified named secret value resources. The information does not include the
     * actual value of the secret.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the specified named secret value resources along with {@link Response}.
     */
    SecretValueResourceDescription getById(String id);

    /**
     * Gets the specified secret value resource.
     *
     * <p>Get the information about the specified named secret value resources. The information does not include the
     * actual value of the secret.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the specified named secret value resources along with {@link Response}.
     */
    Response<SecretValueResourceDescription> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified value of the named secret resource.
     *
     * <p>Deletes the secret value resource identified by the name. The name of the resource is typically the version
     * associated with that value. Deletion will fail if the specified value is in use.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified value of the named secret resource.
     *
     * <p>Deletes the secret value resource identified by the name. The name of the resource is typically the version
     * associated with that value. Deletion will fail if the specified value is in use.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.servicefabricmesh.models.ErrorErrorModelException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SecretValueResourceDescription resource.
     *
     * @param name resource name.
     * @return the first stage of the new SecretValueResourceDescription definition.
     */
    SecretValueResourceDescription.DefinitionStages.Blank define(String name);
}
