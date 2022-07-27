// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for SqlManagementClient class. */
public interface SqlManagementClient {
    /**
     * Gets The subscription ID that identifies an Azure subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the RecoverableDatabasesClient object to access its operations.
     *
     * @return the RecoverableDatabasesClient object.
     */
    RecoverableDatabasesClient getRecoverableDatabases();

    /**
     * Gets the DataMaskingPoliciesClient object to access its operations.
     *
     * @return the DataMaskingPoliciesClient object.
     */
    DataMaskingPoliciesClient getDataMaskingPolicies();

    /**
     * Gets the DataMaskingRulesClient object to access its operations.
     *
     * @return the DataMaskingRulesClient object.
     */
    DataMaskingRulesClient getDataMaskingRules();

    /**
     * Gets the GeoBackupPoliciesClient object to access its operations.
     *
     * @return the GeoBackupPoliciesClient object.
     */
    GeoBackupPoliciesClient getGeoBackupPolicies();

    /**
     * Gets the DatabasesClient object to access its operations.
     *
     * @return the DatabasesClient object.
     */
    DatabasesClient getDatabases();

    /**
     * Gets the ElasticPoolsClient object to access its operations.
     *
     * @return the ElasticPoolsClient object.
     */
    ElasticPoolsClient getElasticPools();

    /**
     * Gets the ServerCommunicationLinksClient object to access its operations.
     *
     * @return the ServerCommunicationLinksClient object.
     */
    ServerCommunicationLinksClient getServerCommunicationLinks();

    /**
     * Gets the ServiceObjectivesClient object to access its operations.
     *
     * @return the ServiceObjectivesClient object.
     */
    ServiceObjectivesClient getServiceObjectives();

    /**
     * Gets the ElasticPoolActivitiesClient object to access its operations.
     *
     * @return the ElasticPoolActivitiesClient object.
     */
    ElasticPoolActivitiesClient getElasticPoolActivities();

    /**
     * Gets the ElasticPoolDatabaseActivitiesClient object to access its operations.
     *
     * @return the ElasticPoolDatabaseActivitiesClient object.
     */
    ElasticPoolDatabaseActivitiesClient getElasticPoolDatabaseActivities();

    /**
     * Gets the ServerUsagesClient object to access its operations.
     *
     * @return the ServerUsagesClient object.
     */
    ServerUsagesClient getServerUsages();

    /**
     * Gets the DatabaseAdvisorsClient object to access its operations.
     *
     * @return the DatabaseAdvisorsClient object.
     */
    DatabaseAdvisorsClient getDatabaseAdvisors();

    /**
     * Gets the DatabaseAutomaticTuningsClient object to access its operations.
     *
     * @return the DatabaseAutomaticTuningsClient object.
     */
    DatabaseAutomaticTuningsClient getDatabaseAutomaticTunings();

    /**
     * Gets the DatabaseColumnsClient object to access its operations.
     *
     * @return the DatabaseColumnsClient object.
     */
    DatabaseColumnsClient getDatabaseColumns();

    /**
     * Gets the DatabaseRecommendedActionsClient object to access its operations.
     *
     * @return the DatabaseRecommendedActionsClient object.
     */
    DatabaseRecommendedActionsClient getDatabaseRecommendedActions();

    /**
     * Gets the DatabaseSchemasClient object to access its operations.
     *
     * @return the DatabaseSchemasClient object.
     */
    DatabaseSchemasClient getDatabaseSchemas();

    /**
     * Gets the DatabaseSecurityAlertPoliciesClient object to access its operations.
     *
     * @return the DatabaseSecurityAlertPoliciesClient object.
     */
    DatabaseSecurityAlertPoliciesClient getDatabaseSecurityAlertPolicies();

    /**
     * Gets the DatabaseTablesClient object to access its operations.
     *
     * @return the DatabaseTablesClient object.
     */
    DatabaseTablesClient getDatabaseTables();

    /**
     * Gets the DatabaseVulnerabilityAssessmentRuleBaselinesClient object to access its operations.
     *
     * @return the DatabaseVulnerabilityAssessmentRuleBaselinesClient object.
     */
    DatabaseVulnerabilityAssessmentRuleBaselinesClient getDatabaseVulnerabilityAssessmentRuleBaselines();

