// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.agrifood.fluent.models.SolutionInner;

/** An immutable client-side representation of Solution. */
public interface Solution {
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
     * Gets the properties property: Solution resource properties.
     *
     * @return the properties value.
     */
    SolutionProperties properties();

    /**
     * Gets the etag property: The ETag value to implement optimistic concurrency.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.agrifood.fluent.models.SolutionInner object.
     *
     * @return the inner object.
     */
    SolutionInner innerModel();

    /** The entirety of the Solution definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Solution definition stages. */
    interface DefinitionStages {
        /** The first stage of the Solution definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Solution definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, farmBeatsResourceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param farmBeatsResourceName FarmBeats resource name.
             * @return the next definition stage.
             */
            WithCreate withExistingFarmBeat(String resourceGroupName, String farmBeatsResourceName);
        }
        /**
         * The stage of the Solution definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Solution create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Solution create(Context context);
        }
        /** The stage of the Solution definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Solution resource properties..
             *
             * @param properties Solution resource properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(SolutionProperties properties);
        }
    }
    /**
     * Begins update for the Solution resource.
     *
     * @return the stage of resource update.
     */
    Solution.Update update();

    /** The template for Solution update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Solution apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Solution apply(Context context);
    }
    /** The Solution update stages. */
    interface UpdateStages {
        /** The stage of the Solution update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Solution resource properties..
             *
             * @param properties Solution resource properties.
             * @return the next definition stage.
             */
            Update withProperties(SolutionProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Solution refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Solution refresh(Context context);
}
