/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2018_02_01.implementation.ResourcesManager;
import com.microsoft.azure.management.resources.v2018_02_01.implementation.DeploymentValidateResultInner;

/**
 * Type representing DeploymentValidateResult.
 */
public interface DeploymentValidateResult extends HasInner<DeploymentValidateResultInner>, HasManager<ResourcesManager> {
    /**
     * @return the error value.
     */
    ResourceManagementErrorWithDetails error();

    /**
     * @return the properties value.
     */
    DeploymentPropertiesExtended properties();

}
