// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appplatform.generated.fluent.models.ServiceRegistryResourceInner;

/** An immutable client-side representation of ServiceRegistryResource. */
public interface ServiceRegistryResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: Service Registry properties payload.
     *
     * @return the properties value.
     */
    ServiceRegistryProperties properties();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.appplatform.generated.fluent.models.ServiceRegistryResourceInner object.
     *
     * @return the inner object.
     */
    ServiceRegistryResourceInner innerModel();
}
