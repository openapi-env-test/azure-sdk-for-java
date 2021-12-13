// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.ImageInner;
import com.azure.resourcemanager.compute.generated.models.ImageUpdate;

/** An instance of this class provides access to all the operations defined in ImagesClient. */
public interface ImagesClient {
    /**
     * Create or update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Create Image operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImageInner>, ImageInner> beginCreateOrUpdate(
        String resourceGroupName, String imageName, ImageInner parameters);

    /**
     * Create or update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Create Image operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImageInner>, ImageInner> beginCreateOrUpdate(
        String resourceGroupName, String imageName, ImageInner parameters, Context context);

    /**
     * Create or update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Create Image operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImageInner createOrUpdate(String resourceGroupName, String imageName, ImageInner parameters);

    /**
     * Create or update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Create Image operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImageInner createOrUpdate(String resourceGroupName, String imageName, ImageInner parameters, Context context);

    /**
     * Update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Update Image operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImageInner>, ImageInner> beginUpdate(
        String resourceGroupName, String imageName, ImageUpdate parameters);

    /**
     * Update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Update Image operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImageInner>, ImageInner> beginUpdate(
        String resourceGroupName, String imageName, ImageUpdate parameters, Context context);

    /**
     * Update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Update Image operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImageInner update(String resourceGroupName, String imageName, ImageUpdate parameters);

    /**
     * Update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Update Image operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImageInner update(String resourceGroupName, String imageName, ImageUpdate parameters, Context context);

    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String imageName);

    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String imageName, Context context);

    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String imageName);

    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String imageName, Context context);

    /**
     * Gets an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImageInner getByResourceGroup(String resourceGroupName, String imageName);

    /**
     * Gets an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ImageInner> getByResourceGroupWithResponse(
        String resourceGroupName, String imageName, String expand, Context context);

    /**
     * Gets the list of images under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of images under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImageInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets the list of images under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of images under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImageInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Images in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImageInner> list();

    /**
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Images in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImageInner> list(Context context);
}
