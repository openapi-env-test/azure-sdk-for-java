// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerAzureADAdministratorInner;
import java.util.UUID;

/** An immutable client-side representation of ServerAzureADAdministrator. */
public interface ServerAzureADAdministrator {
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
     * Gets the administratorType property: The type of administrator.
     *
     * @return the administratorType value.
     */
    AdministratorType administratorType();

    /**
     * Gets the login property: The server administrator login value.
     *
     * @return the login value.
     */
    String login();

    /**
     * Gets the sid property: The server administrator Sid (Secure ID).
     *
     * @return the sid value.
     */
    UUID sid();

    /**
     * Gets the tenantId property: The server Active Directory Administrator tenant id.
     *
     * @return the tenantId value.
     */
    UUID tenantId();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ServerAzureADAdministratorInner object.
     *
     * @return the inner object.
     */
    ServerAzureADAdministratorInner innerModel();

    /** The entirety of the ServerAzureADAdministrator definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ServerAzureADAdministrator definition stages. */
    interface DefinitionStages {
        /** The first stage of the ServerAzureADAdministrator definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ServerAzureADAdministrator definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param serverName The name of the server.
             * @return the next definition stage.
             */
            WithCreate withExistingServer(String resourceGroupName, String serverName);
        }
        /**
         * The stage of the ServerAzureADAdministrator definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithAdministratorType,
                DefinitionStages.WithLogin,
                DefinitionStages.WithSid,
                DefinitionStages.WithTenantId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ServerAzureADAdministrator create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServerAzureADAdministrator create(Context context);
        }
        /** The stage of the ServerAzureADAdministrator definition allowing to specify administratorType. */
        interface WithAdministratorType {
            /**
             * Specifies the administratorType property: The type of administrator..
             *
             * @param administratorType The type of administrator.
             * @return the next definition stage.
             */
            WithCreate withAdministratorType(AdministratorType administratorType);
        }
        /** The stage of the ServerAzureADAdministrator definition allowing to specify login. */
        interface WithLogin {
            /**
             * Specifies the login property: The server administrator login value..
             *
             * @param login The server administrator login value.
             * @return the next definition stage.
             */
            WithCreate withLogin(String login);
        }
        /** The stage of the ServerAzureADAdministrator definition allowing to specify sid. */
        interface WithSid {
            /**
             * Specifies the sid property: The server administrator Sid (Secure ID)..
             *
             * @param sid The server administrator Sid (Secure ID).
             * @return the next definition stage.
             */
            WithCreate withSid(UUID sid);
        }
        /** The stage of the ServerAzureADAdministrator definition allowing to specify tenantId. */
        interface WithTenantId {
            /**
             * Specifies the tenantId property: The server Active Directory Administrator tenant id..
             *
             * @param tenantId The server Active Directory Administrator tenant id.
             * @return the next definition stage.
             */
            WithCreate withTenantId(UUID tenantId);
        }
    }
    /**
     * Begins update for the ServerAzureADAdministrator resource.
     *
     * @return the stage of resource update.
     */
    ServerAzureADAdministrator.Update update();

    /** The template for ServerAzureADAdministrator update. */
    interface Update
        extends UpdateStages.WithAdministratorType,
            UpdateStages.WithLogin,
            UpdateStages.WithSid,
            UpdateStages.WithTenantId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ServerAzureADAdministrator apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ServerAzureADAdministrator apply(Context context);
    }
    /** The ServerAzureADAdministrator update stages. */
    interface UpdateStages {
        /** The stage of the ServerAzureADAdministrator update allowing to specify administratorType. */
        interface WithAdministratorType {
            /**
             * Specifies the administratorType property: The type of administrator..
             *
             * @param administratorType The type of administrator.
             * @return the next definition stage.
             */
            Update withAdministratorType(AdministratorType administratorType);
        }
        /** The stage of the ServerAzureADAdministrator update allowing to specify login. */
        interface WithLogin {
            /**
             * Specifies the login property: The server administrator login value..
             *
             * @param login The server administrator login value.
             * @return the next definition stage.
             */
            Update withLogin(String login);
        }
        /** The stage of the ServerAzureADAdministrator update allowing to specify sid. */
        interface WithSid {
            /**
             * Specifies the sid property: The server administrator Sid (Secure ID)..
             *
             * @param sid The server administrator Sid (Secure ID).
             * @return the next definition stage.
             */
            Update withSid(UUID sid);
        }
        /** The stage of the ServerAzureADAdministrator update allowing to specify tenantId. */
        interface WithTenantId {
            /**
             * Specifies the tenantId property: The server Active Directory Administrator tenant id..
             *
             * @param tenantId The server Active Directory Administrator tenant id.
             * @return the next definition stage.
             */
            Update withTenantId(UUID tenantId);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ServerAzureADAdministrator refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServerAzureADAdministrator refresh(Context context);
}