    /**
     * Gets the DatabaseVulnerabilityAssessmentsClient object to access its operations.
     *
     * @return the DatabaseVulnerabilityAssessmentsClient object.
     */
    DatabaseVulnerabilityAssessmentsClient getDatabaseVulnerabilityAssessments();

    /**
     * Gets the DatabaseVulnerabilityAssessmentScansClient object to access its operations.
     *
     * @return the DatabaseVulnerabilityAssessmentScansClient object.
     */
    DatabaseVulnerabilityAssessmentScansClient getDatabaseVulnerabilityAssessmentScans();

    /**
     * Gets the DataWarehouseUserActivitiesOperationsClient object to access its operations.
     *
     * @return the DataWarehouseUserActivitiesOperationsClient object.
     */
    DataWarehouseUserActivitiesOperationsClient getDataWarehouseUserActivitiesOperations();

    /**
     * Gets the DeletedServersClient object to access its operations.
     *
     * @return the DeletedServersClient object.
     */
    DeletedServersClient getDeletedServers();

    /**
     * Gets the ElasticPoolOperationsClient object to access its operations.
     *
     * @return the ElasticPoolOperationsClient object.
     */
    ElasticPoolOperationsClient getElasticPoolOperations();

    /**
     * Gets the EncryptionProtectorsClient object to access its operations.
     *
     * @return the EncryptionProtectorsClient object.
     */
    EncryptionProtectorsClient getEncryptionProtectors();

    /**
     * Gets the FailoverGroupsClient object to access its operations.
     *
     * @return the FailoverGroupsClient object.
     */
    FailoverGroupsClient getFailoverGroups();

    /**
     * Gets the FirewallRulesClient object to access its operations.
     *
     * @return the FirewallRulesClient object.
     */
    FirewallRulesClient getFirewallRules();

    /**
     * Gets the InstanceFailoverGroupsClient object to access its operations.
     *
     * @return the InstanceFailoverGroupsClient object.
     */
    InstanceFailoverGroupsClient getInstanceFailoverGroups();

    /**
     * Gets the InstancePoolsClient object to access its operations.
     *
     * @return the InstancePoolsClient object.
     */
    InstancePoolsClient getInstancePools();

    /**
     * Gets the JobAgentsClient object to access its operations.
     *
     * @return the JobAgentsClient object.
     */
    JobAgentsClient getJobAgents();

    /**
     * Gets the JobCredentialsClient object to access its operations.
     *
     * @return the JobCredentialsClient object.
     */
    JobCredentialsClient getJobCredentials();

    /**
     * Gets the JobExecutionsClient object to access its operations.
     *
     * @return the JobExecutionsClient object.
     */
    JobExecutionsClient getJobExecutions();

    /**
     * Gets the JobsClient object to access its operations.
     *
     * @return the JobsClient object.
     */
    JobsClient getJobs();

    /**
     * Gets the JobStepExecutionsClient object to access its operations.
     *
     * @return the JobStepExecutionsClient object.
     */
    JobStepExecutionsClient getJobStepExecutions();

    /**
     * Gets the JobStepsClient object to access its operations.
     *
     * @return the JobStepsClient object.
     */
    JobStepsClient getJobSteps();

    /**
     * Gets the JobTargetExecutionsClient object to access its operations.
     *
     * @return the JobTargetExecutionsClient object.
     */
    JobTargetExecutionsClient getJobTargetExecutions();

    /**
     * Gets the JobTargetGroupsClient object to access its operations.
     *
     * @return the JobTargetGroupsClient object.
     */
    JobTargetGroupsClient getJobTargetGroups();

    /**
     * Gets the JobVersionsClient object to access its operations.
     *
     * @return the JobVersionsClient object.
     */
    JobVersionsClient getJobVersions();

    /**
     * Gets the CapabilitiesClient object to access its operations.
     *
     * @return the CapabilitiesClient object.
     */
    CapabilitiesClient getCapabilities();

