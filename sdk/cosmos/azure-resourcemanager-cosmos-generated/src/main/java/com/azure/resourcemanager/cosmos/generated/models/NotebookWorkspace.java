// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.NotebookWorkspaceInner;

/** An immutable client-side representation of NotebookWorkspace. */
public interface NotebookWorkspace {
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
     * Gets the notebookServerEndpoint property: Specifies the endpoint of Notebook server.
     *
     * @return the notebookServerEndpoint value.
     */
    String notebookServerEndpoint();

    /**
     * Gets the status property: Status of the notebook workspace. Possible values are: Creating, Online, Deleting,
     * Failed, Updating.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.NotebookWorkspaceInner object.
     *
     * @return the inner object.
     */
    NotebookWorkspaceInner innerModel();

    /** The entirety of the NotebookWorkspace definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The NotebookWorkspace definition stages. */
    interface DefinitionStages {
        /** The first stage of the NotebookWorkspace definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the NotebookWorkspace definition allowing to specify parent resource. */
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
         * The stage of the NotebookWorkspace definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NotebookWorkspace create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NotebookWorkspace create(Context context);
        }
    }
    /**
     * Begins update for the NotebookWorkspace resource.
     *
     * @return the stage of resource update.
     */
    NotebookWorkspace.Update update();

    /** The template for NotebookWorkspace update. */
    interface Update {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NotebookWorkspace apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NotebookWorkspace apply(Context context);
    }
    /** The NotebookWorkspace update stages. */
    interface UpdateStages {
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    NotebookWorkspace refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NotebookWorkspace refresh(Context context);

    /**
     * Retrieves the connection info for the notebook workspace.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection info for the given notebook workspace.
     */
    NotebookWorkspaceConnectionInfoResult listConnectionInfo();

    /**
     * Retrieves the connection info for the notebook workspace.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection info for the given notebook workspace along with {@link Response}.
     */
    Response<NotebookWorkspaceConnectionInfoResult> listConnectionInfoWithResponse(Context context);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateAuthToken();

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateAuthToken(Context context);

    /**
     * Starts the notebook workspace.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * Starts the notebook workspace.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);
}
