// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewHistoryDefinitionInner;

/**
 * An instance of this class provides access to all the operations defined in ScopeAccessReviewHistoryDefinitionsClient.
 */
public interface ScopeAccessReviewHistoryDefinitionsClient {
    /**
     * Lists the accessReviewHistoryDefinitions available from this provider, definition instances are only available
     * for 30 days after creation.
     *
     * @param scope The scope of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Access Review History Definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccessReviewHistoryDefinitionInner> list(String scope);

    /**
     * Lists the accessReviewHistoryDefinitions available from this provider, definition instances are only available
     * for 30 days after creation.
     *
     * @param scope The scope of the resource.
     * @param filter The filter to apply on the operation. Only standard filters on definition name and created date are
     *     supported.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Access Review History Definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccessReviewHistoryDefinitionInner> list(String scope, String filter, Context context);

    /**
     * Get access review history definition by definition Id.
     *
     * @param scope The scope of the resource.
     * @param historyDefinitionId The id of the access review history definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review history definition by definition Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessReviewHistoryDefinitionInner getById(String scope, String historyDefinitionId);

    /**
     * Get access review history definition by definition Id.
     *
     * @param scope The scope of the resource.
     * @param historyDefinitionId The id of the access review history definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review history definition by definition Id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessReviewHistoryDefinitionInner> getByIdWithResponse(
        String scope, String historyDefinitionId, Context context);
}
