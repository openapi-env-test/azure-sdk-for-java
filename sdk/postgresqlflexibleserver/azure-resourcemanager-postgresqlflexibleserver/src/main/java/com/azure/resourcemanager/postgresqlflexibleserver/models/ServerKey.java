// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ServerKeyInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of ServerKey. */
public interface ServerKey {
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
     * Gets the kind property: Kind of encryption protector used to protect the key.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the serverKeyType property: The key type like 'AzureKeyVault'.
     *
     * @return the serverKeyType value.
     */
    ServerKeyType serverKeyType();

    /**
     * Gets the uri property: The URI of the key.
     *
     * @return the uri value.
     */
    String uri();

    /**
     * Gets the creationDate property: The key creation date.
     *
     * @return the creationDate value.
     */
    OffsetDateTime creationDate();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ServerKeyInner object.
     *
     * @return the inner object.
     */
    ServerKeyInner innerModel();

    /** The entirety of the ServerKey definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ServerKey definition stages. */
    interface DefinitionStages {
        /** The first stage of the ServerKey definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ServerKey definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies serverName, resourceGroupName.
             *
             * @param serverName The name of the server.
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingServer(String serverName, String resourceGroupName);
        }
        /**
         * The stage of the ServerKey definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithServerKeyType, DefinitionStages.WithUri {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ServerKey create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServerKey create(Context context);
        }
        /** The stage of the ServerKey definition allowing to specify serverKeyType. */
        interface WithServerKeyType {
            /**
             * Specifies the serverKeyType property: The key type like 'AzureKeyVault'..
             *
             * @param serverKeyType The key type like 'AzureKeyVault'.
             * @return the next definition stage.
             */
            WithCreate withServerKeyType(ServerKeyType serverKeyType);
        }
        /** The stage of the ServerKey definition allowing to specify uri. */
        interface WithUri {
            /**
             * Specifies the uri property: The URI of the key..
             *
             * @param uri The URI of the key.
             * @return the next definition stage.
             */
            WithCreate withUri(String uri);
        }
    }
    /**
     * Begins update for the ServerKey resource.
     *
     * @return the stage of resource update.
     */
    ServerKey.Update update();

    /** The template for ServerKey update. */
    interface Update extends UpdateStages.WithServerKeyType, UpdateStages.WithUri {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ServerKey apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ServerKey apply(Context context);
    }
    /** The ServerKey update stages. */
    interface UpdateStages {
        /** The stage of the ServerKey update allowing to specify serverKeyType. */
        interface WithServerKeyType {
            /**
             * Specifies the serverKeyType property: The key type like 'AzureKeyVault'..
             *
             * @param serverKeyType The key type like 'AzureKeyVault'.
             * @return the next definition stage.
             */
            Update withServerKeyType(ServerKeyType serverKeyType);
        }
        /** The stage of the ServerKey update allowing to specify uri. */
        interface WithUri {
            /**
             * Specifies the uri property: The URI of the key..
             *
             * @param uri The URI of the key.
             * @return the next definition stage.
             */
            Update withUri(String uri);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ServerKey refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServerKey refresh(Context context);
}
