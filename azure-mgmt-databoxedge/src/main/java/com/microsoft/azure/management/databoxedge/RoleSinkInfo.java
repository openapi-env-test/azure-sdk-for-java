/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Compute role against which events will be raised.
 */
public class RoleSinkInfo {
    /**
     * Compute role ID.
     */
    @JsonProperty(value = "roleId", required = true)
    private String roleId;

    /**
     * Get compute role ID.
     *
     * @return the roleId value
     */
    public String roleId() {
        return this.roleId;
    }

    /**
     * Set compute role ID.
     *
     * @param roleId the roleId value to set
     * @return the RoleSinkInfo object itself.
     */
    public RoleSinkInfo withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

}
