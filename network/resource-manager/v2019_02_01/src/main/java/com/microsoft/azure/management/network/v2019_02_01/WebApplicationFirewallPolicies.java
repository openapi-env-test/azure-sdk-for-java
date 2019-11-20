/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.network.v2019_02_01.implementation.WebApplicationFirewallPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WebApplicationFirewallPolicies.
 */
public interface WebApplicationFirewallPolicies extends SupportsCreating<WebApplicationFirewallPolicy.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<WebApplicationFirewallPolicy>, SupportsListingByResourceGroup<WebApplicationFirewallPolicy>, SupportsListing<WebApplicationFirewallPolicy>, HasInner<WebApplicationFirewallPoliciesInner> {
}
