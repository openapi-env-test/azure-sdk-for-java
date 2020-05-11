/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SqlManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.ManagedInstanceInner;

/**
 * Type representing ManagedInstance.
 */
public interface ManagedInstance extends HasInner<ManagedInstanceInner>, Resource, GroupableResourceCore<SqlManager, ManagedInstanceInner>, HasResourceGroup, Refreshable<ManagedInstance>, Updatable<ManagedInstance.Update>, HasManager<SqlManager> {
    /**
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * @return the administratorLoginPassword value.
     */
    String administratorLoginPassword();

    /**
     * @return the collation value.
     */
    String collation();

    /**
     * @return the dnsZone value.
     */
    String dnsZone();

    /**
     * @return the dnsZonePartner value.
     */
    String dnsZonePartner();

    /**
     * @return the fullyQualifiedDomainName value.
     */
    String fullyQualifiedDomainName();

    /**
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * @return the instancePoolId value.
     */
    String instancePoolId();

    /**
     * @return the licenseType value.
     */
    ManagedInstanceLicenseType licenseType();

    /**
     * @return the managedInstanceCreateMode value.
     */
    ManagedServerCreateMode managedInstanceCreateMode();

    /**
     * @return the minimalTlsVersion value.
     */
    String minimalTlsVersion();

    /**
     * @return the proxyOverride value.
     */
    ManagedInstanceProxyOverride proxyOverride();

    /**
     * @return the publicDataEndpointEnabled value.
     */
    Boolean publicDataEndpointEnabled();

    /**
     * @return the restorePointInTime value.
     */
    DateTime restorePointInTime();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the sourceManagedInstanceId value.
     */
    String sourceManagedInstanceId();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the storageSizeInGB value.
     */
    Integer storageSizeInGB();

    /**
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * @return the timezoneId value.
     */
    String timezoneId();

    /**
     * @return the vCores value.
     */
    Integer vCores();

    /**
     * The entirety of the ManagedInstance definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ManagedInstance definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ManagedInstance definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ManagedInstance definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the managedinstance definition allowing to specify AdministratorLogin.
         */
        interface WithAdministratorLogin {
            /**
             * Specifies administratorLogin.
             * @param administratorLogin Administrator username for the managed instance. Can only be specified when the managed instance is being created (and is required for creation)
             * @return the next definition stage
             */
            WithCreate withAdministratorLogin(String administratorLogin);
        }

