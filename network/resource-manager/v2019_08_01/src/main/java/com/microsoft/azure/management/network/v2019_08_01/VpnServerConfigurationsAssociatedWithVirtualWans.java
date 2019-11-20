/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2019_08_01.implementation.VpnServerConfigurationsAssociatedWithVirtualWansInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VpnServerConfigurationsAssociatedWithVirtualWans.
 */
public interface VpnServerConfigurationsAssociatedWithVirtualWans extends HasInner<VpnServerConfigurationsAssociatedWithVirtualWansInner> {
    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VpnServerConfigurationsResponse> listAsync(String resourceGroupName, String virtualWANName);

}
