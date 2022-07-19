// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewHistoryDefinitionInner;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewHistoryInstanceInner;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewScope;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of AccessReviewHistoryDefinition. */
public interface AccessReviewHistoryDefinition {
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
     * Gets the displayName property: The display name for the history definition.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the reviewHistoryPeriodStartDateTime property: Date time used when selecting review data, all reviews
     * included in data start on or after this date. For use only with one-time/non-recurring reports.
     *
     * @return the reviewHistoryPeriodStartDateTime value.
     */
    OffsetDateTime reviewHistoryPeriodStartDateTime();

    /**
     * Gets the reviewHistoryPeriodEndDateTime property: Date time used when selecting review data, all reviews included
     * in data end on or before this date. For use only with one-time/non-recurring reports.
     *
     * @return the reviewHistoryPeriodEndDateTime value.
     */
    OffsetDateTime reviewHistoryPeriodEndDateTime();

    /**
     * Gets the decisions property: Collection of review decisions which the history data should be filtered on. For
     * example if Approve and Deny are supplied the data will only contain review results in which the decision maker
     * approved or denied a review request.
     *
     * @return the decisions value.
     */
    List<AccessReviewResult> decisions();

    /**
     * Gets the status property: This read-only field specifies the of the requested review history data. This is either
     * requested, in-progress, done or error.
     *
     * @return the status value.
     */
    AccessReviewHistoryDefinitionStatus status();

    /**
     * Gets the createdDateTime property: Date time when history definition was created.
     *
     * @return the createdDateTime value.
     */
    OffsetDateTime createdDateTime();

    /**
     * Gets the scopes property: A collection of scopes used when selecting review history data.
     *
     * @return the scopes value.
     */
    List<AccessReviewScope> scopes();

    /**
     * Gets the instances property: Set of access review history instances for this history definition.
     *
     * @return the instances value.
     */
    List<AccessReviewHistoryInstance> instances();

    /**
     * Gets the principalId property: The identity id.
     *
     * @return the principalId value.
     */
    String principalId();

    /**
     * Gets the principalType property: The identity type : user/servicePrincipal.
     *
     * @return the principalType value.
     */
    AccessReviewActorIdentityType principalType();

    /**
     * Gets the principalName property: The identity display name.
     *
     * @return the principalName value.
     */
    String principalName();

    /**
     * Gets the userPrincipalName property: The user principal name(if valid).
     *
     * @return the userPrincipalName value.
     */
    String userPrincipalName();

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
     * Gets the inner com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewHistoryDefinitionInner
     * object.
     *
     * @return the inner object.
     */
    AccessReviewHistoryDefinitionInner innerModel();

