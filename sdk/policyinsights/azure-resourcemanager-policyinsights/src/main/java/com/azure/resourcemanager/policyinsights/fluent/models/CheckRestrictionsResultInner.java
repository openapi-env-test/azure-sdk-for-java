// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.policyinsights.models.CheckRestrictionsResultContentEvaluationResult;
import com.azure.resourcemanager.policyinsights.models.FieldRestrictions;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of a check policy restrictions evaluation on a resource. */
@Immutable
public final class CheckRestrictionsResultInner {
    /*
     * The restrictions that will be placed on various fields in the resource
     * by policy.
     */
    @JsonProperty(value = "fieldRestrictions", access = JsonProperty.Access.WRITE_ONLY)
    private List<FieldRestrictions> fieldRestrictions;

    /*
     * Evaluation results for the provided partial resource content.
     */
    @JsonProperty(value = "contentEvaluationResult", access = JsonProperty.Access.WRITE_ONLY)
    private CheckRestrictionsResultContentEvaluationResult contentEvaluationResult;

    /**
     * Get the fieldRestrictions property: The restrictions that will be placed on various fields in the resource by
     * policy.
     *
     * @return the fieldRestrictions value.
     */
    public List<FieldRestrictions> fieldRestrictions() {
        return this.fieldRestrictions;
    }

    /**
     * Get the contentEvaluationResult property: Evaluation results for the provided partial resource content.
     *
     * @return the contentEvaluationResult value.
     */
    public CheckRestrictionsResultContentEvaluationResult contentEvaluationResult() {
        return this.contentEvaluationResult;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fieldRestrictions() != null) {
            fieldRestrictions().forEach(e -> e.validate());
        }
        if (contentEvaluationResult() != null) {
            contentEvaluationResult().validate();
        }
    }
}
