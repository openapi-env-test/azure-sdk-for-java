// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.fluent.models.BalanceInner;

/** An instance of this class provides access to all the operations defined in BalancesClient. */
public interface BalancesClient {
    /**
     * Gets the balances for a scope by billingAccountId. Balances are available via this API only for May 1, 2014 or
     * later.
     *
     * @param billingAccountId BillingAccount ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BalanceInner getByBillingAccount(String billingAccountId);

    /**
     * Gets the balances for a scope by billingAccountId. Balances are available via this API only for May 1, 2014 or
     * later.
     *
     * @param billingAccountId BillingAccount ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billingAccountId along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BalanceInner> getByBillingAccountWithResponse(String billingAccountId, Context context);

    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billing period and billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BalanceInner getForBillingPeriodByBillingAccount(String billingAccountId, String billingPeriodName);

    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingPeriodName Billing Period Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billing period and billingAccountId along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BalanceInner> getForBillingPeriodByBillingAccountWithResponse(
        String billingAccountId, String billingPeriodName, Context context);
}
