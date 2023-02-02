// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

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
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.monitor.generated.fluent.MetricAlertsStatusClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricAlertStatusCollectionInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MetricAlertsStatusClient. */
public final class MetricAlertsStatusClientImpl implements MetricAlertsStatusClient {
    /** The proxy service used to perform REST calls. */
    private final MetricAlertsStatusService service;

    /** The service client containing this operation class. */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of MetricAlertsStatusClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MetricAlertsStatusClientImpl(MonitorClientImpl client) {
        this.service =
            RestProxy.create(MetricAlertsStatusService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientMetricAlertsStatus to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientMetricA")
    public interface MetricAlertsStatusService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights"
                + "/metricAlerts/{ruleName}/status")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MetricAlertStatusCollectionInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("ruleName") String ruleName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights"
                + "/metricAlerts/{ruleName}/status/{statusName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MetricAlertStatusCollectionInner>> listByName(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("ruleName") String ruleName,
            @PathParam("statusName") String statusName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MetricAlertStatusCollectionInner>> listWithResponseAsync(
        String resourceGroupName, String ruleName) {
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
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            ruleName,
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MetricAlertStatusCollectionInner>> listWithResponseAsync(
        String resourceGroupName, String ruleName, Context context) {
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
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                ruleName,
                apiVersion,
                accept,
                context);
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<MetricAlertStatusCollectionInner> listAsync(String resourceGroupName, String ruleName) {
        return listWithResponseAsync(resourceGroupName, ruleName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MetricAlertStatusCollectionInner> listWithResponse(
        String resourceGroupName, String ruleName, Context context) {
        return listWithResponseAsync(resourceGroupName, ruleName, context).block();
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MetricAlertStatusCollectionInner list(String resourceGroupName, String ruleName) {
        return listWithResponse(resourceGroupName, ruleName, Context.NONE).getValue();
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MetricAlertStatusCollectionInner>> listByNameWithResponseAsync(
        String resourceGroupName, String ruleName, String statusName) {
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
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        if (statusName == null) {
            return Mono.error(new IllegalArgumentException("Parameter statusName is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByName(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            ruleName,
                            statusName,
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MetricAlertStatusCollectionInner>> listByNameWithResponseAsync(
        String resourceGroupName, String ruleName, String statusName, Context context) {
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
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        if (statusName == null) {
            return Mono.error(new IllegalArgumentException("Parameter statusName is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByName(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                ruleName,
                statusName,
                apiVersion,
                accept,
                context);
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<MetricAlertStatusCollectionInner> listByNameAsync(
        String resourceGroupName, String ruleName, String statusName) {
        return listByNameWithResponseAsync(resourceGroupName, ruleName, statusName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MetricAlertStatusCollectionInner> listByNameWithResponse(
        String resourceGroupName, String ruleName, String statusName, Context context) {
        return listByNameWithResponseAsync(resourceGroupName, ruleName, statusName, context).block();
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MetricAlertStatusCollectionInner listByName(String resourceGroupName, String ruleName, String statusName) {
        return listByNameWithResponse(resourceGroupName, ruleName, statusName, Context.NONE).getValue();
    }
}