    /**
     * Gets the LongTermRetentionPoliciesClient object to access its operations.
     *
     * @return the LongTermRetentionPoliciesClient object.
     */
    LongTermRetentionPoliciesClient getLongTermRetentionPolicies();

    /**
     * Gets the MaintenanceWindowOptionsOperationsClient object to access its operations.
     *
     * @return the MaintenanceWindowOptionsOperationsClient object.
     */
    MaintenanceWindowOptionsOperationsClient getMaintenanceWindowOptionsOperations();

    /**
     * Gets the MaintenanceWindowsOperationsClient object to access its operations.
     *
     * @return the MaintenanceWindowsOperationsClient object.
     */
    MaintenanceWindowsOperationsClient getMaintenanceWindowsOperations();

    /**
     * Gets the ManagedBackupShortTermRetentionPoliciesClient object to access its operations.
     *
     * @return the ManagedBackupShortTermRetentionPoliciesClient object.
     */
    ManagedBackupShortTermRetentionPoliciesClient getManagedBackupShortTermRetentionPolicies();

    /**
     * Gets the ManagedDatabaseColumnsClient object to access its operations.
     *
     * @return the ManagedDatabaseColumnsClient object.
     */
    ManagedDatabaseColumnsClient getManagedDatabaseColumns();

    /**
     * Gets the ManagedDatabaseQueriesClient object to access its operations.
     *
     * @return the ManagedDatabaseQueriesClient object.
     */
    ManagedDatabaseQueriesClient getManagedDatabaseQueries();

    /**
     * Gets the ManagedDatabaseRestoreDetailsClient object to access its operations.
     *
     * @return the ManagedDatabaseRestoreDetailsClient object.
     */
    ManagedDatabaseRestoreDetailsClient getManagedDatabaseRestoreDetails();

    /**
     * Gets the ManagedDatabasesClient object to access its operations.
     *
     * @return the ManagedDatabasesClient object.
     */
    ManagedDatabasesClient getManagedDatabases();

    /**
     * Gets the ManagedDatabaseSchemasClient object to access its operations.
     *
     * @return the ManagedDatabaseSchemasClient object.
     */
    ManagedDatabaseSchemasClient getManagedDatabaseSchemas();

    /**
     * Gets the ManagedDatabaseSecurityAlertPoliciesClient object to access its operations.
     *
     * @return the ManagedDatabaseSecurityAlertPoliciesClient object.
     */
    ManagedDatabaseSecurityAlertPoliciesClient getManagedDatabaseSecurityAlertPolicies();

    /**
     * Gets the ManagedDatabaseSecurityEventsClient object to access its operations.
     *
     * @return the ManagedDatabaseSecurityEventsClient object.
     */
    ManagedDatabaseSecurityEventsClient getManagedDatabaseSecurityEvents();

    /**
     * Gets the ManagedDatabaseTablesClient object to access its operations.
     *
     * @return the ManagedDatabaseTablesClient object.
     */
    ManagedDatabaseTablesClient getManagedDatabaseTables();

    /**
     * Gets the ManagedDatabaseTransparentDataEncryptionsClient object to access its operations.
     *
     * @return the ManagedDatabaseTransparentDataEncryptionsClient object.
     */
    ManagedDatabaseTransparentDataEncryptionsClient getManagedDatabaseTransparentDataEncryptions();

    /**
     * Gets the ManagedDatabaseVulnerabilityAssessmentRuleBaselinesClient object to access its operations.
     *
     * @return the ManagedDatabaseVulnerabilityAssessmentRuleBaselinesClient object.
     */
    ManagedDatabaseVulnerabilityAssessmentRuleBaselinesClient getManagedDatabaseVulnerabilityAssessmentRuleBaselines();

    /**
     * Gets the ManagedDatabaseVulnerabilityAssessmentsClient object to access its operations.
     *
     * @return the ManagedDatabaseVulnerabilityAssessmentsClient object.
     */
    ManagedDatabaseVulnerabilityAssessmentsClient getManagedDatabaseVulnerabilityAssessments();

