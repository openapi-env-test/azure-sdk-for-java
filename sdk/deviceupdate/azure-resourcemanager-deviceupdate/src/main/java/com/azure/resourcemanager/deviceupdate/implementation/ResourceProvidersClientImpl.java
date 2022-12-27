// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.deviceupdate.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.deviceupdate.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.deviceupdate.models.CheckNameAvailabilityRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    /** The proxy service used to perform REST calls. */
    private final ResourceProvidersService service;

    /** The service client containing this operation class. */
    private final DeviceUpdateImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(DeviceUpdateImpl client) {
        this.service =
            RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DeviceUpdateResourceProviders to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DeviceUpdateResource")
    public interface ResourceProvidersService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.DeviceUpdate/checknameavailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailability(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") CheckNameAvailabilityRequest request,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Checks ADU resource name availability.
     *
     * @param request Check Name Availability Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailabilityWithResponseAsync(
        CheckNameAvailabilityRequest request) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (request == null) {
            return Mono.error(new IllegalArgumentException("Parameter request is required and cannot be null."));
        } else {
            request.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailability(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            request,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Checks ADU resource name availability.
     *
     * @param request Check Name Availability Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailabilityWithResponseAsync(
        CheckNameAvailabilityRequest request, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (request == null) {
            return Mono.error(new IllegalArgumentException("Parameter request is required and cannot be null."));
        } else {
            request.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkNameAvailability(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                request,
                accept,
                context);
    }

    /**
     * Checks ADU resource name availability.
     *
     * @param request Check Name Availability Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckNameAvailabilityResponseInner> checkNameAvailabilityAsync(CheckNameAvailabilityRequest request) {
        return checkNameAvailabilityWithResponseAsync(request).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Checks ADU resource name availability.
     *
     * @param request Check Name Availability Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameAvailabilityResponseInner> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityRequest request, Context context) {
        return checkNameAvailabilityWithResponseAsync(request, context).block();
    }

    /**
     * Checks ADU resource name availability.
     *
     * @param request Check Name Availability Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityResponseInner checkNameAvailability(CheckNameAvailabilityRequest request) {
        return checkNameAvailabilityWithResponse(request, Context.NONE).getValue();
    }
}
