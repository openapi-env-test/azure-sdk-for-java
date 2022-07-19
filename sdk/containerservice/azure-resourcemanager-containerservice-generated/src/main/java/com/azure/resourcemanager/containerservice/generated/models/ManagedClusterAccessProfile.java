// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.containerservice.generated.fluent.models.ManagedClusterAccessProfileInner;
import java.util.Map;

/** An immutable client-side representation of ManagedClusterAccessProfile. */
public interface ManagedClusterAccessProfile {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the kubeConfig property: Base64-encoded Kubernetes configuration file.
     *
     * @return the kubeConfig value.
     */
    byte[] kubeConfig();

    /**
     * Gets the inner
     * com.azure.resourcemanager.containerservice.generated.fluent.models.ManagedClusterAccessProfileInner object.
     *
     * @return the inner object.
     */
    ManagedClusterAccessProfileInner innerModel();
}
