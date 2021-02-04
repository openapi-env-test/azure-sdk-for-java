// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A policy that specifies the delivery rules to be used for an endpoint. */
@Fluent
public final class EndpointPropertiesUpdateParametersDeliveryPolicy {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(EndpointPropertiesUpdateParametersDeliveryPolicy.class);

    /*
     * User-friendly description of the policy.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A list of the delivery rules.
     */
    @JsonProperty(value = "rules", required = true)
    private List<DeliveryRule> rules;

    /**
     * Get the description property: User-friendly description of the policy.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: User-friendly description of the policy.
     *
     * @param description the description value to set.
     * @return the EndpointPropertiesUpdateParametersDeliveryPolicy object itself.
     */
    public EndpointPropertiesUpdateParametersDeliveryPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the rules property: A list of the delivery rules.
     *
     * @return the rules value.
     */
    public List<DeliveryRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: A list of the delivery rules.
     *
     * @param rules the rules value to set.
     * @return the EndpointPropertiesUpdateParametersDeliveryPolicy object itself.
     */
    public EndpointPropertiesUpdateParametersDeliveryPolicy withRules(List<DeliveryRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property rules in model EndpointPropertiesUpdateParametersDeliveryPolicy"));
        } else {
            rules().forEach(e -> e.validate());
        }
    }
}