    /** The entirety of the AccessReviewHistoryDefinition definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }
    /** The AccessReviewHistoryDefinition definition stages. */
    interface DefinitionStages {
        /** The first stage of the AccessReviewHistoryDefinition definition. */
        interface Blank extends WithCreate {
        }
        /**
         * The stage of the AccessReviewHistoryDefinition definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDisplayName,
                DefinitionStages.WithDecisions,
                DefinitionStages.WithScopes,
                DefinitionStages.WithInstances,
                DefinitionStages.WithType,
                DefinitionStages.WithInterval,
                DefinitionStages.WithTypeRangeType,
                DefinitionStages.WithNumberOfOccurrences,
                DefinitionStages.WithStartDate,
                DefinitionStages.WithEndDate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AccessReviewHistoryDefinition create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AccessReviewHistoryDefinition create(Context context);
        }
        /** The stage of the AccessReviewHistoryDefinition definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name for the history definition..
             *
             * @param displayName The display name for the history definition.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the AccessReviewHistoryDefinition definition allowing to specify decisions. */
        interface WithDecisions {
            /**
             * Specifies the decisions property: Collection of review decisions which the history data should be
             * filtered on. For example if Approve and Deny are supplied the data will only contain review results in
             * which the decision maker approved or denied a review request..
             *
             * @param decisions Collection of review decisions which the history data should be filtered on. For example
             *     if Approve and Deny are supplied the data will only contain review results in which the decision
             *     maker approved or denied a review request.
             * @return the next definition stage.
             */
            WithCreate withDecisions(List<AccessReviewResult> decisions);
        }
        /** The stage of the AccessReviewHistoryDefinition definition allowing to specify scopes. */
        interface WithScopes {
            /**
             * Specifies the scopes property: A collection of scopes used when selecting review history data.
             *
             * @param scopes A collection of scopes used when selecting review history data.
             * @return the next definition stage.
             */
            WithCreate withScopes(List<AccessReviewScope> scopes);
        }
        /** The stage of the AccessReviewHistoryDefinition definition allowing to specify instances. */
        interface WithInstances {
            /**
             * Specifies the instances property: Set of access review history instances for this history definition..
             *
             * @param instances Set of access review history instances for this history definition.
             * @return the next definition stage.
             */
            WithCreate withInstances(List<AccessReviewHistoryInstanceInner> instances);
        }
        /** The stage of the AccessReviewHistoryDefinition definition allowing to specify type. */
        interface WithType {
            /**
             * Specifies the type property: The recurrence type : weekly, monthly, etc..
             *
             * @param type The recurrence type : weekly, monthly, etc.
             * @return the next definition stage.
             */
            WithCreate withType(AccessReviewRecurrencePatternType type);
        }
        /** The stage of the AccessReviewHistoryDefinition definition allowing to specify interval. */
        interface WithInterval {
            /**
             * Specifies the interval property: The interval for recurrence. For a quarterly review, the interval is 3
             * for type : absoluteMonthly..
             *
             * @param interval The interval for recurrence. For a quarterly review, the interval is 3 for type :
             *     absoluteMonthly.
             * @return the next definition stage.
             */
            WithCreate withInterval(Integer interval);
        }
        /** The stage of the AccessReviewHistoryDefinition definition allowing to specify typeRangeType. */
        interface WithTypeRangeType {
            /**
             * Specifies the typeRangeType property: The recurrence range type. The possible values are: endDate, noEnd,
             * numbered..
             *
             * @param typeRangeType The recurrence range type. The possible values are: endDate, noEnd, numbered.
             * @return the next definition stage.
             */
            WithCreate withTypeRangeType(AccessReviewRecurrenceRangeType typeRangeType);
        }
        /** The stage of the AccessReviewHistoryDefinition definition allowing to specify numberOfOccurrences. */
        interface WithNumberOfOccurrences {
            /**
             * Specifies the numberOfOccurrences property: The number of times to repeat the access review. Required and
             * must be positive if type is numbered..
             *
             * @param numberOfOccurrences The number of times to repeat the access review. Required and must be positive
             *     if type is numbered.
             * @return the next definition stage.
             */
            WithCreate withNumberOfOccurrences(Integer numberOfOccurrences);
        }
        /** The stage of the AccessReviewHistoryDefinition definition allowing to specify startDate. */
        interface WithStartDate {
            /**
             * Specifies the startDate property: The DateTime when the review is scheduled to be start. This could be a
             * date in the future. Required on create..
             *
             * @param startDate The DateTime when the review is scheduled to be start. This could be a date in the
             *     future. Required on create.
             * @return the next definition stage.
             */
            WithCreate withStartDate(OffsetDateTime startDate);
        }
        /** The stage of the AccessReviewHistoryDefinition definition allowing to specify endDate. */
        interface WithEndDate {
            /**
             * Specifies the endDate property: The DateTime when the review is scheduled to end. Required if type is
             * endDate.
             *
             * @param endDate The DateTime when the review is scheduled to end. Required if type is endDate.
             * @return the next definition stage.
             */
            WithCreate withEndDate(OffsetDateTime endDate);
        }
    }
}
