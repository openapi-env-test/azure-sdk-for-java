/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ProgressProperties model.
 */
public class ProgressProperties {
    /**
     * The percentage complete of the copy operation.
     */
    @JsonProperty(value = "percentage")
    private String percentage;

    /**
     * Get the percentage complete of the copy operation.
     *
     * @return the percentage value
     */
    public String percentage() {
        return this.percentage;
    }

    /**
     * Set the percentage complete of the copy operation.
     *
     * @param percentage the percentage value to set
     * @return the ProgressProperties object itself.
     */
    public ProgressProperties withPercentage(String percentage) {
        this.percentage = percentage;
        return this;
    }

}
