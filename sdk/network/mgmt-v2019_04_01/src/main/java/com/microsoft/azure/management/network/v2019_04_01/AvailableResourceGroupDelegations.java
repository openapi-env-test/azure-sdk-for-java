/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2019_04_01.implementation.AvailableResourceGroupDelegationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AvailableResourceGroupDelegations.
 */
public interface AvailableResourceGroupDelegations extends HasInner<AvailableResourceGroupDelegationsInner> {
    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LocationAvailableDelegationModel> listAsync(final String location, final String resourceGroupName);

}
