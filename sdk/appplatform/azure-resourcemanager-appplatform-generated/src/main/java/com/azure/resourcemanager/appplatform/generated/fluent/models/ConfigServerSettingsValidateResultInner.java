// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServerSettingsErrorRecord;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Validation result for config server settings. */
@Fluent
public final class ConfigServerSettingsValidateResultInner {
    /*
     * Indicate if the config server settings are valid
     */
    @JsonProperty(value = "isValid")
    private Boolean isValid;

    /*
     * The detail validation results
     */
    @JsonProperty(value = "details")
    private List<ConfigServerSettingsErrorRecord> details;

    /**
     * Get the isValid property: Indicate if the config server settings are valid.
     *
     * @return the isValid value.
     */
    public Boolean isValid() {
        return this.isValid;
    }

    /**
     * Set the isValid property: Indicate if the config server settings are valid.
     *
     * @param isValid the isValid value to set.
     * @return the ConfigServerSettingsValidateResultInner object itself.
     */
    public ConfigServerSettingsValidateResultInner withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * Get the details property: The detail validation results.
     *
     * @return the details value.
     */
    public List<ConfigServerSettingsErrorRecord> details() {
        return this.details;
    }

    /**
     * Set the details property: The detail validation results.
     *
     * @param details the details value to set.
     * @return the ConfigServerSettingsValidateResultInner object itself.
     */
    public ConfigServerSettingsValidateResultInner withDetails(List<ConfigServerSettingsErrorRecord> details) {
        this.details = details;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }
}
