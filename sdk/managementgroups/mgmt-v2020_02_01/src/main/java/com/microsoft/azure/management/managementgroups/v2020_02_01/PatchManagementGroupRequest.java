/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2020_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Management group patch parameters.
 */
public class PatchManagementGroupRequest {
    /**
     * The friendly name of the management group.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * (Optional) The fully qualified ID for the parent management group.  For
     * example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "parentId")
    private String parentId;

    /**
     * Get the friendly name of the management group.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the friendly name of the management group.
     *
     * @param displayName the displayName value to set
     * @return the PatchManagementGroupRequest object itself.
     */
    public PatchManagementGroupRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get (Optional) The fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @return the parentId value
     */
    public String parentId() {
        return this.parentId;
    }

    /**
     * Set (Optional) The fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @param parentId the parentId value to set
     * @return the PatchManagementGroupRequest object itself.
     */
    public PatchManagementGroupRequest withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

}
