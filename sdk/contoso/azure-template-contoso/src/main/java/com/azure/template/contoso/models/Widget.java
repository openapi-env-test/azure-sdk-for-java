// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.template.contoso.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A widget. */
@Fluent
public final class Widget {
    /*
     * The widget name.
     */
    @JsonProperty(value = "name", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The ID of the manufacturer.
     */
    @JsonProperty(value = "manufacturerId", required = true)
    private String manufacturerId;

    /*
     * The faked shared model.
     */
    @JsonProperty(value = "sharedModel")
    private FakedSharedModel sharedModel;

    /**
     * Creates an instance of Widget class.
     *
     * @param manufacturerId the manufacturerId value to set.
     */
    @JsonCreator
    public Widget(@JsonProperty(value = "manufacturerId", required = true) String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    /**
     * Get the name property: The widget name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the manufacturerId property: The ID of the manufacturer.
     *
     * @return the manufacturerId value.
     */
    public String getManufacturerId() {
        return this.manufacturerId;
    }

    /**
     * Get the sharedModel property: The faked shared model.
     *
     * @return the sharedModel value.
     */
    public FakedSharedModel getSharedModel() {
        return this.sharedModel;
    }

    /**
     * Set the sharedModel property: The faked shared model.
     *
     * @param sharedModel the sharedModel value to set.
     * @return the Widget object itself.
     */
    public Widget setSharedModel(FakedSharedModel sharedModel) {
        this.sharedModel = sharedModel;
        return this;
    }
}
