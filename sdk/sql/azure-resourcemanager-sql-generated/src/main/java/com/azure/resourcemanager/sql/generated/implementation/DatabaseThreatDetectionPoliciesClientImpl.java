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
import com.azure.resourcemanager.sql.generated.fluent.DatabaseThreatDetectionPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseSecurityAlertPolicyInner;
import com.azure.resourcemanager.sql.generated.models.SecurityAlertPolicyName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DatabaseThreatDetectionPoliciesClient. */
public final class DatabaseThreatDetectionPoliciesClientImpl implements DatabaseThreatDetectionPoliciesClient {
    private final ClientLogger logger = new ClientLogger(DatabaseThreatDetectionPoliciesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DatabaseThreatDetectionPoliciesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseThreatDetectionPoliciesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DatabaseThreatDetectionPoliciesClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    DatabaseThreatDetectionPoliciesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientDatabaseThreatDetectionPolicies to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientD")
    private interface DatabaseThreatDetectionPoliciesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseSecurityAlertPolicyInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("securityAlertPolicyName") SecurityAlertPolicyName securityAlertPolicyName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseSecurityAlertPolicyInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("securityAlertPolicyName") SecurityAlertPolicyName securityAlertPolicyName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") DatabaseSecurityAlertPolicyInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DatabaseSecurityAlertPolicyInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
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
                            serverName,
                            databaseName,
                            securityAlertPolicyName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DatabaseSecurityAlertPolicyInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        Context context) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                databaseName,
                securityAlertPolicyName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DatabaseSecurityAlertPolicyInner> getAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, securityAlertPolicyName)
            .flatMap(
                (Response<DatabaseSecurityAlertPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseSecurityAlertPolicyInner get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName) {
        return getAsync(resourceGroupName, serverName, databaseName, securityAlertPolicyName).block();
    }

    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DatabaseSecurityAlertPolicyInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, securityAlertPolicyName, context)
            .block();
    }

    /**
     * Creates or updates a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The database Threat Detection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a database Threat Detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DatabaseSecurityAlertPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        DatabaseSecurityAlertPolicyInner parameters) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
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
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            securityAlertPolicyName,
                            this.client.getApiVersion(),
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The database Threat Detection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a database Threat Detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DatabaseSecurityAlertPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        DatabaseSecurityAlertPolicyInner parameters,
        Context context) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
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
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                databaseName,
                securityAlertPolicyName,
                this.client.getApiVersion(),
                parameters,
                accept,
                context);
    }

    /**
     * Creates or updates a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The database Threat Detection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a database Threat Detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DatabaseSecurityAlertPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        DatabaseSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithResponseAsync(
                resourceGroupName, serverName, databaseName, securityAlertPolicyName, parameters)
            .flatMap(
                (Response<DatabaseSecurityAlertPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The database Threat Detection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a database Threat Detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseSecurityAlertPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        DatabaseSecurityAlertPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, databaseName, securityAlertPolicyName, parameters)
            .block();
    }

    /**
     * Creates or updates a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The database Threat Detection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a database Threat Detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DatabaseSecurityAlertPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        DatabaseSecurityAlertPolicyInner parameters,
        Context context) {
        return createOrUpdateWithResponseAsync(
                resourceGroupName, serverName, databaseName, securityAlertPolicyName, parameters, context)
            .block();
    }
}
