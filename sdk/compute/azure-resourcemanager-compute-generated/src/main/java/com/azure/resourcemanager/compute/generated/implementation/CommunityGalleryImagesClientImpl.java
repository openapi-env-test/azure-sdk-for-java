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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.compute.generated.fluent.CommunityGalleryImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.CommunityGalleryImageInner;
import com.azure.resourcemanager.compute.generated.models.ApiErrorException;
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
        final String apiVersion = "2021-07-01";
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
        final String apiVersion = "2021-07-01";
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
            .flatMap(
                (Response<CommunityGalleryImageInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
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
}
