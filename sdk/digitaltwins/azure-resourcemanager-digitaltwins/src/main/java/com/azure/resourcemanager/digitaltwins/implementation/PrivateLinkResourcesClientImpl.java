// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.implementation;

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
import com.azure.resourcemanager.digitaltwins.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.digitaltwins.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.digitaltwins.fluent.models.GroupIdInformationResponseInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public final class PrivateLinkResourcesClientImpl implements PrivateLinkResourcesClient {
    /** The proxy service used to perform REST calls. */
    private final PrivateLinkResourcesService service;

    /** The service client containing this operation class. */
    private final AzureDigitalTwinsManagementClientImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateLinkResourcesClientImpl(AzureDigitalTwinsManagementClientImpl client) {
        this.service =
            RestProxy
                .create(PrivateLinkResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureDigitalTwinsManagementClientPrivateLinkResources to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureDigitalTwinsMan")
    private interface PrivateLinkResourcesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DigitalTwins"
                + "/digitalTwinsInstances/{resourceName}/privateLinkResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GroupIdInformationResponseInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("resourceName") String resourceName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DigitalTwins"
                + "/digitalTwinsInstances/{resourceName}/privateLinkResources/{resourceId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GroupIdInformationInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceId") String resourceId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List private link resources for given Digital Twin.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for a Digital Twin along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GroupIdInformationResponseInner>> listWithResponseAsync(
        String resourceGroupName, String resourceName) {
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
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            resourceName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List private link resources for given Digital Twin.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for a Digital Twin along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GroupIdInformationResponseInner>> listWithResponseAsync(
        String resourceGroupName, String resourceName, Context context) {
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
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                resourceName,
                accept,
                context);
    }

    /**
     * List private link resources for given Digital Twin.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for a Digital Twin on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GroupIdInformationResponseInner> listAsync(String resourceGroupName, String resourceName) {
        return listWithResponseAsync(resourceGroupName, resourceName)
            .flatMap(
                (Response<GroupIdInformationResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * List private link resources for given Digital Twin.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for a Digital Twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GroupIdInformationResponseInner list(String resourceGroupName, String resourceName) {
        return listAsync(resourceGroupName, resourceName).block();
    }

    /**
     * List private link resources for given Digital Twin.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for a Digital Twin along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GroupIdInformationResponseInner> listWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        return listWithResponseAsync(resourceGroupName, resourceName, context).block();
    }

    /**
     * Get the specified private link resource for the given Digital Twin.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param resourceId The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource for the given Digital Twin along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GroupIdInformationInner>> getWithResponseAsync(
        String resourceGroupName, String resourceName, String resourceId) {
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
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            resourceName,
                            resourceId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the specified private link resource for the given Digital Twin.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param resourceId The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource for the given Digital Twin along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GroupIdInformationInner>> getWithResponseAsync(
        String resourceGroupName, String resourceName, String resourceId, Context context) {
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
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                resourceName,
                resourceId,
                accept,
                context);
    }

    /**
     * Get the specified private link resource for the given Digital Twin.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param resourceId The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource for the given Digital Twin on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GroupIdInformationInner> getAsync(String resourceGroupName, String resourceName, String resourceId) {
        return getWithResponseAsync(resourceGroupName, resourceName, resourceId)
            .flatMap(
                (Response<GroupIdInformationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get the specified private link resource for the given Digital Twin.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param resourceId The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource for the given Digital Twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GroupIdInformationInner get(String resourceGroupName, String resourceName, String resourceId) {
        return getAsync(resourceGroupName, resourceName, resourceId).block();
    }

    /**
     * Get the specified private link resource for the given Digital Twin.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param resourceId The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource for the given Digital Twin along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GroupIdInformationInner> getWithResponse(
        String resourceGroupName, String resourceName, String resourceId, Context context) {
        return getWithResponseAsync(resourceGroupName, resourceName, resourceId, context).block();
    }
}
