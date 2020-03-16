/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcegraph.v2019_04_01;

import rx.Observable;
import com.microsoft.azure.management.resourcegraph.v2019_04_01.implementation.ResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Resources.
 */
public interface Resources extends HasInner<ResourcesInner> {
    /**
     * Queries the resources managed by Azure Resource Manager for all subscriptions specified in the request.
     *
     * @param query Request specifying query and its options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<QueryResponse> queryAsync(QueryRequest query);

}
