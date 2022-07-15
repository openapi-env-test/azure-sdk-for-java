// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.fluent.models.CheckEndpointNameAvailabilityOutputInner;
import com.azure.resourcemanager.cdn.generated.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.cdn.generated.fluent.models.ValidateProbeOutputInner;
import com.azure.resourcemanager.cdn.generated.models.CheckEndpointNameAvailabilityInput;
import com.azure.resourcemanager.cdn.generated.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.cdn.generated.models.ValidateProbeInput;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public interface ResourceProvidersClient {
    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * afdx endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param checkEndpointNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckEndpointNameAvailabilityOutputInner checkEndpointNameAvailability(
        String resourceGroupName, CheckEndpointNameAvailabilityInput checkEndpointNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * afdx endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param checkEndpointNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckEndpointNameAvailabilityOutputInner> checkEndpointNameAvailabilityWithResponse(
        String resourceGroupName,
        CheckEndpointNameAvailabilityInput checkEndpointNameAvailabilityInput,
        Context context);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityOutputInner checkNameAvailability(CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityInput checkNameAvailabilityInput, Context context);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityOutputInner checkNameAvailabilityWithSubscription(
        CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithSubscriptionWithResponse(
        CheckNameAvailabilityInput checkNameAvailabilityInput, Context context);

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param validateProbeInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ValidateProbeOutputInner validateProbe(ValidateProbeInput validateProbeInput);

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param validateProbeInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ValidateProbeOutputInner> validateProbeWithResponse(
        ValidateProbeInput validateProbeInput, Context context);
}
