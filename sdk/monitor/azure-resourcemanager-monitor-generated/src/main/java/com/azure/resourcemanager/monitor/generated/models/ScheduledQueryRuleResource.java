// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.ScheduledQueryRuleResourceInner;
import java.time.Duration;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ScheduledQueryRuleResource. */
public interface ScheduledQueryRuleResource {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the kind property: Indicates the type of scheduled query rule. The default is LogAlert.
     *
     * @return the kind value.
     */
    Kind kind();

    /**
     * Gets the etag property: The etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal etag convention. Entity tags are used for comparing two or more entities from
     * the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24),
     * If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: SystemData of ScheduledQueryRule.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the createdWithApiVersion property: The api-version used when creating this alert rule.
     *
     * @return the createdWithApiVersion value.
     */
    String createdWithApiVersion();

    /**
     * Gets the isLegacyLogAnalyticsRule property: True if alert rule is legacy Log Analytic rule.
     *
     * @return the isLegacyLogAnalyticsRule value.
     */
    Boolean isLegacyLogAnalyticsRule();

    /**
     * Gets the description property: The description of the scheduled query rule.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the displayName property: The display name of the alert rule.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the severity property: Severity of the alert. Should be an integer between [0-4]. Value of 0 is severest.
     * Relevant and required only for rules of the kind LogAlert.
     *
     * @return the severity value.
     */
    AlertSeverity severity();

    /**
     * Gets the enabled property: The flag which indicates whether this scheduled query rule is enabled. Value should be
     * true or false.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the scopes property: The list of resource id's that this scheduled query rule is scoped to.
     *
     * @return the scopes value.
     */
    List<String> scopes();

    /**
     * Gets the evaluationFrequency property: How often the scheduled query rule is evaluated represented in ISO 8601
     * duration format. Relevant and required only for rules of the kind LogAlert.
     *
     * @return the evaluationFrequency value.
     */
    Duration evaluationFrequency();

    /**
     * Gets the windowSize property: The period of time (in ISO 8601 duration format) on which the Alert query will be
     * executed (bin size). Relevant and required only for rules of the kind LogAlert.
     *
     * @return the windowSize value.
     */
    Duration windowSize();

    /**
     * Gets the overrideQueryTimeRange property: If specified then overrides the query time range (default is
     * WindowSize*NumberOfEvaluationPeriods). Relevant only for rules of the kind LogAlert.
     *
     * @return the overrideQueryTimeRange value.
     */
    Duration overrideQueryTimeRange();

    /**
     * Gets the targetResourceTypes property: List of resource type of the target resource(s) on which the alert is
     * created/updated. For example if the scope is a resource group and targetResourceTypes is
     * Microsoft.Compute/virtualMachines, then a different alert will be fired for each virtual machine in the resource
     * group which meet the alert criteria. Relevant only for rules of the kind LogAlert.
     *
     * @return the targetResourceTypes value.
     */
    List<String> targetResourceTypes();

    /**
     * Gets the criteria property: The rule criteria that defines the conditions of the scheduled query rule.
     *
     * @return the criteria value.
     */
    ScheduledQueryRuleCriteria criteria();

    /**
     * Gets the muteActionsDuration property: Mute actions for the chosen period of time (in ISO 8601 duration format)
     * after the alert is fired. Relevant only for rules of the kind LogAlert.
     *
     * @return the muteActionsDuration value.
     */
    Duration muteActionsDuration();

    /**
     * Gets the actions property: Actions to invoke when the alert fires.
     *
     * @return the actions value.
     */
    Actions actions();

    /**
     * Gets the isWorkspaceAlertsStorageConfigured property: The flag which indicates whether this scheduled query rule
     * has been configured to be stored in the customer's storage. The default is false.
     *
     * @return the isWorkspaceAlertsStorageConfigured value.
     */
    Boolean isWorkspaceAlertsStorageConfigured();

    /**
     * Gets the checkWorkspaceAlertsStorageConfigured property: The flag which indicates whether this scheduled query
     * rule should be stored in the customer's storage. The default is false. Relevant only for rules of the kind
     * LogAlert.
     *
     * @return the checkWorkspaceAlertsStorageConfigured value.
     */
    Boolean checkWorkspaceAlertsStorageConfigured();

    /**
     * Gets the skipQueryValidation property: The flag which indicates whether the provided query should be validated or
     * not. The default is false. Relevant only for rules of the kind LogAlert.
     *
     * @return the skipQueryValidation value.
     */
    Boolean skipQueryValidation();

