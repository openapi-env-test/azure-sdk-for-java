/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2017_03_30.implementation.VirtualMachineExtensionImageInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2017_03_30.implementation.ComputeManager;
import java.util.Map;

/**
 * Type representing VirtualMachineExtensionImage.
 */
public interface VirtualMachineExtensionImage extends HasInner<VirtualMachineExtensionImageInner>, Indexable, Refreshable<VirtualMachineExtensionImage>, HasManager<ComputeManager> {
    /**
     * @return the computeRole value.
     */
    String computeRole();

    /**
     * @return the handlerSchema value.
     */
    String handlerSchema();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the operatingSystem value.
     */
    String operatingSystem();

    /**
     * @return the supportsMultipleExtensions value.
     */
    Boolean supportsMultipleExtensions();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vmScaleSetEnabled value.
     */
    Boolean vmScaleSetEnabled();

}
