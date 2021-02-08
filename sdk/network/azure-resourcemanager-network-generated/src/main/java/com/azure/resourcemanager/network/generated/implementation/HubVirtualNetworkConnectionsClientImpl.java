// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.HubVirtualNetworkConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.HubVirtualNetworkConnectionInner;
import com.azure.resourcemanager.network.generated.models.ErrorException;
import com.azure.resourcemanager.network.generated.models.ListHubVirtualNetworkConnectionsResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in HubVirtualNetworkConnectionsClient. */
public final class HubVirtualNetworkConnectionsClientImpl implements HubVirtualNetworkConnectionsClient {
    private final ClientLogger logger = new ClientLogger(HubVirtualNetworkConnectionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final HubVirtualNetworkConnectionsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of HubVirtualNetworkConnectionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    HubVirtualNetworkConnectionsClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    HubVirtualNetworkConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientHubVirtualNetworkConnections to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface HubVirtualNetworkConnectionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs"
                + "/{virtualHubName}/hubVirtualNetworkConnections/{connectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<HubVirtualNetworkConnectionInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("virtualHubName") String virtualHubName,
            @PathParam("connectionName") String connectionName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs"
                + "/{virtualHubName}/hubVirtualNetworkConnections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<ListHubVirtualNetworkConnectionsResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("virtualHubName") String virtualHubName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<ListHubVirtualNetworkConnectionsResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hubVirtualNetworkConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<HubVirtualNetworkConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String virtualHubName, String connectionName) {
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
        if (virtualHubName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualHubName is required and cannot be null."));
        }
        if (connectionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter connectionName is required and cannot be null."));
        }
        final String apiVersion = "2019-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            virtualHubName,
                            connectionName,
                            apiVersion,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hubVirtualNetworkConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<HubVirtualNetworkConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String virtualHubName, String connectionName, Context context) {
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
        if (virtualHubName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualHubName is required and cannot be null."));
        }
        if (connectionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter connectionName is required and cannot be null."));
        }
        final String apiVersion = "2019-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                virtualHubName,
                connectionName,
                apiVersion,
                accept,
                context);
    }

    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hubVirtualNetworkConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<HubVirtualNetworkConnectionInner> getAsync(
        String resourceGroupName, String virtualHubName, String connectionName) {
        return getWithResponseAsync(resourceGroupName, virtualHubName, connectionName)
            .flatMap(
                (Response<HubVirtualNetworkConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hubVirtualNetworkConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public HubVirtualNetworkConnectionInner get(
        String resourceGroupName, String virtualHubName, String connectionName) {
        return getAsync(resourceGroupName, virtualHubName, connectionName).block();
    }

    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hubVirtualNetworkConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<HubVirtualNetworkConnectionInner> getWithResponse(
        String resourceGroupName, String virtualHubName, String connectionName, Context context) {
        return getWithResponseAsync(resourceGroupName, virtualHubName, connectionName, context).block();
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HubVirtualNetworkConnections and a URL nextLink to get the next set of results.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<HubVirtualNetworkConnectionInner>> listSinglePageAsync(
        String resourceGroupName, String virtualHubName) {
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
        if (virtualHubName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualHubName is required and cannot be null."));
        }
        final String apiVersion = "2019-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            virtualHubName,
                            apiVersion,
                            accept,
                            context))
            .<PagedResponse<HubVirtualNetworkConnectionInner>>map(
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
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HubVirtualNetworkConnections and a URL nextLink to get the next set of results.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<HubVirtualNetworkConnectionInner>> listSinglePageAsync(
        String resourceGroupName, String virtualHubName, Context context) {
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
        if (virtualHubName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualHubName is required and cannot be null."));
        }
        final String apiVersion = "2019-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                virtualHubName,
                apiVersion,
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
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HubVirtualNetworkConnections and a URL nextLink to get the next set of results.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<HubVirtualNetworkConnectionInner> listAsync(String resourceGroupName, String virtualHubName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, virtualHubName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HubVirtualNetworkConnections and a URL nextLink to get the next set of results.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<HubVirtualNetworkConnectionInner> listAsync(
        String resourceGroupName, String virtualHubName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, virtualHubName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HubVirtualNetworkConnections and a URL nextLink to get the next set of results.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<HubVirtualNetworkConnectionInner> list(String resourceGroupName, String virtualHubName) {
        return new PagedIterable<>(listAsync(resourceGroupName, virtualHubName));
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HubVirtualNetworkConnections and a URL nextLink to get the next set of results.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<HubVirtualNetworkConnectionInner> list(
        String resourceGroupName, String virtualHubName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, virtualHubName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HubVirtualNetworkConnections and a URL nextLink to get the next set of results.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<HubVirtualNetworkConnectionInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<HubVirtualNetworkConnectionInner>>map(
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
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HubVirtualNetworkConnections and a URL nextLink to get the next set of results.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<HubVirtualNetworkConnectionInner>> listNextSinglePageAsync(
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
