// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewHistoryDefinitionProperties;

/** Resource collection API of ScopeAccessReviewHistoryDefinitionOperations. */
public interface ScopeAccessReviewHistoryDefinitionOperations {
    /**
     * Create a scheduled or one-time Access Review History Definition.
     *
     * @param scope The scope of the resource.
     * @param historyDefinitionId The id of the access review history definition.
     * @param properties Access review history definition properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access Review History Definition.
     */
    AccessReviewHistoryDefinition create(
        String scope, String historyDefinitionId, AccessReviewHistoryDefinitionProperties properties);

    /**
     * Create a scheduled or one-time Access Review History Definition.
     *
     * @param scope The scope of the resource.
     * @param historyDefinitionId The id of the access review history definition.
     * @param properties Access review history definition properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access Review History Definition along with {@link Response}.
     */
    Response<AccessReviewHistoryDefinition> createWithResponse(
        String scope, String historyDefinitionId, AccessReviewHistoryDefinitionProperties properties, Context context);

    /**
     * Delete an access review history definition.
     *
     * @param scope The scope of the resource.
     * @param historyDefinitionId The id of the access review history definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String scope, String historyDefinitionId);

    /**
     * Delete an access review history definition.
     *
     * @param scope The scope of the resource.
     * @param historyDefinitionId The id of the access review history definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String scope, String historyDefinitionId, Context context);
}
