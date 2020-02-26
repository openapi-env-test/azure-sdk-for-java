/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_03_01;

import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.resources.v2019_03_01.implementation.GenericResourceInner;
import com.microsoft.azure.management.resources.v2019_03_01.implementation.ResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Resources.
 */
public interface Resources extends HasInner<ResourcesInner> {
    /**
     * Get all the resources in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GenericResourceExpanded> listAsync();

    /**
     * Checks by ID whether a resource exists.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the format, /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceByIdAsync(String resourceId);

    /**
     * Deletes a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the format, /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteByIdAsync(String resourceId);

    /**
     * Create a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the format, /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
     * @param parameters Create or update resource parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GenericResource> createOrUpdateByIdAsync(String resourceId, GenericResourceInner parameters);

    /**
     * Updates a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the format, /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
     * @param parameters Update resource parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GenericResource> updateByIdAsync(String resourceId, GenericResourceInner parameters);

    /**
     * Gets a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the format, /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GenericResource> getByIdAsync(String resourceId);

    /**
     * Get all the resources for a resource group.
     *
     * @param resourceGroupName The resource group with the resources to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GenericResourceExpanded> listByResourceGroupAsync(final String resourceGroupName);

    /**
     * Moves resources from one resource group to another resource group.
     * The resources to move must be in the same source resource group. The target resource group may be in a different subscription. When moving resources, both the source group and the target group are locked for the duration of the operation. Write and delete operations are blocked on the groups until the move completes.
     *
     * @param sourceResourceGroupName The name of the resource group containing the resources to move.
     * @param parameters Parameters for moving resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable moveResourcesAsync(String sourceResourceGroupName, ResourcesMoveInfo parameters);

    /**
     * Validates whether resources can be moved from one resource group to another resource group.
     * This operation checks whether the specified resources can be moved to the target. The resources to move must be in the same source resource group. The target resource group may be in a different subscription. If validation succeeds, it returns HTTP response code 204 (no content). If validation fails, it returns HTTP response code 409 (Conflict) with an error message. Retrieve the URL in the Location header value to check the result of the long-running operation.
     *
     * @param sourceResourceGroupName The name of the resource group containing the resources to validate for move.
     * @param parameters Parameters for moving resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable validateMoveResourcesAsync(String sourceResourceGroupName, ResourcesMoveInfo parameters);

    /**
     * Checks whether a resource exists.
     *
     * @param resourceGroupName The name of the resource group containing the resource to check. The name is case insensitive.
     * @param resourceProviderNamespace The resource provider of the resource to check.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type.
     * @param resourceName The name of the resource to check whether it exists.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName);

    /**
     * Deletes a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource to delete. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type.
     * @param resourceName The name of the resource to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName);

    /**
     * Creates a resource.
     *
     * @param resourceGroupName The name of the resource group for the resource. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource to create.
     * @param resourceName The name of the resource to create.
     * @param parameters Parameters for creating or updating the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GenericResource> createOrUpdateAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, GenericResourceInner parameters);

    /**
     * Updates a resource.
     *
     * @param resourceGroupName The name of the resource group for the resource. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource to update.
     * @param resourceName The name of the resource to update.
     * @param parameters Parameters for updating the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GenericResource> updateAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, GenericResourceInner parameters);

    /**
     * Gets a resource.
     *
     * @param resourceGroupName The name of the resource group containing the resource to get. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GenericResource> getAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName);

}
