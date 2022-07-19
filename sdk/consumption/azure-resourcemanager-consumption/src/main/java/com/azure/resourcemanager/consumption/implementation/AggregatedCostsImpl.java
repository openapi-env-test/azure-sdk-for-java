// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.AggregatedCostsClient;
import com.azure.resourcemanager.consumption.fluent.models.ManagementGroupAggregatedCostResultInner;
import com.azure.resourcemanager.consumption.models.AggregatedCosts;
import com.azure.resourcemanager.consumption.models.ManagementGroupAggregatedCostResult;

public final class AggregatedCostsImpl implements AggregatedCosts {
    private static final ClientLogger LOGGER = new ClientLogger(AggregatedCostsImpl.class);

    private final AggregatedCostsClient innerClient;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    public AggregatedCostsImpl(
        AggregatedCostsClient innerClient, com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ManagementGroupAggregatedCostResult getByManagementGroup(String managementGroupId) {
        ManagementGroupAggregatedCostResultInner inner = this.serviceClient().getByManagementGroup(managementGroupId);
        if (inner != null) {
            return new ManagementGroupAggregatedCostResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagementGroupAggregatedCostResult> getByManagementGroupWithResponse(
        String managementGroupId, String filter, Context context) {
        Response<ManagementGroupAggregatedCostResultInner> inner =
            this.serviceClient().getByManagementGroupWithResponse(managementGroupId, filter, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagementGroupAggregatedCostResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagementGroupAggregatedCostResult getForBillingPeriodByManagementGroup(
        String managementGroupId, String billingPeriodName) {
        ManagementGroupAggregatedCostResultInner inner =
            this.serviceClient().getForBillingPeriodByManagementGroup(managementGroupId, billingPeriodName);
        if (inner != null) {
            return new ManagementGroupAggregatedCostResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagementGroupAggregatedCostResult> getForBillingPeriodByManagementGroupWithResponse(
        String managementGroupId, String billingPeriodName, Context context) {
        Response<ManagementGroupAggregatedCostResultInner> inner =
            this
                .serviceClient()
                .getForBillingPeriodByManagementGroupWithResponse(managementGroupId, billingPeriodName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagementGroupAggregatedCostResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private AggregatedCostsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
