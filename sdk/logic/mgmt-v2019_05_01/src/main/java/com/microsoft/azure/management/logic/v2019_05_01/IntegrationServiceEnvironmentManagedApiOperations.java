/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import rx.Observable;
import com.microsoft.azure.management.logic.v2019_05_01.implementation.IntegrationServiceEnvironmentManagedApiOperationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing IntegrationServiceEnvironmentManagedApiOperations.
 */
public interface IntegrationServiceEnvironmentManagedApiOperations extends HasInner<IntegrationServiceEnvironmentManagedApiOperationsInner> {
    /**
     * Gets the managed Api operations.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @param apiName The api name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApiOperation> listAsync(final String resourceGroup, final String integrationServiceEnvironmentName, final String apiName);

}
