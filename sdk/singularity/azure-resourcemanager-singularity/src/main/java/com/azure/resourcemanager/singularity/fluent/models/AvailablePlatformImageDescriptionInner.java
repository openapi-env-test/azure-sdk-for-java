// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Platform supported container image types available. */
@Immutable
public final class AvailablePlatformImageDescriptionInner {
    /*
     * Fully qualifed Id for the container image.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Image names
     */
    @JsonProperty(value = "names", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> names;

    /*
     * Description of the container image.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the id property: Fully qualifed Id for the container image.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the names property: Image names.
     *
     * @return the names value.
     */
    public List<String> names() {
        return this.names;
    }

    /**
     * Get the description property: Description of the container image.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
