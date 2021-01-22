// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azuredata.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azuredata.models.OnPremiseProperty;
import com.azure.resourcemanager.azuredata.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Data controller resource. */
@JsonFlatten
@Fluent
public class DataControllerResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataControllerResourceInner.class);

    /*
     * Properties from the on premise data controller
     */
    @JsonProperty(value = "properties.onPremiseProperty", required = true)
    private OnPremiseProperty onPremiseProperty;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the onPremiseProperty property: Properties from the on premise data controller.
     *
     * @return the onPremiseProperty value.
     */
    public OnPremiseProperty onPremiseProperty() {
        return this.onPremiseProperty;
    }

    /**
     * Set the onPremiseProperty property: Properties from the on premise data controller.
     *
     * @param onPremiseProperty the onPremiseProperty value to set.
     * @return the DataControllerResourceInner object itself.
     */
    public DataControllerResourceInner withOnPremiseProperty(OnPremiseProperty onPremiseProperty) {
        this.onPremiseProperty = onPremiseProperty;
        return this;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public DataControllerResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataControllerResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (onPremiseProperty() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property onPremiseProperty in model DataControllerResourceInner"));
        } else {
            onPremiseProperty().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
