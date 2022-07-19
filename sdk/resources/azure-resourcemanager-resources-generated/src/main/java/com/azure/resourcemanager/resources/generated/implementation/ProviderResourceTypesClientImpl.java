// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.resources.generated.fluent.ProviderResourceTypesClient;
import com.azure.resourcemanager.resources.generated.fluent.models.ProviderResourceTypeListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ProviderResourceTypesClient. */
public final class ProviderResourceTypesClientImpl implements ProviderResourceTypesClient {
    /** The proxy service used to perform REST calls. */
    private final ProviderResourceTypesService service;

    /** The service client containing this operation class. */
    private final ResourceManagementClientImpl client;

    /**
     * Initializes an instance of ProviderResourceTypesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ProviderResourceTypesClientImpl(ResourceManagementClientImpl client) {
        this.service =
            RestProxy
                .create(ProviderResourceTypesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ResourceManagementClientProviderResourceTypes to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ResourceManagementCl")
    private interface ProviderResourceTypesService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/{resourceProviderNamespace}/resourceTypes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProviderResourceTypeListResultInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("$expand") String expand,
            @PathParam("resourceProviderNamespace") String resourceProviderNamespace,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List the resource types for a specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of resource types of a resource provider along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProviderResourceTypeListResultInner>> listWithResponseAsync(
        String resourceProviderNamespace, String expand) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceProviderNamespace == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter resourceProviderNamespace is required and cannot be null."));
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
                            expand,
                            resourceProviderNamespace,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List the resource types for a specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of resource types of a resource provider along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProviderResourceTypeListResultInner>> listWithResponseAsync(
        String resourceProviderNamespace, String expand, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceProviderNamespace == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter resourceProviderNamespace is required and cannot be null."));
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
                expand,
                resourceProviderNamespace,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * List the resource types for a specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of resource types of a resource provider on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ProviderResourceTypeListResultInner> listAsync(String resourceProviderNamespace, String expand) {
        return listWithResponseAsync(resourceProviderNamespace, expand)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List the resource types for a specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of resource types of a resource provider on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ProviderResourceTypeListResultInner> listAsync(String resourceProviderNamespace) {
        final String expand = null;
        return listWithResponseAsync(resourceProviderNamespace, expand)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List the resource types for a specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of resource types of a resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProviderResourceTypeListResultInner list(String resourceProviderNamespace) {
        final String expand = null;
        return listAsync(resourceProviderNamespace, expand).block();
    }

    /**
     * List the resource types for a specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of resource types of a resource provider along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ProviderResourceTypeListResultInner> listWithResponse(
        String resourceProviderNamespace, String expand, Context context) {
        return listWithResponseAsync(resourceProviderNamespace, expand, context).block();
    }
}
