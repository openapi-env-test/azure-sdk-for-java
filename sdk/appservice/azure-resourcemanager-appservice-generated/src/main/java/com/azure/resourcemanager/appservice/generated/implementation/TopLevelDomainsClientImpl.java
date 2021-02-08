// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.resourcemanager.appservice.generated.fluent.TopLevelDomainsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.TldLegalAgreementInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.TopLevelDomainInner;
import com.azure.resourcemanager.appservice.generated.models.TldLegalAgreementCollection;
import com.azure.resourcemanager.appservice.generated.models.TopLevelDomainAgreementOption;
import com.azure.resourcemanager.appservice.generated.models.TopLevelDomainCollection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TopLevelDomainsClient. */
public final class TopLevelDomainsClientImpl implements TopLevelDomainsClient {
    private final ClientLogger logger = new ClientLogger(TopLevelDomainsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final TopLevelDomainsService service;

    /** The service client containing this operation class. */
    private final WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of TopLevelDomainsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TopLevelDomainsClientImpl(WebSiteManagementClientImpl client) {
        this.service =
            RestProxy.create(TopLevelDomainsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for WebSiteManagementClientTopLevelDomains to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WebSiteManagementCli")
    private interface TopLevelDomainsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TopLevelDomainCollection>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains/{name}")
        @ExpectedResponses({200, 200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TopLevelDomainInner>> getTopLevelDomain(
            @HostParam("$host") String endpoint,
            @PathParam("name") String name,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains/{name}"
                + "/listAgreements")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TldLegalAgreementCollection>> listTopLevelDomainAgreements(
            @HostParam("$host") String endpoint,
            @PathParam("name") String name,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") TopLevelDomainAgreementOption agreementOption,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TopLevelDomainCollection>> getTopLevelDomainsNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TldLegalAgreementCollection>> listTopLevelDomainAgreementsNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists all top level domains supported for registration.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top Level Domains.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TopLevelDomainInner>> listSinglePageAsync() {
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
        final String apiVersion = "2015-08-01";
        final String accept = "application/json, text/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, accept, context))
            .<PagedResponse<TopLevelDomainInner>>map(
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
     * Lists all top level domains supported for registration.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top Level Domains.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TopLevelDomainInner>> listSinglePageAsync(Context context) {
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
        final String apiVersion = "2015-08-01";
        final String accept = "application/json, text/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, accept, context)
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
     * Lists all top level domains supported for registration.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top Level Domains.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TopLevelDomainInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(), nextLink -> getTopLevelDomainsNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all top level domains supported for registration.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top Level Domains.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TopLevelDomainInner> listAsync(Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(context), nextLink -> getTopLevelDomainsNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists all top level domains supported for registration.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top Level Domains.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TopLevelDomainInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Lists all top level domains supported for registration.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top Level Domains.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TopLevelDomainInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Gets details of a top level domain.
     *
     * @param name Name of the top level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a top level domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<TopLevelDomainInner>> getTopLevelDomainWithResponseAsync(String name) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2015-08-01";
        final String accept = "application/json, text/json, application/xml, text/xml";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getTopLevelDomain(
                            this.client.getEndpoint(),
                            name,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets details of a top level domain.
     *
     * @param name Name of the top level domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a top level domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<TopLevelDomainInner>> getTopLevelDomainWithResponseAsync(String name, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2015-08-01";
        final String accept = "application/json, text/json, application/xml, text/xml";
        context = this.client.mergeContext(context);
        return service
            .getTopLevelDomain(
                this.client.getEndpoint(), name, this.client.getSubscriptionId(), apiVersion, accept, context);
    }

    /**
     * Gets details of a top level domain.
     *
     * @param name Name of the top level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a top level domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TopLevelDomainInner> getTopLevelDomainAsync(String name) {
        return getTopLevelDomainWithResponseAsync(name)
            .flatMap(
                (Response<TopLevelDomainInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets details of a top level domain.
     *
     * @param name Name of the top level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a top level domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TopLevelDomainInner getTopLevelDomain(String name) {
        return getTopLevelDomainAsync(name).block();
    }

    /**
     * Gets details of a top level domain.
     *
     * @param name Name of the top level domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a top level domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<TopLevelDomainInner> getTopLevelDomainWithResponse(String name, Context context) {
        return getTopLevelDomainWithResponseAsync(name, context).block();
    }

    /**
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain.
     * @param agreementOption Domain agreement options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Tld Legal Agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TldLegalAgreementInner>> listTopLevelDomainAgreementsSinglePageAsync(
        String name, TopLevelDomainAgreementOption agreementOption) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (agreementOption == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter agreementOption is required and cannot be null."));
        } else {
            agreementOption.validate();
        }
        final String apiVersion = "2015-08-01";
        final String accept = "application/json, text/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listTopLevelDomainAgreements(
                            this.client.getEndpoint(),
                            name,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            agreementOption,
                            accept,
                            context))
            .<PagedResponse<TldLegalAgreementInner>>map(
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
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain.
     * @param agreementOption Domain agreement options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Tld Legal Agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TldLegalAgreementInner>> listTopLevelDomainAgreementsSinglePageAsync(
        String name, TopLevelDomainAgreementOption agreementOption, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (agreementOption == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter agreementOption is required and cannot be null."));
        } else {
            agreementOption.validate();
        }
        final String apiVersion = "2015-08-01";
        final String accept = "application/json, text/json";
        context = this.client.mergeContext(context);
        return service
            .listTopLevelDomainAgreements(
                this.client.getEndpoint(),
                name,
                this.client.getSubscriptionId(),
                apiVersion,
                agreementOption,
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
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain.
     * @param agreementOption Domain agreement options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Tld Legal Agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TldLegalAgreementInner> listTopLevelDomainAgreementsAsync(
        String name, TopLevelDomainAgreementOption agreementOption) {
        return new PagedFlux<>(
            () -> listTopLevelDomainAgreementsSinglePageAsync(name, agreementOption),
            nextLink -> listTopLevelDomainAgreementsNextSinglePageAsync(nextLink));
    }

    /**
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain.
     * @param agreementOption Domain agreement options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Tld Legal Agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TldLegalAgreementInner> listTopLevelDomainAgreementsAsync(
        String name, TopLevelDomainAgreementOption agreementOption, Context context) {
        return new PagedFlux<>(
            () -> listTopLevelDomainAgreementsSinglePageAsync(name, agreementOption, context),
            nextLink -> listTopLevelDomainAgreementsNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain.
     * @param agreementOption Domain agreement options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Tld Legal Agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TldLegalAgreementInner> listTopLevelDomainAgreements(
        String name, TopLevelDomainAgreementOption agreementOption) {
        return new PagedIterable<>(listTopLevelDomainAgreementsAsync(name, agreementOption));
    }

    /**
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain.
     * @param agreementOption Domain agreement options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Tld Legal Agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TldLegalAgreementInner> listTopLevelDomainAgreements(
        String name, TopLevelDomainAgreementOption agreementOption, Context context) {
        return new PagedIterable<>(listTopLevelDomainAgreementsAsync(name, agreementOption, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top Level Domains.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TopLevelDomainInner>> getTopLevelDomainsNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json, text/json";
        return FluxUtil
            .withContext(
                context -> service.getTopLevelDomainsNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<TopLevelDomainInner>>map(
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
     * @return collection of Top Level Domains.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TopLevelDomainInner>> getTopLevelDomainsNextSinglePageAsync(
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
        final String accept = "application/json, text/json";
        context = this.client.mergeContext(context);
        return service
            .getTopLevelDomainsNext(nextLink, this.client.getEndpoint(), accept, context)
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
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Tld Legal Agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TldLegalAgreementInner>> listTopLevelDomainAgreementsNextSinglePageAsync(
        String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json, text/json";
        return FluxUtil
            .withContext(
                context ->
                    service.listTopLevelDomainAgreementsNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<TldLegalAgreementInner>>map(
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
     * @return collection of Tld Legal Agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TldLegalAgreementInner>> listTopLevelDomainAgreementsNextSinglePageAsync(
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
        final String accept = "application/json, text/json";
        context = this.client.mergeContext(context);
        return service
            .listTopLevelDomainAgreementsNext(nextLink, this.client.getEndpoint(), accept, context)
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
