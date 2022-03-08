// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MongoRoleDefinitionGetResultsInner;
import java.util.List;

/** An immutable client-side representation of MongoRoleDefinitionGetResults. */
public interface MongoRoleDefinitionGetResults {
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
     * Gets the roleName property: A user-friendly name for the Role Definition. Must be unique for the database
     * account.
     *
     * @return the roleName value.
     */
    String roleName();

    /**
     * Gets the typePropertiesType property: Indicates whether the Role Definition was built-in or user created.
     *
     * @return the typePropertiesType value.
     */
    MongoRoleDefinitionType typePropertiesType();

    /**
     * Gets the databaseName property: The database name for which access is being granted for this Role Definition.
     *
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * Gets the privileges property: A set of privileges contained by the Role Definition. This will allow application
     * of this Role Definition on the entire database account or any underlying Database / Collection. Scopes higher
     * than Database are not enforceable as privilege.
     *
     * @return the privileges value.
     */
    List<Privilege> privileges();

    /**
     * Gets the roles property: The set of roles inherited by this Role Definition.
     *
     * @return the roles value.
     */
    List<Role> roles();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.MongoRoleDefinitionGetResultsInner
     * object.
     *
     * @return the inner object.
     */
    MongoRoleDefinitionGetResultsInner innerModel();

    /** The entirety of the MongoRoleDefinitionGetResults definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The MongoRoleDefinitionGetResults definition stages. */
    interface DefinitionStages {
        /** The first stage of the MongoRoleDefinitionGetResults definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the MongoRoleDefinitionGetResults definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName Cosmos DB database account name.
             * @return the next definition stage.
             */
            WithCreate withExistingDatabaseAccount(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the MongoRoleDefinitionGetResults definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithRoleName,
                DefinitionStages.WithType,
                DefinitionStages.WithDatabaseName,
                DefinitionStages.WithPrivileges,
                DefinitionStages.WithRoles {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            MongoRoleDefinitionGetResults create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MongoRoleDefinitionGetResults create(Context context);
        }
        /** The stage of the MongoRoleDefinitionGetResults definition allowing to specify roleName. */
        interface WithRoleName {
            /**
             * Specifies the roleName property: A user-friendly name for the Role Definition. Must be unique for the
             * database account..
             *
             * @param roleName A user-friendly name for the Role Definition. Must be unique for the database account.
             * @return the next definition stage.
             */
            WithCreate withRoleName(String roleName);
        }
        /** The stage of the MongoRoleDefinitionGetResults definition allowing to specify type. */
        interface WithType {
            /**
             * Specifies the type property: Indicates whether the Role Definition was built-in or user created..
             *
             * @param type Indicates whether the Role Definition was built-in or user created.
             * @return the next definition stage.
             */
            WithCreate withType(MongoRoleDefinitionType type);
        }
        /** The stage of the MongoRoleDefinitionGetResults definition allowing to specify databaseName. */
        interface WithDatabaseName {
            /**
             * Specifies the databaseName property: The database name for which access is being granted for this Role
             * Definition..
             *
             * @param databaseName The database name for which access is being granted for this Role Definition.
             * @return the next definition stage.
             */
            WithCreate withDatabaseName(String databaseName);
        }
        /** The stage of the MongoRoleDefinitionGetResults definition allowing to specify privileges. */
        interface WithPrivileges {
            /**
             * Specifies the privileges property: A set of privileges contained by the Role Definition. This will allow
             * application of this Role Definition on the entire database account or any underlying Database /
             * Collection. Scopes higher than Database are not enforceable as privilege..
             *
             * @param privileges A set of privileges contained by the Role Definition. This will allow application of
             *     this Role Definition on the entire database account or any underlying Database / Collection. Scopes
             *     higher than Database are not enforceable as privilege.
             * @return the next definition stage.
             */
            WithCreate withPrivileges(List<Privilege> privileges);
        }
        /** The stage of the MongoRoleDefinitionGetResults definition allowing to specify roles. */
        interface WithRoles {
            /**
             * Specifies the roles property: The set of roles inherited by this Role Definition..
             *
             * @param roles The set of roles inherited by this Role Definition.
             * @return the next definition stage.
             */
            WithCreate withRoles(List<Role> roles);
        }
    }
    /**
     * Begins update for the MongoRoleDefinitionGetResults resource.
     *
     * @return the stage of resource update.
     */
    MongoRoleDefinitionGetResults.Update update();

    /** The template for MongoRoleDefinitionGetResults update. */
    interface Update
        extends UpdateStages.WithRoleName,
            UpdateStages.WithType,
            UpdateStages.WithDatabaseName,
            UpdateStages.WithPrivileges,
            UpdateStages.WithRoles {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        MongoRoleDefinitionGetResults apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MongoRoleDefinitionGetResults apply(Context context);
    }
    /** The MongoRoleDefinitionGetResults update stages. */
    interface UpdateStages {
        /** The stage of the MongoRoleDefinitionGetResults update allowing to specify roleName. */
        interface WithRoleName {
            /**
             * Specifies the roleName property: A user-friendly name for the Role Definition. Must be unique for the
             * database account..
             *
             * @param roleName A user-friendly name for the Role Definition. Must be unique for the database account.
             * @return the next definition stage.
             */
            Update withRoleName(String roleName);
        }
        /** The stage of the MongoRoleDefinitionGetResults update allowing to specify type. */
        interface WithType {
            /**
             * Specifies the type property: Indicates whether the Role Definition was built-in or user created..
             *
             * @param type Indicates whether the Role Definition was built-in or user created.
             * @return the next definition stage.
             */
            Update withType(MongoRoleDefinitionType type);
        }
        /** The stage of the MongoRoleDefinitionGetResults update allowing to specify databaseName. */
        interface WithDatabaseName {
            /**
             * Specifies the databaseName property: The database name for which access is being granted for this Role
             * Definition..
             *
             * @param databaseName The database name for which access is being granted for this Role Definition.
             * @return the next definition stage.
             */
            Update withDatabaseName(String databaseName);
        }
        /** The stage of the MongoRoleDefinitionGetResults update allowing to specify privileges. */
        interface WithPrivileges {
            /**
             * Specifies the privileges property: A set of privileges contained by the Role Definition. This will allow
             * application of this Role Definition on the entire database account or any underlying Database /
             * Collection. Scopes higher than Database are not enforceable as privilege..
             *
             * @param privileges A set of privileges contained by the Role Definition. This will allow application of
             *     this Role Definition on the entire database account or any underlying Database / Collection. Scopes
             *     higher than Database are not enforceable as privilege.
             * @return the next definition stage.
             */
            Update withPrivileges(List<Privilege> privileges);
        }
        /** The stage of the MongoRoleDefinitionGetResults update allowing to specify roles. */
        interface WithRoles {
            /**
             * Specifies the roles property: The set of roles inherited by this Role Definition..
             *
             * @param roles The set of roles inherited by this Role Definition.
             * @return the next definition stage.
             */
            Update withRoles(List<Role> roles);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    MongoRoleDefinitionGetResults refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MongoRoleDefinitionGetResults refresh(Context context);
}
