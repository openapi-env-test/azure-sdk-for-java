// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines the url redirect action for the delivery rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name")
@JsonTypeName("UrlRedirect")
@Fluent
public final class UrlRedirectAction extends DeliveryRuleAction {
    /*
     * Defines the parameters for the action.
     */
    @JsonProperty(value = "parameters", required = true)
    private UrlRedirectActionParameters parameters;

    /**
     * Get the parameters property: Defines the parameters for the action.
     *
     * @return the parameters value.
     */
    public UrlRedirectActionParameters parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Defines the parameters for the action.
     *
     * @param parameters the parameters value to set.
     * @return the UrlRedirectAction object itself.
     */
    public UrlRedirectAction withParameters(UrlRedirectActionParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (parameters() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property parameters in model UrlRedirectAction"));
        } else {
            parameters().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UrlRedirectAction.class);
}
