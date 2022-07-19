// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewInstanceProperties;

/** Resource collection API of ScopeAccessReviewInstances. */
public interface ScopeAccessReviewInstances {
    /**
     * Get access review instances.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AccessReviewInstance> list(String scope, String scheduleDefinitionId);

    /**
     * Get access review instances.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AccessReviewInstance> list(String scope, String scheduleDefinitionId, String filter, Context context);

    /**
     * Get access review instances.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances.
     */
    AccessReviewInstance getById(String scope, String scheduleDefinitionId, String id);

    /**
     * Get access review instances.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances along with {@link Response}.
     */
    Response<AccessReviewInstance> getByIdWithResponse(
        String scope, String scheduleDefinitionId, String id, Context context);

    /**
     * Update access review instance.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param properties Access review instance properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access Review Instance.
     */
    AccessReviewInstance create(
        String scope, String scheduleDefinitionId, String id, AccessReviewInstanceProperties properties);

    /**
     * Update access review instance.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param properties Access review instance properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access Review Instance along with {@link Response}.
     */
    Response<AccessReviewInstance> createWithResponse(
        String scope,
        String scheduleDefinitionId,
        String id,
        AccessReviewInstanceProperties properties,
        Context context);
}