    /**
     * Gets the autoMitigate property: The flag that indicates whether the alert should be automatically resolved or
     * not. The default is true. Relevant only for rules of the kind LogAlert.
     *
     * @return the autoMitigate value.
     */
    Boolean autoMitigate();

    /**
     * Gets the ruleResolveConfiguration property: Defines the configuration for resolving fired alerts. Relevant only
     * for rules of the kind LogAlert.
     *
     * @return the ruleResolveConfiguration value.
     */
    RuleResolveConfiguration ruleResolveConfiguration();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.ScheduledQueryRuleResourceInner object.
     *
     * @return the inner object.
     */
    ScheduledQueryRuleResourceInner innerModel();

    /** The entirety of the ScheduledQueryRuleResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ScheduledQueryRuleResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ScheduledQueryRuleResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the ScheduledQueryRuleResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithKind,
                DefinitionStages.WithDescription,
                DefinitionStages.WithDisplayName,
                DefinitionStages.WithSeverity,
                DefinitionStages.WithEnabled,
                DefinitionStages.WithPublicNetworkAccess,
                DefinitionStages.WithScopes,
                DefinitionStages.WithEvaluationFrequency,
                DefinitionStages.WithWindowSize,
                DefinitionStages.WithOverrideQueryTimeRange,
                DefinitionStages.WithTargetResourceTypes,
                DefinitionStages.WithCriteria,
                DefinitionStages.WithMuteActionsDuration,
                DefinitionStages.WithActions,
                DefinitionStages.WithCheckWorkspaceAlertsStorageConfigured,
                DefinitionStages.WithSkipQueryValidation,
                DefinitionStages.WithAutoMitigate,
                DefinitionStages.WithRuleResolveConfiguration {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ScheduledQueryRuleResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ScheduledQueryRuleResource create(Context context);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Indicates the type of scheduled query rule. The default is LogAlert..
             *
             * @param kind Indicates the type of scheduled query rule. The default is LogAlert.
             * @return the next definition stage.
             */
            WithCreate withKind(Kind kind);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of the scheduled query rule..
             *
             * @param description The description of the scheduled query rule.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name of the alert rule.
             *
             * @param displayName The display name of the alert rule.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify severity. */
        interface WithSeverity {
            /**
             * Specifies the severity property: Severity of the alert. Should be an integer between [0-4]. Value of 0 is
             * severest. Relevant and required only for rules of the kind LogAlert..
             *
             * @param severity Severity of the alert. Should be an integer between [0-4]. Value of 0 is severest.
             *     Relevant and required only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            WithCreate withSeverity(AlertSeverity severity);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: The flag which indicates whether this scheduled query rule is enabled.
             * Value should be true or false.
             *
             * @param enabled The flag which indicates whether this scheduled query rule is enabled. Value should be
             *     true or false.
             * @return the next definition stage.
             */
            WithCreate withEnabled(Boolean enabled);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This determines if traffic is allowed over public network. By
             * default it is enabled..
             *
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is
             *     enabled.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify scopes. */
        interface WithScopes {
            /**
             * Specifies the scopes property: The list of resource id's that this scheduled query rule is scoped to..
             *
             * @param scopes The list of resource id's that this scheduled query rule is scoped to.
             * @return the next definition stage.
             */
            WithCreate withScopes(List<String> scopes);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify evaluationFrequency. */
        interface WithEvaluationFrequency {
            /**
             * Specifies the evaluationFrequency property: How often the scheduled query rule is evaluated represented
             * in ISO 8601 duration format. Relevant and required only for rules of the kind LogAlert..
             *
             * @param evaluationFrequency How often the scheduled query rule is evaluated represented in ISO 8601
             *     duration format. Relevant and required only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            WithCreate withEvaluationFrequency(Duration evaluationFrequency);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify windowSize. */
        interface WithWindowSize {
            /**
             * Specifies the windowSize property: The period of time (in ISO 8601 duration format) on which the Alert
             * query will be executed (bin size). Relevant and required only for rules of the kind LogAlert..
             *
             * @param windowSize The period of time (in ISO 8601 duration format) on which the Alert query will be
             *     executed (bin size). Relevant and required only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            WithCreate withWindowSize(Duration windowSize);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify overrideQueryTimeRange. */
        interface WithOverrideQueryTimeRange {
            /**
             * Specifies the overrideQueryTimeRange property: If specified then overrides the query time range (default
             * is WindowSize*NumberOfEvaluationPeriods). Relevant only for rules of the kind LogAlert..
             *
             * @param overrideQueryTimeRange If specified then overrides the query time range (default is
             *     WindowSize*NumberOfEvaluationPeriods). Relevant only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            WithCreate withOverrideQueryTimeRange(Duration overrideQueryTimeRange);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify targetResourceTypes. */
        interface WithTargetResourceTypes {
            /**
             * Specifies the targetResourceTypes property: List of resource type of the target resource(s) on which the
             * alert is created/updated. For example if the scope is a resource group and targetResourceTypes is
             * Microsoft.Compute/virtualMachines, then a different alert will be fired for each virtual machine in the
             * resource group which meet the alert criteria. Relevant only for rules of the kind LogAlert.
             *
             * @param targetResourceTypes List of resource type of the target resource(s) on which the alert is
             *     created/updated. For example if the scope is a resource group and targetResourceTypes is
             *     Microsoft.Compute/virtualMachines, then a different alert will be fired for each virtual machine in
             *     the resource group which meet the alert criteria. Relevant only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            WithCreate withTargetResourceTypes(List<String> targetResourceTypes);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify criteria. */
        interface WithCriteria {
            /**
             * Specifies the criteria property: The rule criteria that defines the conditions of the scheduled query
             * rule..
             *
             * @param criteria The rule criteria that defines the conditions of the scheduled query rule.
             * @return the next definition stage.
             */
            WithCreate withCriteria(ScheduledQueryRuleCriteria criteria);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify muteActionsDuration. */
        interface WithMuteActionsDuration {
            /**
             * Specifies the muteActionsDuration property: Mute actions for the chosen period of time (in ISO 8601
             * duration format) after the alert is fired. Relevant only for rules of the kind LogAlert..
             *
             * @param muteActionsDuration Mute actions for the chosen period of time (in ISO 8601 duration format) after
             *     the alert is fired. Relevant only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            WithCreate withMuteActionsDuration(Duration muteActionsDuration);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify actions. */
        interface WithActions {
            /**
             * Specifies the actions property: Actions to invoke when the alert fires..
             *
             * @param actions Actions to invoke when the alert fires.
             * @return the next definition stage.
             */
            WithCreate withActions(Actions actions);
        }
        /**
         * The stage of the ScheduledQueryRuleResource definition allowing to specify
         * checkWorkspaceAlertsStorageConfigured.
         */
        interface WithCheckWorkspaceAlertsStorageConfigured {
            /**
             * Specifies the checkWorkspaceAlertsStorageConfigured property: The flag which indicates whether this
             * scheduled query rule should be stored in the customer's storage. The default is false. Relevant only for
             * rules of the kind LogAlert..
             *
             * @param checkWorkspaceAlertsStorageConfigured The flag which indicates whether this scheduled query rule
             *     should be stored in the customer's storage. The default is false. Relevant only for rules of the kind
             *     LogAlert.
             * @return the next definition stage.
             */
            WithCreate withCheckWorkspaceAlertsStorageConfigured(Boolean checkWorkspaceAlertsStorageConfigured);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify skipQueryValidation. */
        interface WithSkipQueryValidation {
            /**
             * Specifies the skipQueryValidation property: The flag which indicates whether the provided query should be
             * validated or not. The default is false. Relevant only for rules of the kind LogAlert..
             *
             * @param skipQueryValidation The flag which indicates whether the provided query should be validated or
             *     not. The default is false. Relevant only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            WithCreate withSkipQueryValidation(Boolean skipQueryValidation);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify autoMitigate. */
        interface WithAutoMitigate {
            /**
             * Specifies the autoMitigate property: The flag that indicates whether the alert should be automatically
             * resolved or not. The default is true. Relevant only for rules of the kind LogAlert..
             *
             * @param autoMitigate The flag that indicates whether the alert should be automatically resolved or not.
             *     The default is true. Relevant only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            WithCreate withAutoMitigate(Boolean autoMitigate);
        }
        /** The stage of the ScheduledQueryRuleResource definition allowing to specify ruleResolveConfiguration. */
        interface WithRuleResolveConfiguration {
            /**
             * Specifies the ruleResolveConfiguration property: Defines the configuration for resolving fired alerts.
             * Relevant only for rules of the kind LogAlert..
             *
             * @param ruleResolveConfiguration Defines the configuration for resolving fired alerts. Relevant only for
             *     rules of the kind LogAlert.
             * @return the next definition stage.
             */
            WithCreate withRuleResolveConfiguration(RuleResolveConfiguration ruleResolveConfiguration);
        }
    }
    /**
     * Begins update for the ScheduledQueryRuleResource resource.
     *
     * @return the stage of resource update.
     */
    ScheduledQueryRuleResource.Update update();

