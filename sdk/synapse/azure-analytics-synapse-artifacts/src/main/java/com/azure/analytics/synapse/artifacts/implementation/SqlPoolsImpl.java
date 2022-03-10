// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.implementation;

import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.analytics.synapse.artifacts.models.SqlPool;
import com.azure.analytics.synapse.artifacts.models.SqlPoolInfoListResult;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SqlPools. */
public final class SqlPoolsImpl {
    /** The proxy service used to perform REST calls. */
    private final SqlPoolsService service;

    /** The service client containing this operation class. */
    private final ArtifactsClientImpl client;

    /**
     * Initializes an instance of SqlPoolsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SqlPoolsImpl(ArtifactsClientImpl client) {
        this.service = RestProxy.create(SqlPoolsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ArtifactsClientSqlPools to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ArtifactsClientSqlPo")
    private interface SqlPoolsService {
        @Get("/sqlPools")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorContractException.class)
        Mono<Response<SqlPoolInfoListResult>> list(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/sqlPools/{sqlPoolName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorContractException.class)
        Mono<Response<SqlPool>> get(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("sqlPoolName") String sqlPoolName,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * List Sql Pools.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL pool collection along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SqlPoolInfoListResult>> listWithResponseAsync() {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.list(this.client.getEndpoint(), apiVersion, accept, context));
    }

    /**
     * List Sql Pools.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL pool collection along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SqlPoolInfoListResult>> listWithResponseAsync(Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.list(this.client.getEndpoint(), apiVersion, accept, context);
    }

    /**
     * List Sql Pools.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL pool collection on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlPoolInfoListResult> listAsync() {
        return listWithResponseAsync()
                .flatMap(
                        (Response<SqlPoolInfoListResult> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * List Sql Pools.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL pool collection on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlPoolInfoListResult> listAsync(Context context) {
        return listWithResponseAsync(context)
                .flatMap(
                        (Response<SqlPoolInfoListResult> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * List Sql Pools.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL pool collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SqlPoolInfoListResult list() {
        return listAsync().block();
    }

    /**
     * List Sql Pools.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL pool collection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SqlPoolInfoListResult> listWithResponse(Context context) {
        return listWithResponseAsync(context).block();
    }

    /**
     * Get Sql Pool.
     *
     * @param sqlPoolName The Sql Pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Pool along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SqlPool>> getWithResponseAsync(String sqlPoolName) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.get(this.client.getEndpoint(), apiVersion, sqlPoolName, accept, context));
    }

    /**
     * Get Sql Pool.
     *
     * @param sqlPoolName The Sql Pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Pool along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SqlPool>> getWithResponseAsync(String sqlPoolName, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.get(this.client.getEndpoint(), apiVersion, sqlPoolName, accept, context);
    }

    /**
     * Get Sql Pool.
     *
     * @param sqlPoolName The Sql Pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Pool on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlPool> getAsync(String sqlPoolName) {
        return getWithResponseAsync(sqlPoolName)
                .flatMap(
                        (Response<SqlPool> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get Sql Pool.
     *
     * @param sqlPoolName The Sql Pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Pool on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlPool> getAsync(String sqlPoolName, Context context) {
        return getWithResponseAsync(sqlPoolName, context)
                .flatMap(
                        (Response<SqlPool> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get Sql Pool.
     *
     * @param sqlPoolName The Sql Pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SqlPool get(String sqlPoolName) {
        return getAsync(sqlPoolName).block();
    }

    /**
     * Get Sql Pool.
     *
     * @param sqlPoolName The Sql Pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Pool along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SqlPool> getWithResponse(String sqlPoolName, Context context) {
        return getWithResponseAsync(sqlPoolName, context).block();
    }
}
