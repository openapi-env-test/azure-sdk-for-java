/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2019_02_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.imagebuilder.v2019_02_01_preview.implementation.RunOutputInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.imagebuilder.v2019_02_01_preview.implementation.VirtualMachineImagesManager;

/**
 * Type representing RunOutput.
 */
public interface RunOutput extends HasInner<RunOutputInner>, Indexable, Refreshable<RunOutput>, HasManager<VirtualMachineImagesManager> {
    /**
     * @return the artifactId value.
     */
    String artifactId();

    /**
     * @return the artifactLocation value.
     */
    String artifactLocation();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the type value.
     */
    String type();

}
