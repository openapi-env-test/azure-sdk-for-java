// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.authorization.generated.fluent.AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewScheduleDefinitionInner;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewScheduleDefinitionListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient.
 */
public final class AccessReviewScheduleDefinitionsAssignedForMyApprovalsClientImpl
    implements AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient {
    /** The proxy service used to perform REST calls. */
    private final AccessReviewScheduleDefinitionsAssignedForMyApprovalsService service;

    /** The service client containing this operation class. */
    private final AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of AccessReviewScheduleDefinitionsAssignedForMyApprovalsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AccessReviewScheduleDefinitionsAssignedForMyApprovalsClientImpl(AuthorizationManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    AccessReviewScheduleDefinitionsAssignedForMyApprovalsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * AuthorizationManagementClientAccessReviewScheduleDefinitionsAssignedForMyApprovals to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AuthorizationManagem")
    private interface AccessReviewScheduleDefinitionsAssignedForMyApprovalsService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Authorization/accessReviewScheduleDefinitions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AccessReviewScheduleDefinitionListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @QueryParam(value = "$filter", encoded = true) String filter,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AccessReviewScheduleDefinitionListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get access review instances assigned for my approval.
     *
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances assigned for my approval along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewScheduleDefinitionInner>> listSinglePageAsync(String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service.list(this.client.getEndpoint(), this.client.getApiVersion(), filter, accept, context))
            .<PagedResponse<AccessReviewScheduleDefinitionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get access review instances assigned for my approval.
     *
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances assigned for my approval along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewScheduleDefinitionInner>> listSinglePageAsync(
        String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), filter, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Get access review instances assigned for my approval.
     *
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances assigned for my approval as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AccessReviewScheduleDefinitionInner> listAsync(String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get access review instances assigned for my approval.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances assigned for my approval as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AccessReviewScheduleDefinitionInner> listAsync() {
        final String filter = null;
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get access review instances assigned for my approval.
     *
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances assigned for my approval as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AccessReviewScheduleDefinitionInner> listAsync(String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get access review instances assigned for my approval.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances assigned for my approval as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AccessReviewScheduleDefinitionInner> list() {
        final String filter = null;
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Get access review instances assigned for my approval.
     *
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances assigned for my approval as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AccessReviewScheduleDefinitionInner> list(String filter, Context context) {
        return new PagedIterable<>(listAsync(filter, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Access Review Schedule Definitions along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewScheduleDefinitionInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<AccessReviewScheduleDefinitionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Access Review Schedule Definitions along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewScheduleDefinitionInner>> listNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
