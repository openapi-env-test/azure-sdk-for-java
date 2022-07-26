// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagemover.fluent.models.ProjectInner;

/** An immutable client-side representation of Project. */
public interface Project {
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
     * Gets the systemData property: Resource system metadata.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the description property: A description for the project.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the provisioningState property: The provisioning state of this resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.storagemover.fluent.models.ProjectInner object.
     *
     * @return the inner object.
     */
    ProjectInner innerModel();

    /** The entirety of the Project definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Project definition stages. */
    interface DefinitionStages {
        /** The first stage of the Project definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Project definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, storageMoverName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param storageMoverName The name of the Storage Mover resource.
             * @return the next definition stage.
             */
            WithCreate withExistingStorageMover(String resourceGroupName, String storageMoverName);
        }
        /**
         * The stage of the Project definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDescription {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Project create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Project create(Context context);
        }
        /** The stage of the Project definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: A description for the project..
             *
             * @param description A description for the project.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
    }
    /**
     * Begins update for the Project resource.
     *
     * @return the stage of resource update.
     */
    Project.Update update();

    /** The template for Project update. */
    interface Update extends UpdateStages.WithDescription {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Project apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Project apply(Context context);
    }
    /** The Project update stages. */
    interface UpdateStages {
        /** The stage of the Project update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: A description for the project..
             *
             * @param description A description for the project.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Project refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Project refresh(Context context);
}