    /** The template for ScheduledQueryRuleResource update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithDescription,
            UpdateStages.WithDisplayName,
            UpdateStages.WithSeverity,
            UpdateStages.WithEnabled,
            UpdateStages.WithPublicNetworkAccess,
            UpdateStages.WithScopes,
            UpdateStages.WithEvaluationFrequency,
            UpdateStages.WithWindowSize,
            UpdateStages.WithOverrideQueryTimeRange,
            UpdateStages.WithTargetResourceTypes,
            UpdateStages.WithCriteria,
            UpdateStages.WithMuteActionsDuration,
            UpdateStages.WithActions,
            UpdateStages.WithCheckWorkspaceAlertsStorageConfigured,
            UpdateStages.WithSkipQueryValidation,
            UpdateStages.WithAutoMitigate,
            UpdateStages.WithRuleResolveConfiguration {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ScheduledQueryRuleResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ScheduledQueryRuleResource apply(Context context);
    }
    /** The ScheduledQueryRuleResource update stages. */
    interface UpdateStages {
        /** The stage of the ScheduledQueryRuleResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of the scheduled query rule..
             *
             * @param description The description of the scheduled query rule.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name of the alert rule.
             *
             * @param displayName The display name of the alert rule.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify severity. */
        interface WithSeverity {
            /**
             * Specifies the severity property: Severity of the alert. Should be an integer between [0-4]. Value of 0 is
             * severest. Relevant and required only for rules of the kind LogAlert..
             *
             * @param severity Severity of the alert. Should be an integer between [0-4]. Value of 0 is severest.
             *     Relevant and required only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            Update withSeverity(AlertSeverity severity);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: The flag which indicates whether this scheduled query rule is enabled.
             * Value should be true or false.
             *
             * @param enabled The flag which indicates whether this scheduled query rule is enabled. Value should be
             *     true or false.
             * @return the next definition stage.
             */
            Update withEnabled(Boolean enabled);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This determines if traffic is allowed over public network. By
             * default it is enabled..
             *
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is
             *     enabled.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify scopes. */
        interface WithScopes {
            /**
             * Specifies the scopes property: The list of resource id's that this scheduled query rule is scoped to..
             *
             * @param scopes The list of resource id's that this scheduled query rule is scoped to.
             * @return the next definition stage.
             */
            Update withScopes(List<String> scopes);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify evaluationFrequency. */
        interface WithEvaluationFrequency {
            /**
             * Specifies the evaluationFrequency property: How often the scheduled query rule is evaluated represented
             * in ISO 8601 duration format. Relevant and required only for rules of the kind LogAlert..
             *
             * @param evaluationFrequency How often the scheduled query rule is evaluated represented in ISO 8601
             *     duration format. Relevant and required only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            Update withEvaluationFrequency(Duration evaluationFrequency);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify windowSize. */
        interface WithWindowSize {
            /**
             * Specifies the windowSize property: The period of time (in ISO 8601 duration format) on which the Alert
             * query will be executed (bin size). Relevant and required only for rules of the kind LogAlert..
             *
             * @param windowSize The period of time (in ISO 8601 duration format) on which the Alert query will be
             *     executed (bin size). Relevant and required only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            Update withWindowSize(Duration windowSize);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify overrideQueryTimeRange. */
        interface WithOverrideQueryTimeRange {
            /**
             * Specifies the overrideQueryTimeRange property: If specified then overrides the query time range (default
             * is WindowSize*NumberOfEvaluationPeriods). Relevant only for rules of the kind LogAlert..
             *
             * @param overrideQueryTimeRange If specified then overrides the query time range (default is
             *     WindowSize*NumberOfEvaluationPeriods). Relevant only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            Update withOverrideQueryTimeRange(Duration overrideQueryTimeRange);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify targetResourceTypes. */
        interface WithTargetResourceTypes {
            /**
             * Specifies the targetResourceTypes property: List of resource type of the target resource(s) on which the
             * alert is created/updated. For example if the scope is a resource group and targetResourceTypes is
             * Microsoft.Compute/virtualMachines, then a different alert will be fired for each virtual machine in the
             * resource group which meet the alert criteria. Relevant only for rules of the kind LogAlert.
             *
             * @param targetResourceTypes List of resource type of the target resource(s) on which the alert is
             *     created/updated. For example if the scope is a resource group and targetResourceTypes is
             *     Microsoft.Compute/virtualMachines, then a different alert will be fired for each virtual machine in
             *     the resource group which meet the alert criteria. Relevant only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            Update withTargetResourceTypes(List<String> targetResourceTypes);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify criteria. */
        interface WithCriteria {
            /**
             * Specifies the criteria property: The rule criteria that defines the conditions of the scheduled query
             * rule..
             *
             * @param criteria The rule criteria that defines the conditions of the scheduled query rule.
             * @return the next definition stage.
             */
            Update withCriteria(ScheduledQueryRuleCriteria criteria);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify muteActionsDuration. */
        interface WithMuteActionsDuration {
            /**
             * Specifies the muteActionsDuration property: Mute actions for the chosen period of time (in ISO 8601
             * duration format) after the alert is fired. Relevant only for rules of the kind LogAlert..
             *
             * @param muteActionsDuration Mute actions for the chosen period of time (in ISO 8601 duration format) after
             *     the alert is fired. Relevant only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            Update withMuteActionsDuration(Duration muteActionsDuration);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify actions. */
        interface WithActions {
            /**
             * Specifies the actions property: Actions to invoke when the alert fires..
             *
             * @param actions Actions to invoke when the alert fires.
             * @return the next definition stage.
             */
            Update withActions(Actions actions);
        }
        /**
         * The stage of the ScheduledQueryRuleResource update allowing to specify checkWorkspaceAlertsStorageConfigured.
         */
        interface WithCheckWorkspaceAlertsStorageConfigured {
            /**
             * Specifies the checkWorkspaceAlertsStorageConfigured property: The flag which indicates whether this
             * scheduled query rule should be stored in the customer's storage. The default is false. Relevant only for
             * rules of the kind LogAlert..
             *
             * @param checkWorkspaceAlertsStorageConfigured The flag which indicates whether this scheduled query rule
             *     should be stored in the customer's storage. The default is false. Relevant only for rules of the kind
             *     LogAlert.
             * @return the next definition stage.
             */
            Update withCheckWorkspaceAlertsStorageConfigured(Boolean checkWorkspaceAlertsStorageConfigured);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify skipQueryValidation. */
        interface WithSkipQueryValidation {
            /**
             * Specifies the skipQueryValidation property: The flag which indicates whether the provided query should be
             * validated or not. The default is false. Relevant only for rules of the kind LogAlert..
             *
             * @param skipQueryValidation The flag which indicates whether the provided query should be validated or
             *     not. The default is false. Relevant only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            Update withSkipQueryValidation(Boolean skipQueryValidation);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify autoMitigate. */
        interface WithAutoMitigate {
            /**
             * Specifies the autoMitigate property: The flag that indicates whether the alert should be automatically
             * resolved or not. The default is true. Relevant only for rules of the kind LogAlert..
             *
             * @param autoMitigate The flag that indicates whether the alert should be automatically resolved or not.
             *     The default is true. Relevant only for rules of the kind LogAlert.
             * @return the next definition stage.
             */
            Update withAutoMitigate(Boolean autoMitigate);
        }
        /** The stage of the ScheduledQueryRuleResource update allowing to specify ruleResolveConfiguration. */
        interface WithRuleResolveConfiguration {
            /**
             * Specifies the ruleResolveConfiguration property: Defines the configuration for resolving fired alerts.
             * Relevant only for rules of the kind LogAlert..
             *
             * @param ruleResolveConfiguration Defines the configuration for resolving fired alerts. Relevant only for
             *     rules of the kind LogAlert.
             * @return the next definition stage.
             */
            Update withRuleResolveConfiguration(RuleResolveConfiguration ruleResolveConfiguration);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ScheduledQueryRuleResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ScheduledQueryRuleResource refresh(Context context);
}
