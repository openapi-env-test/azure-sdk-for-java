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
import com.azure.resourcemanager.compute.generated.fluent.CommunityGalleryImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.CommunityGalleryImageInner;
import com.azure.resourcemanager.compute.generated.models.ApiErrorException;
import com.azure.resourcemanager.compute.generated.models.CommunityGalleryImageList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CommunityGalleryImagesClient. */
public final class CommunityGalleryImagesClientImpl implements CommunityGalleryImagesClient {
    /** The proxy service used to perform REST calls. */
    private final CommunityGalleryImagesService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of CommunityGalleryImagesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CommunityGalleryImagesClientImpl(ComputeManagementClientImpl client) {
        this.service =
            RestProxy
                .create(CommunityGalleryImagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientCommunityGalleryImages to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface CommunityGalleryImagesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/communityGalleries"
                + "/{publicGalleryName}/images/{galleryImageName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<CommunityGalleryImageInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("publicGalleryName") String publicGalleryName,
            @PathParam("galleryImageName") String galleryImageName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/communityGalleries"
                + "/{publicGalleryName}/images")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<CommunityGalleryImageList>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("publicGalleryName") String publicGalleryName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<CommunityGalleryImageList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get a community gallery image.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CommunityGalleryImageInner>> getWithResponseAsync(
        String location, String publicGalleryName, String galleryImageName) {
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
        if (publicGalleryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter publicGalleryName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        final String apiVersion = "2022-01-03";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            apiVersion,
                            publicGalleryName,
                            galleryImageName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a community gallery image.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CommunityGalleryImageInner>> getWithResponseAsync(
        String location, String publicGalleryName, String galleryImageName, Context context) {
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
        if (publicGalleryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter publicGalleryName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        final String apiVersion = "2022-01-03";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                apiVersion,
                publicGalleryName,
                galleryImageName,
                accept,
                context);
    }

    /**
     * Get a community gallery image.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CommunityGalleryImageInner> getAsync(
        String location, String publicGalleryName, String galleryImageName) {
        return getWithResponseAsync(location, publicGalleryName, galleryImageName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a community gallery image.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunityGalleryImageInner get(String location, String publicGalleryName, String galleryImageName) {
        return getAsync(location, publicGalleryName, galleryImageName).block();
    }

    /**
     * Get a community gallery image.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CommunityGalleryImageInner> getWithResponse(
        String location, String publicGalleryName, String galleryImageName, Context context) {
        return getWithResponseAsync(location, publicGalleryName, galleryImageName, context).block();
    }

    /**
     * List community gallery images inside a gallery.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Images operation response along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CommunityGalleryImageInner>> listSinglePageAsync(
        String location, String publicGalleryName) {
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
        if (publicGalleryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter publicGalleryName is required and cannot be null."));
        }
        final String apiVersion = "2022-01-03";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            apiVersion,
                            publicGalleryName,
                            accept,
                            context))
            .<PagedResponse<CommunityGalleryImageInner>>map(
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
     * List community gallery images inside a gallery.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Images operation response along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CommunityGalleryImageInner>> listSinglePageAsync(
        String location, String publicGalleryName, Context context) {
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
        if (publicGalleryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter publicGalleryName is required and cannot be null."));
        }
        final String apiVersion = "2022-01-03";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                apiVersion,
                publicGalleryName,
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
     * List community gallery images inside a gallery.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Images operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CommunityGalleryImageInner> listAsync(String location, String publicGalleryName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, publicGalleryName), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List community gallery images inside a gallery.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Images operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CommunityGalleryImageInner> listAsync(
        String location, String publicGalleryName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, publicGalleryName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List community gallery images inside a gallery.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Images operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CommunityGalleryImageInner> list(String location, String publicGalleryName) {
        return new PagedIterable<>(listAsync(location, publicGalleryName));
    }

    /**
     * List community gallery images inside a gallery.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Images operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CommunityGalleryImageInner> list(String location, String publicGalleryName, Context context) {
        return new PagedIterable<>(listAsync(location, publicGalleryName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Images operation response along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CommunityGalleryImageInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<CommunityGalleryImageInner>>map(
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
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Images operation response along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CommunityGalleryImageInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
