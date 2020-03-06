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
 * A path element of a management group ancestors.
 */
public class ManagementGroupPathElement {
    /**
     * The name of the group.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The friendly name of the group.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the name of the group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the group.
     *
     * @param name the name value to set
     * @return the ManagementGroupPathElement object itself.
     */
    public ManagementGroupPathElement withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the friendly name of the group.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the friendly name of the group.
     *
     * @param displayName the displayName value to set
     * @return the ManagementGroupPathElement object itself.
     */
    public ManagementGroupPathElement withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