    /**
     * Gets the ManagedDatabaseVulnerabilityAssessmentScansClient object to access its operations.
     *
     * @return the ManagedDatabaseVulnerabilityAssessmentScansClient object.
     */
    ManagedDatabaseVulnerabilityAssessmentScansClient getManagedDatabaseVulnerabilityAssessmentScans();

    /**
     * Gets the ManagedInstanceAdministratorsClient object to access its operations.
     *
     * @return the ManagedInstanceAdministratorsClient object.
     */
    ManagedInstanceAdministratorsClient getManagedInstanceAdministrators();

    /**
     * Gets the ManagedInstanceAzureADOnlyAuthenticationsClient object to access its operations.
     *
     * @return the ManagedInstanceAzureADOnlyAuthenticationsClient object.
     */
    ManagedInstanceAzureADOnlyAuthenticationsClient getManagedInstanceAzureADOnlyAuthentications();

    /**
     * Gets the ManagedInstanceEncryptionProtectorsClient object to access its operations.
     *
     * @return the ManagedInstanceEncryptionProtectorsClient object.
     */
    ManagedInstanceEncryptionProtectorsClient getManagedInstanceEncryptionProtectors();

    /**
     * Gets the ManagedInstanceKeysClient object to access its operations.
     *
     * @return the ManagedInstanceKeysClient object.
     */
    ManagedInstanceKeysClient getManagedInstanceKeys();

    /**
     * Gets the ManagedInstanceLongTermRetentionPoliciesClient object to access its operations.
     *
     * @return the ManagedInstanceLongTermRetentionPoliciesClient object.
     */
    ManagedInstanceLongTermRetentionPoliciesClient getManagedInstanceLongTermRetentionPolicies();

    /**
     * Gets the ManagedInstanceOperationsClient object to access its operations.
     *
     * @return the ManagedInstanceOperationsClient object.
     */
    ManagedInstanceOperationsClient getManagedInstanceOperations();

    /**
     * Gets the ManagedInstancePrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the ManagedInstancePrivateEndpointConnectionsClient object.
     */
    ManagedInstancePrivateEndpointConnectionsClient getManagedInstancePrivateEndpointConnections();

    /**
     * Gets the ManagedInstancePrivateLinkResourcesClient object to access its operations.
     *
     * @return the ManagedInstancePrivateLinkResourcesClient object.
     */
    ManagedInstancePrivateLinkResourcesClient getManagedInstancePrivateLinkResources();

    /**
     * Gets the ManagedInstanceTdeCertificatesClient object to access its operations.
     *
     * @return the ManagedInstanceTdeCertificatesClient object.
     */
    ManagedInstanceTdeCertificatesClient getManagedInstanceTdeCertificates();

    /**
     * Gets the ManagedInstanceVulnerabilityAssessmentsClient object to access its operations.
     *
     * @return the ManagedInstanceVulnerabilityAssessmentsClient object.
     */
    ManagedInstanceVulnerabilityAssessmentsClient getManagedInstanceVulnerabilityAssessments();

    /**
     * Gets the ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient object to access its operations.
     *
     * @return the ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient object.
     */
    ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient
        getManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies();

    /**
     * Gets the ManagedServerSecurityAlertPoliciesClient object to access its operations.
     *
     * @return the ManagedServerSecurityAlertPoliciesClient object.
     */
    ManagedServerSecurityAlertPoliciesClient getManagedServerSecurityAlertPolicies();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the RecoverableManagedDatabasesClient object to access its operations.
     *
     * @return the RecoverableManagedDatabasesClient object.
     */
    RecoverableManagedDatabasesClient getRecoverableManagedDatabases();

    /**
     * Gets the RestorePointsClient object to access its operations.
     *
     * @return the RestorePointsClient object.
     */
    RestorePointsClient getRestorePoints();

    /**
     * Gets the ServerAdvisorsClient object to access its operations.
     *
     * @return the ServerAdvisorsClient object.
     */
    ServerAdvisorsClient getServerAdvisors();

    /**
     * Gets the ServerAutomaticTuningsClient object to access its operations.
     *
     * @return the ServerAutomaticTuningsClient object.
     */
    ServerAutomaticTuningsClient getServerAutomaticTunings();

