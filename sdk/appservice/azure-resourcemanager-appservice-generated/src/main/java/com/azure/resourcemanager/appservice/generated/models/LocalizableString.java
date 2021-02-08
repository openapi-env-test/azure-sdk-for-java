// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LocalizableString object containing the name and a localized value. */
@Fluent
public final class LocalizableString {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocalizableString.class);

    /*
     * Non localized name
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Localized name
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get the value property: Non localized name.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Non localized name.
     *
     * @param value the value value to set.
     * @return the LocalizableString object itself.
     */
    public LocalizableString withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: Localized name.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: Localized name.
     *
     * @param localizedValue the localizedValue value to set.
     * @return the LocalizableString object itself.
     */
    public LocalizableString withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
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
