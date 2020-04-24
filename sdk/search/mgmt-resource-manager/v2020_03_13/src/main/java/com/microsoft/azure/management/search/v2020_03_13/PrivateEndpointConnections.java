/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_03_13;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.search.v2020_03_13.implementation.PrivateEndpointConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateEndpointConnections.
 */
public interface PrivateEndpointConnections extends HasInner<PrivateEndpointConnectionsInner> {
    /**
     * Gets the details of the private endpoint connection to the Search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search service with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateEndpointConnection> getAsync(String resourceGroupName, String searchServiceName, String privateEndpointConnectionName);

    /**
     * Gets a list of all private endpoint connections in the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateEndpointConnection> listByServiceAsync(final String resourceGroupName, final String searchServiceName);

    /**
     * Disconnects the private endpoint connection and deletes it from the Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search service with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String searchServiceName, String privateEndpointConnectionName);

}
