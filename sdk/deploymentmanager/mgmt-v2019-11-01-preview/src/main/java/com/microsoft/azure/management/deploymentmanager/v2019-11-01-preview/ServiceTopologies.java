/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019-11-01-preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.management.deploymentmanager.v2019-11-01-preview.implementation.ServiceTopologiesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ServiceTopologies.
 */
public interface ServiceTopologies extends SupportsCreating<ServiceTopologyResource.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<ServiceTopologyResource>, SupportsListingByResourceGroup<ServiceTopologyResource>, HasInner<ServiceTopologiesInner> {
}
