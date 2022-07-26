// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration view of an OS version. */
@Immutable
public final class OSVersionPropertiesBase {
    /*
     * The OS version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * The OS version label.
     */
    @JsonProperty(value = "label", access = JsonProperty.Access.WRITE_ONLY)
    private String label;

    /*
     * Specifies whether this is the default OS version for its family.
     */
    @JsonProperty(value = "isDefault", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDefault;

    /*
     * Specifies whether this OS version is active.
     */
    @JsonProperty(value = "isActive", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isActive;

    /**
     * Get the version property: The OS version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the label property: The OS version label.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Get the isDefault property: Specifies whether this is the default OS version for its family.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Get the isActive property: Specifies whether this OS version is active.
     *
     * @return the isActive value.
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
