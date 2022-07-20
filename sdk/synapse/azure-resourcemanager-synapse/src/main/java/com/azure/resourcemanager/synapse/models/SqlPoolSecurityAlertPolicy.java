// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolSecurityAlertPolicyInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of SqlPoolSecurityAlertPolicy. */
public interface SqlPoolSecurityAlertPolicy {
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
     * Gets the state property: Specifies the state of the policy, whether it is enabled or disabled or a policy has not
     * been applied yet on the specific Sql pool.
     *
     * @return the state value.
     */
    SecurityAlertPolicyState state();

    /**
     * Gets the disabledAlerts property: Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action.
     *
     * @return the disabledAlerts value.
     */
    List<String> disabledAlerts();

    /**
     * Gets the emailAddresses property: Specifies an array of e-mail addresses to which the alert is sent.
     *
     * @return the emailAddresses value.
     */
    List<String> emailAddresses();

    /**
     * Gets the emailAccountAdmins property: Specifies that the alert is sent to the account administrators.
     *
     * @return the emailAccountAdmins value.
     */
    Boolean emailAccountAdmins();

    /**
     * Gets the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     *
     * @return the storageEndpoint value.
     */
    String storageEndpoint();

    /**
     * Gets the storageAccountAccessKey property: Specifies the identifier key of the Threat Detection audit storage
     * account.
     *
     * @return the storageAccountAccessKey value.
     */
    String storageAccountAccessKey();

    /**
     * Gets the retentionDays property: Specifies the number of days to keep in the Threat Detection audit logs.
     *
     * @return the retentionDays value.
     */
    Integer retentionDays();

    /**
     * Gets the creationTime property: Specifies the UTC creation time of the policy.
     *
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.SqlPoolSecurityAlertPolicyInner object.
     *
     * @return the inner object.
     */
    SqlPoolSecurityAlertPolicyInner innerModel();

