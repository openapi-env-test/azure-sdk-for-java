// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The lab user list management profile. */
@Fluent
public final class RosterProfile {
    /*
     * The AAD group ID which this lab roster is populated from. Having this
     * set enables AAD sync mode.
     */
    @JsonProperty(value = "activeDirectoryGroupId")
    private String activeDirectoryGroupId;

    /*
     * The unique context identifier for the lab in the lms.
     */
    @JsonProperty(value = "ltiContextId")
    private String ltiContextId;

    /*
     * The base URI identifying the lms instance.
     */
    @JsonProperty(value = "lmsInstance")
    private String lmsInstance;

    /*
     * The unique id of the azure lab services tool in the lms.
     */
    @JsonProperty(value = "ltiClientId")
    private String ltiClientId;

    /*
     * The uri of the names and roles service endpoint on the lms for the class
     * attached to this lab.
     */
    @JsonProperty(value = "ltiRosterEndpoint")
    private String ltiRosterEndpoint;

    /**
     * Get the activeDirectoryGroupId property: The AAD group ID which this lab roster is populated from. Having this
     * set enables AAD sync mode.
     *
     * @return the activeDirectoryGroupId value.
     */
    public String activeDirectoryGroupId() {
        return this.activeDirectoryGroupId;
    }

    /**
     * Set the activeDirectoryGroupId property: The AAD group ID which this lab roster is populated from. Having this
     * set enables AAD sync mode.
     *
     * @param activeDirectoryGroupId the activeDirectoryGroupId value to set.
     * @return the RosterProfile object itself.
     */
    public RosterProfile withActiveDirectoryGroupId(String activeDirectoryGroupId) {
        this.activeDirectoryGroupId = activeDirectoryGroupId;
        return this;
    }

    /**
     * Get the ltiContextId property: The unique context identifier for the lab in the lms.
     *
     * @return the ltiContextId value.
     */
    public String ltiContextId() {
        return this.ltiContextId;
    }

    /**
     * Set the ltiContextId property: The unique context identifier for the lab in the lms.
     *
     * @param ltiContextId the ltiContextId value to set.
     * @return the RosterProfile object itself.
     */
    public RosterProfile withLtiContextId(String ltiContextId) {
        this.ltiContextId = ltiContextId;
        return this;
    }

    /**
     * Get the lmsInstance property: The base URI identifying the lms instance.
     *
     * @return the lmsInstance value.
     */
    public String lmsInstance() {
        return this.lmsInstance;
    }

    /**
     * Set the lmsInstance property: The base URI identifying the lms instance.
     *
     * @param lmsInstance the lmsInstance value to set.
     * @return the RosterProfile object itself.
     */
    public RosterProfile withLmsInstance(String lmsInstance) {
        this.lmsInstance = lmsInstance;
        return this;
    }

    /**
     * Get the ltiClientId property: The unique id of the azure lab services tool in the lms.
     *
     * @return the ltiClientId value.
     */
    public String ltiClientId() {
        return this.ltiClientId;
    }

    /**
     * Set the ltiClientId property: The unique id of the azure lab services tool in the lms.
     *
     * @param ltiClientId the ltiClientId value to set.
     * @return the RosterProfile object itself.
     */
    public RosterProfile withLtiClientId(String ltiClientId) {
        this.ltiClientId = ltiClientId;
        return this;
    }

    /**
     * Get the ltiRosterEndpoint property: The uri of the names and roles service endpoint on the lms for the class
     * attached to this lab.
     *
     * @return the ltiRosterEndpoint value.
     */
    public String ltiRosterEndpoint() {
        return this.ltiRosterEndpoint;
    }

    /**
     * Set the ltiRosterEndpoint property: The uri of the names and roles service endpoint on the lms for the class
     * attached to this lab.
     *
     * @param ltiRosterEndpoint the ltiRosterEndpoint value to set.
     * @return the RosterProfile object itself.
     */
    public RosterProfile withLtiRosterEndpoint(String ltiRosterEndpoint) {
        this.ltiRosterEndpoint = ltiRosterEndpoint;
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
