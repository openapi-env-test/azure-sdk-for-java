/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.RunCommandDocumentInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.ComputeManager;
import java.util.List;

/**
 * Type representing RunCommandDocument.
 */
public interface RunCommandDocument extends HasInner<RunCommandDocumentInner>, Indexable, Refreshable<RunCommandDocument>, HasManager<ComputeManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the label value.
     */
    String label();

    /**
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * @return the parameters value.
     */
    List<RunCommandParameterDefinition> parameters();

    /**
     * @return the schema value.
     */
    String schema();

    /**
     * @return the script value.
     */
    List<String> script();

}