    /** The entirety of the SqlPoolSecurityAlertPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The SqlPoolSecurityAlertPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the SqlPoolSecurityAlertPolicy definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SqlPoolSecurityAlertPolicy definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName, sqlPoolName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @param sqlPoolName SQL pool name.
             * @return the next definition stage.
             */
            WithCreate withExistingSqlPool(String resourceGroupName, String workspaceName, String sqlPoolName);
        }
        /**
         * The stage of the SqlPoolSecurityAlertPolicy definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithState,
                DefinitionStages.WithDisabledAlerts,
                DefinitionStages.WithEmailAddresses,
                DefinitionStages.WithEmailAccountAdmins,
                DefinitionStages.WithStorageEndpoint,
                DefinitionStages.WithStorageAccountAccessKey,
                DefinitionStages.WithRetentionDays {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SqlPoolSecurityAlertPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SqlPoolSecurityAlertPolicy create(Context context);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy definition allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Specifies the state of the policy, whether it is enabled or disabled or a
             * policy has not been applied yet on the specific Sql pool..
             *
             * @param state Specifies the state of the policy, whether it is enabled or disabled or a policy has not
             *     been applied yet on the specific Sql pool.
             * @return the next definition stage.
             */
            WithCreate withState(SecurityAlertPolicyState state);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy definition allowing to specify disabledAlerts. */
        interface WithDisabledAlerts {
            /**
             * Specifies the disabledAlerts property: Specifies an array of alerts that are disabled. Allowed values
             * are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action.
             *
             * @param disabledAlerts Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection,
             *     Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action.
             * @return the next definition stage.
             */
            WithCreate withDisabledAlerts(List<String> disabledAlerts);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy definition allowing to specify emailAddresses. */
        interface WithEmailAddresses {
            /**
             * Specifies the emailAddresses property: Specifies an array of e-mail addresses to which the alert is
             * sent..
             *
             * @param emailAddresses Specifies an array of e-mail addresses to which the alert is sent.
             * @return the next definition stage.
             */
            WithCreate withEmailAddresses(List<String> emailAddresses);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy definition allowing to specify emailAccountAdmins. */
        interface WithEmailAccountAdmins {
            /**
             * Specifies the emailAccountAdmins property: Specifies that the alert is sent to the account
             * administrators..
             *
             * @param emailAccountAdmins Specifies that the alert is sent to the account administrators.
             * @return the next definition stage.
             */
            WithCreate withEmailAccountAdmins(Boolean emailAccountAdmins);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy definition allowing to specify storageEndpoint. */
        interface WithStorageEndpoint {
            /**
             * Specifies the storageEndpoint property: Specifies the blob storage endpoint (e.g.
             * https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs..
             *
             * @param storageEndpoint Specifies the blob storage endpoint (e.g.
             *     https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit
             *     logs.
             * @return the next definition stage.
             */
            WithCreate withStorageEndpoint(String storageEndpoint);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy definition allowing to specify storageAccountAccessKey. */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies the storageAccountAccessKey property: Specifies the identifier key of the Threat Detection
             * audit storage account..
             *
             * @param storageAccountAccessKey Specifies the identifier key of the Threat Detection audit storage
             *     account.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountAccessKey(String storageAccountAccessKey);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy definition allowing to specify retentionDays. */
        interface WithRetentionDays {
            /**
             * Specifies the retentionDays property: Specifies the number of days to keep in the Threat Detection audit
             * logs..
             *
             * @param retentionDays Specifies the number of days to keep in the Threat Detection audit logs.
             * @return the next definition stage.
             */
            WithCreate withRetentionDays(Integer retentionDays);
        }
    }
    /**
     * Begins update for the SqlPoolSecurityAlertPolicy resource.
     *
     * @return the stage of resource update.
     */
    SqlPoolSecurityAlertPolicy.Update update();

    /** The template for SqlPoolSecurityAlertPolicy update. */
    interface Update
        extends UpdateStages.WithState,
            UpdateStages.WithDisabledAlerts,
            UpdateStages.WithEmailAddresses,
            UpdateStages.WithEmailAccountAdmins,
            UpdateStages.WithStorageEndpoint,
            UpdateStages.WithStorageAccountAccessKey,
            UpdateStages.WithRetentionDays {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SqlPoolSecurityAlertPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SqlPoolSecurityAlertPolicy apply(Context context);
    }
    /** The SqlPoolSecurityAlertPolicy update stages. */
    interface UpdateStages {
        /** The stage of the SqlPoolSecurityAlertPolicy update allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Specifies the state of the policy, whether it is enabled or disabled or a
             * policy has not been applied yet on the specific Sql pool..
             *
             * @param state Specifies the state of the policy, whether it is enabled or disabled or a policy has not
             *     been applied yet on the specific Sql pool.
             * @return the next definition stage.
             */
            Update withState(SecurityAlertPolicyState state);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy update allowing to specify disabledAlerts. */
        interface WithDisabledAlerts {
            /**
             * Specifies the disabledAlerts property: Specifies an array of alerts that are disabled. Allowed values
             * are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action.
             *
             * @param disabledAlerts Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection,
             *     Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action.
             * @return the next definition stage.
             */
            Update withDisabledAlerts(List<String> disabledAlerts);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy update allowing to specify emailAddresses. */
        interface WithEmailAddresses {
            /**
             * Specifies the emailAddresses property: Specifies an array of e-mail addresses to which the alert is
             * sent..
             *
             * @param emailAddresses Specifies an array of e-mail addresses to which the alert is sent.
             * @return the next definition stage.
             */
            Update withEmailAddresses(List<String> emailAddresses);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy update allowing to specify emailAccountAdmins. */
        interface WithEmailAccountAdmins {
            /**
             * Specifies the emailAccountAdmins property: Specifies that the alert is sent to the account
             * administrators..
             *
             * @param emailAccountAdmins Specifies that the alert is sent to the account administrators.
             * @return the next definition stage.
             */
            Update withEmailAccountAdmins(Boolean emailAccountAdmins);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy update allowing to specify storageEndpoint. */
        interface WithStorageEndpoint {
            /**
             * Specifies the storageEndpoint property: Specifies the blob storage endpoint (e.g.
             * https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs..
             *
             * @param storageEndpoint Specifies the blob storage endpoint (e.g.
             *     https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit
             *     logs.
             * @return the next definition stage.
             */
            Update withStorageEndpoint(String storageEndpoint);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy update allowing to specify storageAccountAccessKey. */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies the storageAccountAccessKey property: Specifies the identifier key of the Threat Detection
             * audit storage account..
             *
             * @param storageAccountAccessKey Specifies the identifier key of the Threat Detection audit storage
             *     account.
             * @return the next definition stage.
             */
            Update withStorageAccountAccessKey(String storageAccountAccessKey);
        }
        /** The stage of the SqlPoolSecurityAlertPolicy update allowing to specify retentionDays. */
        interface WithRetentionDays {
            /**
             * Specifies the retentionDays property: Specifies the number of days to keep in the Threat Detection audit
             * logs..
             *
             * @param retentionDays Specifies the number of days to keep in the Threat Detection audit logs.
             * @return the next definition stage.
             */
            Update withRetentionDays(Integer retentionDays);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SqlPoolSecurityAlertPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SqlPoolSecurityAlertPolicy refresh(Context context);
}
