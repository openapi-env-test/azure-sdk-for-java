// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.logic.models.ApiOperationPropertiesDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The api operation. */
@Fluent
public final class ApiOperationInner extends Resource {
    /*
     * The api operations properties
     */
    @JsonProperty(value = "properties")
    private ApiOperationPropertiesDefinition properties;

    /** Creates an instance of ApiOperationInner class. */
    public ApiOperationInner() {
    }

    /**
     * Get the properties property: The api operations properties.
     *
     * @return the properties value.
     */
    public ApiOperationPropertiesDefinition properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The api operations properties.
     *
     * @param properties the properties value to set.
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withProperties(ApiOperationPropertiesDefinition properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiOperationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiOperationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
