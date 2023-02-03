// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the disk controller type configured for the VM and VirtualMachineScaleSet. This property is only supported
 * for virtual machines whose operating system disk and VM sku supports Generation 2
 * (https://docs.microsoft.com/en-us/azure/virtual-machines/generation-2), please check the HyperVGenerations capability
 * returned as part of VM sku capabilities in the response of Microsoft.Compute SKUs api for the region contains V2
 * (https://docs.microsoft.com/rest/api/compute/resourceskus/list) . &lt;br&gt; For more information about Disk
 * Controller Types supported please refer to https://aka.ms/azure-diskcontrollertypes.
 */
public final class DiskControllerTypes extends ExpandableStringEnum<DiskControllerTypes> {
    /** Static value SCSI for DiskControllerTypes. */
    public static final DiskControllerTypes SCSI = fromString("SCSI");

    /** Static value NVMe for DiskControllerTypes. */
    public static final DiskControllerTypes NVME = fromString("NVMe");

    /**
     * Creates or finds a DiskControllerTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiskControllerTypes.
     */
    @JsonCreator
    public static DiskControllerTypes fromString(String name) {
        return fromString(name, DiskControllerTypes.class);
    }

    /**
     * Gets known DiskControllerTypes values.
     *
     * @return known DiskControllerTypes values.
     */
    public static Collection<DiskControllerTypes> values() {
        return values(DiskControllerTypes.class);
    }
}
