// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The job error items. */
@Immutable
public final class JobErrorItem {
    /*
     * The recommended actions.
     */
    @JsonProperty(value = "recommendations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> recommendations;

    /*
     * The code intended for programmatic access.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * The message that describes the error in detail.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /** Creates an instance of JobErrorItem class. */
    public JobErrorItem() {
    }

    /**
     * Get the recommendations property: The recommended actions.
     *
     * @return the recommendations value.
     */
    public List<String> recommendations() {
        return this.recommendations;
    }

    /**
     * Get the code property: The code intended for programmatic access.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: The message that describes the error in detail.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
