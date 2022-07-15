// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies whether template expressions are evaluated within the scope of the parent template or nested template. */
@Fluent
public final class ExpressionEvaluationOptions {
    /*
     * The scope to be used for evaluation of parameters, variables and
     * functions in a nested template.
     */
    @JsonProperty(value = "scope")
    private ExpressionEvaluationOptionsScopeType scope;

    /**
     * Get the scope property: The scope to be used for evaluation of parameters, variables and functions in a nested
     * template.
     *
     * @return the scope value.
     */
    public ExpressionEvaluationOptionsScopeType scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope to be used for evaluation of parameters, variables and functions in a nested
     * template.
     *
     * @param scope the scope value to set.
     * @return the ExpressionEvaluationOptions object itself.
     */
    public ExpressionEvaluationOptions withScope(ExpressionEvaluationOptionsScopeType scope) {
        this.scope = scope;
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
