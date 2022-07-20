// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result of the assessment. */
@Fluent
public class AssessmentStatus {
    /*
     * Programmatic code for the status of the assessment
     */
    @JsonProperty(value = "code", required = true)
    private AssessmentStatusCode code;

    /*
     * Programmatic code for the cause of the assessment status
     */
    @JsonProperty(value = "cause")
    private String cause;

    /*
     * Human readable description of the assessment status
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the code property: Programmatic code for the status of the assessment.
     *
     * @return the code value.
     */
    public AssessmentStatusCode code() {
        return this.code;
    }

    /**
     * Set the code property: Programmatic code for the status of the assessment.
     *
     * @param code the code value to set.
     * @return the AssessmentStatus object itself.
     */
    public AssessmentStatus withCode(AssessmentStatusCode code) {
        this.code = code;
        return this;
    }

    /**
     * Get the cause property: Programmatic code for the cause of the assessment status.
     *
     * @return the cause value.
     */
    public String cause() {
        return this.cause;
    }

    /**
     * Set the cause property: Programmatic code for the cause of the assessment status.
     *
     * @param cause the cause value to set.
     * @return the AssessmentStatus object itself.
     */
    public AssessmentStatus withCause(String cause) {
        this.cause = cause;
        return this;
    }

    /**
     * Get the description property: Human readable description of the assessment status.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Human readable description of the assessment status.
     *
     * @param description the description value to set.
     * @return the AssessmentStatus object itself.
     */
    public AssessmentStatus withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (code() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property code in model AssessmentStatus"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AssessmentStatus.class);
}
