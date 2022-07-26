// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sqlvirtualmachine.fluent.models.SqlVirtualMachineInner;
import java.util.Map;

/** An immutable client-side representation of SqlVirtualMachine. */
public interface SqlVirtualMachine {
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
     * Gets the identity property: Azure Active Directory identity of the server.
     *
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the virtualMachineResourceId property: ARM Resource id of underlying virtual machine created from SQL
     * marketplace image.
     *
     * @return the virtualMachineResourceId value.
     */
    String virtualMachineResourceId();

    /**
     * Gets the provisioningState property: Provisioning state to track the async operation status.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the sqlImageOffer property: SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     *
     * @return the sqlImageOffer value.
     */
    String sqlImageOffer();

    /**
     * Gets the sqlServerLicenseType property: SQL Server license type.
     *
     * @return the sqlServerLicenseType value.
     */
    SqlServerLicenseType sqlServerLicenseType();

    /**
     * Gets the sqlManagement property: SQL Server Management type.
     *
     * @return the sqlManagement value.
     */
    SqlManagementMode sqlManagement();

    /**
     * Gets the leastPrivilegeMode property: SQL IaaS Agent least privilege mode.
     *
     * @return the leastPrivilegeMode value.
     */
    LeastPrivilegeMode leastPrivilegeMode();

    /**
     * Gets the sqlImageSku property: SQL Server edition type.
     *
     * @return the sqlImageSku value.
     */
    SqlImageSku sqlImageSku();

    /**
     * Gets the sqlVirtualMachineGroupResourceId property: ARM resource id of the SQL virtual machine group this SQL
     * virtual machine is or will be part of.
     *
     * @return the sqlVirtualMachineGroupResourceId value.
     */
    String sqlVirtualMachineGroupResourceId();

    /**
     * Gets the wsfcDomainCredentials property: Domain credentials for setting up Windows Server Failover Cluster for
     * SQL availability group.
     *
     * @return the wsfcDomainCredentials value.
     */
    WsfcDomainCredentials wsfcDomainCredentials();

    /**
     * Gets the wsfcStaticIp property: Domain credentials for setting up Windows Server Failover Cluster for SQL
     * availability group.
     *
     * @return the wsfcStaticIp value.
     */
    String wsfcStaticIp();

    /**
     * Gets the autoPatchingSettings property: Auto patching settings for applying critical security updates to SQL
     * virtual machine.
     *
     * @return the autoPatchingSettings value.
     */
    AutoPatchingSettings autoPatchingSettings();

    /**
     * Gets the autoBackupSettings property: Auto backup settings for SQL Server.
     *
     * @return the autoBackupSettings value.
     */
    AutoBackupSettings autoBackupSettings();

    /**
     * Gets the keyVaultCredentialSettings property: Key vault credential settings.
     *
     * @return the keyVaultCredentialSettings value.
     */
    KeyVaultCredentialSettings keyVaultCredentialSettings();

    /**
     * Gets the serverConfigurationsManagementSettings property: SQL Server configuration management settings.
     *
     * @return the serverConfigurationsManagementSettings value.
     */
    ServerConfigurationsManagementSettings serverConfigurationsManagementSettings();

    /**
     * Gets the storageConfigurationSettings property: Storage Configuration Settings.
     *
     * @return the storageConfigurationSettings value.
     */
    StorageConfigurationSettings storageConfigurationSettings();

    /**
     * Gets the assessmentSettings property: Assessment Settings.
     *
     * @return the assessmentSettings value.
     */
    AssessmentSettings assessmentSettings();

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
     * Gets the inner com.azure.resourcemanager.sqlvirtualmachine.fluent.models.SqlVirtualMachineInner object.
     *
     * @return the inner object.
     */
    SqlVirtualMachineInner innerModel();

