// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Time Zone. */
@Immutable
public final class TimeZoneInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private TimeZoneProperties innerProperties;

    /** Creates an instance of TimeZoneInner class. */
    public TimeZoneInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private TimeZoneProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the timeZoneId property: The time zone id.
     *
     * @return the timeZoneId value.
     */
    public String timeZoneId() {
        return this.innerProperties() == null ? null : this.innerProperties().timeZoneId();
    }

    /**
     * Get the displayName property: The time zone display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
