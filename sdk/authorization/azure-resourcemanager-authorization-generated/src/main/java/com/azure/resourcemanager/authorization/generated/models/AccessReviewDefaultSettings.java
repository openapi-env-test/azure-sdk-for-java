// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewDefaultSettingsInner;
import java.time.Duration;
import java.time.OffsetDateTime;

/** An immutable client-side representation of AccessReviewDefaultSettings. */
public interface AccessReviewDefaultSettings {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the mailNotificationsEnabled property: Flag to indicate whether sending mails to reviewers and the review
     * creator is enabled.
     *
     * @return the mailNotificationsEnabled value.
     */
    Boolean mailNotificationsEnabled();

    /**
     * Gets the reminderNotificationsEnabled property: Flag to indicate whether sending reminder emails to reviewers are
     * enabled.
     *
     * @return the reminderNotificationsEnabled value.
     */
    Boolean reminderNotificationsEnabled();

    /**
     * Gets the defaultDecisionEnabled property: Flag to indicate whether reviewers are required to provide a
     * justification when reviewing access.
     *
     * @return the defaultDecisionEnabled value.
     */
    Boolean defaultDecisionEnabled();

    /**
     * Gets the justificationRequiredOnApproval property: Flag to indicate whether the reviewer is required to pass
     * justification when recording a decision.
     *
     * @return the justificationRequiredOnApproval value.
     */
    Boolean justificationRequiredOnApproval();

    /**
     * Gets the defaultDecision property: This specifies the behavior for the autoReview feature when an access review
     * completes.
     *
     * @return the defaultDecision value.
     */
    DefaultDecisionType defaultDecision();

    /**
     * Gets the autoApplyDecisionsEnabled property: Flag to indicate whether auto-apply capability, to automatically
     * change the target object access resource, is enabled. If not enabled, a user must, after the review completes,
     * apply the access review.
     *
     * @return the autoApplyDecisionsEnabled value.
     */
    Boolean autoApplyDecisionsEnabled();

    /**
     * Gets the recommendationsEnabled property: Flag to indicate whether showing recommendations to reviewers is
     * enabled.
     *
     * @return the recommendationsEnabled value.
     */
    Boolean recommendationsEnabled();

    /**
     * Gets the recommendationLookBackDuration property: Recommendations for access reviews are calculated by looking
     * back at 30 days of data(w.r.t the start date of the review) by default. However, in some scenarios, customers
     * want to change how far back to look at and want to configure 60 days, 90 days, etc. instead. This setting allows
     * customers to configure this duration. The value should be in ISO 8601 format
     * (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval
     * string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds)).
     *
     * @return the recommendationLookBackDuration value.
     */
    Duration recommendationLookBackDuration();

    /**
     * Gets the instanceDurationInDays property: The duration in days for an instance.
     *
     * @return the instanceDurationInDays value.
     */
    Integer instanceDurationInDays();

    /**
     * Gets the typePropertiesType property: The recurrence type : weekly, monthly, etc.
     *
     * @return the typePropertiesType value.
     */
    AccessReviewRecurrencePatternType typePropertiesType();

    /**
     * Gets the interval property: The interval for recurrence. For a quarterly review, the interval is 3 for type :
     * absoluteMonthly.
     *
     * @return the interval value.
     */
    Integer interval();

    /**
     * Gets the typeRangeType property: The recurrence range type. The possible values are: endDate, noEnd, numbered.
     *
     * @return the typeRangeType value.
     */
    AccessReviewRecurrenceRangeType typeRangeType();

    /**
     * Gets the numberOfOccurrences property: The number of times to repeat the access review. Required and must be
     * positive if type is numbered.
     *
     * @return the numberOfOccurrences value.
     */
    Integer numberOfOccurrences();

    /**
     * Gets the startDate property: The DateTime when the review is scheduled to be start. This could be a date in the
     * future. Required on create.
     *
     * @return the startDate value.
     */
    OffsetDateTime startDate();

    /**
     * Gets the endDate property: The DateTime when the review is scheduled to end. Required if type is endDate.
     *
     * @return the endDate value.
     */
    OffsetDateTime endDate();

    /**
     * Gets the inner com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewDefaultSettingsInner
     * object.
     *
     * @return the inner object.
     */
    AccessReviewDefaultSettingsInner innerModel();
}
