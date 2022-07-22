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
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.devtestlabs.fluent.PolicySetsClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.EvaluatePoliciesResponseInner;
import com.azure.resourcemanager.devtestlabs.fluent.models.PolicySetInner;
import com.azure.resourcemanager.devtestlabs.models.EvaluatePoliciesRequest;
import com.azure.resourcemanager.devtestlabs.models.PolicySetList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PolicySetsClient. */
public final class PolicySetsClientImpl implements PolicySetsClient {
    /** The proxy service used to perform REST calls. */
    private final PolicySetsService service;

    /** The service client containing this operation class. */
    private final DevTestLabsClientImpl client;

    /**
     * Initializes an instance of PolicySetsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PolicySetsClientImpl(DevTestLabsClientImpl client) {
        this.service =
            RestProxy.create(PolicySetsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DevTestLabsClientPolicySets to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DevTestLabsClientPol")
    private interface PolicySetsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevTestLab/labs"
                + "/{labName}/policysets")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PolicySetList>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("labName") String labName,
            @QueryParam("$filter") String filter,
            @QueryParam("$top") Integer top,
            @QueryParam("$orderby") String orderby,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevTestLab/labs"
                + "/{labName}/policysets/{name}/evaluatePolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EvaluatePoliciesResponseInner>> evaluatePolicies(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("labName") String labName,
            @PathParam("name") String name,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") EvaluatePoliciesRequest evaluatePoliciesRequest,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PolicySetList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List policy sets in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName')'.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of policySets and their properties along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PolicySetInner>> listSinglePageAsync(
        String resourceGroupName, String labName, String filter, Integer top, String orderby) {
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
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            labName,
                            filter,
                            top,
                            orderby,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<PolicySetInner>>map(
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
     * List policy sets in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName')'.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of policySets and their properties along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PolicySetInner>> listSinglePageAsync(
        String resourceGroupName, String labName, String filter, Integer top, String orderby, Context context) {
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
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                labName,
                filter,
                top,
                orderby,
                this.client.getApiVersion(),
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
     * List policy sets in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName')'.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of policySets and their properties as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PolicySetInner> listAsync(
        String resourceGroupName, String labName, String filter, Integer top, String orderby) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, labName, filter, top, orderby),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List policy sets in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of policySets and their properties as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PolicySetInner> listAsync(String resourceGroupName, String labName) {
        final String filter = null;
        final Integer top = null;
        final String orderby = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, labName, filter, top, orderby),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List policy sets in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName')'.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of policySets and their properties as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PolicySetInner> listAsync(
        String resourceGroupName, String labName, String filter, Integer top, String orderby, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, labName, filter, top, orderby, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List policy sets in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of policySets and their properties as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PolicySetInner> list(String resourceGroupName, String labName) {
        final String filter = null;
        final Integer top = null;
        final String orderby = null;
        return new PagedIterable<>(listAsync(resourceGroupName, labName, filter, top, orderby));
    }

    /**
     * List policy sets in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName')'.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of policySets and their properties as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PolicySetInner> list(
        String resourceGroupName, String labName, String filter, Integer top, String orderby, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, labName, filter, top, orderby, context));
    }

    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EvaluatePoliciesResponseInner>> evaluatePoliciesWithResponseAsync(
        String resourceGroupName, String labName, String name, EvaluatePoliciesRequest evaluatePoliciesRequest) {
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
        if (evaluatePoliciesRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter evaluatePoliciesRequest is required and cannot be null."));
        } else {
            evaluatePoliciesRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .evaluatePolicies(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            labName,
                            name,
                            this.client.getApiVersion(),
                            evaluatePoliciesRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EvaluatePoliciesResponseInner>> evaluatePoliciesWithResponseAsync(
        String resourceGroupName,
        String labName,
        String name,
        EvaluatePoliciesRequest evaluatePoliciesRequest,
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
        if (labName == null) {
            return Mono.error(new IllegalArgumentException("Parameter labName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (evaluatePoliciesRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter evaluatePoliciesRequest is required and cannot be null."));
        } else {
            evaluatePoliciesRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .evaluatePolicies(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                labName,
                name,
                this.client.getApiVersion(),
                evaluatePoliciesRequest,
                accept,
                context);
    }

    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<EvaluatePoliciesResponseInner> evaluatePoliciesAsync(
        String resourceGroupName, String labName, String name, EvaluatePoliciesRequest evaluatePoliciesRequest) {
        return evaluatePoliciesWithResponseAsync(resourceGroupName, labName, name, evaluatePoliciesRequest)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EvaluatePoliciesResponseInner evaluatePolicies(
        String resourceGroupName, String labName, String name, EvaluatePoliciesRequest evaluatePoliciesRequest) {
        return evaluatePoliciesAsync(resourceGroupName, labName, name, evaluatePoliciesRequest).block();
    }

    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<EvaluatePoliciesResponseInner> evaluatePoliciesWithResponse(
        String resourceGroupName,
        String labName,
        String name,
        EvaluatePoliciesRequest evaluatePoliciesRequest,
        Context context) {
        return evaluatePoliciesWithResponseAsync(resourceGroupName, labName, name, evaluatePoliciesRequest, context)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of policySets and their properties along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PolicySetInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<PolicySetInner>>map(
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
     * @return contains a list of policySets and their properties along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PolicySetInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
