// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.implementation;

import com.azure.core.annotation.BodyParam;
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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.policyinsights.fluent.PolicyRestrictionsClient;
import com.azure.resourcemanager.policyinsights.fluent.models.CheckRestrictionsResultInner;
import com.azure.resourcemanager.policyinsights.models.CheckManagementGroupRestrictionsRequest;
import com.azure.resourcemanager.policyinsights.models.CheckRestrictionsRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PolicyRestrictionsClient. */
public final class PolicyRestrictionsClientImpl implements PolicyRestrictionsClient {
    /** The proxy service used to perform REST calls. */
    private final PolicyRestrictionsService service;

    /** The service client containing this operation class. */
    private final PolicyInsightsClientImpl client;

    /**
     * Initializes an instance of PolicyRestrictionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PolicyRestrictionsClientImpl(PolicyInsightsClientImpl client) {
        this.service =
            RestProxy.create(PolicyRestrictionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PolicyInsightsClientPolicyRestrictions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PolicyInsightsClient")
    private interface PolicyRestrictionsService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.PolicyInsights/checkPolicyRestrictions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckRestrictionsResultInner>> checkAtSubscriptionScope(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckRestrictionsRequest parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.PolicyInsights"
                + "/checkPolicyRestrictions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckRestrictionsResultInner>> checkAtResourceGroupScope(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckRestrictionsRequest parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/providers/{managementGroupsNamespace}/managementGroups/{managementGroupId}/providers"
                + "/Microsoft.PolicyInsights/checkPolicyRestrictions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckRestrictionsResultInner>> checkAtManagementGroupScope(
            @HostParam("$host") String endpoint,
            @PathParam("managementGroupsNamespace") String managementGroupsNamespace,
            @PathParam("managementGroupId") String managementGroupId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckManagementGroupRestrictionsRequest parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Checks what restrictions Azure Policy will place on a resource within a subscription.
     *
     * @param parameters The check policy restrictions parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckRestrictionsResultInner>> checkAtSubscriptionScopeWithResponseAsync(
        CheckRestrictionsRequest parameters) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2022-03-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkAtSubscriptionScope(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            apiVersion,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Checks what restrictions Azure Policy will place on a resource within a subscription.
     *
     * @param parameters The check policy restrictions parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckRestrictionsResultInner>> checkAtSubscriptionScopeWithResponseAsync(
        CheckRestrictionsRequest parameters, Context context) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2022-03-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkAtSubscriptionScope(
                this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, parameters, accept, context);
    }

    /**
     * Checks what restrictions Azure Policy will place on a resource within a subscription.
     *
     * @param parameters The check policy restrictions parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckRestrictionsResultInner> checkAtSubscriptionScopeAsync(CheckRestrictionsRequest parameters) {
        return checkAtSubscriptionScopeWithResponseAsync(parameters).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Checks what restrictions Azure Policy will place on a resource within a subscription.
     *
     * @param parameters The check policy restrictions parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckRestrictionsResultInner checkAtSubscriptionScope(CheckRestrictionsRequest parameters) {
        return checkAtSubscriptionScopeAsync(parameters).block();
    }

    /**
     * Checks what restrictions Azure Policy will place on a resource within a subscription.
     *
     * @param parameters The check policy restrictions parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckRestrictionsResultInner> checkAtSubscriptionScopeWithResponse(
        CheckRestrictionsRequest parameters, Context context) {
        return checkAtSubscriptionScopeWithResponseAsync(parameters, context).block();
    }

    /**
     * Checks what restrictions Azure Policy will place on a resource within a resource group. Use this when the
     * resource group the resource will be created in is already known.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The check policy restrictions parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckRestrictionsResultInner>> checkAtResourceGroupScopeWithResponseAsync(
        String resourceGroupName, CheckRestrictionsRequest parameters) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2022-03-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkAtResourceGroupScope(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            apiVersion,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Checks what restrictions Azure Policy will place on a resource within a resource group. Use this when the
     * resource group the resource will be created in is already known.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The check policy restrictions parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckRestrictionsResultInner>> checkAtResourceGroupScopeWithResponseAsync(
        String resourceGroupName, CheckRestrictionsRequest parameters, Context context) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2022-03-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkAtResourceGroupScope(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                apiVersion,
                parameters,
                accept,
                context);
    }

    /**
     * Checks what restrictions Azure Policy will place on a resource within a resource group. Use this when the
     * resource group the resource will be created in is already known.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The check policy restrictions parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckRestrictionsResultInner> checkAtResourceGroupScopeAsync(
        String resourceGroupName, CheckRestrictionsRequest parameters) {
        return checkAtResourceGroupScopeWithResponseAsync(resourceGroupName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Checks what restrictions Azure Policy will place on a resource within a resource group. Use this when the
     * resource group the resource will be created in is already known.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The check policy restrictions parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckRestrictionsResultInner checkAtResourceGroupScope(
        String resourceGroupName, CheckRestrictionsRequest parameters) {
        return checkAtResourceGroupScopeAsync(resourceGroupName, parameters).block();
    }

    /**
     * Checks what restrictions Azure Policy will place on a resource within a resource group. Use this when the
     * resource group the resource will be created in is already known.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The check policy restrictions parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckRestrictionsResultInner> checkAtResourceGroupScopeWithResponse(
        String resourceGroupName, CheckRestrictionsRequest parameters, Context context) {
        return checkAtResourceGroupScopeWithResponseAsync(resourceGroupName, parameters, context).block();
    }

    /**
     * Checks what restrictions Azure Policy will place on resources within a management group.
     *
     * @param managementGroupId Management group ID.
     * @param parameters The check policy restrictions parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckRestrictionsResultInner>> checkAtManagementGroupScopeWithResponseAsync(
        String managementGroupId, CheckManagementGroupRestrictionsRequest parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (managementGroupId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementGroupId is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String managementGroupsNamespace = "Microsoft.Management";
        final String apiVersion = "2022-03-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkAtManagementGroupScope(
                            this.client.getEndpoint(),
                            managementGroupsNamespace,
                            managementGroupId,
                            apiVersion,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Checks what restrictions Azure Policy will place on resources within a management group.
     *
     * @param managementGroupId Management group ID.
     * @param parameters The check policy restrictions parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckRestrictionsResultInner>> checkAtManagementGroupScopeWithResponseAsync(
        String managementGroupId, CheckManagementGroupRestrictionsRequest parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (managementGroupId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementGroupId is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String managementGroupsNamespace = "Microsoft.Management";
        final String apiVersion = "2022-03-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkAtManagementGroupScope(
                this.client.getEndpoint(),
                managementGroupsNamespace,
                managementGroupId,
                apiVersion,
                parameters,
                accept,
                context);
    }

    /**
     * Checks what restrictions Azure Policy will place on resources within a management group.
     *
     * @param managementGroupId Management group ID.
     * @param parameters The check policy restrictions parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckRestrictionsResultInner> checkAtManagementGroupScopeAsync(
        String managementGroupId, CheckManagementGroupRestrictionsRequest parameters) {
        return checkAtManagementGroupScopeWithResponseAsync(managementGroupId, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Checks what restrictions Azure Policy will place on resources within a management group.
     *
     * @param managementGroupId Management group ID.
     * @param parameters The check policy restrictions parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckRestrictionsResultInner checkAtManagementGroupScope(
        String managementGroupId, CheckManagementGroupRestrictionsRequest parameters) {
        return checkAtManagementGroupScopeAsync(managementGroupId, parameters).block();
    }

    /**
     * Checks what restrictions Azure Policy will place on resources within a management group.
     *
     * @param managementGroupId Management group ID.
     * @param parameters The check policy restrictions parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckRestrictionsResultInner> checkAtManagementGroupScopeWithResponse(
        String managementGroupId, CheckManagementGroupRestrictionsRequest parameters, Context context) {
        return checkAtManagementGroupScopeWithResponseAsync(managementGroupId, parameters, context).block();
    }
}
