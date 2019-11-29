/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity DelimitedText source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = DelimitedTextSource.class)
@JsonTypeName("DelimitedTextSource")
public class DelimitedTextSource extends CopySource {
    /**
     * DelimitedText store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreReadSettings storeSettings;

    /**
     * DelimitedText format settings.
     */
    @JsonProperty(value = "formatSettings")
    private DelimitedTextReadSettings formatSettings;

    /**
     * Get delimitedText store settings.
     *
     * @return the storeSettings value
     */
    public StoreReadSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set delimitedText store settings.
     *
     * @param storeSettings the storeSettings value to set
     * @return the DelimitedTextSource object itself.
     */
    public DelimitedTextSource withStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get delimitedText format settings.
     *
     * @return the formatSettings value
     */
    public DelimitedTextReadSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set delimitedText format settings.
     *
     * @param formatSettings the formatSettings value to set
     * @return the DelimitedTextSource object itself.
     */
    public DelimitedTextSource withFormatSettings(DelimitedTextReadSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

}
