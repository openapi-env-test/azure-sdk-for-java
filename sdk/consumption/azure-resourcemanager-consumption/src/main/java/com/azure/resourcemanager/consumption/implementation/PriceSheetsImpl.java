// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.PriceSheetsClient;
import com.azure.resourcemanager.consumption.fluent.models.PriceSheetResultInner;
import com.azure.resourcemanager.consumption.models.PriceSheetResult;
import com.azure.resourcemanager.consumption.models.PriceSheets;

public final class PriceSheetsImpl implements PriceSheets {
    private static final ClientLogger LOGGER = new ClientLogger(PriceSheetsImpl.class);

    private final PriceSheetsClient innerClient;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    public PriceSheetsImpl(
        PriceSheetsClient innerClient, com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PriceSheetResult get() {
        PriceSheetResultInner inner = this.serviceClient().get();
        if (inner != null) {
            return new PriceSheetResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PriceSheetResult> getWithResponse(String expand, String skiptoken, Integer top, Context context) {
        Response<PriceSheetResultInner> inner = this.serviceClient().getWithResponse(expand, skiptoken, top, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PriceSheetResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PriceSheetResult getByBillingPeriod(String billingPeriodName) {
        PriceSheetResultInner inner = this.serviceClient().getByBillingPeriod(billingPeriodName);
        if (inner != null) {
            return new PriceSheetResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PriceSheetResult> getByBillingPeriodWithResponse(
        String billingPeriodName, String expand, String skiptoken, Integer top, Context context) {
        Response<PriceSheetResultInner> inner =
            this.serviceClient().getByBillingPeriodWithResponse(billingPeriodName, expand, skiptoken, top, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PriceSheetResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PriceSheetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
