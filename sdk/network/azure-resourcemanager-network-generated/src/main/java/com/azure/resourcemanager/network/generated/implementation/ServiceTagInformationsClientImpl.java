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
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ServiceTagInformationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceTagInformationInner;
import com.azure.resourcemanager.network.generated.models.ServiceTagInformationListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ServiceTagInformationsClient. */
public final class ServiceTagInformationsClientImpl implements ServiceTagInformationsClient {
    private final ClientLogger logger = new ClientLogger(ServiceTagInformationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ServiceTagInformationsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ServiceTagInformationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServiceTagInformationsClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(ServiceTagInformationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientServiceTagInformations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface ServiceTagInformationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/locations/{location}/serviceTagDetails")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServiceTagInformationListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("noAddressPrefixes") Boolean noAddressPrefixes,
            @QueryParam("tagName") String tagName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServiceTagInformationListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a list of service tag information resources with pagination.
     *
     * @param location The location that will be used as a reference for cloud (not as a filter based on location, you
     *     will get the list of service tags with prefix details across all regions but limited to the cloud that your
     *     subscription belongs to).
     * @param noAddressPrefixes Do not return address prefixes for the tag(s).
     * @param tagName Return tag information for a particular tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service tag information resources with pagination.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ServiceTagInformationInner>> listSinglePageAsync(
        String location, Boolean noAddressPrefixes, String tagName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            location,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            noAddressPrefixes,
                            tagName,
                            accept,
                            context))
            .<PagedResponse<ServiceTagInformationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of service tag information resources with pagination.
     *
     * @param location The location that will be used as a reference for cloud (not as a filter based on location, you
     *     will get the list of service tags with prefix details across all regions but limited to the cloud that your
     *     subscription belongs to).
     * @param noAddressPrefixes Do not return address prefixes for the tag(s).
     * @param tagName Return tag information for a particular tag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service tag information resources with pagination.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ServiceTagInformationInner>> listSinglePageAsync(
        String location, Boolean noAddressPrefixes, String tagName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                location,
                apiVersion,
                this.client.getSubscriptionId(),
                noAddressPrefixes,
                tagName,
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
     * Gets a list of service tag information resources with pagination.
     *
     * @param location The location that will be used as a reference for cloud (not as a filter based on location, you
     *     will get the list of service tags with prefix details across all regions but limited to the cloud that your
     *     subscription belongs to).
     * @param noAddressPrefixes Do not return address prefixes for the tag(s).
     * @param tagName Return tag information for a particular tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service tag information resources with pagination.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ServiceTagInformationInner> listAsync(
        String location, Boolean noAddressPrefixes, String tagName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, noAddressPrefixes, tagName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of service tag information resources with pagination.
     *
     * @param location The location that will be used as a reference for cloud (not as a filter based on location, you
     *     will get the list of service tags with prefix details across all regions but limited to the cloud that your
     *     subscription belongs to).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service tag information resources with pagination.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ServiceTagInformationInner> listAsync(String location) {
        final Boolean noAddressPrefixes = null;
        final String tagName = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, noAddressPrefixes, tagName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of service tag information resources with pagination.
     *
     * @param location The location that will be used as a reference for cloud (not as a filter based on location, you
     *     will get the list of service tags with prefix details across all regions but limited to the cloud that your
     *     subscription belongs to).
     * @param noAddressPrefixes Do not return address prefixes for the tag(s).
     * @param tagName Return tag information for a particular tag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service tag information resources with pagination.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ServiceTagInformationInner> listAsync(
        String location, Boolean noAddressPrefixes, String tagName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, noAddressPrefixes, tagName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of service tag information resources with pagination.
     *
     * @param location The location that will be used as a reference for cloud (not as a filter based on location, you
     *     will get the list of service tags with prefix details across all regions but limited to the cloud that your
     *     subscription belongs to).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service tag information resources with pagination.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceTagInformationInner> list(String location) {
        final Boolean noAddressPrefixes = null;
        final String tagName = null;
        return new PagedIterable<>(listAsync(location, noAddressPrefixes, tagName));
    }

    /**
     * Gets a list of service tag information resources with pagination.
     *
     * @param location The location that will be used as a reference for cloud (not as a filter based on location, you
     *     will get the list of service tags with prefix details across all regions but limited to the cloud that your
     *     subscription belongs to).
     * @param noAddressPrefixes Do not return address prefixes for the tag(s).
     * @param tagName Return tag information for a particular tag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service tag information resources with pagination.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceTagInformationInner> list(
        String location, Boolean noAddressPrefixes, String tagName, Context context) {
        return new PagedIterable<>(listAsync(location, noAddressPrefixes, tagName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Get ServiceTagInformation API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ServiceTagInformationInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<ServiceTagInformationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Get ServiceTagInformation API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ServiceTagInformationInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
