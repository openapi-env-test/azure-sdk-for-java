// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a cloud service Extension. */
@Fluent
public final class Extension {
    /*
     * The name of the extension.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Extension Properties.
     */
    @JsonProperty(value = "properties")
    private CloudServiceExtensionProperties properties;

    /**
     * Get the name property: The name of the extension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the extension.
     *
     * @param name the name value to set.
     * @return the Extension object itself.
     */
    public Extension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Extension Properties.
     *
     * @return the properties value.
     */
    public CloudServiceExtensionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Extension Properties.
     *
     * @param properties the properties value to set.
     * @return the Extension object itself.
     */
    public Extension withProperties(CloudServiceExtensionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
