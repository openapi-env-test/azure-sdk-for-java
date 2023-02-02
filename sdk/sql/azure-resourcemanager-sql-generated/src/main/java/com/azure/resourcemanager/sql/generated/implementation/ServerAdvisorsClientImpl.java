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
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
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
import com.azure.resourcemanager.sql.generated.fluent.ServerAdvisorsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.AdvisorInner;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ServerAdvisorsClient. */
public final class ServerAdvisorsClientImpl implements ServerAdvisorsClient {
    /** The proxy service used to perform REST calls. */
    private final ServerAdvisorsService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of ServerAdvisorsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServerAdvisorsClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy.create(ServerAdvisorsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientServerAdvisors to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientS")
    public interface ServerAdvisorsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/advisors")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<AdvisorInner>>> listByServer(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @QueryParam("$expand") String expand,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/advisors/{advisorName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AdvisorInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("advisorName") String advisorName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/advisors/{advisorName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AdvisorInner>> update(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("advisorName") String advisorName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") AdvisorInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param expand The child resources to include in the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server advisors along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<AdvisorInner>>> listByServerWithResponseAsync(
        String resourceGroupName, String serverName, String expand) {
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
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByServer(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            expand,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param expand The child resources to include in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server advisors along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<AdvisorInner>>> listByServerWithResponseAsync(
        String resourceGroupName, String serverName, String expand, Context context) {
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
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByServer(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                expand,
                this.client.getSubscriptionId(),
                apiVersion,
                accept,
                context);
    }

    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server advisors on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<AdvisorInner>> listByServerAsync(String resourceGroupName, String serverName) {
        final String expand = null;
        return listByServerWithResponseAsync(resourceGroupName, serverName, expand)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param expand The child resources to include in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server advisors along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<AdvisorInner>> listByServerWithResponse(
        String resourceGroupName, String serverName, String expand, Context context) {
        return listByServerWithResponseAsync(resourceGroupName, serverName, expand, context).block();
    }

    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server advisors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<AdvisorInner> listByServer(String resourceGroupName, String serverName) {
        final String expand = null;
        return listByServerWithResponse(resourceGroupName, serverName, expand, Context.NONE).getValue();
    }

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server advisor along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AdvisorInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String advisorName) {
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            advisorName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server advisor along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AdvisorInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String advisorName, Context context) {
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                advisorName,
                this.client.getSubscriptionId(),
                apiVersion,
                accept,
                context);
    }

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server advisor on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AdvisorInner> getAsync(String resourceGroupName, String serverName, String advisorName) {
        return getWithResponseAsync(resourceGroupName, serverName, advisorName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server advisor along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AdvisorInner> getWithResponse(
        String resourceGroupName, String serverName, String advisorName, Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, advisorName, context).block();
    }

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AdvisorInner get(String resourceGroupName, String serverName, String advisorName) {
        return getWithResponse(resourceGroupName, serverName, advisorName, Context.NONE).getValue();
    }

    /**
     * Updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param parameters The requested advisor resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AdvisorInner>> updateWithResponseAsync(
        String resourceGroupName, String serverName, String advisorName, AdvisorInner parameters) {
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
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
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            advisorName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param parameters The requested advisor resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AdvisorInner>> updateWithResponseAsync(
        String resourceGroupName, String serverName, String advisorName, AdvisorInner parameters, Context context) {
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
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
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                advisorName,
                this.client.getSubscriptionId(),
                apiVersion,
                parameters,
                accept,
                context);
    }

    /**
     * Updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param parameters The requested advisor resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AdvisorInner> updateAsync(
        String resourceGroupName, String serverName, String advisorName, AdvisorInner parameters) {
        return updateWithResponseAsync(resourceGroupName, serverName, advisorName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param parameters The requested advisor resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AdvisorInner> updateWithResponse(
        String resourceGroupName, String serverName, String advisorName, AdvisorInner parameters, Context context) {
        return updateWithResponseAsync(resourceGroupName, serverName, advisorName, parameters, context).block();
    }

    /**
     * Updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param parameters The requested advisor resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AdvisorInner update(
        String resourceGroupName, String serverName, String advisorName, AdvisorInner parameters) {
        return updateWithResponse(resourceGroupName, serverName, advisorName, parameters, Context.NONE).getValue();
    }
}
