// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vi.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The media services details. */
@Fluent
public final class MediaServicesForPatchRequest {
    /*
     * The user assigned identity to be used to grant permissions
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String userAssignedIdentity;

    /**
     * Get the userAssignedIdentity property: The user assigned identity to be used to grant permissions.
     *
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: The user assigned identity to be used to grant permissions.
     *
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the MediaServicesForPatchRequest object itself.
     */
    public MediaServicesForPatchRequest withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
