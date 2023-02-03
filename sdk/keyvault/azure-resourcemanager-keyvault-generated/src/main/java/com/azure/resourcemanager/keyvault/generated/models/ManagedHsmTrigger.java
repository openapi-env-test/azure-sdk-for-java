// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagedHsmTrigger model. */
@Fluent
public final class ManagedHsmTrigger {
    /*
     * The time duration after key creation to rotate the key. It only applies to rotate. It will be in ISO 8601
     * duration format. Eg: 'P90D', 'P1Y'.
     */
    @JsonProperty(value = "timeAfterCreate")
    private String timeAfterCreate;

    /*
     * The time duration before key expiring to rotate or notify. It will be in ISO 8601 duration format. Eg: 'P90D',
     * 'P1Y'.
     */
    @JsonProperty(value = "timeBeforeExpiry")
    private String timeBeforeExpiry;

    /** Creates an instance of ManagedHsmTrigger class. */
    public ManagedHsmTrigger() {
    }

    /**
     * Get the timeAfterCreate property: The time duration after key creation to rotate the key. It only applies to
     * rotate. It will be in ISO 8601 duration format. Eg: 'P90D', 'P1Y'.
     *
     * @return the timeAfterCreate value.
     */
    public String timeAfterCreate() {
        return this.timeAfterCreate;
    }

    /**
     * Set the timeAfterCreate property: The time duration after key creation to rotate the key. It only applies to
     * rotate. It will be in ISO 8601 duration format. Eg: 'P90D', 'P1Y'.
     *
     * @param timeAfterCreate the timeAfterCreate value to set.
     * @return the ManagedHsmTrigger object itself.
     */
    public ManagedHsmTrigger withTimeAfterCreate(String timeAfterCreate) {
        this.timeAfterCreate = timeAfterCreate;
        return this;
    }

    /**
     * Get the timeBeforeExpiry property: The time duration before key expiring to rotate or notify. It will be in ISO
     * 8601 duration format. Eg: 'P90D', 'P1Y'.
     *
     * @return the timeBeforeExpiry value.
     */
    public String timeBeforeExpiry() {
        return this.timeBeforeExpiry;
    }

    /**
     * Set the timeBeforeExpiry property: The time duration before key expiring to rotate or notify. It will be in ISO
     * 8601 duration format. Eg: 'P90D', 'P1Y'.
     *
     * @param timeBeforeExpiry the timeBeforeExpiry value to set.
     * @return the ManagedHsmTrigger object itself.
     */
    public ManagedHsmTrigger withTimeBeforeExpiry(String timeBeforeExpiry) {
        this.timeBeforeExpiry = timeBeforeExpiry;
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
