// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

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
import com.azure.resourcemanager.billing.fluent.AgreementsClient;
import com.azure.resourcemanager.billing.fluent.models.AgreementInner;
import com.azure.resourcemanager.billing.models.AgreementListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AgreementsClient. */
public final class AgreementsClientImpl implements AgreementsClient {
    private final ClientLogger logger = new ClientLogger(AgreementsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final AgreementsService service;

    /** The service client containing this operation class. */
    private final BillingManagementClientImpl client;

    /**
     * Initializes an instance of AgreementsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AgreementsClientImpl(BillingManagementClientImpl client) {
        this.service =
            RestProxy.create(AgreementsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingManagementClientAgreements to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "BillingManagementCli")
    private interface AgreementsService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/agreements")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AgreementListResult>> listByBillingAccount(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("billingAccountName") String billingAccountName,
            @QueryParam("$expand") String expand,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/agreements/{agreementName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AgreementInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("billingAccountName") String billingAccountName,
            @PathParam("agreementName") String agreementName,
            @QueryParam("$expand") String expand,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AgreementListResult>> listByBillingAccountNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists the agreements for a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AgreementInner>> listByBillingAccountSinglePageAsync(
        String billingAccountName, String expand) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByBillingAccount(
                            this.client.getEndpoint(), apiVersion, billingAccountName, expand, accept, context))
            .<PagedResponse<AgreementInner>>map(
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
     * Lists the agreements for a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the participants.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AgreementInner>> listByBillingAccountSinglePageAsync(
        String billingAccountName, String expand, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByBillingAccount(this.client.getEndpoint(), apiVersion, billingAccountName, expand, accept, context)
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
     * Lists the agreements for a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AgreementInner> listByBillingAccountAsync(String billingAccountName, String expand) {
        return new PagedFlux<>(
            () -> listByBillingAccountSinglePageAsync(billingAccountName, expand),
            nextLink -> listByBillingAccountNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the agreements for a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AgreementInner> listByBillingAccountAsync(String billingAccountName) {
        final String expand = null;
        return new PagedFlux<>(
            () -> listByBillingAccountSinglePageAsync(billingAccountName, expand),
            nextLink -> listByBillingAccountNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the agreements for a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the participants.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AgreementInner> listByBillingAccountAsync(
        String billingAccountName, String expand, Context context) {
        return new PagedFlux<>(
            () -> listByBillingAccountSinglePageAsync(billingAccountName, expand, context),
            nextLink -> listByBillingAccountNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the agreements for a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AgreementInner> listByBillingAccount(String billingAccountName) {
        final String expand = null;
        return new PagedIterable<>(listByBillingAccountAsync(billingAccountName, expand));
    }

    /**
     * Lists the agreements for a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the participants.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AgreementInner> listByBillingAccount(
        String billingAccountName, String expand, Context context) {
        return new PagedIterable<>(listByBillingAccountAsync(billingAccountName, expand, context));
    }

    /**
     * Gets an agreement by ID.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param agreementName The ID that uniquely identifies an agreement.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an agreement by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AgreementInner>> getWithResponseAsync(
        String billingAccountName, String agreementName, String expand) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (agreementName == null) {
            return Mono.error(new IllegalArgumentException("Parameter agreementName is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            billingAccountName,
                            agreementName,
                            expand,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets an agreement by ID.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param agreementName The ID that uniquely identifies an agreement.
     * @param expand May be used to expand the participants.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an agreement by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AgreementInner>> getWithResponseAsync(
        String billingAccountName, String agreementName, String expand, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (agreementName == null) {
            return Mono.error(new IllegalArgumentException("Parameter agreementName is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(this.client.getEndpoint(), apiVersion, billingAccountName, agreementName, expand, accept, context);
    }

    /**
     * Gets an agreement by ID.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param agreementName The ID that uniquely identifies an agreement.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an agreement by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AgreementInner> getAsync(String billingAccountName, String agreementName, String expand) {
        return getWithResponseAsync(billingAccountName, agreementName, expand)
            .flatMap(
                (Response<AgreementInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets an agreement by ID.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param agreementName The ID that uniquely identifies an agreement.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an agreement by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AgreementInner> getAsync(String billingAccountName, String agreementName) {
        final String expand = null;
        return getWithResponseAsync(billingAccountName, agreementName, expand)
            .flatMap(
                (Response<AgreementInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets an agreement by ID.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param agreementName The ID that uniquely identifies an agreement.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an agreement by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AgreementInner get(String billingAccountName, String agreementName) {
        final String expand = null;
        return getAsync(billingAccountName, agreementName, expand).block();
    }

    /**
     * Gets an agreement by ID.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param agreementName The ID that uniquely identifies an agreement.
     * @param expand May be used to expand the participants.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an agreement by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AgreementInner> getWithResponse(
        String billingAccountName, String agreementName, String expand, Context context) {
        return getWithResponseAsync(billingAccountName, agreementName, expand, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AgreementInner>> listByBillingAccountNextSinglePageAsync(String nextLink) {
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
            .withContext(
                context -> service.listByBillingAccountNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<AgreementInner>>map(
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
     * @return result of listing agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AgreementInner>> listByBillingAccountNextSinglePageAsync(
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
            .listByBillingAccountNext(nextLink, this.client.getEndpoint(), accept, context)
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
