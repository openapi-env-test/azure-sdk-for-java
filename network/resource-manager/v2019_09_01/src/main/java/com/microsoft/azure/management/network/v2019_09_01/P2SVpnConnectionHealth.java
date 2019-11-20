/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_09_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2019_09_01.implementation.P2SVpnConnectionHealthInner;

/**
 * Type representing P2SVpnConnectionHealth.
 */
public interface P2SVpnConnectionHealth extends HasInner<P2SVpnConnectionHealthInner>, HasManager<NetworkManager> {
    /**
     * @return the sasUrl value.
     */
    String sasUrl();

}
