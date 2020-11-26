// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.compute.generated.fluent.models.ResourceSkuInner;
import java.util.List;

/** An immutable client-side representation of ResourceSku. */
@Immutable
public interface ResourceSku {
    /**
     * Gets the resourceType property: The type of resource the SKU applies to.
     *
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the name property: The name of SKU.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the tier property: Specifies the tier of virtual machines in a scale set.&lt;br /&gt;&lt;br /&gt; Possible
     * Values:&lt;br /&gt;&lt;br /&gt; **Standard**&lt;br /&gt;&lt;br /&gt; **Basic**.
     *
     * @return the tier value.
     */
    String tier();

    /**
     * Gets the size property: The Size of the SKU.
     *
     * @return the size value.
     */
    String size();

    /**
     * Gets the family property: The Family of this particular SKU.
     *
     * @return the family value.
     */
    String family();

    /**
     * Gets the kind property: The Kind of resources that are supported in this SKU.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the capacity property: Specifies the number of virtual machines in the scale set.
     *
     * @return the capacity value.
     */
    ResourceSkuCapacity capacity();

    /**
     * Gets the locations property: The set of locations that the SKU is available.
     *
     * @return the locations value.
     */
    List<String> locations();

    /**
     * Gets the locationInfo property: A list of locations and availability zones in those locations where the SKU is
     * available.
     *
     * @return the locationInfo value.
     */
    List<ResourceSkuLocationInfo> locationInfo();

    /**
     * Gets the apiVersions property: The api versions that support this SKU.
     *
     * @return the apiVersions value.
     */
    List<String> apiVersions();

    /**
     * Gets the costs property: Metadata for retrieving price info.
     *
     * @return the costs value.
     */
    List<ResourceSkuCosts> costs();

    /**
     * Gets the capabilities property: A name value pair to describe the capability.
     *
     * @return the capabilities value.
     */
    List<ResourceSkuCapabilities> capabilities();

    /**
     * Gets the restrictions property: The restrictions because of which SKU cannot be used. This is empty if there are
     * no restrictions.
     *
     * @return the restrictions value.
     */
    List<ResourceSkuRestrictions> restrictions();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.ResourceSkuInner object.
     *
     * @return the inner object.
     */
    ResourceSkuInner innerModel();
}