    /**
     * Gets the ServerAzureADAdministratorsClient object to access its operations.
     *
     * @return the ServerAzureADAdministratorsClient object.
     */
    ServerAzureADAdministratorsClient getServerAzureADAdministrators();

    /**
     * Gets the ServerAzureADOnlyAuthenticationsClient object to access its operations.
     *
     * @return the ServerAzureADOnlyAuthenticationsClient object.
     */
    ServerAzureADOnlyAuthenticationsClient getServerAzureADOnlyAuthentications();

    /**
     * Gets the ServerDevOpsAuditSettingsClient object to access its operations.
     *
     * @return the ServerDevOpsAuditSettingsClient object.
     */
    ServerDevOpsAuditSettingsClient getServerDevOpsAuditSettings();

    /**
     * Gets the ServerDnsAliasesClient object to access its operations.
     *
     * @return the ServerDnsAliasesClient object.
     */
    ServerDnsAliasesClient getServerDnsAliases();

    /**
     * Gets the ServerKeysClient object to access its operations.
     *
     * @return the ServerKeysClient object.
     */
    ServerKeysClient getServerKeys();

    /**
     * Gets the ServerOperationsClient object to access its operations.
     *
     * @return the ServerOperationsClient object.
     */
    ServerOperationsClient getServerOperations();

    /**
     * Gets the ServerSecurityAlertPoliciesClient object to access its operations.
     *
     * @return the ServerSecurityAlertPoliciesClient object.
     */
    ServerSecurityAlertPoliciesClient getServerSecurityAlertPolicies();

    /**
     * Gets the ServerTrustGroupsClient object to access its operations.
     *
     * @return the ServerTrustGroupsClient object.
     */
    ServerTrustGroupsClient getServerTrustGroups();

    /**
     * Gets the ServerVulnerabilityAssessmentsClient object to access its operations.
     *
     * @return the ServerVulnerabilityAssessmentsClient object.
     */
    ServerVulnerabilityAssessmentsClient getServerVulnerabilityAssessments();

    /**
     * Gets the SqlAgentsClient object to access its operations.
     *
     * @return the SqlAgentsClient object.
     */
    SqlAgentsClient getSqlAgents();

    /**
     * Gets the SubscriptionUsagesClient object to access its operations.
     *
     * @return the SubscriptionUsagesClient object.
     */
    SubscriptionUsagesClient getSubscriptionUsages();

    /**
     * Gets the SyncAgentsClient object to access its operations.
     *
     * @return the SyncAgentsClient object.
     */
    SyncAgentsClient getSyncAgents();

    /**
     * Gets the SyncGroupsClient object to access its operations.
     *
     * @return the SyncGroupsClient object.
     */
    SyncGroupsClient getSyncGroups();

    /**
     * Gets the SyncMembersClient object to access its operations.
     *
     * @return the SyncMembersClient object.
     */
    SyncMembersClient getSyncMembers();

    /**
     * Gets the TdeCertificatesClient object to access its operations.
     *
     * @return the TdeCertificatesClient object.
     */
    TdeCertificatesClient getTdeCertificates();

    /**
     * Gets the TimeZonesClient object to access its operations.
     *
     * @return the TimeZonesClient object.
     */
    TimeZonesClient getTimeZones();

    /**
     * Gets the VirtualClustersClient object to access its operations.
     *
     * @return the VirtualClustersClient object.
     */
    VirtualClustersClient getVirtualClusters();

    /**
     * Gets the VirtualNetworkRulesClient object to access its operations.
     *
     * @return the VirtualNetworkRulesClient object.
     */
    VirtualNetworkRulesClient getVirtualNetworkRules();

    /**
     * Gets the WorkloadClassifiersClient object to access its operations.
     *
     * @return the WorkloadClassifiersClient object.
     */
    WorkloadClassifiersClient getWorkloadClassifiers();

    /**
     * Gets the WorkloadGroupsClient object to access its operations.
     *
     * @return the WorkloadGroupsClient object.
     */
    WorkloadGroupsClient getWorkloadGroups();

