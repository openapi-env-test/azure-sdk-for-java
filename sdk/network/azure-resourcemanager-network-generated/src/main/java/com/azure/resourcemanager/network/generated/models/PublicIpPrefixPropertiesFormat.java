// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpPrefixPropertiesFormatInner;
import java.util.List;

/** An immutable client-side representation of PublicIpPrefixPropertiesFormat. */
public interface PublicIpPrefixPropertiesFormat {
    /**
     * Gets the publicIpAddressVersion property: The public IP address version.
     *
     * @return the publicIpAddressVersion value.
     */
    IpVersion publicIpAddressVersion();

    /**
     * Gets the ipTags property: The list of tags associated with the public IP prefix.
     *
     * @return the ipTags value.
     */
    List<IpTag> ipTags();

    /**
     * Gets the prefixLength property: The Length of the Public IP Prefix.
     *
     * @return the prefixLength value.
     */
    Integer prefixLength();

    /**
     * Gets the ipPrefix property: The allocated Prefix.
     *
     * @return the ipPrefix value.
     */
    String ipPrefix();

    /**
     * Gets the publicIpAddresses property: The list of all referenced PublicIPAddresses.
     *
     * @return the publicIpAddresses value.
     */
    List<ReferencedPublicIpAddress> publicIpAddresses();

    /**
     * Gets the loadBalancerFrontendIpConfiguration property: The reference to load balancer frontend IP configuration
     * associated with the public IP prefix.
     *
     * @return the loadBalancerFrontendIpConfiguration value.
     */
    SubResource loadBalancerFrontendIpConfiguration();

    /**
     * Gets the customIpPrefix property: The customIpPrefix that this prefix is associated with.
     *
     * @return the customIpPrefix value.
     */
    SubResource customIpPrefix();

    /**
     * Gets the resourceGuid property: The resource GUID property of the public IP prefix resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the public IP prefix resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the natGateway property: NatGateway of Public IP Prefix.
     *
     * @return the natGateway value.
     */
    NatGateway natGateway();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.PublicIpPrefixPropertiesFormatInner
     * object.
     *
     * @return the inner object.
     */
    PublicIpPrefixPropertiesFormatInner innerModel();
}
