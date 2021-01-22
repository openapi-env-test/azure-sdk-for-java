// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

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
import com.azure.resourcemanager.billing.fluent.PoliciesClient;
import com.azure.resourcemanager.billing.fluent.models.CustomerPolicyInner;
import com.azure.resourcemanager.billing.fluent.models.PolicyInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PoliciesClient. */
public final class PoliciesClientImpl implements PoliciesClient {
    private final ClientLogger logger = new ClientLogger(PoliciesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PoliciesService service;

    /** The service client containing this operation class. */
    private final BillingManagementClientImpl client;

    /**
     * Initializes an instance of PoliciesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PoliciesClientImpl(BillingManagementClientImpl client) {
        this.service = RestProxy.create(PoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingManagementClientPolicies to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "BillingManagementCli")
    private interface PoliciesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}"
                + "/policies/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PolicyInner>> getByBillingProfile(
            @HostParam("$host") String endpoint,
            @PathParam("billingAccountName") String billingAccountName,
            @PathParam("billingProfileName") String billingProfileName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}"
                + "/policies/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PolicyInner>> update(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("billingAccountName") String billingAccountName,
            @PathParam("billingProfileName") String billingProfileName,
            @BodyParam("application/json") PolicyInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/customers/{customerName}/policies"
                + "/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CustomerPolicyInner>> getByCustomer(
            @HostParam("$host") String endpoint,
            @PathParam("billingAccountName") String billingAccountName,
            @PathParam("customerName") String customerName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/customers/{customerName}/policies"
                + "/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CustomerPolicyInner>> updateCustomer(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("billingAccountName") String billingAccountName,
            @PathParam("customerName") String customerName,
            @BodyParam("application/json") CustomerPolicyInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PolicyInner>> getByBillingProfileWithResponseAsync(
        String billingAccountName, String billingProfileName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (billingProfileName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingProfileName is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByBillingProfile(
                            this.client.getEndpoint(),
                            billingAccountName,
                            billingProfileName,
                            apiVersion,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PolicyInner>> getByBillingProfileWithResponseAsync(
        String billingAccountName, String billingProfileName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (billingProfileName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingProfileName is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByBillingProfile(
                this.client.getEndpoint(), billingAccountName, billingProfileName, apiVersion, accept, context);
    }

    /**
     * Lists the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PolicyInner> getByBillingProfileAsync(String billingAccountName, String billingProfileName) {
        return getByBillingProfileWithResponseAsync(billingAccountName, billingProfileName)
            .flatMap(
                (Response<PolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PolicyInner getByBillingProfile(String billingAccountName, String billingProfileName) {
        return getByBillingProfileAsync(billingAccountName, billingProfileName).block();
    }

    /**
     * Lists the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PolicyInner> getByBillingProfileWithResponse(
        String billingAccountName, String billingProfileName, Context context) {
        return getByBillingProfileWithResponseAsync(billingAccountName, billingProfileName, context).block();
    }

    /**
     * Updates the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PolicyInner>> updateWithResponseAsync(
        String billingAccountName, String billingProfileName, PolicyInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (billingProfileName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingProfileName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            apiVersion,
                            billingAccountName,
                            billingProfileName,
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Updates the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PolicyInner>> updateWithResponseAsync(
        String billingAccountName, String billingProfileName, PolicyInner parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (billingProfileName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingProfileName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                apiVersion,
                billingAccountName,
                billingProfileName,
                parameters,
                accept,
                context);
    }

    /**
     * Updates the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PolicyInner> updateAsync(
        String billingAccountName, String billingProfileName, PolicyInner parameters) {
        return updateWithResponseAsync(billingAccountName, billingProfileName, parameters)
            .flatMap(
                (Response<PolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Updates the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PolicyInner update(String billingAccountName, String billingProfileName, PolicyInner parameters) {
        return updateAsync(billingAccountName, billingProfileName, parameters).block();
    }

    /**
     * Updates the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PolicyInner> updateWithResponse(
        String billingAccountName, String billingProfileName, PolicyInner parameters, Context context) {
        return updateWithResponseAsync(billingAccountName, billingProfileName, parameters, context).block();
    }

    /**
     * Lists the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CustomerPolicyInner>> getByCustomerWithResponseAsync(
        String billingAccountName, String customerName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (customerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter customerName is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByCustomer(
                            this.client.getEndpoint(), billingAccountName, customerName, apiVersion, accept, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CustomerPolicyInner>> getByCustomerWithResponseAsync(
        String billingAccountName, String customerName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (customerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter customerName is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByCustomer(this.client.getEndpoint(), billingAccountName, customerName, apiVersion, accept, context);
    }

    /**
     * Lists the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CustomerPolicyInner> getByCustomerAsync(String billingAccountName, String customerName) {
        return getByCustomerWithResponseAsync(billingAccountName, customerName)
            .flatMap(
                (Response<CustomerPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CustomerPolicyInner getByCustomer(String billingAccountName, String customerName) {
        return getByCustomerAsync(billingAccountName, customerName).block();
    }

    /**
     * Lists the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CustomerPolicyInner> getByCustomerWithResponse(
        String billingAccountName, String customerName, Context context) {
        return getByCustomerWithResponseAsync(billingAccountName, customerName, context).block();
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CustomerPolicyInner>> updateCustomerWithResponseAsync(
        String billingAccountName, String customerName, CustomerPolicyInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (customerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter customerName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .updateCustomer(
                            this.client.getEndpoint(),
                            apiVersion,
                            billingAccountName,
                            customerName,
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CustomerPolicyInner>> updateCustomerWithResponseAsync(
        String billingAccountName, String customerName, CustomerPolicyInner parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (customerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter customerName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .updateCustomer(
                this.client.getEndpoint(), apiVersion, billingAccountName, customerName, parameters, accept, context);
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CustomerPolicyInner> updateCustomerAsync(
        String billingAccountName, String customerName, CustomerPolicyInner parameters) {
        return updateCustomerWithResponseAsync(billingAccountName, customerName, parameters)
            .flatMap(
                (Response<CustomerPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CustomerPolicyInner updateCustomer(
        String billingAccountName, String customerName, CustomerPolicyInner parameters) {
        return updateCustomerAsync(billingAccountName, customerName, parameters).block();
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CustomerPolicyInner> updateCustomerWithResponse(
        String billingAccountName, String customerName, CustomerPolicyInner parameters, Context context) {
        return updateCustomerWithResponseAsync(billingAccountName, customerName, parameters, context).block();
    }
}
