// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A custom alert rule that checks if a value (depends on the custom alert type) is allowed. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "ruleType",
    defaultImpl = AllowlistCustomAlertRule.class)
@JsonTypeName("AllowlistCustomAlertRule")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ConnectionToIpNotAllowed", value = ConnectionToIpNotAllowed.class),
    @JsonSubTypes.Type(name = "ConnectionFromIpNotAllowed", value = ConnectionFromIpNotAllowed.class),
    @JsonSubTypes.Type(name = "LocalUserNotAllowed", value = LocalUserNotAllowed.class),
    @JsonSubTypes.Type(name = "ProcessNotAllowed", value = ProcessNotAllowed.class)
})
@Fluent
public class AllowlistCustomAlertRule extends ListCustomAlertRule {
    /*
     * The values to allow. The format of the values depends on the rule type.
     */
    @JsonProperty(value = "allowlistValues", required = true)
    private List<String> allowlistValues;

    /**
     * Get the allowlistValues property: The values to allow. The format of the values depends on the rule type.
     *
     * @return the allowlistValues value.
     */
    public List<String> allowlistValues() {
        return this.allowlistValues;
    }

    /**
     * Set the allowlistValues property: The values to allow. The format of the values depends on the rule type.
     *
     * @param allowlistValues the allowlistValues value to set.
     * @return the AllowlistCustomAlertRule object itself.
     */
    public AllowlistCustomAlertRule withAllowlistValues(List<String> allowlistValues) {
        this.allowlistValues = allowlistValues;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AllowlistCustomAlertRule withIsEnabled(boolean isEnabled) {
        super.withIsEnabled(isEnabled);
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
        if (allowlistValues() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property allowlistValues in model AllowlistCustomAlertRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AllowlistCustomAlertRule.class);
}