        /**
         * The stage of the managedinstance definition allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             * @param administratorLoginPassword The administrator login password (required for managed instance creation)
             * @return the next definition stage
             */
            WithCreate withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the managedinstance definition allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             * @param collation Collation of the managed instance
             * @return the next definition stage
             */
            WithCreate withCollation(String collation);
        }

        /**
         * The stage of the managedinstance definition allowing to specify DnsZonePartner.
         */
        interface WithDnsZonePartner {
            /**
             * Specifies dnsZonePartner.
             * @param dnsZonePartner The resource id of another managed instance whose DNS zone this managed instance will share after creation
             * @return the next definition stage
             */
            WithCreate withDnsZonePartner(String dnsZonePartner);
        }

        /**
         * The stage of the managedinstance definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The Azure Active Directory identity of the managed instance
             * @return the next definition stage
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the managedinstance definition allowing to specify InstancePoolId.
         */
        interface WithInstancePoolId {
            /**
             * Specifies instancePoolId.
             * @param instancePoolId The Id of the instance pool this managed server belongs to
             * @return the next definition stage
             */
            WithCreate withInstancePoolId(String instancePoolId);
        }

        /**
         * The stage of the managedinstance definition allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             * @param licenseType The license type. Possible values are 'LicenseIncluded' (regular price inclusive of a new SQL license) and 'BasePrice' (discounted AHB price for bringing your own SQL licenses). Possible values include: 'LicenseIncluded', 'BasePrice'
             * @return the next definition stage
             */
            WithCreate withLicenseType(ManagedInstanceLicenseType licenseType);
        }

        /**
         * The stage of the managedinstance definition allowing to specify ManagedInstanceCreateMode.
         */
        interface WithManagedInstanceCreateMode {
            /**
             * Specifies managedInstanceCreateMode.
             * @param managedInstanceCreateMode Specifies the mode of database creation.
 Default: Regular instance creation.
 Restore: Creates an instance by restoring a set of backups to specific point in time. RestorePointInTime and SourceManagedInstanceId must be specified. Possible values include: 'Default', 'PointInTimeRestore'
             * @return the next definition stage
             */
            WithCreate withManagedInstanceCreateMode(ManagedServerCreateMode managedInstanceCreateMode);
        }

        /**
         * The stage of the managedinstance definition allowing to specify MinimalTlsVersion.
         */
        interface WithMinimalTlsVersion {
            /**
             * Specifies minimalTlsVersion.
             * @param minimalTlsVersion Minimal TLS version. Allowed values: 'None', '1.0', '1.1', '1.2'
             * @return the next definition stage
             */
            WithCreate withMinimalTlsVersion(String minimalTlsVersion);
        }

        /**
         * The stage of the managedinstance definition allowing to specify ProxyOverride.
         */
        interface WithProxyOverride {
            /**
             * Specifies proxyOverride.
             * @param proxyOverride Connection type used for connecting to the instance. Possible values include: 'Proxy', 'Redirect', 'Default'
             * @return the next definition stage
             */
            WithCreate withProxyOverride(ManagedInstanceProxyOverride proxyOverride);
        }

        /**
         * The stage of the managedinstance definition allowing to specify PublicDataEndpointEnabled.
         */
        interface WithPublicDataEndpointEnabled {
            /**
             * Specifies publicDataEndpointEnabled.
             * @param publicDataEndpointEnabled Whether or not the public data endpoint is enabled
             * @return the next definition stage
             */
            WithCreate withPublicDataEndpointEnabled(Boolean publicDataEndpointEnabled);
        }

        /**
         * The stage of the managedinstance definition allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             * @param restorePointInTime Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database
             * @return the next definition stage
             */
            WithCreate withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the managedinstance definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Managed instance SKU. Allowed values for sku.name: GP_Gen4, GP_Gen5, BC_Gen4, BC_Gen5
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the managedinstance definition allowing to specify SourceManagedInstanceId.
         */
        interface WithSourceManagedInstanceId {
            /**
             * Specifies sourceManagedInstanceId.
             * @param sourceManagedInstanceId The resource identifier of the source managed instance associated with create operation of this instance
             * @return the next definition stage
             */
            WithCreate withSourceManagedInstanceId(String sourceManagedInstanceId);
        }

        /**
         * The stage of the managedinstance definition allowing to specify StorageSizeInGB.
         */
        interface WithStorageSizeInGB {
            /**
             * Specifies storageSizeInGB.
             * @param storageSizeInGB Storage size in GB. Minimum value: 32. Maximum value: 8192. Increments of 32 GB allowed only
             * @return the next definition stage
             */
            WithCreate withStorageSizeInGB(Integer storageSizeInGB);
        }

        /**
         * The stage of the managedinstance definition allowing to specify SubnetId.
         */
        interface WithSubnetId {
            /**
             * Specifies subnetId.
             * @param subnetId Subnet resource ID for the managed instance
             * @return the next definition stage
             */
            WithCreate withSubnetId(String subnetId);
        }

        /**
         * The stage of the managedinstance definition allowing to specify TimezoneId.
         */
        interface WithTimezoneId {
            /**
             * Specifies timezoneId.
             * @param timezoneId Id of the timezone. Allowed values are timezones supported by Windows.
 Windows keeps details on supported timezones, including the id, in registry under
 KEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Time Zones.
 You can get those registry values via SQL Server by querying SELECT name AS timezone_id FROM sys.time_zone_info.
 List of Ids can also be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
 An example of valid timezone id is "Pacific Standard Time" or "W. Europe Standard Time"
             * @return the next definition stage
             */
            WithCreate withTimezoneId(String timezoneId);
        }

        /**
         * The stage of the managedinstance definition allowing to specify VCores.
         */
        interface WithVCores {
            /**
             * Specifies vCores.
             * @param vCores The number of vCores. Allowed values: 8, 16, 24, 32, 40, 64, 80
             * @return the next definition stage
             */
            WithCreate withVCores(Integer vCores);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ManagedInstance>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAdministratorLogin, DefinitionStages.WithAdministratorLoginPassword, DefinitionStages.WithCollation, DefinitionStages.WithDnsZonePartner, DefinitionStages.WithIdentity, DefinitionStages.WithInstancePoolId, DefinitionStages.WithLicenseType, DefinitionStages.WithManagedInstanceCreateMode, DefinitionStages.WithMinimalTlsVersion, DefinitionStages.WithProxyOverride, DefinitionStages.WithPublicDataEndpointEnabled, DefinitionStages.WithRestorePointInTime, DefinitionStages.WithSku, DefinitionStages.WithSourceManagedInstanceId, DefinitionStages.WithStorageSizeInGB, DefinitionStages.WithSubnetId, DefinitionStages.WithTimezoneId, DefinitionStages.WithVCores {
        }
    }
    /**
     * The template for a ManagedInstance update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ManagedInstance>, Resource.UpdateWithTags<Update>, UpdateStages.WithAdministratorLogin, UpdateStages.WithAdministratorLoginPassword, UpdateStages.WithCollation, UpdateStages.WithDnsZonePartner, UpdateStages.WithInstancePoolId, UpdateStages.WithLicenseType, UpdateStages.WithManagedInstanceCreateMode, UpdateStages.WithMinimalTlsVersion, UpdateStages.WithProxyOverride, UpdateStages.WithPublicDataEndpointEnabled, UpdateStages.WithRestorePointInTime, UpdateStages.WithSku, UpdateStages.WithSourceManagedInstanceId, UpdateStages.WithStorageSizeInGB, UpdateStages.WithSubnetId, UpdateStages.WithTimezoneId, UpdateStages.WithVCores {
    }

    /**
     * Grouping of ManagedInstance update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the managedinstance update allowing to specify AdministratorLogin.
         */
        interface WithAdministratorLogin {
            /**
             * Specifies administratorLogin.
             * @param administratorLogin Administrator username for the managed instance. Can only be specified when the managed instance is being created (and is required for creation)
             * @return the next update stage
             */
            Update withAdministratorLogin(String administratorLogin);
        }

        /**
         * The stage of the managedinstance update allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             * @param administratorLoginPassword The administrator login password (required for managed instance creation)
             * @return the next update stage
             */
            Update withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the managedinstance update allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             * @param collation Collation of the managed instance
             * @return the next update stage
             */
            Update withCollation(String collation);
        }

        /**
         * The stage of the managedinstance update allowing to specify DnsZonePartner.
         */
        interface WithDnsZonePartner {
            /**
             * Specifies dnsZonePartner.
             * @param dnsZonePartner The resource id of another managed instance whose DNS zone this managed instance will share after creation
             * @return the next update stage
             */
            Update withDnsZonePartner(String dnsZonePartner);
        }

        /**
         * The stage of the managedinstance update allowing to specify InstancePoolId.
         */
        interface WithInstancePoolId {
            /**
             * Specifies instancePoolId.
             * @param instancePoolId The Id of the instance pool this managed server belongs to
             * @return the next update stage
             */
            Update withInstancePoolId(String instancePoolId);
        }

        /**
         * The stage of the managedinstance update allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             * @param licenseType The license type. Possible values are 'LicenseIncluded' (regular price inclusive of a new SQL license) and 'BasePrice' (discounted AHB price for bringing your own SQL licenses). Possible values include: 'LicenseIncluded', 'BasePrice'
             * @return the next update stage
             */
            Update withLicenseType(ManagedInstanceLicenseType licenseType);
        }

        /**
         * The stage of the managedinstance update allowing to specify ManagedInstanceCreateMode.
         */
        interface WithManagedInstanceCreateMode {
            /**
             * Specifies managedInstanceCreateMode.
             * @param managedInstanceCreateMode Specifies the mode of database creation.
 Default: Regular instance creation.
 Restore: Creates an instance by restoring a set of backups to specific point in time. RestorePointInTime and SourceManagedInstanceId must be specified. Possible values include: 'Default', 'PointInTimeRestore'
             * @return the next update stage
             */
            Update withManagedInstanceCreateMode(ManagedServerCreateMode managedInstanceCreateMode);
        }

        /**
         * The stage of the managedinstance update allowing to specify MinimalTlsVersion.
         */
        interface WithMinimalTlsVersion {
            /**
             * Specifies minimalTlsVersion.
             * @param minimalTlsVersion Minimal TLS version. Allowed values: 'None', '1.0', '1.1', '1.2'
             * @return the next update stage
             */
            Update withMinimalTlsVersion(String minimalTlsVersion);
        }

        /**
         * The stage of the managedinstance update allowing to specify ProxyOverride.
         */
        interface WithProxyOverride {
            /**
             * Specifies proxyOverride.
             * @param proxyOverride Connection type used for connecting to the instance. Possible values include: 'Proxy', 'Redirect', 'Default'
             * @return the next update stage
             */
            Update withProxyOverride(ManagedInstanceProxyOverride proxyOverride);
        }

        /**
         * The stage of the managedinstance update allowing to specify PublicDataEndpointEnabled.
         */
        interface WithPublicDataEndpointEnabled {
            /**
             * Specifies publicDataEndpointEnabled.
             * @param publicDataEndpointEnabled Whether or not the public data endpoint is enabled
             * @return the next update stage
             */
            Update withPublicDataEndpointEnabled(Boolean publicDataEndpointEnabled);
        }

        /**
         * The stage of the managedinstance update allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             * @param restorePointInTime Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database
             * @return the next update stage
             */
            Update withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the managedinstance update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Managed instance sku
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the managedinstance update allowing to specify SourceManagedInstanceId.
         */
        interface WithSourceManagedInstanceId {
            /**
             * Specifies sourceManagedInstanceId.
             * @param sourceManagedInstanceId The resource identifier of the source managed instance associated with create operation of this instance
             * @return the next update stage
             */
            Update withSourceManagedInstanceId(String sourceManagedInstanceId);
        }

        /**
         * The stage of the managedinstance update allowing to specify StorageSizeInGB.
         */
        interface WithStorageSizeInGB {
            /**
             * Specifies storageSizeInGB.
             * @param storageSizeInGB Storage size in GB. Minimum value: 32. Maximum value: 8192. Increments of 32 GB allowed only
             * @return the next update stage
             */
            Update withStorageSizeInGB(Integer storageSizeInGB);
        }

        /**
         * The stage of the managedinstance update allowing to specify SubnetId.
         */
        interface WithSubnetId {
            /**
             * Specifies subnetId.
             * @param subnetId Subnet resource ID for the managed instance
             * @return the next update stage
             */
            Update withSubnetId(String subnetId);
        }

        /**
         * The stage of the managedinstance update allowing to specify TimezoneId.
         */
        interface WithTimezoneId {
            /**
             * Specifies timezoneId.
             * @param timezoneId Id of the timezone. Allowed values are timezones supported by Windows.
 Windows keeps details on supported timezones, including the id, in registry under
 KEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Time Zones.
 You can get those registry values via SQL Server by querying SELECT name AS timezone_id FROM sys.time_zone_info.
 List of Ids can also be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
 An example of valid timezone id is "Pacific Standard Time" or "W. Europe Standard Time"
             * @return the next update stage
             */
            Update withTimezoneId(String timezoneId);
        }

        /**
         * The stage of the managedinstance update allowing to specify VCores.
         */
        interface WithVCores {
            /**
             * Specifies vCores.
             * @param vCores The number of vCores. Allowed values: 8, 16, 24, 32, 40, 64, 80
             * @return the next update stage
             */
            Update withVCores(Integer vCores);
        }

    }
}
