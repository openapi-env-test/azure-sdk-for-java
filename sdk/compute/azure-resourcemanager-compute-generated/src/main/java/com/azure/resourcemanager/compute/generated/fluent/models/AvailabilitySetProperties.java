// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.InstanceViewStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The instance view of a resource. */
@Fluent
public final class AvailabilitySetProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailabilitySetProperties.class);

    /*
     * Update Domain count.
     */
    @JsonProperty(value = "platformUpdateDomainCount")
    private Integer platformUpdateDomainCount;

    /*
     * Fault Domain count.
     */
    @JsonProperty(value = "platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /*
     * A list of references to all virtual machines in the availability set.
     */
    @JsonProperty(value = "virtualMachines")
    private List<SubResource> virtualMachines;

    /*
     * Specifies information about the proximity placement group that the
     * availability set should be assigned to. <br><br>Minimum api-version:
     * 2018-04-01.
     */
    @JsonProperty(value = "proximityPlacementGroup")
    private SubResource proximityPlacementGroup;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "statuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<InstanceViewStatus> statuses;

    /**
     * Get the platformUpdateDomainCount property: Update Domain count.
     *
     * @return the platformUpdateDomainCount value.
     */
    public Integer platformUpdateDomainCount() {
        return this.platformUpdateDomainCount;
    }

    /**
     * Set the platformUpdateDomainCount property: Update Domain count.
     *
     * @param platformUpdateDomainCount the platformUpdateDomainCount value to set.
     * @return the AvailabilitySetProperties object itself.
     */
    public AvailabilitySetProperties withPlatformUpdateDomainCount(Integer platformUpdateDomainCount) {
        this.platformUpdateDomainCount = platformUpdateDomainCount;
        return this;
    }

    /**
     * Get the platformFaultDomainCount property: Fault Domain count.
     *
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set the platformFaultDomainCount property: Fault Domain count.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set.
     * @return the AvailabilitySetProperties object itself.
     */
    public AvailabilitySetProperties withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get the virtualMachines property: A list of references to all virtual machines in the availability set.
     *
     * @return the virtualMachines value.
     */
    public List<SubResource> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Set the virtualMachines property: A list of references to all virtual machines in the availability set.
     *
     * @param virtualMachines the virtualMachines value to set.
     * @return the AvailabilitySetProperties object itself.
     */
    public AvailabilitySetProperties withVirtualMachines(List<SubResource> virtualMachines) {
        this.virtualMachines = virtualMachines;
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    public SubResource proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the AvailabilitySetProperties object itself.
     */
    public AvailabilitySetProperties withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }
}
