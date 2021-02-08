// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerInner;
import java.util.Map;

/** An immutable client-side representation of Server. */
public interface Server {
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
     * Gets the identity property: The Azure Active Directory identity of the server.
     *
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * Gets the kind property: Kind of sql server. This is metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the administratorLogin property: Administrator username for the server. Once created it cannot be changed.
     *
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * Gets the administratorLoginPassword property: The administrator login password (required for server creation).
     *
     * @return the administratorLoginPassword value.
     */
    String administratorLoginPassword();

    /**
     * Gets the version property: The version of the server.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the state property: The state of the server.
     *
     * @return the state value.
     */
    String state();

    /**
     * Gets the fullyQualifiedDomainName property: The fully qualified domain name of the server.
     *
     * @return the fullyQualifiedDomainName value.
     */
    String fullyQualifiedDomainName();

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
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ServerInner object.
     *
     * @return the inner object.
     */
    ServerInner innerModel();

    /** The entirety of the Server definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Server definition stages. */
    interface DefinitionStages {
        /** The first stage of the Server definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Server definition allowing to specify location. */
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
        /** The stage of the Server definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Server definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithAdministratorLogin,
                DefinitionStages.WithAdministratorLoginPassword,
                DefinitionStages.WithVersion {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Server create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Server create(Context context);
        }
        /** The stage of the Server definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Server definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The Azure Active Directory identity of the server..
             *
             * @param identity The Azure Active Directory identity of the server.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }
        /** The stage of the Server definition allowing to specify administratorLogin. */
        interface WithAdministratorLogin {
            /**
             * Specifies the administratorLogin property: Administrator username for the server. Once created it cannot
             * be changed..
             *
             * @param administratorLogin Administrator username for the server. Once created it cannot be changed.
             * @return the next definition stage.
             */
            WithCreate withAdministratorLogin(String administratorLogin);
        }
        /** The stage of the Server definition allowing to specify administratorLoginPassword. */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies the administratorLoginPassword property: The administrator login password (required for server
             * creation)..
             *
             * @param administratorLoginPassword The administrator login password (required for server creation).
             * @return the next definition stage.
             */
            WithCreate withAdministratorLoginPassword(String administratorLoginPassword);
        }
        /** The stage of the Server definition allowing to specify version. */
        interface WithVersion {
            /**
             * Specifies the version property: The version of the server..
             *
             * @param version The version of the server.
             * @return the next definition stage.
             */
            WithCreate withVersion(String version);
        }
    }
    /**
     * Begins update for the Server resource.
     *
     * @return the stage of resource update.
     */
    Server.Update update();

    /** The template for Server update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithAdministratorLogin,
            UpdateStages.WithAdministratorLoginPassword,
            UpdateStages.WithVersion {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Server apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Server apply(Context context);
    }
    /** The Server update stages. */
    interface UpdateStages {
        /** The stage of the Server update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Server update allowing to specify administratorLogin. */
        interface WithAdministratorLogin {
            /**
             * Specifies the administratorLogin property: Administrator username for the server. Once created it cannot
             * be changed..
             *
             * @param administratorLogin Administrator username for the server. Once created it cannot be changed.
             * @return the next definition stage.
             */
            Update withAdministratorLogin(String administratorLogin);
        }
        /** The stage of the Server update allowing to specify administratorLoginPassword. */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies the administratorLoginPassword property: The administrator login password (required for server
             * creation)..
             *
             * @param administratorLoginPassword The administrator login password (required for server creation).
             * @return the next definition stage.
             */
            Update withAdministratorLoginPassword(String administratorLoginPassword);
        }
        /** The stage of the Server update allowing to specify version. */
        interface WithVersion {
            /**
             * Specifies the version property: The version of the server..
             *
             * @param version The version of the server.
             * @return the next definition stage.
             */
            Update withVersion(String version);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Server refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Server refresh(Context context);
}
