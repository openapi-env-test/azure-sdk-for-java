// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devspaces.implementation;

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
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devspaces.fluent.ContainerHostMappingsClient;
import com.azure.resourcemanager.devspaces.fluent.models.ContainerHostMappingInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ContainerHostMappingsClient. */
public final class ContainerHostMappingsClientImpl implements ContainerHostMappingsClient {
    private final ClientLogger logger = new ClientLogger(ContainerHostMappingsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ContainerHostMappingsService service;

    /** The service client containing this operation class. */
    private final DevSpacesManagementClientImpl client;

    /**
     * Initializes an instance of ContainerHostMappingsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ContainerHostMappingsClientImpl(DevSpacesManagementClientImpl client) {
        this.service =
            RestProxy
                .create(ContainerHostMappingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DevSpacesManagementClientContainerHostMappings to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DevSpacesManagementC")
    private interface ContainerHostMappingsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevSpaces/locations"
                + "/{location}/checkContainerHostMapping")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ContainerHostMappingInner>> getContainerHostMapping(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("location") String location,
            @BodyParam("application/json") ContainerHostMappingInner containerHostMapping,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param location Location of the container host.
     * @param containerHostMapping Container host mapping object specifying the Container host resource ID and its
     *     associated Controller resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container host mapping object specifying the Container host resource ID and its associated Controller
     *     resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ContainerHostMappingInner>> getContainerHostMappingWithResponseAsync(
        String resourceGroupName, String location, ContainerHostMappingInner containerHostMapping) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (containerHostMapping == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerHostMapping is required and cannot be null."));
        } else {
            containerHostMapping.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getContainerHostMapping(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            location,
                            containerHostMapping,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param location Location of the container host.
     * @param containerHostMapping Container host mapping object specifying the Container host resource ID and its
     *     associated Controller resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container host mapping object specifying the Container host resource ID and its associated Controller
     *     resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ContainerHostMappingInner>> getContainerHostMappingWithResponseAsync(
        String resourceGroupName, String location, ContainerHostMappingInner containerHostMapping, Context context) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (containerHostMapping == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerHostMapping is required and cannot be null."));
        } else {
            containerHostMapping.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getContainerHostMapping(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                location,
                containerHostMapping,
                accept,
                context);
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param location Location of the container host.
     * @param containerHostMapping Container host mapping object specifying the Container host resource ID and its
     *     associated Controller resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container host mapping object specifying the Container host resource ID and its associated Controller
     *     resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ContainerHostMappingInner> getContainerHostMappingAsync(
        String resourceGroupName, String location, ContainerHostMappingInner containerHostMapping) {
        return getContainerHostMappingWithResponseAsync(resourceGroupName, location, containerHostMapping)
            .flatMap(
                (Response<ContainerHostMappingInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param location Location of the container host.
     * @param containerHostMapping Container host mapping object specifying the Container host resource ID and its
     *     associated Controller resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container host mapping object specifying the Container host resource ID and its associated Controller
     *     resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ContainerHostMappingInner getContainerHostMapping(
        String resourceGroupName, String location, ContainerHostMappingInner containerHostMapping) {
        return getContainerHostMappingAsync(resourceGroupName, location, containerHostMapping).block();
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param location Location of the container host.
     * @param containerHostMapping Container host mapping object specifying the Container host resource ID and its
     *     associated Controller resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container host mapping object specifying the Container host resource ID and its associated Controller
     *     resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ContainerHostMappingInner> getContainerHostMappingWithResponse(
        String resourceGroupName, String location, ContainerHostMappingInner containerHostMapping, Context context) {
        return getContainerHostMappingWithResponseAsync(resourceGroupName, location, containerHostMapping, context)
            .block();
    }
}
