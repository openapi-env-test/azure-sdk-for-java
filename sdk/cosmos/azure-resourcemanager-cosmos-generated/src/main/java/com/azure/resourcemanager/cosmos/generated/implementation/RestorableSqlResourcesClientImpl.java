// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

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
import com.azure.resourcemanager.cosmos.generated.fluent.RestorableSqlResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseRestoreResourceInner;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlResourcesListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RestorableSqlResourcesClient. */
public final class RestorableSqlResourcesClientImpl implements RestorableSqlResourcesClient {
    /** The proxy service used to perform REST calls. */
    private final RestorableSqlResourcesService service;

    /** The service client containing this operation class. */
    private final CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of RestorableSqlResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RestorableSqlResourcesClientImpl(CosmosDBManagementClientImpl client) {
        this.service =
            RestProxy
                .create(RestorableSqlResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CosmosDBManagementClientRestorableSqlResources to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CosmosDBManagementCl")
    private interface RestorableSqlResourcesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}"
                + "/restorableDatabaseAccounts/{instanceId}/restorableSqlResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RestorableSqlResourcesListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @PathParam("instanceId") String instanceId,
            @QueryParam("restoreLocation") String restoreLocation,
            @QueryParam("restoreTimestampInUtc") String restoreTimestampInUtc,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Return a list of database and container combo that exist on the account at the given timestamp and location. This
     * helps in scenarios to validate what resources exist at given timestamp and location. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restoreLocation The location where the restorable resources are located.
     * @param restoreTimestampInUtc The timestamp when the restorable resources existed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable SQL resources along with {@link PagedResponse}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DatabaseRestoreResourceInner>> listSinglePageAsync(
        String location, String instanceId, String restoreLocation, String restoreTimestampInUtc) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (instanceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
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
                            location,
                            instanceId,
                            restoreLocation,
                            restoreTimestampInUtc,
                            accept,
                            context))
            .<PagedResponse<DatabaseRestoreResourceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Return a list of database and container combo that exist on the account at the given timestamp and location. This
     * helps in scenarios to validate what resources exist at given timestamp and location. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restoreLocation The location where the restorable resources are located.
     * @param restoreTimestampInUtc The timestamp when the restorable resources existed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable SQL resources along with {@link PagedResponse}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DatabaseRestoreResourceInner>> listSinglePageAsync(
        String location, String instanceId, String restoreLocation, String restoreTimestampInUtc, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (instanceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                location,
                instanceId,
                restoreLocation,
                restoreTimestampInUtc,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Return a list of database and container combo that exist on the account at the given timestamp and location. This
     * helps in scenarios to validate what resources exist at given timestamp and location. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restoreLocation The location where the restorable resources are located.
     * @param restoreTimestampInUtc The timestamp when the restorable resources existed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable SQL resources as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DatabaseRestoreResourceInner> listAsync(
        String location, String instanceId, String restoreLocation, String restoreTimestampInUtc) {
        return new PagedFlux<>(() -> listSinglePageAsync(location, instanceId, restoreLocation, restoreTimestampInUtc));
    }

    /**
     * Return a list of database and container combo that exist on the account at the given timestamp and location. This
     * helps in scenarios to validate what resources exist at given timestamp and location. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable SQL resources as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DatabaseRestoreResourceInner> listAsync(String location, String instanceId) {
        final String restoreLocation = null;
        final String restoreTimestampInUtc = null;
        return new PagedFlux<>(() -> listSinglePageAsync(location, instanceId, restoreLocation, restoreTimestampInUtc));
    }

    /**
     * Return a list of database and container combo that exist on the account at the given timestamp and location. This
     * helps in scenarios to validate what resources exist at given timestamp and location. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restoreLocation The location where the restorable resources are located.
     * @param restoreTimestampInUtc The timestamp when the restorable resources existed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable SQL resources as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DatabaseRestoreResourceInner> listAsync(
        String location, String instanceId, String restoreLocation, String restoreTimestampInUtc, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, instanceId, restoreLocation, restoreTimestampInUtc, context));
    }

    /**
     * Return a list of database and container combo that exist on the account at the given timestamp and location. This
     * helps in scenarios to validate what resources exist at given timestamp and location. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable SQL resources as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DatabaseRestoreResourceInner> list(String location, String instanceId) {
        final String restoreLocation = null;
        final String restoreTimestampInUtc = null;
        return new PagedIterable<>(listAsync(location, instanceId, restoreLocation, restoreTimestampInUtc));
    }

    /**
     * Return a list of database and container combo that exist on the account at the given timestamp and location. This
     * helps in scenarios to validate what resources exist at given timestamp and location. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restoreLocation The location where the restorable resources are located.
     * @param restoreTimestampInUtc The timestamp when the restorable resources existed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable SQL resources as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DatabaseRestoreResourceInner> list(
        String location, String instanceId, String restoreLocation, String restoreTimestampInUtc, Context context) {
        return new PagedIterable<>(listAsync(location, instanceId, restoreLocation, restoreTimestampInUtc, context));
    }
}