    /**
     * Gets the TransparentDataEncryptionsClient object to access its operations.
     *
     * @return the TransparentDataEncryptionsClient object.
     */
    TransparentDataEncryptionsClient getTransparentDataEncryptions();

    /**
     * Gets the BackupShortTermRetentionPoliciesClient object to access its operations.
     *
     * @return the BackupShortTermRetentionPoliciesClient object.
     */
    BackupShortTermRetentionPoliciesClient getBackupShortTermRetentionPolicies();

    /**
     * Gets the DatabaseExtensionsOperationsClient object to access its operations.
     *
     * @return the DatabaseExtensionsOperationsClient object.
     */
    DatabaseExtensionsOperationsClient getDatabaseExtensionsOperations();

    /**
     * Gets the DatabaseOperationsClient object to access its operations.
     *
     * @return the DatabaseOperationsClient object.
     */
    DatabaseOperationsClient getDatabaseOperations();

    /**
     * Gets the DatabaseUsagesClient object to access its operations.
     *
     * @return the DatabaseUsagesClient object.
     */
    DatabaseUsagesClient getDatabaseUsages();

    /**
     * Gets the LedgerDigestUploadsOperationsClient object to access its operations.
     *
     * @return the LedgerDigestUploadsOperationsClient object.
     */
    LedgerDigestUploadsOperationsClient getLedgerDigestUploadsOperations();

    /**
     * Gets the OutboundFirewallRulesClient object to access its operations.
     *
     * @return the OutboundFirewallRulesClient object.
     */
    OutboundFirewallRulesClient getOutboundFirewallRules();

    /**
     * Gets the ServersClient object to access its operations.
     *
     * @return the ServersClient object.
     */
    ServersClient getServers();

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the LongTermRetentionBackupsClient object to access its operations.
     *
     * @return the LongTermRetentionBackupsClient object.
     */
    LongTermRetentionBackupsClient getLongTermRetentionBackups();

    /**
     * Gets the LongTermRetentionManagedInstanceBackupsClient object to access its operations.
     *
     * @return the LongTermRetentionManagedInstanceBackupsClient object.
     */
    LongTermRetentionManagedInstanceBackupsClient getLongTermRetentionManagedInstanceBackups();

    /**
     * Gets the ManagedInstancesClient object to access its operations.
     *
     * @return the ManagedInstancesClient object.
     */
    ManagedInstancesClient getManagedInstances();

    /**
     * Gets the RestorableDroppedDatabasesClient object to access its operations.
     *
     * @return the RestorableDroppedDatabasesClient object.
     */
    RestorableDroppedDatabasesClient getRestorableDroppedDatabases();

    /**
     * Gets the RestorableDroppedManagedDatabasesClient object to access its operations.
     *
     * @return the RestorableDroppedManagedDatabasesClient object.
     */
    RestorableDroppedManagedDatabasesClient getRestorableDroppedManagedDatabases();

    /**
     * Gets the ServerConnectionPoliciesClient object to access its operations.
     *
     * @return the ServerConnectionPoliciesClient object.
     */
    ServerConnectionPoliciesClient getServerConnectionPolicies();

    /**
     * Gets the DistributedAvailabilityGroupsClient object to access its operations.
     *
     * @return the DistributedAvailabilityGroupsClient object.
     */
    DistributedAvailabilityGroupsClient getDistributedAvailabilityGroups();

    /**
     * Gets the ServerTrustCertificatesClient object to access its operations.
     *
     * @return the ServerTrustCertificatesClient object.
     */
    ServerTrustCertificatesClient getServerTrustCertificates();

    /**
     * Gets the IPv6FirewallRulesClient object to access its operations.
     *
     * @return the IPv6FirewallRulesClient object.
     */
    IPv6FirewallRulesClient getIPv6FirewallRules();

    /**
     * Gets the EndpointCertificatesClient object to access its operations.
     *
     * @return the EndpointCertificatesClient object.
     */
    EndpointCertificatesClient getEndpointCertificates();

