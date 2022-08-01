// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventhubs.generated.fluent.NetworkSecurityPerimeterConfigurationsOperationsClient;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * NetworkSecurityPerimeterConfigurationsOperationsClient.
 */
public final class NetworkSecurityPerimeterConfigurationsOperationsClientImpl
    implements NetworkSecurityPerimeterConfigurationsOperationsClient {
    /** The proxy service used to perform REST calls. */
    private final NetworkSecurityPerimeterConfigurationsOperationsService service;

    /** The service client containing this operation class. */
    private final EventHubManagementClientImpl client;

    /**
     * Initializes an instance of NetworkSecurityPerimeterConfigurationsOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NetworkSecurityPerimeterConfigurationsOperationsClientImpl(EventHubManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    NetworkSecurityPerimeterConfigurationsOperationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * EventHubManagementClientNetworkSecurityPerimeterConfigurationsOperations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "EventHubManagementCl")
    private interface NetworkSecurityPerimeterConfigurationsOperationsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/namespaces"
                + "/{namespaceName}/networkSecurityPerimeterConfigurations/{resourceAssociationName}/reconcile")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("namespaceName") String namespaceName,
            @PathParam("resourceAssociationName") String resourceAssociationName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Refreshes any information about the association.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param resourceAssociationName The ResourceAssociation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String namespaceName, String resourceAssociationName) {
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
        if (namespaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter namespaceName is required and cannot be null."));
        }
        if (resourceAssociationName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter resourceAssociationName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            namespaceName,
                            resourceAssociationName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Refreshes any information about the association.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param resourceAssociationName The ResourceAssociation Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String namespaceName, String resourceAssociationName, Context context) {
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
        if (namespaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter namespaceName is required and cannot be null."));
        }
        if (resourceAssociationName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter resourceAssociationName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                namespaceName,
                resourceAssociationName,
                accept,
                context);
    }

    /**
     * Refreshes any information about the association.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param resourceAssociationName The ResourceAssociation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginCreateOrUpdateAsync(
        String resourceGroupName, String namespaceName, String resourceAssociationName) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            createOrUpdateWithResponseAsync(resourceGroupName, namespaceName, resourceAssociationName);
        return this
            .client
            .<Void, Void>getLroResult(
                mono, this.client.getHttpPipeline(), Void.class, Void.class, this.client.getContext());
    }

    /**
     * Refreshes any information about the association.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param resourceAssociationName The ResourceAssociation Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginCreateOrUpdateAsync(
        String resourceGroupName, String namespaceName, String resourceAssociationName, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            createOrUpdateWithResponseAsync(resourceGroupName, namespaceName, resourceAssociationName, context);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, context);
    }

    /**
     * Refreshes any information about the association.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param resourceAssociationName The ResourceAssociation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginCreateOrUpdate(
        String resourceGroupName, String namespaceName, String resourceAssociationName) {
        return beginCreateOrUpdateAsync(resourceGroupName, namespaceName, resourceAssociationName).getSyncPoller();
    }

    /**
     * Refreshes any information about the association.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param resourceAssociationName The ResourceAssociation Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginCreateOrUpdate(
        String resourceGroupName, String namespaceName, String resourceAssociationName, Context context) {
        return beginCreateOrUpdateAsync(resourceGroupName, namespaceName, resourceAssociationName, context)
            .getSyncPoller();
    }

    /**
     * Refreshes any information about the association.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param resourceAssociationName The ResourceAssociation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> createOrUpdateAsync(
        String resourceGroupName, String namespaceName, String resourceAssociationName) {
        return beginCreateOrUpdateAsync(resourceGroupName, namespaceName, resourceAssociationName)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Refreshes any information about the association.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param resourceAssociationName The ResourceAssociation Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> createOrUpdateAsync(
        String resourceGroupName, String namespaceName, String resourceAssociationName, Context context) {
        return beginCreateOrUpdateAsync(resourceGroupName, namespaceName, resourceAssociationName, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Refreshes any information about the association.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param resourceAssociationName The ResourceAssociation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void createOrUpdate(String resourceGroupName, String namespaceName, String resourceAssociationName) {
        createOrUpdateAsync(resourceGroupName, namespaceName, resourceAssociationName).block();
    }

    /**
     * Refreshes any information about the association.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param resourceAssociationName The ResourceAssociation Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void createOrUpdate(
        String resourceGroupName, String namespaceName, String resourceAssociationName, Context context) {
        createOrUpdateAsync(resourceGroupName, namespaceName, resourceAssociationName, context).block();
    }
}
