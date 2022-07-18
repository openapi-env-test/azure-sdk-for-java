// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationApplianceInner;

/** An instance of this class provides access to all the operations defined in ReplicationAppliancesClient. */
public interface ReplicationAppliancesClient {
    /**
     * Gets the list of Azure Site Recovery appliances for the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Azure Site Recovery appliances for the vault as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReplicationApplianceInner> list(String resourceName, String resourceGroupName);

    /**
     * Gets the list of Azure Site Recovery appliances for the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Azure Site Recovery appliances for the vault as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReplicationApplianceInner> list(
        String resourceName, String resourceGroupName, String filter, Context context);
}
