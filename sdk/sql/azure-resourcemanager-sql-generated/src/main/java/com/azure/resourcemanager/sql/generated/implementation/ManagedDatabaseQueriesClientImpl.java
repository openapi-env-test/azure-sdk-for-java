// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

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
import com.azure.resourcemanager.sql.generated.fluent.ManagedDatabaseQueriesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceQueryInner;
import com.azure.resourcemanager.sql.generated.fluent.models.QueryStatisticsInner;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceQueryStatistics;
import com.azure.resourcemanager.sql.generated.models.QueryTimeGrainType;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ManagedDatabaseQueriesClient. */
public final class ManagedDatabaseQueriesClientImpl implements ManagedDatabaseQueriesClient {
    private final ClientLogger logger = new ClientLogger(ManagedDatabaseQueriesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ManagedDatabaseQueriesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedDatabaseQueriesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ManagedDatabaseQueriesClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(ManagedDatabaseQueriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientManagedDatabaseQueries to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientM")
    private interface ManagedDatabaseQueriesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/databases/{databaseName}/queries/{queryId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ManagedInstanceQueryInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("databaseName") String databaseName,
            @PathParam("queryId") String queryId,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/databases/{databaseName}/queries/{queryId}/statistics")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ManagedInstanceQueryStatistics>> listByQuery(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("databaseName") String databaseName,
            @PathParam("queryId") String queryId,
            @QueryParam("startTime") String startTime,
            @QueryParam("endTime") String endTime,
            @QueryParam("interval") QueryTimeGrainType interval,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ManagedInstanceQueryStatistics>> listByQueryNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get query by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query by query id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagedInstanceQueryInner>> getWithResponseAsync(
        String resourceGroupName, String managedInstanceName, String databaseName, String queryId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (queryId == null) {
            return Mono.error(new IllegalArgumentException("Parameter queryId is required and cannot be null."));
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
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            managedInstanceName,
                            databaseName,
                            queryId,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get query by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query by query id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagedInstanceQueryInner>> getWithResponseAsync(
        String resourceGroupName, String managedInstanceName, String databaseName, String queryId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (queryId == null) {
            return Mono.error(new IllegalArgumentException("Parameter queryId is required and cannot be null."));
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
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                managedInstanceName,
                databaseName,
                queryId,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Get query by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query by query id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ManagedInstanceQueryInner> getAsync(
        String resourceGroupName, String managedInstanceName, String databaseName, String queryId) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, queryId)
            .flatMap(
                (Response<ManagedInstanceQueryInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get query by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query by query id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceQueryInner get(
        String resourceGroupName, String managedInstanceName, String databaseName, String queryId) {
        return getAsync(resourceGroupName, managedInstanceName, databaseName, queryId).block();
    }

    /**
     * Get query by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query by query id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ManagedInstanceQueryInner> getWithResponse(
        String resourceGroupName, String managedInstanceName, String databaseName, String queryId, Context context) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, queryId, context).block();
    }

    /**
     * Get query execution statistics by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @param startTime Start time for observed period.
     * @param endTime End time for observed period.
     * @param interval The time step to be used to summarize the metric values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query execution statistics by query id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<QueryStatisticsInner>> listByQuerySinglePageAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String queryId,
        String startTime,
        String endTime,
        QueryTimeGrainType interval) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (queryId == null) {
            return Mono.error(new IllegalArgumentException("Parameter queryId is required and cannot be null."));
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
                        .listByQuery(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            managedInstanceName,
                            databaseName,
                            queryId,
                            startTime,
                            endTime,
                            interval,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<QueryStatisticsInner>>map(
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
     * Get query execution statistics by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @param startTime Start time for observed period.
     * @param endTime End time for observed period.
     * @param interval The time step to be used to summarize the metric values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query execution statistics by query id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<QueryStatisticsInner>> listByQuerySinglePageAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String queryId,
        String startTime,
        String endTime,
        QueryTimeGrainType interval,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (queryId == null) {
            return Mono.error(new IllegalArgumentException("Parameter queryId is required and cannot be null."));
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
            .listByQuery(
                this.client.getEndpoint(),
                resourceGroupName,
                managedInstanceName,
                databaseName,
                queryId,
                startTime,
                endTime,
                interval,
                this.client.getSubscriptionId(),
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
     * Get query execution statistics by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @param startTime Start time for observed period.
     * @param endTime End time for observed period.
     * @param interval The time step to be used to summarize the metric values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query execution statistics by query id.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<QueryStatisticsInner> listByQueryAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String queryId,
        String startTime,
        String endTime,
        QueryTimeGrainType interval) {
        return new PagedFlux<>(
            () ->
                listByQuerySinglePageAsync(
                    resourceGroupName, managedInstanceName, databaseName, queryId, startTime, endTime, interval),
            nextLink -> listByQueryNextSinglePageAsync(nextLink));
    }

    /**
     * Get query execution statistics by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query execution statistics by query id.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<QueryStatisticsInner> listByQueryAsync(
        String resourceGroupName, String managedInstanceName, String databaseName, String queryId) {
        final String startTime = null;
        final String endTime = null;
        final QueryTimeGrainType interval = null;
        return new PagedFlux<>(
            () ->
                listByQuerySinglePageAsync(
                    resourceGroupName, managedInstanceName, databaseName, queryId, startTime, endTime, interval),
            nextLink -> listByQueryNextSinglePageAsync(nextLink));
    }

    /**
     * Get query execution statistics by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @param startTime Start time for observed period.
     * @param endTime End time for observed period.
     * @param interval The time step to be used to summarize the metric values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query execution statistics by query id.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<QueryStatisticsInner> listByQueryAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String queryId,
        String startTime,
        String endTime,
        QueryTimeGrainType interval,
        Context context) {
        return new PagedFlux<>(
            () ->
                listByQuerySinglePageAsync(
                    resourceGroupName,
                    managedInstanceName,
                    databaseName,
                    queryId,
                    startTime,
                    endTime,
                    interval,
                    context),
            nextLink -> listByQueryNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get query execution statistics by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query execution statistics by query id.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<QueryStatisticsInner> listByQuery(
        String resourceGroupName, String managedInstanceName, String databaseName, String queryId) {
        final String startTime = null;
        final String endTime = null;
        final QueryTimeGrainType interval = null;
        return new PagedIterable<>(
            listByQueryAsync(
                resourceGroupName, managedInstanceName, databaseName, queryId, startTime, endTime, interval));
    }

    /**
     * Get query execution statistics by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @param startTime Start time for observed period.
     * @param endTime End time for observed period.
     * @param interval The time step to be used to summarize the metric values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query execution statistics by query id.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<QueryStatisticsInner> listByQuery(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String queryId,
        String startTime,
        String endTime,
        QueryTimeGrainType interval,
        Context context) {
        return new PagedIterable<>(
            listByQueryAsync(
                resourceGroupName, managedInstanceName, databaseName, queryId, startTime, endTime, interval, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return execution statistics for one particular query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<QueryStatisticsInner>> listByQueryNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listByQueryNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<QueryStatisticsInner>>map(
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
     * @return execution statistics for one particular query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<QueryStatisticsInner>> listByQueryNextSinglePageAsync(String nextLink, Context context) {
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
            .listByQueryNext(nextLink, this.client.getEndpoint(), accept, context)
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