    /**
     * Gets the ManagedDatabaseSensitivityLabelsClient object to access its operations.
     *
     * @return the ManagedDatabaseSensitivityLabelsClient object.
     */
    ManagedDatabaseSensitivityLabelsClient getManagedDatabaseSensitivityLabels();

    /**
     * Gets the ManagedDatabaseRecommendedSensitivityLabelsClient object to access its operations.
     *
     * @return the ManagedDatabaseRecommendedSensitivityLabelsClient object.
     */
    ManagedDatabaseRecommendedSensitivityLabelsClient getManagedDatabaseRecommendedSensitivityLabels();

    /**
     * Gets the SensitivityLabelsClient object to access its operations.
     *
     * @return the SensitivityLabelsClient object.
     */
    SensitivityLabelsClient getSensitivityLabels();

    /**
     * Gets the RecommendedSensitivityLabelsClient object to access its operations.
     *
     * @return the RecommendedSensitivityLabelsClient object.
     */
    RecommendedSensitivityLabelsClient getRecommendedSensitivityLabels();

    /**
     * Gets the ServerBlobAuditingPoliciesClient object to access its operations.
     *
     * @return the ServerBlobAuditingPoliciesClient object.
     */
    ServerBlobAuditingPoliciesClient getServerBlobAuditingPolicies();

    /**
     * Gets the DatabaseBlobAuditingPoliciesClient object to access its operations.
     *
     * @return the DatabaseBlobAuditingPoliciesClient object.
     */
    DatabaseBlobAuditingPoliciesClient getDatabaseBlobAuditingPolicies();

    /**
     * Gets the ExtendedDatabaseBlobAuditingPoliciesClient object to access its operations.
     *
     * @return the ExtendedDatabaseBlobAuditingPoliciesClient object.
     */
    ExtendedDatabaseBlobAuditingPoliciesClient getExtendedDatabaseBlobAuditingPolicies();

    /**
     * Gets the ExtendedServerBlobAuditingPoliciesClient object to access its operations.
     *
     * @return the ExtendedServerBlobAuditingPoliciesClient object.
     */
    ExtendedServerBlobAuditingPoliciesClient getExtendedServerBlobAuditingPolicies();

    /**
     * Gets the DatabaseAdvancedThreatProtectionSettingsClient object to access its operations.
     *
     * @return the DatabaseAdvancedThreatProtectionSettingsClient object.
     */
    DatabaseAdvancedThreatProtectionSettingsClient getDatabaseAdvancedThreatProtectionSettings();

    /**
     * Gets the ServerAdvancedThreatProtectionSettingsClient object to access its operations.
     *
     * @return the ServerAdvancedThreatProtectionSettingsClient object.
     */
    ServerAdvancedThreatProtectionSettingsClient getServerAdvancedThreatProtectionSettings();

    /**
     * Gets the ManagedServerDnsAliasesClient object to access its operations.
     *
     * @return the ManagedServerDnsAliasesClient object.
     */
    ManagedServerDnsAliasesClient getManagedServerDnsAliases();

    /**
     * Gets the ManagedInstanceDtcsClient object to access its operations.
     *
     * @return the ManagedInstanceDtcsClient object.
     */
    ManagedInstanceDtcsClient getManagedInstanceDtcs();

    /**
     * Gets the ManagedDatabaseAdvancedThreatProtectionSettingsClient object to access its operations.
     *
     * @return the ManagedDatabaseAdvancedThreatProtectionSettingsClient object.
     */
    ManagedDatabaseAdvancedThreatProtectionSettingsClient getManagedDatabaseAdvancedThreatProtectionSettings();

    /**
     * Gets the ManagedInstanceAdvancedThreatProtectionSettingsClient object to access its operations.
     *
     * @return the ManagedInstanceAdvancedThreatProtectionSettingsClient object.
     */
    ManagedInstanceAdvancedThreatProtectionSettingsClient getManagedInstanceAdvancedThreatProtectionSettings();

    /**
     * Gets the ReplicationLinksClient object to access its operations.
     *
     * @return the ReplicationLinksClient object.
     */
    ReplicationLinksClient getReplicationLinks();
}
