/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Application Insights component feature capability.
 */
public class ApplicationInsightsComponentFeatureCapability {
    /**
     * The name of the capability.
     */
    @JsonProperty(value = "Name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The description of the capability.
     */
    @JsonProperty(value = "Description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * The value of the capability.
     */
    @JsonProperty(value = "Value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * The unit of the capability.
     */
    @JsonProperty(value = "Unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * The meter used for the capability.
     */
    @JsonProperty(value = "MeterId", access = JsonProperty.Access.WRITE_ONLY)
    private String meterId;

    /**
     * The meter rate of the meter.
     */
    @JsonProperty(value = "MeterRateFrequency", access = JsonProperty.Access.WRITE_ONLY)
    private String meterRateFrequency;

    /**
     * Get the name of the capability.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the description of the capability.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the value of the capability.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the unit of the capability.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the meter used for the capability.
     *
     * @return the meterId value
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Get the meter rate of the meter.
     *
     * @return the meterRateFrequency value
     */
    public String meterRateFrequency() {
        return this.meterRateFrequency;
    }

}
