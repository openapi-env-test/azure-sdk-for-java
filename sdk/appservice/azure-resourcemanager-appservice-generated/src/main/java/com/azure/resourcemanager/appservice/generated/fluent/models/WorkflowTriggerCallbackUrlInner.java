// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.WorkflowTriggerListCallbackUrlQueries;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The workflow trigger callback URL. */
@Fluent
public final class WorkflowTriggerCallbackUrlInner {
    /*
     * Gets the workflow trigger callback URL.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /*
     * Gets the workflow trigger callback URL HTTP method.
     */
    @JsonProperty(value = "method", access = JsonProperty.Access.WRITE_ONLY)
    private String method;

    /*
     * Gets the workflow trigger callback URL base path.
     */
    @JsonProperty(value = "basePath", access = JsonProperty.Access.WRITE_ONLY)
    private String basePath;

    /*
     * Gets the workflow trigger callback URL relative path.
     */
    @JsonProperty(value = "relativePath", access = JsonProperty.Access.WRITE_ONLY)
    private String relativePath;

    /*
     * Gets the workflow trigger callback URL relative path parameters.
     */
    @JsonProperty(value = "relativePathParameters")
    private List<String> relativePathParameters;

    /*
     * Gets the workflow trigger callback URL query parameters.
     */
    @JsonProperty(value = "queries")
    private WorkflowTriggerListCallbackUrlQueries queries;

    /**
     * Get the value property: Gets the workflow trigger callback URL.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the method property: Gets the workflow trigger callback URL HTTP method.
     *
     * @return the method value.
     */
    public String method() {
        return this.method;
    }

    /**
     * Get the basePath property: Gets the workflow trigger callback URL base path.
     *
     * @return the basePath value.
     */
    public String basePath() {
        return this.basePath;
    }

    /**
     * Get the relativePath property: Gets the workflow trigger callback URL relative path.
     *
     * @return the relativePath value.
     */
    public String relativePath() {
        return this.relativePath;
    }

    /**
     * Get the relativePathParameters property: Gets the workflow trigger callback URL relative path parameters.
     *
     * @return the relativePathParameters value.
     */
    public List<String> relativePathParameters() {
        return this.relativePathParameters;
    }

    /**
     * Set the relativePathParameters property: Gets the workflow trigger callback URL relative path parameters.
     *
     * @param relativePathParameters the relativePathParameters value to set.
     * @return the WorkflowTriggerCallbackUrlInner object itself.
     */
    public WorkflowTriggerCallbackUrlInner withRelativePathParameters(List<String> relativePathParameters) {
        this.relativePathParameters = relativePathParameters;
        return this;
    }

    /**
     * Get the queries property: Gets the workflow trigger callback URL query parameters.
     *
     * @return the queries value.
     */
    public WorkflowTriggerListCallbackUrlQueries queries() {
        return this.queries;
    }

    /**
     * Set the queries property: Gets the workflow trigger callback URL query parameters.
     *
     * @param queries the queries value to set.
     * @return the WorkflowTriggerCallbackUrlInner object itself.
     */
    public WorkflowTriggerCallbackUrlInner withQueries(WorkflowTriggerListCallbackUrlQueries queries) {
        this.queries = queries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queries() != null) {
            queries().validate();
        }
    }
}
