/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.peering.v2020_04_01.implementation.RegisteredAsnsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RegisteredAsns.
 */
public interface RegisteredAsns extends SupportsCreating<PeeringRegisteredAsn.DefinitionStages.Blank>, HasInner<RegisteredAsnsInner> {
    /**
     * Gets an existing registered ASN with the specified name under the given subscription, resource group and peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredAsnName The name of the registered ASN.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeeringRegisteredAsn> getAsync(String resourceGroupName, String peeringName, String registeredAsnName);

    /**
     * Lists all registered ASNs under the given subscription, resource group and peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeeringRegisteredAsn> listByPeeringAsync(final String resourceGroupName, final String peeringName);

    /**
     * Deletes an existing registered ASN with the specified name under the given subscription, resource group and peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredAsnName The name of the registered ASN.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String peeringName, String registeredAsnName);

}
