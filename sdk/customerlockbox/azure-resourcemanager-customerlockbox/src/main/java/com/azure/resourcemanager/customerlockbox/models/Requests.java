// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerlockbox.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.customerlockbox.fluent.models.ApprovalInner;

/** Resource collection API of Requests. */
public interface Requests {
    /**
     * Get Customer Lockbox request.
     *
     * @param requestId The Lockbox request ID.
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer Lockbox request.
     */
    LockboxRequestResponse get(String requestId, String subscriptionId);

    /**
     * Get Customer Lockbox request.
     *
     * @param requestId The Lockbox request ID.
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer Lockbox request.
     */
    Response<LockboxRequestResponse> getWithResponse(String requestId, String subscriptionId, Context context);

    /**
     * Update Customer Lockbox request approval status API.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param requestId The Lockbox request ID.
     * @param approval The approval object to update request status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return request content object, in the use of Approve or Deny a Lockbox request.
     */
    Approval updateStatus(String subscriptionId, String requestId, ApprovalInner approval);

    /**
     * Update Customer Lockbox request approval status API.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param requestId The Lockbox request ID.
     * @param approval The approval object to update request status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return request content object, in the use of Approve or Deny a Lockbox request.
     */
    Response<Approval> updateStatusWithResponse(
        String subscriptionId, String requestId, ApprovalInner approval, Context context);

    /**
     * Lists all of the Lockbox requests in the given subscription.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of streaming jobs.
     */
    PagedIterable<LockboxRequestResponse> list(String subscriptionId);

    /**
     * Lists all of the Lockbox requests in the given subscription.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param filter The $filter OData query parameter. Only filter by request status is supported, e.g
     *     $filter=properties/status eq 'Pending'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of streaming jobs.
     */
    PagedIterable<LockboxRequestResponse> list(String subscriptionId, String filter, Context context);
}
