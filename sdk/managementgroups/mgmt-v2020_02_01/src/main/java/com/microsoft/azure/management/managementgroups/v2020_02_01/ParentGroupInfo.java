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
 * (Optional) The ID of the parent management group.
 */
public class ParentGroupInfo {
    /**
     * The fully qualified ID for the parent management group.  For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the parent management group.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The friendly name of the parent management group.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @param id the id value to set
     * @return the ParentGroupInfo object itself.
     */
    public ParentGroupInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name of the parent management group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the parent management group.
     *
     * @param name the name value to set
     * @return the ParentGroupInfo object itself.
     */
    public ParentGroupInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the friendly name of the parent management group.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the friendly name of the parent management group.
     *
     * @param displayName the displayName value to set
     * @return the ParentGroupInfo object itself.
     */
    public ParentGroupInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
