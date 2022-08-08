// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.VMInsightsOnboardingStatusInner;

/** An instance of this class provides access to all the operations defined in VMInsightsClient. */
public interface VMInsightsClient {
    /**
     * Retrieves the VM Insights onboarding status for the specified resource or resource scope.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource, or scope, whose status
     *     to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vM Insights onboarding status for a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VMInsightsOnboardingStatusInner getOnboardingStatus(String resourceUri);

    /**
     * Retrieves the VM Insights onboarding status for the specified resource or resource scope.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource, or scope, whose status
     *     to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vM Insights onboarding status for a resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VMInsightsOnboardingStatusInner> getOnboardingStatusWithResponse(String resourceUri, Context context);
}
