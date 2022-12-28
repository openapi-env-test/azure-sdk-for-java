// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deviceupdate.models.GroupIdProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The group information for creating a private endpoint on an Account. */
@Fluent
public final class GroupInformationInner extends ProxyResource {
    /*
     * The properties for a group information object
     */
    @JsonProperty(value = "properties", required = true)
    private GroupInformationProperties innerProperties = new GroupInformationProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of GroupInformationInner class. */
    public GroupInformationInner() {
    }

    /**
     * Get the innerProperties property: The properties for a group information object.
     *
     * @return the innerProperties value.
     */
    private GroupInformationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of private link group ID.
     *
     * @return the provisioningState value.
     */
    public GroupIdProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the groupId property: The private link resource group id.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.innerProperties() == null ? null : this.innerProperties().groupId();
    }

    /**
     * Get the requiredMembers property: The private link resource required member names.
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredMembers();
    }

    /**
     * Get the requiredZoneNames property: The private link resource Private link DNS zone name.
     *
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredZoneNames();
    }

    /**
     * Set the requiredZoneNames property: The private link resource Private link DNS zone name.
     *
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the GroupInformationInner object itself.
     */
    public GroupInformationInner withRequiredZoneNames(List<String> requiredZoneNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GroupInformationProperties();
        }
        this.innerProperties().withRequiredZoneNames(requiredZoneNames);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model GroupInformationInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GroupInformationInner.class);
}
