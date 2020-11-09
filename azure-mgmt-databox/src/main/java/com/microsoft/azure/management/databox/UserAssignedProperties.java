/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User assigned identity properties.
 */
public class UserAssignedProperties {
    /**
     * Arm resource id for user assigned identity to be used to fetch MSI
     * token.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Get arm resource id for user assigned identity to be used to fetch MSI token.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set arm resource id for user assigned identity to be used to fetch MSI token.
     *
     * @param resourceId the resourceId value to set
     * @return the UserAssignedProperties object itself.
     */
    public UserAssignedProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

}
