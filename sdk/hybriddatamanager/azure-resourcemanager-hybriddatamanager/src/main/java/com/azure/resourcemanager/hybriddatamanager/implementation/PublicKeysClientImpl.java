// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.implementation;

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
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybriddatamanager.fluent.PublicKeysClient;
import com.azure.resourcemanager.hybriddatamanager.fluent.models.PublicKeyInner;
import com.azure.resourcemanager.hybriddatamanager.models.PublicKeyList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PublicKeysClient. */
public final class PublicKeysClientImpl implements PublicKeysClient {
    private final ClientLogger logger = new ClientLogger(PublicKeysClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PublicKeysService service;

    /** The service client containing this operation class. */
    private final HybridDataManagementClientImpl client;

    /**
     * Initializes an instance of PublicKeysClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PublicKeysClientImpl(HybridDataManagementClientImpl client) {
        this.service =
            RestProxy.create(PublicKeysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HybridDataManagementClientPublicKeys to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "HybridDataManagement")
    private interface PublicKeysService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HybridData"
                + "/dataManagers/{dataManagerName}/publicKeys")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PublicKeyList>> listByDataManager(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("dataManagerName") String dataManagerName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HybridData"
                + "/dataManagers/{dataManagerName}/publicKeys/{publicKeyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PublicKeyInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("publicKeyName") String publicKeyName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("dataManagerName") String dataManagerName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PublicKeyList>> listByDataManagerNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * This method gets the list view of public keys, however it will only have one element.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicKey Collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PublicKeyInner>> listByDataManagerSinglePageAsync(
        String resourceGroupName, String dataManagerName) {
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
        if (dataManagerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter dataManagerName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByDataManager(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            dataManagerName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<PublicKeyInner>>map(
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
     * This method gets the list view of public keys, however it will only have one element.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicKey Collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PublicKeyInner>> listByDataManagerSinglePageAsync(
        String resourceGroupName, String dataManagerName, Context context) {
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
        if (dataManagerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter dataManagerName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByDataManager(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                dataManagerName,
                this.client.getApiVersion(),
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
     * This method gets the list view of public keys, however it will only have one element.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicKey Collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PublicKeyInner> listByDataManagerAsync(String resourceGroupName, String dataManagerName) {
        return new PagedFlux<>(
            () -> listByDataManagerSinglePageAsync(resourceGroupName, dataManagerName),
            nextLink -> listByDataManagerNextSinglePageAsync(nextLink));
    }

    /**
     * This method gets the list view of public keys, however it will only have one element.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicKey Collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PublicKeyInner> listByDataManagerAsync(
        String resourceGroupName, String dataManagerName, Context context) {
        return new PagedFlux<>(
            () -> listByDataManagerSinglePageAsync(resourceGroupName, dataManagerName, context),
            nextLink -> listByDataManagerNextSinglePageAsync(nextLink, context));
    }

    /**
     * This method gets the list view of public keys, however it will only have one element.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicKey Collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PublicKeyInner> listByDataManager(String resourceGroupName, String dataManagerName) {
        return new PagedIterable<>(listByDataManagerAsync(resourceGroupName, dataManagerName));
    }

    /**
     * This method gets the list view of public keys, however it will only have one element.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicKey Collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PublicKeyInner> listByDataManager(
        String resourceGroupName, String dataManagerName, Context context) {
        return new PagedIterable<>(listByDataManagerAsync(resourceGroupName, dataManagerName, context));
    }

    /**
     * This method gets the public keys.
     *
     * @param publicKeyName Name of the public key.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PublicKeyInner>> getWithResponseAsync(
        String publicKeyName, String resourceGroupName, String dataManagerName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (publicKeyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter publicKeyName is required and cannot be null."));
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
        if (dataManagerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter dataManagerName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            publicKeyName,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            dataManagerName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * This method gets the public keys.
     *
     * @param publicKeyName Name of the public key.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PublicKeyInner>> getWithResponseAsync(
        String publicKeyName, String resourceGroupName, String dataManagerName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (publicKeyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter publicKeyName is required and cannot be null."));
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
        if (dataManagerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter dataManagerName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                publicKeyName,
                this.client.getSubscriptionId(),
                resourceGroupName,
                dataManagerName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * This method gets the public keys.
     *
     * @param publicKeyName Name of the public key.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PublicKeyInner> getAsync(String publicKeyName, String resourceGroupName, String dataManagerName) {
        return getWithResponseAsync(publicKeyName, resourceGroupName, dataManagerName)
            .flatMap(
                (Response<PublicKeyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * This method gets the public keys.
     *
     * @param publicKeyName Name of the public key.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PublicKeyInner get(String publicKeyName, String resourceGroupName, String dataManagerName) {
        return getAsync(publicKeyName, resourceGroupName, dataManagerName).block();
    }

    /**
     * This method gets the public keys.
     *
     * @param publicKeyName Name of the public key.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PublicKeyInner> getWithResponse(
        String publicKeyName, String resourceGroupName, String dataManagerName, Context context) {
        return getWithResponseAsync(publicKeyName, resourceGroupName, dataManagerName, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicKey Collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PublicKeyInner>> listByDataManagerNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listByDataManagerNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<PublicKeyInner>>map(
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
     * @return publicKey Collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PublicKeyInner>> listByDataManagerNextSinglePageAsync(String nextLink, Context context) {
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
            .listByDataManagerNext(nextLink, this.client.getEndpoint(), accept, context)
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
