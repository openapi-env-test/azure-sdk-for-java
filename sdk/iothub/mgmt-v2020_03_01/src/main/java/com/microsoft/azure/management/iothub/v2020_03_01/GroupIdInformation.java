/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.iothub.v2020_03_01.implementation.GroupIdInformationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2020_03_01.implementation.DevicesManager;

/**
 * Type representing GroupIdInformation.
 */
public interface GroupIdInformation extends HasInner<GroupIdInformationInner>, Indexable, Refreshable<GroupIdInformation>, HasManager<DevicesManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    GroupIdInformationProperties properties();

    /**
     * @return the type value.
     */
    String type();

}
