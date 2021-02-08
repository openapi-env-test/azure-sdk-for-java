// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

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
import com.azure.resourcemanager.compute.generated.fluent.SharedGalleryImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.SharedGalleryImageInner;
import com.azure.resourcemanager.compute.generated.models.ApiErrorException;
import com.azure.resourcemanager.compute.generated.models.SharedGalleryImageList;
import com.azure.resourcemanager.compute.generated.models.SharedToValues;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SharedGalleryImagesClient. */
public final class SharedGalleryImagesClientImpl implements SharedGalleryImagesClient {
    private final ClientLogger logger = new ClientLogger(SharedGalleryImagesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final SharedGalleryImagesService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of SharedGalleryImagesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SharedGalleryImagesClientImpl(ComputeManagementClientImpl client) {
        this.service =
            RestProxy.create(SharedGalleryImagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientSharedGalleryImages to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface SharedGalleryImagesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/sharedGalleries"
                + "/{galleryUniqueName}/images")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<SharedGalleryImageList>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("galleryUniqueName") String galleryUniqueName,
            @QueryParam("sharedTo") SharedToValues sharedTo,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/sharedGalleries"
                + "/{galleryUniqueName}/images/{galleryImageName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<SharedGalleryImageInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("galleryUniqueName") String galleryUniqueName,
            @PathParam("galleryImageName") String galleryImageName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<SharedGalleryImageList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List shared gallery images by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SharedGalleryImageInner>> listSinglePageAsync(
        String location, String galleryUniqueName, SharedToValues sharedTo) {
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
        if (galleryUniqueName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryUniqueName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            galleryUniqueName,
                            sharedTo,
                            accept,
                            context))
            .<PagedResponse<SharedGalleryImageInner>>map(
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
     * List shared gallery images by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SharedGalleryImageInner>> listSinglePageAsync(
        String location, String galleryUniqueName, SharedToValues sharedTo, Context context) {
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
        if (galleryUniqueName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryUniqueName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                galleryUniqueName,
                sharedTo,
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
     * List shared gallery images by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SharedGalleryImageInner> listAsync(
        String location, String galleryUniqueName, SharedToValues sharedTo) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, galleryUniqueName, sharedTo),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List shared gallery images by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SharedGalleryImageInner> listAsync(String location, String galleryUniqueName) {
        final SharedToValues sharedTo = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, galleryUniqueName, sharedTo),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List shared gallery images by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SharedGalleryImageInner> listAsync(
        String location, String galleryUniqueName, SharedToValues sharedTo, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, galleryUniqueName, sharedTo, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List shared gallery images by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SharedGalleryImageInner> list(String location, String galleryUniqueName) {
        final SharedToValues sharedTo = null;
        return new PagedIterable<>(listAsync(location, galleryUniqueName, sharedTo));
    }

    /**
     * List shared gallery images by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SharedGalleryImageInner> list(
        String location, String galleryUniqueName, SharedToValues sharedTo, Context context) {
        return new PagedIterable<>(listAsync(location, galleryUniqueName, sharedTo, context));
    }

    /**
     * Get a shared gallery image by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     *     listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image by subscription id or tenant id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SharedGalleryImageInner>> getWithResponseAsync(
        String location, String galleryUniqueName, String galleryImageName) {
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
        if (galleryUniqueName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryUniqueName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            galleryUniqueName,
                            galleryImageName,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get a shared gallery image by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     *     listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image by subscription id or tenant id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SharedGalleryImageInner>> getWithResponseAsync(
        String location, String galleryUniqueName, String galleryImageName, Context context) {
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
        if (galleryUniqueName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryUniqueName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                galleryUniqueName,
                galleryImageName,
                accept,
                context);
    }

    /**
     * Get a shared gallery image by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     *     listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image by subscription id or tenant id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SharedGalleryImageInner> getAsync(String location, String galleryUniqueName, String galleryImageName) {
        return getWithResponseAsync(location, galleryUniqueName, galleryImageName)
            .flatMap(
                (Response<SharedGalleryImageInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get a shared gallery image by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     *     listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image by subscription id or tenant id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SharedGalleryImageInner get(String location, String galleryUniqueName, String galleryImageName) {
        return getAsync(location, galleryUniqueName, galleryImageName).block();
    }

    /**
     * Get a shared gallery image by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     *     listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image by subscription id or tenant id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SharedGalleryImageInner> getWithResponse(
        String location, String galleryUniqueName, String galleryImageName, Context context) {
        return getWithResponseAsync(location, galleryUniqueName, galleryImageName, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SharedGalleryImageInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<SharedGalleryImageInner>>map(
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
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SharedGalleryImageInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