    /** The entirety of the SqlVirtualMachine definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The SqlVirtualMachine definition stages. */
    interface DefinitionStages {
        /** The first stage of the SqlVirtualMachine definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify location. */
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
        /** The stage of the SqlVirtualMachine definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value
             *     from the Azure Resource Manager API or the portal.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the SqlVirtualMachine definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithVirtualMachineResourceId,
                DefinitionStages.WithSqlImageOffer,
                DefinitionStages.WithSqlServerLicenseType,
                DefinitionStages.WithSqlManagement,
                DefinitionStages.WithLeastPrivilegeMode,
                DefinitionStages.WithSqlImageSku,
                DefinitionStages.WithWsfcDomainCredentials,
                DefinitionStages.WithWsfcStaticIp,
                DefinitionStages.WithAutoPatchingSettings,
                DefinitionStages.WithAutoBackupSettings,
                DefinitionStages.WithKeyVaultCredentialSettings,
                DefinitionStages.WithServerConfigurationsManagementSettings,
                DefinitionStages.WithStorageConfigurationSettings,
                DefinitionStages.WithAssessmentSettings {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SqlVirtualMachine create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SqlVirtualMachine create(Context context);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Azure Active Directory identity of the server..
             *
             * @param identity Azure Active Directory identity of the server.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify virtualMachineResourceId. */
        interface WithVirtualMachineResourceId {
            /**
             * Specifies the virtualMachineResourceId property: ARM Resource id of underlying virtual machine created
             * from SQL marketplace image..
             *
             * @param virtualMachineResourceId ARM Resource id of underlying virtual machine created from SQL
             *     marketplace image.
             * @return the next definition stage.
             */
            WithCreate withVirtualMachineResourceId(String virtualMachineResourceId);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify sqlImageOffer. */
        interface WithSqlImageOffer {
            /**
             * Specifies the sqlImageOffer property: SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016..
             *
             * @param sqlImageOffer SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
             * @return the next definition stage.
             */
            WithCreate withSqlImageOffer(String sqlImageOffer);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify sqlServerLicenseType. */
        interface WithSqlServerLicenseType {
            /**
             * Specifies the sqlServerLicenseType property: SQL Server license type..
             *
             * @param sqlServerLicenseType SQL Server license type.
             * @return the next definition stage.
             */
            WithCreate withSqlServerLicenseType(SqlServerLicenseType sqlServerLicenseType);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify sqlManagement. */
        interface WithSqlManagement {
            /**
             * Specifies the sqlManagement property: SQL Server Management type..
             *
             * @param sqlManagement SQL Server Management type.
             * @return the next definition stage.
             */
            WithCreate withSqlManagement(SqlManagementMode sqlManagement);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify leastPrivilegeMode. */
        interface WithLeastPrivilegeMode {
            /**
             * Specifies the leastPrivilegeMode property: SQL IaaS Agent least privilege mode..
             *
             * @param leastPrivilegeMode SQL IaaS Agent least privilege mode.
             * @return the next definition stage.
             */
            WithCreate withLeastPrivilegeMode(LeastPrivilegeMode leastPrivilegeMode);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify sqlImageSku. */
        interface WithSqlImageSku {
            /**
             * Specifies the sqlImageSku property: SQL Server edition type..
             *
             * @param sqlImageSku SQL Server edition type.
             * @return the next definition stage.
             */
            WithCreate withSqlImageSku(SqlImageSku sqlImageSku);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify wsfcDomainCredentials. */
        interface WithWsfcDomainCredentials {
            /**
             * Specifies the wsfcDomainCredentials property: Domain credentials for setting up Windows Server Failover
             * Cluster for SQL availability group..
             *
             * @param wsfcDomainCredentials Domain credentials for setting up Windows Server Failover Cluster for SQL
             *     availability group.
             * @return the next definition stage.
             */
            WithCreate withWsfcDomainCredentials(WsfcDomainCredentials wsfcDomainCredentials);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify wsfcStaticIp. */
        interface WithWsfcStaticIp {
            /**
             * Specifies the wsfcStaticIp property: Domain credentials for setting up Windows Server Failover Cluster
             * for SQL availability group..
             *
             * @param wsfcStaticIp Domain credentials for setting up Windows Server Failover Cluster for SQL
             *     availability group.
             * @return the next definition stage.
             */
            WithCreate withWsfcStaticIp(String wsfcStaticIp);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify autoPatchingSettings. */
        interface WithAutoPatchingSettings {
            /**
             * Specifies the autoPatchingSettings property: Auto patching settings for applying critical security
             * updates to SQL virtual machine..
             *
             * @param autoPatchingSettings Auto patching settings for applying critical security updates to SQL virtual
             *     machine.
             * @return the next definition stage.
             */
            WithCreate withAutoPatchingSettings(AutoPatchingSettings autoPatchingSettings);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify autoBackupSettings. */
        interface WithAutoBackupSettings {
            /**
             * Specifies the autoBackupSettings property: Auto backup settings for SQL Server..
             *
             * @param autoBackupSettings Auto backup settings for SQL Server.
             * @return the next definition stage.
             */
            WithCreate withAutoBackupSettings(AutoBackupSettings autoBackupSettings);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify keyVaultCredentialSettings. */
        interface WithKeyVaultCredentialSettings {
            /**
             * Specifies the keyVaultCredentialSettings property: Key vault credential settings..
             *
             * @param keyVaultCredentialSettings Key vault credential settings.
             * @return the next definition stage.
             */
            WithCreate withKeyVaultCredentialSettings(KeyVaultCredentialSettings keyVaultCredentialSettings);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify serverConfigurationsManagementSettings. */
        interface WithServerConfigurationsManagementSettings {
            /**
             * Specifies the serverConfigurationsManagementSettings property: SQL Server configuration management
             * settings..
             *
             * @param serverConfigurationsManagementSettings SQL Server configuration management settings.
             * @return the next definition stage.
             */
            WithCreate withServerConfigurationsManagementSettings(
                ServerConfigurationsManagementSettings serverConfigurationsManagementSettings);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify storageConfigurationSettings. */
        interface WithStorageConfigurationSettings {
            /**
             * Specifies the storageConfigurationSettings property: Storage Configuration Settings..
             *
             * @param storageConfigurationSettings Storage Configuration Settings.
             * @return the next definition stage.
             */
            WithCreate withStorageConfigurationSettings(StorageConfigurationSettings storageConfigurationSettings);
        }
        /** The stage of the SqlVirtualMachine definition allowing to specify assessmentSettings. */
        interface WithAssessmentSettings {
            /**
             * Specifies the assessmentSettings property: Assessment Settings..
             *
             * @param assessmentSettings Assessment Settings.
             * @return the next definition stage.
             */
            WithCreate withAssessmentSettings(AssessmentSettings assessmentSettings);
        }
    }
    /**
     * Begins update for the SqlVirtualMachine resource.
     *
     * @return the stage of resource update.
     */
    SqlVirtualMachine.Update update();

    /** The template for SqlVirtualMachine update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SqlVirtualMachine apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SqlVirtualMachine apply(Context context);
    }
    /** The SqlVirtualMachine update stages. */
    interface UpdateStages {
        /** The stage of the SqlVirtualMachine update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SqlVirtualMachine refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SqlVirtualMachine refresh(Context context);

    /**
     * Starts Assessment on SQL virtual machine.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void startAssessment();

    /**
     * Starts Assessment on SQL virtual machine.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void startAssessment(Context context);

    /**
     * Uninstalls and reinstalls the SQL Iaas Extension.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy();

    /**
     * Uninstalls and reinstalls the SQL Iaas Extension.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy(Context context);
}
