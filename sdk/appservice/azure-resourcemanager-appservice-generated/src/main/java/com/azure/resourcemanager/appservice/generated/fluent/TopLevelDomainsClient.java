// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.TldLegalAgreementInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.TopLevelDomainInner;
import com.azure.resourcemanager.appservice.generated.models.TopLevelDomainAgreementOption;

/** An instance of this class provides access to all the operations defined in TopLevelDomainsClient. */
public interface TopLevelDomainsClient {
    /**
     * Get all top-level domains supported for registration.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all top-level domains supported for registration.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TopLevelDomainInner> list();

    /**
     * Get all top-level domains supported for registration.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all top-level domains supported for registration.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TopLevelDomainInner> list(Context context);

    /**
     * Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a top-level domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TopLevelDomainInner get(String name);

    /**
     * Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a top-level domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TopLevelDomainInner> getWithResponse(String name, Context context);

    /**
     * Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Domain agreement options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all legal agreements that user needs to accept before purchasing a domain.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TldLegalAgreementInner> listAgreements(String name, TopLevelDomainAgreementOption agreementOption);

    /**
     * Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Domain agreement options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all legal agreements that user needs to accept before purchasing a domain.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TldLegalAgreementInner> listAgreements(
        String name, TopLevelDomainAgreementOption agreementOption, Context context);
}
