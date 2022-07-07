// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewActorIdentityType;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewHistoryDefinitionStatus;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewRecurrencePatternType;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewRecurrenceRangeType;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Access Review History Instances. */
@Fluent
public final class AccessReviewHistoryDefinitionProperties {
    /*
     * The display name for the history definition.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Date time used when selecting review data, all reviews included in data
     * start on or after this date. For use only with one-time/non-recurring
     * reports.
     */
    @JsonProperty(value = "reviewHistoryPeriodStartDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime reviewHistoryPeriodStartDateTime;

    /*
     * Date time used when selecting review data, all reviews included in data
     * end on or before this date. For use only with one-time/non-recurring
     * reports.
     */
    @JsonProperty(value = "reviewHistoryPeriodEndDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime reviewHistoryPeriodEndDateTime;

    /*
     * Collection of review decisions which the history data should be filtered
     * on. For example if Approve and Deny are supplied the data will only
     * contain review results in which the decision maker approved or denied a
     * review request.
     */
    @JsonProperty(value = "decisions")
    private List<AccessReviewResult> decisions;

    /*
     * This read-only field specifies the of the requested review history data.
     * This is either requested, in-progress, done or error.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private AccessReviewHistoryDefinitionStatus status;

    /*
     * Date time when history definition was created
     */
    @JsonProperty(value = "createdDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDateTime;

    /*
     * The user or other identity who created this history definition.
     */
    @JsonProperty(value = "createdBy", access = JsonProperty.Access.WRITE_ONLY)
    private AccessReviewActorIdentity innerCreatedBy;

    /*
     * A collection of scopes used when selecting review history data
     */
    @JsonProperty(value = "scopes")
    private List<AccessReviewScope> scopes;

    /*
     * Recurrence settings for recurring history reports, skip for one-time
     * reports.
     */
    @JsonProperty(value = "settings")
    private AccessReviewHistoryScheduleSettings innerSettings;

    /*
     * Set of access review history instances for this history definition.
     */
    @JsonProperty(value = "instances")
    private List<AccessReviewHistoryInstanceInner> instances;

    /**
     * Get the displayName property: The display name for the history definition.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the history definition.
     *
     * @param displayName the displayName value to set.
     * @return the AccessReviewHistoryDefinitionProperties object itself.
     */
    public AccessReviewHistoryDefinitionProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the reviewHistoryPeriodStartDateTime property: Date time used when selecting review data, all reviews
     * included in data start on or after this date. For use only with one-time/non-recurring reports.
     *
     * @return the reviewHistoryPeriodStartDateTime value.
     */
    public OffsetDateTime reviewHistoryPeriodStartDateTime() {
        return this.reviewHistoryPeriodStartDateTime;
    }

    /**
     * Get the reviewHistoryPeriodEndDateTime property: Date time used when selecting review data, all reviews included
     * in data end on or before this date. For use only with one-time/non-recurring reports.
     *
     * @return the reviewHistoryPeriodEndDateTime value.
     */
    public OffsetDateTime reviewHistoryPeriodEndDateTime() {
        return this.reviewHistoryPeriodEndDateTime;
    }

    /**
     * Get the decisions property: Collection of review decisions which the history data should be filtered on. For
     * example if Approve and Deny are supplied the data will only contain review results in which the decision maker
     * approved or denied a review request.
     *
     * @return the decisions value.
     */
    public List<AccessReviewResult> decisions() {
        return this.decisions;
    }

    /**
     * Set the decisions property: Collection of review decisions which the history data should be filtered on. For
     * example if Approve and Deny are supplied the data will only contain review results in which the decision maker
     * approved or denied a review request.
     *
     * @param decisions the decisions value to set.
     * @return the AccessReviewHistoryDefinitionProperties object itself.
     */
    public AccessReviewHistoryDefinitionProperties withDecisions(List<AccessReviewResult> decisions) {
        this.decisions = decisions;
        return this;
    }

    /**
     * Get the status property: This read-only field specifies the of the requested review history data. This is either
     * requested, in-progress, done or error.
     *
     * @return the status value.
     */
    public AccessReviewHistoryDefinitionStatus status() {
        return this.status;
    }

    /**
     * Get the createdDateTime property: Date time when history definition was created.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the innerCreatedBy property: The user or other identity who created this history definition.
     *
     * @return the innerCreatedBy value.
     */
    private AccessReviewActorIdentity innerCreatedBy() {
        return this.innerCreatedBy;
    }

    /**
     * Get the scopes property: A collection of scopes used when selecting review history data.
     *
     * @return the scopes value.
     */
    public List<AccessReviewScope> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: A collection of scopes used when selecting review history data.
     *
     * @param scopes the scopes value to set.
     * @return the AccessReviewHistoryDefinitionProperties object itself.
     */
    public AccessReviewHistoryDefinitionProperties withScopes(List<AccessReviewScope> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get the innerSettings property: Recurrence settings for recurring history reports, skip for one-time reports.
     *
     * @return the innerSettings value.
     */
    private AccessReviewHistoryScheduleSettings innerSettings() {
        return this.innerSettings;
    }

    /**
     * Get the instances property: Set of access review history instances for this history definition.
     *
     * @return the instances value.
     */
    public List<AccessReviewHistoryInstanceInner> instances() {
        return this.instances;
    }

    /**
     * Set the instances property: Set of access review history instances for this history definition.
     *
     * @param instances the instances value to set.
     * @return the AccessReviewHistoryDefinitionProperties object itself.
     */
    public AccessReviewHistoryDefinitionProperties withInstances(List<AccessReviewHistoryInstanceInner> instances) {
        this.instances = instances;
        return this;
    }

    /**
     * Get the principalId property: The identity id.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerCreatedBy() == null ? null : this.innerCreatedBy().principalId();
    }

    /**
     * Get the principalType property: The identity type : user/servicePrincipal.
     *
     * @return the principalType value.
     */
    public AccessReviewActorIdentityType principalType() {
        return this.innerCreatedBy() == null ? null : this.innerCreatedBy().principalType();
    }

    /**
     * Get the principalName property: The identity display name.
     *
     * @return the principalName value.
     */
    public String principalName() {
        return this.innerCreatedBy() == null ? null : this.innerCreatedBy().principalName();
    }

    /**
     * Get the userPrincipalName property: The user principal name(if valid).
     *
     * @return the userPrincipalName value.
     */
    public String userPrincipalName() {
        return this.innerCreatedBy() == null ? null : this.innerCreatedBy().userPrincipalName();
    }

    /**
     * Get the type property: The recurrence type : weekly, monthly, etc.
     *
     * @return the type value.
     */
    public AccessReviewRecurrencePatternType type() {
        return this.innerSettings() == null ? null : this.innerSettings().type();
    }

    /**
     * Set the type property: The recurrence type : weekly, monthly, etc.
     *
     * @param type the type value to set.
     * @return the AccessReviewHistoryDefinitionProperties object itself.
     */
    public AccessReviewHistoryDefinitionProperties withType(AccessReviewRecurrencePatternType type) {
        if (this.innerSettings() == null) {
            this.innerSettings = new AccessReviewHistoryScheduleSettings();
        }
        this.innerSettings().withType(type);
        return this;
    }

    /**
     * Get the interval property: The interval for recurrence. For a quarterly review, the interval is 3 for type :
     * absoluteMonthly.
     *
     * @return the interval value.
     */
    public Integer interval() {
        return this.innerSettings() == null ? null : this.innerSettings().interval();
    }

    /**
     * Set the interval property: The interval for recurrence. For a quarterly review, the interval is 3 for type :
     * absoluteMonthly.
     *
     * @param interval the interval value to set.
     * @return the AccessReviewHistoryDefinitionProperties object itself.
     */
    public AccessReviewHistoryDefinitionProperties withInterval(Integer interval) {
        if (this.innerSettings() == null) {
            this.innerSettings = new AccessReviewHistoryScheduleSettings();
        }
        this.innerSettings().withInterval(interval);
        return this;
    }

    /**
     * Get the typeRangeType property: The recurrence range type. The possible values are: endDate, noEnd, numbered.
     *
     * @return the typeRangeType value.
     */
    public AccessReviewRecurrenceRangeType typeRangeType() {
        return this.innerSettings() == null ? null : this.innerSettings().typeRangeType();
    }

    /**
     * Set the typeRangeType property: The recurrence range type. The possible values are: endDate, noEnd, numbered.
     *
     * @param typeRangeType the typeRangeType value to set.
     * @return the AccessReviewHistoryDefinitionProperties object itself.
     */
    public AccessReviewHistoryDefinitionProperties withTypeRangeType(AccessReviewRecurrenceRangeType typeRangeType) {
        if (this.innerSettings() == null) {
            this.innerSettings = new AccessReviewHistoryScheduleSettings();
        }
        this.innerSettings().withTypeRangeType(typeRangeType);
        return this;
    }

    /**
     * Get the numberOfOccurrences property: The number of times to repeat the access review. Required and must be
     * positive if type is numbered.
     *
     * @return the numberOfOccurrences value.
     */
    public Integer numberOfOccurrences() {
        return this.innerSettings() == null ? null : this.innerSettings().numberOfOccurrences();
    }

    /**
     * Set the numberOfOccurrences property: The number of times to repeat the access review. Required and must be
     * positive if type is numbered.
     *
     * @param numberOfOccurrences the numberOfOccurrences value to set.
     * @return the AccessReviewHistoryDefinitionProperties object itself.
     */
    public AccessReviewHistoryDefinitionProperties withNumberOfOccurrences(Integer numberOfOccurrences) {
        if (this.innerSettings() == null) {
            this.innerSettings = new AccessReviewHistoryScheduleSettings();
        }
        this.innerSettings().withNumberOfOccurrences(numberOfOccurrences);
        return this;
    }

    /**
     * Get the startDate property: The DateTime when the review is scheduled to be start. This could be a date in the
     * future. Required on create.
     *
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.innerSettings() == null ? null : this.innerSettings().startDate();
    }

    /**
     * Set the startDate property: The DateTime when the review is scheduled to be start. This could be a date in the
     * future. Required on create.
     *
     * @param startDate the startDate value to set.
     * @return the AccessReviewHistoryDefinitionProperties object itself.
     */
    public AccessReviewHistoryDefinitionProperties withStartDate(OffsetDateTime startDate) {
        if (this.innerSettings() == null) {
            this.innerSettings = new AccessReviewHistoryScheduleSettings();
        }
        this.innerSettings().withStartDate(startDate);
        return this;
    }

    /**
     * Get the endDate property: The DateTime when the review is scheduled to end. Required if type is endDate.
     *
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.innerSettings() == null ? null : this.innerSettings().endDate();
    }

    /**
     * Set the endDate property: The DateTime when the review is scheduled to end. Required if type is endDate.
     *
     * @param endDate the endDate value to set.
     * @return the AccessReviewHistoryDefinitionProperties object itself.
     */
    public AccessReviewHistoryDefinitionProperties withEndDate(OffsetDateTime endDate) {
        if (this.innerSettings() == null) {
            this.innerSettings = new AccessReviewHistoryScheduleSettings();
        }
        this.innerSettings().withEndDate(endDate);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerCreatedBy() != null) {
            innerCreatedBy().validate();
        }
        if (scopes() != null) {
            scopes().forEach(e -> e.validate());
        }
        if (innerSettings() != null) {
            innerSettings().validate();
        }
        if (instances() != null) {
            instances().forEach(e -> e.validate());
        }
    }
}
