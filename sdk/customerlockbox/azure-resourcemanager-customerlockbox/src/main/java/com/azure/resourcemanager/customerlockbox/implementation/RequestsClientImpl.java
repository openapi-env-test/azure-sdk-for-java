// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerlockbox.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerlockbox.fluent.RequestsClient;
import com.azure.resourcemanager.customerlockbox.fluent.models.ApprovalInner;
import com.azure.resourcemanager.customerlockbox.fluent.models.LockboxRequestResponseInner;
import com.azure.resourcemanager.customerlockbox.models.RequestListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RequestsClient. */
public final class RequestsClientImpl implements RequestsClient {
    private final ClientLogger logger = new ClientLogger(RequestsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RequestsService service;

    /** The service client containing this operation class. */
    private final CustomerLockboxImpl client;

    /**
     * Initializes an instance of RequestsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RequestsClientImpl(CustomerLockboxImpl client) {
        this.service = RestProxy.create(RequestsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CustomerLockboxRequests to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CustomerLockboxReque")
    private interface RequestsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.CustomerLockbox/requests/{requestId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LockboxRequestResponseInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("requestId") String requestId,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.CustomerLockbox/requests/{requestId}/UpdateApproval")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApprovalInner>> updateStatus(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("requestId") String requestId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ApprovalInner approval,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.CustomerLockbox/requests")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RequestListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("$filter") String filter,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RequestListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get Customer Lockbox request.
     *
     * @param requestId The Lockbox request ID.
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer Lockbox request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LockboxRequestResponseInner>> getWithResponseAsync(String requestId, String subscriptionId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (requestId == null) {
            return Mono.error(new IllegalArgumentException("Parameter requestId is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            requestId,
                            subscriptionId,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get Customer Lockbox request.
     *
     * @param requestId The Lockbox request ID.
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer Lockbox request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LockboxRequestResponseInner>> getWithResponseAsync(
        String requestId, String subscriptionId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (requestId == null) {
            return Mono.error(new IllegalArgumentException("Parameter requestId is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(this.client.getEndpoint(), requestId, subscriptionId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Get Customer Lockbox request.
     *
     * @param requestId The Lockbox request ID.
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer Lockbox request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LockboxRequestResponseInner> getAsync(String requestId, String subscriptionId) {
        return getWithResponseAsync(requestId, subscriptionId)
            .flatMap(
                (Response<LockboxRequestResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get Customer Lockbox request.
     *
     * @param requestId The Lockbox request ID.
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer Lockbox request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LockboxRequestResponseInner get(String requestId, String subscriptionId) {
        return getAsync(requestId, subscriptionId).block();
    }

    /**
     * Get Customer Lockbox request.
     *
     * @param requestId The Lockbox request ID.
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer Lockbox request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LockboxRequestResponseInner> getWithResponse(
        String requestId, String subscriptionId, Context context) {
        return getWithResponseAsync(requestId, subscriptionId, context).block();
    }

    /**
     * Update Customer Lockbox request approval status API.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param requestId The Lockbox request ID.
     * @param approval The approval object to update request status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return request content object, in the use of Approve or Deny a Lockbox request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApprovalInner>> updateStatusWithResponseAsync(
        String subscriptionId, String requestId, ApprovalInner approval) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        if (requestId == null) {
            return Mono.error(new IllegalArgumentException("Parameter requestId is required and cannot be null."));
        }
        if (approval == null) {
            return Mono.error(new IllegalArgumentException("Parameter approval is required and cannot be null."));
        } else {
            approval.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .updateStatus(
                            this.client.getEndpoint(),
                            subscriptionId,
                            requestId,
                            this.client.getApiVersion(),
                            approval,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Update Customer Lockbox request approval status API.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param requestId The Lockbox request ID.
     * @param approval The approval object to update request status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return request content object, in the use of Approve or Deny a Lockbox request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApprovalInner>> updateStatusWithResponseAsync(
        String subscriptionId, String requestId, ApprovalInner approval, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        if (requestId == null) {
            return Mono.error(new IllegalArgumentException("Parameter requestId is required and cannot be null."));
        }
        if (approval == null) {
            return Mono.error(new IllegalArgumentException("Parameter approval is required and cannot be null."));
        } else {
            approval.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .updateStatus(
                this.client.getEndpoint(),
                subscriptionId,
                requestId,
                this.client.getApiVersion(),
                approval,
                accept,
                context);
    }

    /**
     * Update Customer Lockbox request approval status API.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param requestId The Lockbox request ID.
     * @param approval The approval object to update request status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return request content object, in the use of Approve or Deny a Lockbox request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ApprovalInner> updateStatusAsync(String subscriptionId, String requestId, ApprovalInner approval) {
        return updateStatusWithResponseAsync(subscriptionId, requestId, approval)
            .flatMap(
                (Response<ApprovalInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Update Customer Lockbox request approval status API.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param requestId The Lockbox request ID.
     * @param approval The approval object to update request status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return request content object, in the use of Approve or Deny a Lockbox request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApprovalInner updateStatus(String subscriptionId, String requestId, ApprovalInner approval) {
        return updateStatusAsync(subscriptionId, requestId, approval).block();
    }

    /**
     * Update Customer Lockbox request approval status API.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param requestId The Lockbox request ID.
     * @param approval The approval object to update request status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return request content object, in the use of Approve or Deny a Lockbox request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApprovalInner> updateStatusWithResponse(
        String subscriptionId, String requestId, ApprovalInner approval, Context context) {
        return updateStatusWithResponseAsync(subscriptionId, requestId, approval, context).block();
    }

    /**
     * Lists all of the Lockbox requests in the given subscription.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param filter The $filter OData query parameter. Only filter by request status is supported, e.g
     *     $filter=properties/status eq 'Pending'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of streaming jobs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LockboxRequestResponseInner>> listSinglePageAsync(String subscriptionId, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), filter, subscriptionId, accept, context))
            .<PagedResponse<LockboxRequestResponseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists all of the Lockbox requests in the given subscription.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param filter The $filter OData query parameter. Only filter by request status is supported, e.g
     *     $filter=properties/status eq 'Pending'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of streaming jobs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LockboxRequestResponseInner>> listSinglePageAsync(
        String subscriptionId, String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), filter, subscriptionId, accept, context)
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
     * Lists all of the Lockbox requests in the given subscription.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param filter The $filter OData query parameter. Only filter by request status is supported, e.g
     *     $filter=properties/status eq 'Pending'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of streaming jobs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LockboxRequestResponseInner> listAsync(String subscriptionId, String filter) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(subscriptionId, filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all of the Lockbox requests in the given subscription.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of streaming jobs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LockboxRequestResponseInner> listAsync(String subscriptionId) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(subscriptionId, filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all of the Lockbox requests in the given subscription.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param filter The $filter OData query parameter. Only filter by request status is supported, e.g
     *     $filter=properties/status eq 'Pending'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of streaming jobs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LockboxRequestResponseInner> listAsync(String subscriptionId, String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(subscriptionId, filter, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists all of the Lockbox requests in the given subscription.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of streaming jobs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LockboxRequestResponseInner> list(String subscriptionId) {
        final String filter = null;
        return new PagedIterable<>(listAsync(subscriptionId, filter));
    }

    /**
     * Lists all of the Lockbox requests in the given subscription.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param filter The $filter OData query parameter. Only filter by request status is supported, e.g
     *     $filter=properties/status eq 'Pending'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of streaming jobs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LockboxRequestResponseInner> list(String subscriptionId, String filter, Context context) {
        return new PagedIterable<>(listAsync(subscriptionId, filter, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of streaming jobs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LockboxRequestResponseInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<LockboxRequestResponseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of streaming jobs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LockboxRequestResponseInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
