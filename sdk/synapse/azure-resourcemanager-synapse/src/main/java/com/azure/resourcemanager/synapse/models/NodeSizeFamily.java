// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The kind of nodes that the Big Data pool provides. */
public final class NodeSizeFamily extends ExpandableStringEnum<NodeSizeFamily> {
    /** Static value None for NodeSizeFamily. */
    public static final NodeSizeFamily NONE = fromString("None");

    /** Static value MemoryOptimized for NodeSizeFamily. */
    public static final NodeSizeFamily MEMORY_OPTIMIZED = fromString("MemoryOptimized");

    /** Static value HardwareAcceleratedFPGA for NodeSizeFamily. */
    public static final NodeSizeFamily HARDWARE_ACCELERATED_FPGA = fromString("HardwareAcceleratedFPGA");

    /** Static value HardwareAcceleratedGPU for NodeSizeFamily. */
    public static final NodeSizeFamily HARDWARE_ACCELERATED_GPU = fromString("HardwareAcceleratedGPU");

    /**
     * Creates or finds a NodeSizeFamily from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NodeSizeFamily.
     */
    @JsonCreator
    public static NodeSizeFamily fromString(String name) {
        return fromString(name, NodeSizeFamily.class);
    }

    /**
     * Gets known NodeSizeFamily values.
     *
     * @return known NodeSizeFamily values.
     */
    public static Collection<NodeSizeFamily> values() {
        return values(NodeSizeFamily.class);
    }
}
