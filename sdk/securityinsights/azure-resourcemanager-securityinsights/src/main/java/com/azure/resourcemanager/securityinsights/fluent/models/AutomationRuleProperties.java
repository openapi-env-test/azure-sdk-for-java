// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.AutomationRuleAction;
import com.azure.resourcemanager.securityinsights.models.AutomationRuleTriggeringLogic;
import com.azure.resourcemanager.securityinsights.models.ClientInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Automation rule properties. */
@Fluent
public final class AutomationRuleProperties {
    /*
     * The display name of the automation rule.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * The order of execution of the automation rule.
     */
    @JsonProperty(value = "order", required = true)
    private int order;

    /*
     * Describes automation rule triggering logic.
     */
    @JsonProperty(value = "triggeringLogic", required = true)
    private AutomationRuleTriggeringLogic triggeringLogic;

    /*
     * The actions to execute when the automation rule is triggered.
     */
    @JsonProperty(value = "actions", required = true)
    private List<AutomationRuleAction> actions;

    /*
     * The last time the automation rule was updated.
     */
    @JsonProperty(value = "lastModifiedTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTimeUtc;

    /*
     * The time the automation rule was created.
     */
    @JsonProperty(value = "createdTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTimeUtc;

    /*
     * Information on the client (user or application) that made some action
     */
    @JsonProperty(value = "lastModifiedBy", access = JsonProperty.Access.WRITE_ONLY)
    private ClientInfo lastModifiedBy;

    /*
     * Information on the client (user or application) that made some action
     */
    @JsonProperty(value = "createdBy", access = JsonProperty.Access.WRITE_ONLY)
    private ClientInfo createdBy;

    /**
     * Get the displayName property: The display name of the automation rule.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the automation rule.
     *
     * @param displayName the displayName value to set.
     * @return the AutomationRuleProperties object itself.
     */
    public AutomationRuleProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the order property: The order of execution of the automation rule.
     *
     * @return the order value.
     */
    public int order() {
        return this.order;
    }

    /**
     * Set the order property: The order of execution of the automation rule.
     *
     * @param order the order value to set.
     * @return the AutomationRuleProperties object itself.
     */
    public AutomationRuleProperties withOrder(int order) {
        this.order = order;
        return this;
    }

    /**
     * Get the triggeringLogic property: Describes automation rule triggering logic.
     *
     * @return the triggeringLogic value.
     */
    public AutomationRuleTriggeringLogic triggeringLogic() {
        return this.triggeringLogic;
    }

    /**
     * Set the triggeringLogic property: Describes automation rule triggering logic.
     *
     * @param triggeringLogic the triggeringLogic value to set.
     * @return the AutomationRuleProperties object itself.
     */
    public AutomationRuleProperties withTriggeringLogic(AutomationRuleTriggeringLogic triggeringLogic) {
        this.triggeringLogic = triggeringLogic;
        return this;
    }

    /**
     * Get the actions property: The actions to execute when the automation rule is triggered.
     *
     * @return the actions value.
     */
    public List<AutomationRuleAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: The actions to execute when the automation rule is triggered.
     *
     * @param actions the actions value to set.
     * @return the AutomationRuleProperties object itself.
     */
    public AutomationRuleProperties withActions(List<AutomationRuleAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the lastModifiedTimeUtc property: The last time the automation rule was updated.
     *
     * @return the lastModifiedTimeUtc value.
     */
    public OffsetDateTime lastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }

    /**
     * Get the createdTimeUtc property: The time the automation rule was created.
     *
     * @return the createdTimeUtc value.
     */
    public OffsetDateTime createdTimeUtc() {
        return this.createdTimeUtc;
    }

    /**
     * Get the lastModifiedBy property: Information on the client (user or application) that made some action.
     *
     * @return the lastModifiedBy value.
     */
    public ClientInfo lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Get the createdBy property: Information on the client (user or application) that made some action.
     *
     * @return the createdBy value.
     */
    public ClientInfo createdBy() {
        return this.createdBy;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (displayName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model AutomationRuleProperties"));
        }
        if (triggeringLogic() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property triggeringLogic in model AutomationRuleProperties"));
        } else {
            triggeringLogic().validate();
        }
        if (actions() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property actions in model AutomationRuleProperties"));
        } else {
            actions().forEach(e -> e.validate());
        }
        if (lastModifiedBy() != null) {
            lastModifiedBy().validate();
        }
        if (createdBy() != null) {
            createdBy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutomationRuleProperties.class);
}
