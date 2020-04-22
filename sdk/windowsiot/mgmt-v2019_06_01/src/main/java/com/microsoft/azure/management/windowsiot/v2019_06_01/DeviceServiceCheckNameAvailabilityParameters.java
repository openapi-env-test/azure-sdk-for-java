/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.windowsiot.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input values.
 */
public class DeviceServiceCheckNameAvailabilityParameters {
    /**
     * The name of the Windows IoT Device Service to check.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name of the Windows IoT Device Service to check.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the Windows IoT Device Service to check.
     *
     * @param name the name value to set
     * @return the DeviceServiceCheckNameAvailabilityParameters object itself.
     */
    public DeviceServiceCheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

}
