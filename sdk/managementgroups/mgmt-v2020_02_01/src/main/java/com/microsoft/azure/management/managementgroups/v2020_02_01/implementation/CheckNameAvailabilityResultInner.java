/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2020_02_01.implementation;

import com.microsoft.azure.management.managementgroups.v2020_02_01.Reason;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the result of the request to check management group name
 * availability.
 */
public class CheckNameAvailabilityResultInner {
    /**
     * Required. True indicates name is valid and available. False indicates
     * the name is invalid, unavailable, or both.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /**
     * Required if nameAvailable == false. Invalid indicates the name provided
     * does not match the resource provider's naming requirements (incorrect
     * length, unsupported characters, etc.) AlreadyExists indicates that the
     * name is already in use and is therefore unavailable. Possible values
     * include: 'Invalid', 'AlreadyExists'.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private Reason reason;

    /**
     * Required if nameAvailable == false. Localized. If reason == invalid,
     * provide the user with the reason why the given name is invalid, and
     * provide the resource naming requirements so that the user can select a
     * valid name. If reason == AlreadyExists, explain that is already in use,
     * and direct them to select a different name.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get required. True indicates name is valid and available. False indicates the name is invalid, unavailable, or both.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get required if nameAvailable == false. Invalid indicates the name provided does not match the resource provider's naming requirements (incorrect length, unsupported characters, etc.) AlreadyExists indicates that the name is already in use and is therefore unavailable. Possible values include: 'Invalid', 'AlreadyExists'.
     *
     * @return the reason value
     */
    public Reason reason() {
        return this.reason;
    }

    /**
     * Get required if nameAvailable == false. Localized. If reason == invalid, provide the user with the reason why the given name is invalid, and provide the resource naming requirements so that the user can select a valid name. If reason == AlreadyExists, explain that is already in use, and direct them to select a different name.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
