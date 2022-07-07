// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.authorization.generated.fluent.AccessReviewInstancesClient;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewInstanceInner;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewInstanceProperties;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewInstanceListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AccessReviewInstancesClient. */
public final class AccessReviewInstancesClientImpl implements AccessReviewInstancesClient {
    /** The proxy service used to perform REST calls. */
    private final AccessReviewInstancesService service;

    /** The service client containing this operation class. */
    private final AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of AccessReviewInstancesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AccessReviewInstancesClientImpl(AuthorizationManagementClientImpl client) {
        this.service =
            RestProxy
                .create(AccessReviewInstancesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AuthorizationManagementClientAccessReviewInstances to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AuthorizationManagem")
    private interface AccessReviewInstancesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Authorization/accessReviewScheduleDefinitions"
                + "/{scheduleDefinitionId}/instances")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AccessReviewInstanceListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("scheduleDefinitionId") String scheduleDefinitionId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam(value = "$filter", encoded = true) String filter,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Authorization/accessReviewScheduleDefinitions"
                + "/{scheduleDefinitionId}/instances/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AccessReviewInstanceInner>> getById(
            @HostParam("$host") String endpoint,
            @PathParam("scheduleDefinitionId") String scheduleDefinitionId,
            @PathParam("id") String id,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Authorization/accessReviewScheduleDefinitions"
                + "/{scheduleDefinitionId}/instances/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AccessReviewInstanceInner>> create(
            @HostParam("$host") String endpoint,
            @PathParam("scheduleDefinitionId") String scheduleDefinitionId,
            @PathParam("id") String id,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") AccessReviewInstanceProperties properties,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AccessReviewInstanceListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewInstanceInner>> listSinglePageAsync(
        String scheduleDefinitionId, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scheduleDefinitionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scheduleDefinitionId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            scheduleDefinitionId,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            filter,
                            accept,
                            context))
            .<PagedResponse<AccessReviewInstanceInner>>map(
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
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewInstanceInner>> listSinglePageAsync(
        String scheduleDefinitionId, String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scheduleDefinitionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scheduleDefinitionId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                scheduleDefinitionId,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                filter,
                accept,
                context)
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
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AccessReviewInstanceInner> listAsync(String scheduleDefinitionId, String filter) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scheduleDefinitionId, filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AccessReviewInstanceInner> listAsync(String scheduleDefinitionId) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(scheduleDefinitionId, filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AccessReviewInstanceInner> listAsync(
        String scheduleDefinitionId, String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scheduleDefinitionId, filter, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AccessReviewInstanceInner> list(String scheduleDefinitionId) {
        final String filter = null;
        return new PagedIterable<>(listAsync(scheduleDefinitionId, filter));
    }

    /**
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AccessReviewInstanceInner> list(String scheduleDefinitionId, String filter, Context context) {
        return new PagedIterable<>(listAsync(scheduleDefinitionId, filter, context));
    }

    /**
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AccessReviewInstanceInner>> getByIdWithResponseAsync(String scheduleDefinitionId, String id) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scheduleDefinitionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scheduleDefinitionId is required and cannot be null."));
        }
        if (id == null) {
            return Mono.error(new IllegalArgumentException("Parameter id is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getById(
                            this.client.getEndpoint(),
                            scheduleDefinitionId,
                            id,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AccessReviewInstanceInner>> getByIdWithResponseAsync(
        String scheduleDefinitionId, String id, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scheduleDefinitionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scheduleDefinitionId is required and cannot be null."));
        }
        if (id == null) {
            return Mono.error(new IllegalArgumentException("Parameter id is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getById(
                this.client.getEndpoint(),
                scheduleDefinitionId,
                id,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AccessReviewInstanceInner> getByIdAsync(String scheduleDefinitionId, String id) {
        return getByIdWithResponseAsync(scheduleDefinitionId, id).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AccessReviewInstanceInner getById(String scheduleDefinitionId, String id) {
        return getByIdAsync(scheduleDefinitionId, id).block();
    }

    /**
     * Get access review instances.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instances along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AccessReviewInstanceInner> getByIdWithResponse(
        String scheduleDefinitionId, String id, Context context) {
        return getByIdWithResponseAsync(scheduleDefinitionId, id, context).block();
    }

    /**
     * Update access review instance.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param properties Access review instance properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access Review Instance along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AccessReviewInstanceInner>> createWithResponseAsync(
        String scheduleDefinitionId, String id, AccessReviewInstanceProperties properties) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scheduleDefinitionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scheduleDefinitionId is required and cannot be null."));
        }
        if (id == null) {
            return Mono.error(new IllegalArgumentException("Parameter id is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (properties == null) {
            return Mono.error(new IllegalArgumentException("Parameter properties is required and cannot be null."));
        } else {
            properties.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getEndpoint(),
                            scheduleDefinitionId,
                            id,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            properties,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update access review instance.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param properties Access review instance properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access Review Instance along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AccessReviewInstanceInner>> createWithResponseAsync(
        String scheduleDefinitionId, String id, AccessReviewInstanceProperties properties, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scheduleDefinitionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scheduleDefinitionId is required and cannot be null."));
        }
        if (id == null) {
            return Mono.error(new IllegalArgumentException("Parameter id is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (properties == null) {
            return Mono.error(new IllegalArgumentException("Parameter properties is required and cannot be null."));
        } else {
            properties.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .create(
                this.client.getEndpoint(),
                scheduleDefinitionId,
                id,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                properties,
                accept,
                context);
    }

    /**
     * Update access review instance.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param properties Access review instance properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access Review Instance on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AccessReviewInstanceInner> createAsync(
        String scheduleDefinitionId, String id, AccessReviewInstanceProperties properties) {
        return createWithResponseAsync(scheduleDefinitionId, id, properties)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update access review instance.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param properties Access review instance properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access Review Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AccessReviewInstanceInner create(
        String scheduleDefinitionId, String id, AccessReviewInstanceProperties properties) {
        return createAsync(scheduleDefinitionId, id, properties).block();
    }

    /**
     * Update access review instance.
     *
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param properties Access review instance properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access Review Instance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AccessReviewInstanceInner> createWithResponse(
        String scheduleDefinitionId, String id, AccessReviewInstanceProperties properties, Context context) {
        return createWithResponseAsync(scheduleDefinitionId, id, properties, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Access Review Instances along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewInstanceInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<AccessReviewInstanceInner>>map(
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
     * @return list of Access Review Instances along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewInstanceInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
