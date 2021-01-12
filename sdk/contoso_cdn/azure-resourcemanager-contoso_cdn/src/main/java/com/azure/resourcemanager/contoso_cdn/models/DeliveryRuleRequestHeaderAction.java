// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines the request header action for the delivery rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name")
@JsonTypeName("ModifyRequestHeader")
@Fluent
public final class DeliveryRuleRequestHeaderAction extends DeliveryRuleAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeliveryRuleRequestHeaderAction.class);

    /*
     * Defines the parameters for the action.
     */
    @JsonProperty(value = "parameters", required = true)
    private HeaderActionParameters parameters;

    /**
     * Get the parameters property: Defines the parameters for the action.
     *
     * @return the parameters value.
     */
    public HeaderActionParameters parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Defines the parameters for the action.
     *
     * @param parameters the parameters value to set.
     * @return the DeliveryRuleRequestHeaderAction object itself.
     */
    public DeliveryRuleRequestHeaderAction withParameters(HeaderActionParameters parameters) {
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
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property parameters in model DeliveryRuleRequestHeaderAction"));
        } else {
            parameters().validate();
        }
    }
}
