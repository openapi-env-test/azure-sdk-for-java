// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.devtestlabs.fluent.CostsClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.LabCostInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CostsClient. */
public final class CostsClientImpl implements CostsClient {
    /** The proxy service used to perform REST calls. */
    private final CostsService service;

    /** The service client containing this operation class. */
    private final DevTestLabsClientImpl client;

    /**
     * Initializes an instance of CostsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CostsClientImpl(DevTestLabsClientImpl client) {
        this.service = RestProxy.create(CostsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DevTestLabsClientCosts to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DevTestLabsClientCos")
    private interface CostsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevTestLab/labs"
                + "/{labName}/costs/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LabCostInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("labName") String labName,
            @PathParam("name") String name,
            @QueryParam("$expand") String expand,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevTestLab/labs"
                + "/{labName}/costs/{name}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LabCostInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("labName") String labName,
            @PathParam("name") String name,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") LabCostInner labCost,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param expand Specify the $expand query. Example: 'properties($expand=labCostDetails)'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cost along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LabCostInner>> getWithResponseAsync(
        String resourceGroupName, String labName, String name, String expand) {
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
        if (labName == null) {
            return Mono.error(new IllegalArgumentException("Parameter labName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
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
                            labName,
                            name,
                            expand,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param expand Specify the $expand query. Example: 'properties($expand=labCostDetails)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cost along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LabCostInner>> getWithResponseAsync(
        String resourceGroupName, String labName, String name, String expand, Context context) {
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
        if (labName == null) {
            return Mono.error(new IllegalArgumentException("Parameter labName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                labName,
                name,
                expand,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param expand Specify the $expand query. Example: 'properties($expand=labCostDetails)'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cost on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LabCostInner> getAsync(String resourceGroupName, String labName, String name, String expand) {
        return getWithResponseAsync(resourceGroupName, labName, name, expand)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cost on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LabCostInner> getAsync(String resourceGroupName, String labName, String name) {
        final String expand = null;
        return getWithResponseAsync(resourceGroupName, labName, name, expand)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cost.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LabCostInner get(String resourceGroupName, String labName, String name) {
        final String expand = null;
        return getAsync(resourceGroupName, labName, name, expand).block();
    }

    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param expand Specify the $expand query. Example: 'properties($expand=labCostDetails)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cost along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LabCostInner> getWithResponse(
        String resourceGroupName, String labName, String name, String expand, Context context) {
        return getWithResponseAsync(resourceGroupName, labName, name, expand, context).block();
    }

    /**
     * Create or replace an existing cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param labCost A cost item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cost item along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LabCostInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String labName, String name, LabCostInner labCost) {
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
        if (labName == null) {
            return Mono.error(new IllegalArgumentException("Parameter labName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (labCost == null) {
            return Mono.error(new IllegalArgumentException("Parameter labCost is required and cannot be null."));
        } else {
            labCost.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            labName,
                            name,
                            this.client.getApiVersion(),
                            labCost,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create or replace an existing cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param labCost A cost item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cost item along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LabCostInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String labName, String name, LabCostInner labCost, Context context) {
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
        if (labName == null) {
            return Mono.error(new IllegalArgumentException("Parameter labName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (labCost == null) {
            return Mono.error(new IllegalArgumentException("Parameter labCost is required and cannot be null."));
        } else {
            labCost.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                labName,
                name,
                this.client.getApiVersion(),
                labCost,
                accept,
                context);
    }

    /**
     * Create or replace an existing cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param labCost A cost item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cost item on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LabCostInner> createOrUpdateAsync(
        String resourceGroupName, String labName, String name, LabCostInner labCost) {
        return createOrUpdateWithResponseAsync(resourceGroupName, labName, name, labCost)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create or replace an existing cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param labCost A cost item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cost item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LabCostInner createOrUpdate(String resourceGroupName, String labName, String name, LabCostInner labCost) {
        return createOrUpdateAsync(resourceGroupName, labName, name, labCost).block();
    }

    /**
     * Create or replace an existing cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param labCost A cost item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cost item along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LabCostInner> createOrUpdateWithResponse(
        String resourceGroupName, String labName, String name, LabCostInner labCost, Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, labName, name, labCost, context).block();
    }
}
