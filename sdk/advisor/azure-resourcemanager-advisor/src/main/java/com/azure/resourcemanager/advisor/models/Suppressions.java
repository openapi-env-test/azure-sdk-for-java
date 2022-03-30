// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Suppressions. */
public interface Suppressions {
    /**
     * Obtains the details of a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the snoozed or dismissed rule; for example, the duration, name, and GUID associated with
     *     the rule.
     */
    SuppressionContract get(String resourceUri, String recommendationId, String name);

    /**
     * Obtains the details of a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the snoozed or dismissed rule; for example, the duration, name, and GUID associated with
     *     the rule along with {@link Response}.
     */
    Response<SuppressionContract> getWithResponse(
        String resourceUri, String recommendationId, String name, Context context);

    /**
     * Enables the activation of a snoozed or dismissed recommendation. The snoozed or dismissed attribute of a
     * recommendation is referred to as a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceUri, String recommendationId, String name);

    /**
     * Enables the activation of a snoozed or dismissed recommendation. The snoozed or dismissed attribute of a
     * recommendation is referred to as a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceUri, String recommendationId, String name, Context context);

    /**
     * Retrieves the list of snoozed or dismissed suppressions for a subscription. The snoozed or dismissed attribute of
     * a recommendation is referred to as a suppression.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Advisor suppressions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SuppressionContract> list();

    /**
     * Retrieves the list of snoozed or dismissed suppressions for a subscription. The snoozed or dismissed attribute of
     * a recommendation is referred to as a suppression.
     *
     * @param top The number of suppressions per page if a paged version of this API is being used.
     * @param skipToken The page-continuation token to use with a paged version of this API.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Advisor suppressions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SuppressionContract> list(Integer top, String skipToken, Context context);

    /**
     * Obtains the details of a suppression.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the snoozed or dismissed rule; for example, the duration, name, and GUID associated with
     *     the rule along with {@link Response}.
     */
    SuppressionContract getById(String id);

    /**
     * Obtains the details of a suppression.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the snoozed or dismissed rule; for example, the duration, name, and GUID associated with
     *     the rule along with {@link Response}.
     */
    Response<SuppressionContract> getByIdWithResponse(String id, Context context);

    /**
     * Enables the activation of a snoozed or dismissed recommendation. The snoozed or dismissed attribute of a
     * recommendation is referred to as a suppression.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Enables the activation of a snoozed or dismissed recommendation. The snoozed or dismissed attribute of a
     * recommendation is referred to as a suppression.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SuppressionContract resource.
     *
     * @param name resource name.
     * @return the first stage of the new SuppressionContract definition.
     */
    SuppressionContract.DefinitionStages.Blank define(String name);
}
