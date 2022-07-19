// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewRecurrencePatternType;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewRecurrenceRangeType;
import com.azure.resourcemanager.authorization.generated.models.DefaultDecisionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** Access Review Default Settings. */
@Fluent
public final class AccessReviewDefaultSettingsInner extends ProxyResource {
    /*
     * Access Review properties.
     */
    @JsonProperty(value = "properties")
    private AccessReviewScheduleSettings innerProperties;

    /**
     * Get the innerProperties property: Access Review properties.
     *
     * @return the innerProperties value.
     */
    private AccessReviewScheduleSettings innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the mailNotificationsEnabled property: Flag to indicate whether sending mails to reviewers and the review
     * creator is enabled.
     *
     * @return the mailNotificationsEnabled value.
     */
    public Boolean mailNotificationsEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().mailNotificationsEnabled();
    }

    /**
     * Set the mailNotificationsEnabled property: Flag to indicate whether sending mails to reviewers and the review
     * creator is enabled.
     *
     * @param mailNotificationsEnabled the mailNotificationsEnabled value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withMailNotificationsEnabled(Boolean mailNotificationsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withMailNotificationsEnabled(mailNotificationsEnabled);
        return this;
    }

    /**
     * Get the reminderNotificationsEnabled property: Flag to indicate whether sending reminder emails to reviewers are
     * enabled.
     *
     * @return the reminderNotificationsEnabled value.
     */
    public Boolean reminderNotificationsEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().reminderNotificationsEnabled();
    }

    /**
     * Set the reminderNotificationsEnabled property: Flag to indicate whether sending reminder emails to reviewers are
     * enabled.
     *
     * @param reminderNotificationsEnabled the reminderNotificationsEnabled value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withReminderNotificationsEnabled(Boolean reminderNotificationsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withReminderNotificationsEnabled(reminderNotificationsEnabled);
        return this;
    }

    /**
     * Get the defaultDecisionEnabled property: Flag to indicate whether reviewers are required to provide a
     * justification when reviewing access.
     *
     * @return the defaultDecisionEnabled value.
     */
    public Boolean defaultDecisionEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultDecisionEnabled();
    }

    /**
     * Set the defaultDecisionEnabled property: Flag to indicate whether reviewers are required to provide a
     * justification when reviewing access.
     *
     * @param defaultDecisionEnabled the defaultDecisionEnabled value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withDefaultDecisionEnabled(Boolean defaultDecisionEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withDefaultDecisionEnabled(defaultDecisionEnabled);
        return this;
    }

    /**
     * Get the justificationRequiredOnApproval property: Flag to indicate whether the reviewer is required to pass
     * justification when recording a decision.
     *
     * @return the justificationRequiredOnApproval value.
     */
    public Boolean justificationRequiredOnApproval() {
        return this.innerProperties() == null ? null : this.innerProperties().justificationRequiredOnApproval();
    }

    /**
     * Set the justificationRequiredOnApproval property: Flag to indicate whether the reviewer is required to pass
     * justification when recording a decision.
     *
     * @param justificationRequiredOnApproval the justificationRequiredOnApproval value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withJustificationRequiredOnApproval(
        Boolean justificationRequiredOnApproval) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withJustificationRequiredOnApproval(justificationRequiredOnApproval);
        return this;
    }

    /**
     * Get the defaultDecision property: This specifies the behavior for the autoReview feature when an access review
     * completes.
     *
     * @return the defaultDecision value.
     */
    public DefaultDecisionType defaultDecision() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultDecision();
    }

    /**
     * Set the defaultDecision property: This specifies the behavior for the autoReview feature when an access review
     * completes.
     *
     * @param defaultDecision the defaultDecision value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withDefaultDecision(DefaultDecisionType defaultDecision) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withDefaultDecision(defaultDecision);
        return this;
    }

    /**
     * Get the autoApplyDecisionsEnabled property: Flag to indicate whether auto-apply capability, to automatically
     * change the target object access resource, is enabled. If not enabled, a user must, after the review completes,
     * apply the access review.
     *
     * @return the autoApplyDecisionsEnabled value.
     */
    public Boolean autoApplyDecisionsEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().autoApplyDecisionsEnabled();
    }

    /**
     * Set the autoApplyDecisionsEnabled property: Flag to indicate whether auto-apply capability, to automatically
     * change the target object access resource, is enabled. If not enabled, a user must, after the review completes,
     * apply the access review.
     *
     * @param autoApplyDecisionsEnabled the autoApplyDecisionsEnabled value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withAutoApplyDecisionsEnabled(Boolean autoApplyDecisionsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withAutoApplyDecisionsEnabled(autoApplyDecisionsEnabled);
        return this;
    }

    /**
     * Get the recommendationsEnabled property: Flag to indicate whether showing recommendations to reviewers is
     * enabled.
     *
     * @return the recommendationsEnabled value.
     */
    public Boolean recommendationsEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendationsEnabled();
    }

    /**
     * Set the recommendationsEnabled property: Flag to indicate whether showing recommendations to reviewers is
     * enabled.
     *
     * @param recommendationsEnabled the recommendationsEnabled value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withRecommendationsEnabled(Boolean recommendationsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withRecommendationsEnabled(recommendationsEnabled);
        return this;
    }

    /**
     * Get the recommendationLookBackDuration property: Recommendations for access reviews are calculated by looking
     * back at 30 days of data(w.r.t the start date of the review) by default. However, in some scenarios, customers
     * want to change how far back to look at and want to configure 60 days, 90 days, etc. instead. This setting allows
     * customers to configure this duration. The value should be in ISO 8601 format
     * (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval
     * string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds)).
     *
     * @return the recommendationLookBackDuration value.
     */
    public Duration recommendationLookBackDuration() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendationLookBackDuration();
    }

    /**
     * Set the recommendationLookBackDuration property: Recommendations for access reviews are calculated by looking
     * back at 30 days of data(w.r.t the start date of the review) by default. However, in some scenarios, customers
     * want to change how far back to look at and want to configure 60 days, 90 days, etc. instead. This setting allows
     * customers to configure this duration. The value should be in ISO 8601 format
     * (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval
     * string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds)).
     *
     * @param recommendationLookBackDuration the recommendationLookBackDuration value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withRecommendationLookBackDuration(
        Duration recommendationLookBackDuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withRecommendationLookBackDuration(recommendationLookBackDuration);
        return this;
    }

    /**
     * Get the instanceDurationInDays property: The duration in days for an instance.
     *
     * @return the instanceDurationInDays value.
     */
    public Integer instanceDurationInDays() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceDurationInDays();
    }

    /**
     * Set the instanceDurationInDays property: The duration in days for an instance.
     *
     * @param instanceDurationInDays the instanceDurationInDays value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withInstanceDurationInDays(Integer instanceDurationInDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withInstanceDurationInDays(instanceDurationInDays);
        return this;
    }

    /**
     * Get the type property: The recurrence type : weekly, monthly, etc.
     *
     * @return the type value.
     */
    public AccessReviewRecurrencePatternType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: The recurrence type : weekly, monthly, etc.
     *
     * @param type the type value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withTypePropertiesType(AccessReviewRecurrencePatternType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the interval property: The interval for recurrence. For a quarterly review, the interval is 3 for type :
     * absoluteMonthly.
     *
     * @return the interval value.
     */
    public Integer interval() {
        return this.innerProperties() == null ? null : this.innerProperties().interval();
    }

    /**
     * Set the interval property: The interval for recurrence. For a quarterly review, the interval is 3 for type :
     * absoluteMonthly.
     *
     * @param interval the interval value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withInterval(Integer interval) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withInterval(interval);
        return this;
    }

    /**
     * Get the typeRangeType property: The recurrence range type. The possible values are: endDate, noEnd, numbered.
     *
     * @return the typeRangeType value.
     */
    public AccessReviewRecurrenceRangeType typeRangeType() {
        return this.innerProperties() == null ? null : this.innerProperties().typeRangeType();
    }

    /**
     * Set the typeRangeType property: The recurrence range type. The possible values are: endDate, noEnd, numbered.
     *
     * @param typeRangeType the typeRangeType value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withTypeRangeType(AccessReviewRecurrenceRangeType typeRangeType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withTypeRangeType(typeRangeType);
        return this;
    }

    /**
     * Get the numberOfOccurrences property: The number of times to repeat the access review. Required and must be
     * positive if type is numbered.
     *
     * @return the numberOfOccurrences value.
     */
    public Integer numberOfOccurrences() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfOccurrences();
    }

    /**
     * Set the numberOfOccurrences property: The number of times to repeat the access review. Required and must be
     * positive if type is numbered.
     *
     * @param numberOfOccurrences the numberOfOccurrences value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withNumberOfOccurrences(Integer numberOfOccurrences) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withNumberOfOccurrences(numberOfOccurrences);
        return this;
    }

    /**
     * Get the startDate property: The DateTime when the review is scheduled to be start. This could be a date in the
     * future. Required on create.
     *
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.innerProperties() == null ? null : this.innerProperties().startDate();
    }

    /**
     * Set the startDate property: The DateTime when the review is scheduled to be start. This could be a date in the
     * future. Required on create.
     *
     * @param startDate the startDate value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withStartDate(OffsetDateTime startDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withStartDate(startDate);
        return this;
    }

    /**
     * Get the endDate property: The DateTime when the review is scheduled to end. Required if type is endDate.
     *
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.innerProperties() == null ? null : this.innerProperties().endDate();
    }

    /**
     * Set the endDate property: The DateTime when the review is scheduled to end. Required if type is endDate.
     *
     * @param endDate the endDate value to set.
     * @return the AccessReviewDefaultSettingsInner object itself.
     */
    public AccessReviewDefaultSettingsInner withEndDate(OffsetDateTime endDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleSettings();
        }
        this.innerProperties().withEndDate(endDate);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
