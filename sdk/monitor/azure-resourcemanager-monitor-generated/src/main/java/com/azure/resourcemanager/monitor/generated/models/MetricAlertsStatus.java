// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of MetricAlertsStatus. */
public interface MetricAlertsStatus {
    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    MetricAlertStatusCollection list(String resourceGroupName, String ruleName);

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources along with {@link Response}.
     */
    Response<MetricAlertStatusCollection> listWithResponse(String resourceGroupName, String ruleName, Context context);

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    MetricAlertStatusCollection listByName(String resourceGroupName, String ruleName, String statusName);

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources along with {@link Response}.
     */
    Response<MetricAlertStatusCollection> listByNameWithResponse(
        String resourceGroupName, String ruleName, String statusName, Context context);
}
