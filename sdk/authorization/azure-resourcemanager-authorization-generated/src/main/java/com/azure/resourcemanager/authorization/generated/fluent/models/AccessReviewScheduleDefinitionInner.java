// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewActorIdentityType;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewRecurrencePatternType;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewRecurrenceRangeType;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewReviewer;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewScheduleDefinitionReviewersType;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewScheduleDefinitionStatus;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewScopeAssignmentState;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewScopePrincipalType;
import com.azure.resourcemanager.authorization.generated.models.DefaultDecisionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;

/** Access Review Schedule Definition. */
@Fluent
public final class AccessReviewScheduleDefinitionInner extends ProxyResource {
    /*
     * Access Review properties.
     */
    @JsonProperty(value = "properties")
    private AccessReviewScheduleDefinitionProperties innerProperties;

    /**
     * Get the innerProperties property: Access Review properties.
     *
     * @return the innerProperties value.
     */
    private AccessReviewScheduleDefinitionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: The display name for the schedule definition.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name for the schedule definition.
     *
     * @param displayName the displayName value to set.
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the status property: This read-only field specifies the status of an accessReview.
     *
     * @return the status value.
     */
    public AccessReviewScheduleDefinitionStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the descriptionForAdmins property: The description provided by the access review creator and visible to
     * admins.
     *
     * @return the descriptionForAdmins value.
     */
    public String descriptionForAdmins() {
        return this.innerProperties() == null ? null : this.innerProperties().descriptionForAdmins();
    }

    /**
     * Set the descriptionForAdmins property: The description provided by the access review creator and visible to
     * admins.
     *
     * @param descriptionForAdmins the descriptionForAdmins value to set.
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withDescriptionForAdmins(String descriptionForAdmins) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
        }
        this.innerProperties().withDescriptionForAdmins(descriptionForAdmins);
        return this;
    }

    /**
     * Get the descriptionForReviewers property: The description provided by the access review creator to be shown to
     * reviewers.
     *
     * @return the descriptionForReviewers value.
     */
    public String descriptionForReviewers() {
        return this.innerProperties() == null ? null : this.innerProperties().descriptionForReviewers();
    }

    /**
     * Set the descriptionForReviewers property: The description provided by the access review creator to be shown to
     * reviewers.
     *
     * @param descriptionForReviewers the descriptionForReviewers value to set.
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withDescriptionForReviewers(String descriptionForReviewers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
        }
        this.innerProperties().withDescriptionForReviewers(descriptionForReviewers);
        return this;
    }

    /**
     * Get the reviewers property: This is the collection of reviewers.
     *
     * @return the reviewers value.
     */
    public List<AccessReviewReviewer> reviewers() {
        return this.innerProperties() == null ? null : this.innerProperties().reviewers();
    }

    /**
     * Set the reviewers property: This is the collection of reviewers.
     *
     * @param reviewers the reviewers value to set.
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withReviewers(List<AccessReviewReviewer> reviewers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
        }
        this.innerProperties().withReviewers(reviewers);
        return this;
    }

    /**
     * Get the backupReviewers property: This is the collection of backup reviewers.
     *
     * @return the backupReviewers value.
     */
    public List<AccessReviewReviewer> backupReviewers() {
        return this.innerProperties() == null ? null : this.innerProperties().backupReviewers();
    }

    /**
     * Set the backupReviewers property: This is the collection of backup reviewers.
     *
     * @param backupReviewers the backupReviewers value to set.
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withBackupReviewers(List<AccessReviewReviewer> backupReviewers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
        }
        this.innerProperties().withBackupReviewers(backupReviewers);
        return this;
    }

    /**
     * Get the reviewersType property: This field specifies the type of reviewers for a review. Usually for a review,
     * reviewers are explicitly assigned. However, in some cases, the reviewers may not be assigned and instead be
     * chosen dynamically. For example managers review or self review.
     *
     * @return the reviewersType value.
     */
    public AccessReviewScheduleDefinitionReviewersType reviewersType() {
        return this.innerProperties() == null ? null : this.innerProperties().reviewersType();
    }

    /**
     * Get the instances property: This is the collection of instances returned when one does an expand on it.
     *
     * @return the instances value.
     */
    public List<AccessReviewInstanceInner> instances() {
        return this.innerProperties() == null ? null : this.innerProperties().instances();
    }

