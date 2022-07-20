// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.DatabasePrincipalAssignmentInner;

/** An immutable client-side representation of DatabasePrincipalAssignment. */
public interface DatabasePrincipalAssignment {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the principalId property: The principal ID assigned to the database principal. It can be a user email,
     * application ID, or security group name.
     *
     * @return the principalId value.
     */
    String principalId();

    /**
     * Gets the role property: Database principal role.
     *
     * @return the role value.
     */
    DatabasePrincipalRole role();

    /**
     * Gets the tenantId property: The tenant id of the principal.
     *
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the principalType property: Principal type.
     *
     * @return the principalType value.
     */
    PrincipalType principalType();

    /**
     * Gets the tenantName property: The tenant name of the principal.
     *
     * @return the tenantName value.
     */
    String tenantName();

    /**
     * Gets the principalName property: The principal name.
     *
     * @return the principalName value.
     */
    String principalName();

    /**
     * Gets the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    ResourceProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.DatabasePrincipalAssignmentInner object.
     *
     * @return the inner object.
     */
    DatabasePrincipalAssignmentInner innerModel();

    /** The entirety of the DatabasePrincipalAssignment definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The DatabasePrincipalAssignment definition stages. */
    interface DefinitionStages {
        /** The first stage of the DatabasePrincipalAssignment definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the DatabasePrincipalAssignment definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies workspaceName, kustoPoolName, databaseName, resourceGroupName.
             *
             * @param workspaceName The name of the workspace.
             * @param kustoPoolName The name of the Kusto pool.
             * @param databaseName The name of the database in the Kusto pool.
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingDatabase(
                String workspaceName, String kustoPoolName, String databaseName, String resourceGroupName);
        }
        /**
         * The stage of the DatabasePrincipalAssignment definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithPrincipalId,
                DefinitionStages.WithRole,
                DefinitionStages.WithTenantId,
                DefinitionStages.WithPrincipalType {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DatabasePrincipalAssignment create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DatabasePrincipalAssignment create(Context context);
        }
        /** The stage of the DatabasePrincipalAssignment definition allowing to specify principalId. */
        interface WithPrincipalId {
            /**
             * Specifies the principalId property: The principal ID assigned to the database principal. It can be a user
             * email, application ID, or security group name..
             *
             * @param principalId The principal ID assigned to the database principal. It can be a user email,
             *     application ID, or security group name.
             * @return the next definition stage.
             */
            WithCreate withPrincipalId(String principalId);
        }
        /** The stage of the DatabasePrincipalAssignment definition allowing to specify role. */
        interface WithRole {
            /**
             * Specifies the role property: Database principal role..
             *
             * @param role Database principal role.
             * @return the next definition stage.
             */
            WithCreate withRole(DatabasePrincipalRole role);
        }
        /** The stage of the DatabasePrincipalAssignment definition allowing to specify tenantId. */
        interface WithTenantId {
            /**
             * Specifies the tenantId property: The tenant id of the principal.
             *
             * @param tenantId The tenant id of the principal.
             * @return the next definition stage.
             */
            WithCreate withTenantId(String tenantId);
        }
        /** The stage of the DatabasePrincipalAssignment definition allowing to specify principalType. */
        interface WithPrincipalType {
            /**
             * Specifies the principalType property: Principal type..
             *
             * @param principalType Principal type.
             * @return the next definition stage.
             */
            WithCreate withPrincipalType(PrincipalType principalType);
        }
    }
    /**
     * Begins update for the DatabasePrincipalAssignment resource.
     *
     * @return the stage of resource update.
     */
    DatabasePrincipalAssignment.Update update();

    /** The template for DatabasePrincipalAssignment update. */
    interface Update
        extends UpdateStages.WithPrincipalId,
            UpdateStages.WithRole,
            UpdateStages.WithTenantId,
            UpdateStages.WithPrincipalType {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DatabasePrincipalAssignment apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DatabasePrincipalAssignment apply(Context context);
    }
    /** The DatabasePrincipalAssignment update stages. */
    interface UpdateStages {
        /** The stage of the DatabasePrincipalAssignment update allowing to specify principalId. */
        interface WithPrincipalId {
            /**
             * Specifies the principalId property: The principal ID assigned to the database principal. It can be a user
             * email, application ID, or security group name..
             *
             * @param principalId The principal ID assigned to the database principal. It can be a user email,
             *     application ID, or security group name.
             * @return the next definition stage.
             */
            Update withPrincipalId(String principalId);
        }
        /** The stage of the DatabasePrincipalAssignment update allowing to specify role. */
        interface WithRole {
            /**
             * Specifies the role property: Database principal role..
             *
             * @param role Database principal role.
             * @return the next definition stage.
             */
            Update withRole(DatabasePrincipalRole role);
        }
        /** The stage of the DatabasePrincipalAssignment update allowing to specify tenantId. */
        interface WithTenantId {
            /**
             * Specifies the tenantId property: The tenant id of the principal.
             *
             * @param tenantId The tenant id of the principal.
             * @return the next definition stage.
             */
            Update withTenantId(String tenantId);
        }
        /** The stage of the DatabasePrincipalAssignment update allowing to specify principalType. */
        interface WithPrincipalType {
            /**
             * Specifies the principalType property: Principal type..
             *
             * @param principalType Principal type.
             * @return the next definition stage.
             */
            Update withPrincipalType(PrincipalType principalType);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DatabasePrincipalAssignment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DatabasePrincipalAssignment refresh(Context context);
}
