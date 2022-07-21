// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

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
import com.azure.resourcemanager.appservice.generated.fluent.WorkflowVersionsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.WorkflowVersionInner;
import com.azure.resourcemanager.appservice.generated.models.WorkflowVersionListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in WorkflowVersionsClient. */
public final class WorkflowVersionsClientImpl implements WorkflowVersionsClient {
    /** The proxy service used to perform REST calls. */
    private final WorkflowVersionsService service;

    /** The service client containing this operation class. */
    private final WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of WorkflowVersionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    WorkflowVersionsClientImpl(WebSiteManagementClientImpl client) {
        this.service =
            RestProxy.create(WorkflowVersionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for WebSiteManagementClientWorkflowVersions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WebSiteManagementCli")
    private interface WorkflowVersionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}"
                + "/hostruntime/runtime/webhooks/workflow/api/management/workflows/{workflowName}/versions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<WorkflowVersionListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("name") String name,
            @PathParam("workflowName") String workflowName,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$top") Integer top,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}"
                + "/hostruntime/runtime/webhooks/workflow/api/management/workflows/{workflowName}/versions/{versionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<WorkflowVersionInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("name") String name,
            @PathParam("workflowName") String workflowName,
            @PathParam("versionId") String versionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<WorkflowVersionListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow versions along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkflowVersionInner>> listSinglePageAsync(
        String resourceGroupName, String name, String workflowName, Integer top) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            name,
                            workflowName,
                            this.client.getApiVersion(),
                            top,
                            accept,
                            context))
            .<PagedResponse<WorkflowVersionInner>>map(
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
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow versions along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkflowVersionInner>> listSinglePageAsync(
        String resourceGroupName, String name, String workflowName, Integer top, Context context) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                name,
                workflowName,
                this.client.getApiVersion(),
                top,
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
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow versions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<WorkflowVersionInner> listAsync(
        String resourceGroupName, String name, String workflowName, Integer top) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, name, workflowName, top),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow versions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<WorkflowVersionInner> listAsync(String resourceGroupName, String name, String workflowName) {
        final Integer top = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, name, workflowName, top),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow versions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<WorkflowVersionInner> listAsync(
        String resourceGroupName, String name, String workflowName, Integer top, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, name, workflowName, top, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow versions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WorkflowVersionInner> list(String resourceGroupName, String name, String workflowName) {
        final Integer top = null;
        return new PagedIterable<>(listAsync(resourceGroupName, name, workflowName, top));
    }

    /**
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow versions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WorkflowVersionInner> list(
        String resourceGroupName, String name, String workflowName, Integer top, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, name, workflowName, top, context));
    }

    /**
     * Gets a workflow version.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow version along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<WorkflowVersionInner>> getWithResponseAsync(
        String resourceGroupName, String name, String workflowName, String versionId) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (versionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter versionId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            name,
                            workflowName,
                            versionId,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a workflow version.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow version along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<WorkflowVersionInner>> getWithResponseAsync(
        String resourceGroupName, String name, String workflowName, String versionId, Context context) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (versionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter versionId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                name,
                workflowName,
                versionId,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets a workflow version.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow version on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<WorkflowVersionInner> getAsync(
        String resourceGroupName, String name, String workflowName, String versionId) {
        return getWithResponseAsync(resourceGroupName, name, workflowName, versionId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a workflow version.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkflowVersionInner get(String resourceGroupName, String name, String workflowName, String versionId) {
        return getAsync(resourceGroupName, name, workflowName, versionId).block();
    }

    /**
     * Gets a workflow version.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<WorkflowVersionInner> getWithResponse(
        String resourceGroupName, String name, String workflowName, String versionId, Context context) {
        return getWithResponseAsync(resourceGroupName, name, workflowName, versionId, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow versions along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkflowVersionInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<WorkflowVersionInner>>map(
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
     * @return the list of workflow versions along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkflowVersionInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
