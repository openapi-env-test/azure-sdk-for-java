// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.fluent.models.AvailabilitySetInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of AvailabilitySet. */
public interface AvailabilitySet {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: Sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes
     * for possible set of values. Use 'Aligned' for virtual machines with managed disks and 'Classic' for virtual
     * machines with unmanaged disks. Default value is 'Classic'.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the platformUpdateDomainCount property: Update Domain count.
     *
     * @return the platformUpdateDomainCount value.
     */
    Integer platformUpdateDomainCount();

    /**
     * Gets the platformFaultDomainCount property: Fault Domain count.
     *
     * @return the platformFaultDomainCount value.
     */
    Integer platformFaultDomainCount();

    /**
     * Gets the virtualMachines property: A list of references to all virtual machines in the availability set.
     *
     * @return the virtualMachines value.
     */
    List<SubResource> virtualMachines();

    /**
     * Gets the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    SubResource proximityPlacementGroup();

    /**
     * Gets the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    List<InstanceViewStatus> statuses();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.AvailabilitySetInner object.
     *
     * @return the inner object.
     */
    AvailabilitySetInner innerModel();
}
