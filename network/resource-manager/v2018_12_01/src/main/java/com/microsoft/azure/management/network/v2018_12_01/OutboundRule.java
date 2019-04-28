/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_12_01.implementation.OutboundRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_12_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;
import java.util.List;

/**
 * Type representing OutboundRule.
 */
public interface OutboundRule extends HasInner<OutboundRuleInner>, Indexable, Refreshable<OutboundRule>, HasManager<NetworkManager> {
    /**
     * @return the allocatedOutboundPorts value.
     */
    Integer allocatedOutboundPorts();

    /**
     * @return the backendAddressPool value.
     */
    SubResource backendAddressPool();

    /**
     * @return the enableTcpReset value.
     */
    Boolean enableTcpReset();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the frontendIPConfigurations value.
     */
    List<SubResource> frontendIPConfigurations();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the idleTimeoutInMinutes value.
     */
    Integer idleTimeoutInMinutes();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the protocol value.
     */
    String protocol();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

}
