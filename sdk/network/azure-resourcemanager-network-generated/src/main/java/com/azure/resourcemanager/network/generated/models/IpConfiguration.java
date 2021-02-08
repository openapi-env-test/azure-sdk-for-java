// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationInner;

/** An immutable client-side representation of IpConfiguration. */
public interface IpConfiguration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    String privateIpAddress();

    /**
     * Gets the privateIpAllocationMethod property: The private IP allocation method. Possible values are 'Static' and
     * 'Dynamic'.
     *
     * @return the privateIpAllocationMethod value.
     */
    IpAllocationMethod privateIpAllocationMethod();

    /**
     * Gets the subnet property: The reference of the subnet resource.
     *
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * Gets the publicIpAddress property: The reference of the public IP resource.
     *
     * @return the publicIpAddress value.
     */
    PublicIpAddress publicIpAddress();

    /**
     * Gets the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationInner object.
     *
     * @return the inner object.
     */
    IpConfigurationInner innerModel();
}
