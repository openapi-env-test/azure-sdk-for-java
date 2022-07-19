// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.Action;
import com.azure.resourcemanager.monitor.generated.models.Enabled;
import com.azure.resourcemanager.monitor.generated.models.ProvisioningState;
import com.azure.resourcemanager.monitor.generated.models.ResourceAutoGenerated2;
import com.azure.resourcemanager.monitor.generated.models.Schedule;
import com.azure.resourcemanager.monitor.generated.models.Source;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The Log Search Rule resource. */
@Fluent
public final class LogSearchRuleResourceInner extends ResourceAutoGenerated2 {
    /*
     * The rule properties of the resource.
     */
    @JsonProperty(value = "properties", required = true)
    private LogSearchRule innerProperties = new LogSearchRule();

    /**
     * Get the innerProperties property: The rule properties of the resource.
     *
     * @return the innerProperties value.
     */
    private LogSearchRule innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public LogSearchRuleResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LogSearchRuleResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the createdWithApiVersion property: The api-version used when creating this alert rule.
     *
     * @return the createdWithApiVersion value.
     */
    public String createdWithApiVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().createdWithApiVersion();
    }

    /**
     * Get the isLegacyLogAnalyticsRule property: True if alert rule is legacy Log Analytic rule.
     *
     * @return the isLegacyLogAnalyticsRule value.
     */
    public Boolean isLegacyLogAnalyticsRule() {
        return this.innerProperties() == null ? null : this.innerProperties().isLegacyLogAnalyticsRule();
    }

    /**
     * Get the description property: The description of the Log Search rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the Log Search rule.
     *
     * @param description the description value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogSearchRule();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the displayName property: The display name of the alert rule.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the alert rule.
     *
     * @param displayName the displayName value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogSearchRule();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the autoMitigate property: The flag that indicates whether the alert should be automatically resolved or not.
     * The default is false.
     *
     * @return the autoMitigate value.
     */
    public Boolean autoMitigate() {
        return this.innerProperties() == null ? null : this.innerProperties().autoMitigate();
    }

    /**
     * Set the autoMitigate property: The flag that indicates whether the alert should be automatically resolved or not.
     * The default is false.
     *
     * @param autoMitigate the autoMitigate value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withAutoMitigate(Boolean autoMitigate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogSearchRule();
        }
        this.innerProperties().withAutoMitigate(autoMitigate);
        return this;
    }

    /**
     * Get the enabled property: The flag which indicates whether the Log Search rule is enabled. Value should be true
     * or false.
     *
     * @return the enabled value.
     */
    public Enabled enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: The flag which indicates whether the Log Search rule is enabled. Value should be true
     * or false.
     *
     * @param enabled the enabled value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withEnabled(Enabled enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogSearchRule();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the lastUpdatedTime property: Last time the rule was updated in IS08601 format.
     *
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdatedTime();
    }

    /**
     * Get the provisioningState property: Provisioning state of the scheduled query rule.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the source property: Data Source against which rule will Query Data.
     *
     * @return the source value.
     */
    public Source source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Data Source against which rule will Query Data.
     *
     * @param source the source value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withSource(Source source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogSearchRule();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the schedule property: Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction.
     *
     * @return the schedule value.
     */
    public Schedule schedule() {
        return this.innerProperties() == null ? null : this.innerProperties().schedule();
    }

    /**
     * Set the schedule property: Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction.
     *
     * @param schedule the schedule value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withSchedule(Schedule schedule) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogSearchRule();
        }
        this.innerProperties().withSchedule(schedule);
        return this;
    }

    /**
     * Get the action property: Action needs to be taken on rule execution.
     *
     * @return the action value.
     */
    public Action action() {
        return this.innerProperties() == null ? null : this.innerProperties().action();
    }

    /**
     * Set the action property: Action needs to be taken on rule execution.
     *
     * @param action the action value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withAction(Action action) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogSearchRule();
        }
        this.innerProperties().withAction(action);
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
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model LogSearchRuleResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogSearchRuleResourceInner.class);
}
