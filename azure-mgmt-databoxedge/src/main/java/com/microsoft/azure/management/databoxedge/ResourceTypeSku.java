/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.databoxedge.implementation.DataBoxEdgeManager;
import com.microsoft.azure.management.databoxedge.implementation.ResourceTypeSkuInner;
import java.util.List;

/**
 * Type representing ResourceTypeSku.
 */
public interface ResourceTypeSku extends HasInner<ResourceTypeSkuInner>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the apiVersions value.
     */
    List<String> apiVersions();

    /**
     * @return the costs value.
     */
    List<SkuCost> costs();

    /**
     * @return the family value.
     */
    String family();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the locationInfo value.
     */
    List<SkuLocationInfo> locationInfo();

    /**
     * @return the locations value.
     */
    List<String> locations();

    /**
     * @return the name value.
     */
    SkuName name();

    /**
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * @return the restrictions value.
     */
    List<SkuRestriction> restrictions();

    /**
     * @return the tier value.
     */
    SkuTier tier();

}