    /**
     * Set the instances property: This is the collection of instances returned when one does an expand on it.
     *
     * @param instances the instances value to set.
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withInstances(List<AccessReviewInstanceInner> instances) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
        }
        this.innerProperties().withInstances(instances);
        return this;
    }

    /**
     * Get the principalId property: The identity id.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Get the principalType property: The identity type : user/servicePrincipal.
     *
     * @return the principalType value.
     */
    public AccessReviewActorIdentityType principalType() {
        return this.innerProperties() == null ? null : this.innerProperties().principalType();
    }

    /**
     * Get the principalName property: The identity display name.
     *
     * @return the principalName value.
     */
    public String principalName() {
        return this.innerProperties() == null ? null : this.innerProperties().principalName();
    }

    /**
     * Get the userPrincipalName property: The user principal name(if valid).
     *
     * @return the userPrincipalName value.
     */
    public String userPrincipalName() {
        return this.innerProperties() == null ? null : this.innerProperties().userPrincipalName();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withMailNotificationsEnabled(Boolean mailNotificationsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withReminderNotificationsEnabled(Boolean reminderNotificationsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withDefaultDecisionEnabled(Boolean defaultDecisionEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withJustificationRequiredOnApproval(
        Boolean justificationRequiredOnApproval) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withDefaultDecision(DefaultDecisionType defaultDecision) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withAutoApplyDecisionsEnabled(Boolean autoApplyDecisionsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withRecommendationsEnabled(Boolean recommendationsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withRecommendationLookBackDuration(
        Duration recommendationLookBackDuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withInstanceDurationInDays(Integer instanceDurationInDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withTypePropertiesType(AccessReviewRecurrencePatternType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withInterval(Integer interval) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withTypeRangeType(AccessReviewRecurrenceRangeType typeRangeType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withNumberOfOccurrences(Integer numberOfOccurrences) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withStartDate(OffsetDateTime startDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
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
     * @return the AccessReviewScheduleDefinitionInner object itself.
     */
    public AccessReviewScheduleDefinitionInner withEndDate(OffsetDateTime endDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewScheduleDefinitionProperties();
        }
        this.innerProperties().withEndDate(endDate);
        return this;
    }

    /**
     * Get the resourceId property: ResourceId in which this review is getting created.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Get the roleDefinitionId property: This is used to indicate the role being reviewed.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().roleDefinitionId();
    }

    /**
     * Get the principalTypeScopePrincipalType property: The identity type user/servicePrincipal to review.
     *
     * @return the principalTypeScopePrincipalType value.
     */
    public AccessReviewScopePrincipalType principalTypeScopePrincipalType() {
        return this.innerProperties() == null ? null : this.innerProperties().principalTypeScopePrincipalType();
    }

    /**
     * Get the assignmentState property: The role assignment state eligible/active to review.
     *
     * @return the assignmentState value.
     */
    public AccessReviewScopeAssignmentState assignmentState() {
        return this.innerProperties() == null ? null : this.innerProperties().assignmentState();
    }

    /**
     * Get the inactiveDuration property: Duration users are inactive for. The value should be in ISO 8601 format
     * (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval
     * string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds)).
     *
     * @return the inactiveDuration value.
     */
    public Duration inactiveDuration() {
        return this.innerProperties() == null ? null : this.innerProperties().inactiveDuration();
    }

    /**
     * Get the expandNestedMemberships property: Flag to indicate whether to expand nested memberships or not.
     *
     * @return the expandNestedMemberships value.
     */
    public Boolean expandNestedMemberships() {
        return this.innerProperties() == null ? null : this.innerProperties().expandNestedMemberships();
    }

    /**
     * Get the includeInheritedAccess property: Flag to indicate whether to expand nested memberships or not.
     *
     * @return the includeInheritedAccess value.
     */
    public Boolean includeInheritedAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().includeInheritedAccess();
    }

    /**
     * Get the includeAccessBelowResource property: Flag to indicate whether to expand nested memberships or not.
     *
     * @return the includeAccessBelowResource value.
     */
    public Boolean includeAccessBelowResource() {
        return this.innerProperties() == null ? null : this.innerProperties().includeAccessBelowResource();
    }

    /**
     * Get the excludeResourceId property: This is used to indicate the resource id(s) to exclude.
     *
     * @return the excludeResourceId value.
     */
    public String excludeResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().excludeResourceId();
    }

    /**
     * Get the excludeRoleDefinitionId property: This is used to indicate the role definition id(s) to exclude.
     *
     * @return the excludeRoleDefinitionId value.
     */
    public String excludeRoleDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().excludeRoleDefinitionId();
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
