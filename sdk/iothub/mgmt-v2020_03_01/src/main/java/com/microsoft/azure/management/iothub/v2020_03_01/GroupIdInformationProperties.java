/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties for a group information object.
 */
public class GroupIdInformationProperties {
    /**
     * The group id.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /**
     * The required members for a specific group id.
     */
    @JsonProperty(value = "requiredMembers")
    private List<String> requiredMembers;

    /**
     * The required DNS zones for a specific group id.
     */
    @JsonProperty(value = "requiredZoneNames")
    private List<String> requiredZoneNames;

    /**
     * Get the group id.
     *
     * @return the groupId value
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the group id.
     *
     * @param groupId the groupId value to set
     * @return the GroupIdInformationProperties object itself.
     */
    public GroupIdInformationProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the required members for a specific group id.
     *
     * @return the requiredMembers value
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Set the required members for a specific group id.
     *
     * @param requiredMembers the requiredMembers value to set
     * @return the GroupIdInformationProperties object itself.
     */
    public GroupIdInformationProperties withRequiredMembers(List<String> requiredMembers) {
        this.requiredMembers = requiredMembers;
        return this;
    }

    /**
     * Get the required DNS zones for a specific group id.
     *
     * @return the requiredZoneNames value
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Set the required DNS zones for a specific group id.
     *
     * @param requiredZoneNames the requiredZoneNames value to set
     * @return the GroupIdInformationProperties object itself.
     */
    public GroupIdInformationProperties withRequiredZoneNames(List<String> requiredZoneNames) {
        this.requiredZoneNames = requiredZoneNames;
        return this;
    }

}
