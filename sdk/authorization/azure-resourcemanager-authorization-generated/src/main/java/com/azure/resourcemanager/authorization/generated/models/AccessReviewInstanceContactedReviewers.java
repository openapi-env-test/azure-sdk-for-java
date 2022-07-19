// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of AccessReviewInstanceContactedReviewers. */
public interface AccessReviewInstanceContactedReviewers {
    /**
     * Get access review instance contacted reviewers.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instance contacted reviewers as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AccessReviewContactedReviewer> list(String scheduleDefinitionId, String id);

    /**
     * Get access review instance contacted reviewers.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instance contacted reviewers as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AccessReviewContactedReviewer> list(String scheduleDefinitionId, String id, Context context);
}
