// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

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
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ServerTableAuditingPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerTableAuditingPolicyInner;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerTableAuditingPolicyListResultInner;
import com.azure.resourcemanager.sql.generated.models.TableAuditingPolicyName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ServerTableAuditingPoliciesClient. */
public final class ServerTableAuditingPoliciesClientImpl implements ServerTableAuditingPoliciesClient {
    private final ClientLogger logger = new ClientLogger(ServerTableAuditingPoliciesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ServerTableAuditingPoliciesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of ServerTableAuditingPoliciesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServerTableAuditingPoliciesClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ServerTableAuditingPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientServerTableAuditingPolicies to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientS")
    private interface ServerTableAuditingPoliciesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/auditingPolicies/{tableAuditingPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServerTableAuditingPolicyInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("tableAuditingPolicyName") TableAuditingPolicyName tableAuditingPolicyName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/auditingPolicies/{tableAuditingPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServerTableAuditingPolicyInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("tableAuditingPolicyName") TableAuditingPolicyName tableAuditingPolicyName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ServerTableAuditingPolicyInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/auditingPolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServerTableAuditingPolicyListResultInner>> listByServer(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param tableAuditingPolicyName The name of the table auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's table auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerTableAuditingPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, TableAuditingPolicyName tableAuditingPolicyName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (tableAuditingPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter tableAuditingPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            tableAuditingPolicyName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param tableAuditingPolicyName The name of the table auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's table auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerTableAuditingPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, TableAuditingPolicyName tableAuditingPolicyName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (tableAuditingPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter tableAuditingPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                tableAuditingPolicyName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param tableAuditingPolicyName The name of the table auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's table auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServerTableAuditingPolicyInner> getAsync(
        String resourceGroupName, String serverName, TableAuditingPolicyName tableAuditingPolicyName) {
        return getWithResponseAsync(resourceGroupName, serverName, tableAuditingPolicyName)
            .flatMap(
                (Response<ServerTableAuditingPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param tableAuditingPolicyName The name of the table auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's table auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerTableAuditingPolicyInner get(
        String resourceGroupName, String serverName, TableAuditingPolicyName tableAuditingPolicyName) {
        return getAsync(resourceGroupName, serverName, tableAuditingPolicyName).block();
    }

    /**
     * Gets a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param tableAuditingPolicyName The name of the table auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's table auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ServerTableAuditingPolicyInner> getWithResponse(
        String resourceGroupName, String serverName, TableAuditingPolicyName tableAuditingPolicyName, Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, tableAuditingPolicyName, context).block();
    }

    /**
     * Creates or updates a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param tableAuditingPolicyName The name of the table auditing policy.
     * @param parameters The server table auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server table auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerTableAuditingPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        TableAuditingPolicyName tableAuditingPolicyName,
        ServerTableAuditingPolicyInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (tableAuditingPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter tableAuditingPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            tableAuditingPolicyName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param tableAuditingPolicyName The name of the table auditing policy.
     * @param parameters The server table auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server table auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerTableAuditingPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        TableAuditingPolicyName tableAuditingPolicyName,
        ServerTableAuditingPolicyInner parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (tableAuditingPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter tableAuditingPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                tableAuditingPolicyName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                parameters,
                accept,
                context);
    }

    /**
     * Creates or updates a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param tableAuditingPolicyName The name of the table auditing policy.
     * @param parameters The server table auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server table auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServerTableAuditingPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        TableAuditingPolicyName tableAuditingPolicyName,
        ServerTableAuditingPolicyInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, tableAuditingPolicyName, parameters)
            .flatMap(
                (Response<ServerTableAuditingPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param tableAuditingPolicyName The name of the table auditing policy.
     * @param parameters The server table auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server table auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerTableAuditingPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        TableAuditingPolicyName tableAuditingPolicyName,
        ServerTableAuditingPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, tableAuditingPolicyName, parameters).block();
    }

    /**
     * Creates or updates a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param tableAuditingPolicyName The name of the table auditing policy.
     * @param parameters The server table auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server table auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ServerTableAuditingPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        TableAuditingPolicyName tableAuditingPolicyName,
        ServerTableAuditingPolicyInner parameters,
        Context context) {
        return createOrUpdateWithResponseAsync(
                resourceGroupName, serverName, tableAuditingPolicyName, parameters, context)
            .block();
    }

    /**
     * Lists a server's table auditing policies. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list server table auditing policies request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerTableAuditingPolicyListResultInner>> listByServerWithResponseAsync(
        String resourceGroupName, String serverName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByServer(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists a server's table auditing policies. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list server table auditing policies request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerTableAuditingPolicyListResultInner>> listByServerWithResponseAsync(
        String resourceGroupName, String serverName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByServer(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Lists a server's table auditing policies. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list server table auditing policies request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServerTableAuditingPolicyListResultInner> listByServerAsync(
        String resourceGroupName, String serverName) {
        return listByServerWithResponseAsync(resourceGroupName, serverName)
            .flatMap(
                (Response<ServerTableAuditingPolicyListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists a server's table auditing policies. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list server table auditing policies request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerTableAuditingPolicyListResultInner listByServer(String resourceGroupName, String serverName) {
        return listByServerAsync(resourceGroupName, serverName).block();
    }

    /**
     * Lists a server's table auditing policies. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list server table auditing policies request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ServerTableAuditingPolicyListResultInner> listByServerWithResponse(
        String resourceGroupName, String serverName, Context context) {
        return listByServerWithResponseAsync(resourceGroupName, serverName, context).block();
    }
}
