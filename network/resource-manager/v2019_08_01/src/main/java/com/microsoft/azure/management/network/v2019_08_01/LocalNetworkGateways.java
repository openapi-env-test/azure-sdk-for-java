/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.management.network.v2019_08_01.implementation.LocalNetworkGatewaysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LocalNetworkGateways.
 */
public interface LocalNetworkGateways extends SupportsCreating<LocalNetworkGateway.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<LocalNetworkGateway>, SupportsListingByResourceGroup<LocalNetworkGateway>, HasInner<LocalNetworkGatewaysInner> {
}
