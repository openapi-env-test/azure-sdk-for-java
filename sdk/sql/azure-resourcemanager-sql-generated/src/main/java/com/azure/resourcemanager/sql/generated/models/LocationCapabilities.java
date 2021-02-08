// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.LocationCapabilitiesInner;
import java.util.List;

/** An immutable client-side representation of LocationCapabilities. */
public interface LocationCapabilities {
    /**
     * Gets the name property: The location name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the supportedServerVersions property: The list of supported server versions.
     *
     * @return the supportedServerVersions value.
     */
    List<ServerVersionCapability> supportedServerVersions();

    /**
     * Gets the supportedManagedInstanceVersions property: The list of supported managed instance versions.
     *
     * @return the supportedManagedInstanceVersions value.
     */
    List<ManagedInstanceVersionCapability> supportedManagedInstanceVersions();

    /**
     * Gets the status property: The status of the capability.
     *
     * @return the status value.
     */
    CapabilityStatus status();

    /**
     * Gets the reason property: The reason for the capability not being available.
     *
     * @return the reason value.
     */
    String reason();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.LocationCapabilitiesInner object.
     *
     * @return the inner object.
     */
    LocationCapabilitiesInner innerModel();
}
