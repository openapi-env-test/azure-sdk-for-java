/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2020_02_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details of a management group used during creation.
 */
public class CreateManagementGroupDetails {
    /**
     * The version number of the object.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private Double version;

    /**
     * The date and time when this object was last updated.
     */
    @JsonProperty(value = "updatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedTime;

    /**
     * The identity of the principal or process that updated the object.
     */
    @JsonProperty(value = "updatedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String updatedBy;

    /**
     * Parent.
     */
    @JsonProperty(value = "parent")
    private CreateParentGroupInfo parent;

    /**
     * Get the version number of the object.
     *
     * @return the version value
     */
    public Double version() {
        return this.version;
    }

    /**
     * Get the date and time when this object was last updated.
     *
     * @return the updatedTime value
     */
    public DateTime updatedTime() {
        return this.updatedTime;
    }

    /**
     * Get the identity of the principal or process that updated the object.
     *
     * @return the updatedBy value
     */
    public String updatedBy() {
        return this.updatedBy;
    }

    /**
     * Get the parent value.
     *
     * @return the parent value
     */
    public CreateParentGroupInfo parent() {
        return this.parent;
    }

    /**
     * Set the parent value.
     *
     * @param parent the parent value to set
     * @return the CreateManagementGroupDetails object itself.
     */
    public CreateManagementGroupDetails withParent(CreateParentGroupInfo parent) {
        this.parent = parent;
        return this;
    }

}
