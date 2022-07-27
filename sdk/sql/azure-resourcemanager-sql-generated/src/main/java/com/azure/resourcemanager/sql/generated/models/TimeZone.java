// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.TimeZoneInner;

/** An immutable client-side representation of TimeZone. */
public interface TimeZone {
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
     * Gets the timeZoneId property: The time zone id.
     *
     * @return the timeZoneId value.
     */
    String timeZoneId();

    /**
     * Gets the displayName property: The time zone display name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.TimeZoneInner object.
     *
     * @return the inner object.
     */
    TimeZoneInner innerModel();
}
