// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.reservations.fluent.ExchangesClient;
import com.azure.resourcemanager.reservations.fluent.models.ExchangeOperationResultResponseInner;
import com.azure.resourcemanager.reservations.models.ExchangeRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ExchangesClient. */
public final class ExchangesClientImpl implements ExchangesClient {
    /** The proxy service used to perform REST calls. */
    private final ExchangesService service;

    /** The service client containing this operation class. */
    private final AzureReservationApiImpl client;

    /**
     * Initializes an instance of ExchangesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ExchangesClientImpl(AzureReservationApiImpl client) {
        this.service =
            RestProxy.create(ExchangesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureReservationApiExchanges to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureReservationApiE")
    public interface ExchangesService {
        @Headers({"Content-Type: application/json"})
        @Post("/providers/Microsoft.Capacity/exchange")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> post(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ExchangeRequest body,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Exchange Reservation(s)
     *
     * <p>Returns one or more `Reservations` in exchange for one or more `Reservation` purchases.
     *
     * @param body Request containing the refunds and purchases that need to be executed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exchange operation result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> postWithResponseAsync(ExchangeRequest body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String apiVersion = "2022-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.post(this.client.getEndpoint(), apiVersion, body, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Exchange Reservation(s)
     *
     * <p>Returns one or more `Reservations` in exchange for one or more `Reservation` purchases.
     *
     * @param body Request containing the refunds and purchases that need to be executed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exchange operation result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> postWithResponseAsync(ExchangeRequest body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String apiVersion = "2022-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.post(this.client.getEndpoint(), apiVersion, body, accept, context);
    }

    /**
     * Exchange Reservation(s)
     *
     * <p>Returns one or more `Reservations` in exchange for one or more `Reservation` purchases.
     *
     * @param body Request containing the refunds and purchases that need to be executed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of exchange operation result.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<ExchangeOperationResultResponseInner>, ExchangeOperationResultResponseInner>
        beginPostAsync(ExchangeRequest body) {
        Mono<Response<Flux<ByteBuffer>>> mono = postWithResponseAsync(body);
        return this
            .client
            .<ExchangeOperationResultResponseInner, ExchangeOperationResultResponseInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                ExchangeOperationResultResponseInner.class,
                ExchangeOperationResultResponseInner.class,
                this.client.getContext());
    }

    /**
     * Exchange Reservation(s)
     *
     * <p>Returns one or more `Reservations` in exchange for one or more `Reservation` purchases.
     *
     * @param body Request containing the refunds and purchases that need to be executed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of exchange operation result.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<ExchangeOperationResultResponseInner>, ExchangeOperationResultResponseInner>
        beginPostAsync(ExchangeRequest body, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono = postWithResponseAsync(body, context);
        return this
            .client
            .<ExchangeOperationResultResponseInner, ExchangeOperationResultResponseInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                ExchangeOperationResultResponseInner.class,
                ExchangeOperationResultResponseInner.class,
                context);
    }

    /**
     * Exchange Reservation(s)
     *
     * <p>Returns one or more `Reservations` in exchange for one or more `Reservation` purchases.
     *
     * @param body Request containing the refunds and purchases that need to be executed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of exchange operation result.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<ExchangeOperationResultResponseInner>, ExchangeOperationResultResponseInner> beginPost(
        ExchangeRequest body) {
        return beginPostAsync(body).getSyncPoller();
    }

    /**
     * Exchange Reservation(s)
     *
     * <p>Returns one or more `Reservations` in exchange for one or more `Reservation` purchases.
     *
     * @param body Request containing the refunds and purchases that need to be executed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of exchange operation result.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<ExchangeOperationResultResponseInner>, ExchangeOperationResultResponseInner> beginPost(
        ExchangeRequest body, Context context) {
        return beginPostAsync(body, context).getSyncPoller();
    }

    /**
     * Exchange Reservation(s)
     *
     * <p>Returns one or more `Reservations` in exchange for one or more `Reservation` purchases.
     *
     * @param body Request containing the refunds and purchases that need to be executed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exchange operation result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ExchangeOperationResultResponseInner> postAsync(ExchangeRequest body) {
        return beginPostAsync(body).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Exchange Reservation(s)
     *
     * <p>Returns one or more `Reservations` in exchange for one or more `Reservation` purchases.
     *
     * @param body Request containing the refunds and purchases that need to be executed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exchange operation result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ExchangeOperationResultResponseInner> postAsync(ExchangeRequest body, Context context) {
        return beginPostAsync(body, context).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Exchange Reservation(s)
     *
     * <p>Returns one or more `Reservations` in exchange for one or more `Reservation` purchases.
     *
     * @param body Request containing the refunds and purchases that need to be executed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exchange operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExchangeOperationResultResponseInner post(ExchangeRequest body) {
        return postAsync(body).block();
    }

    /**
     * Exchange Reservation(s)
     *
     * <p>Returns one or more `Reservations` in exchange for one or more `Reservation` purchases.
     *
     * @param body Request containing the refunds and purchases that need to be executed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exchange operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExchangeOperationResultResponseInner post(ExchangeRequest body, Context context) {
        return postAsync(body, context).block();
    }
}
