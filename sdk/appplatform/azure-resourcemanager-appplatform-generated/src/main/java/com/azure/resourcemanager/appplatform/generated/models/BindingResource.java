// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.fluent.models.BindingResourceInner;

/** An immutable client-side representation of BindingResource. */
public interface BindingResource {
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
     * Gets the properties property: Properties of the Binding resource.
     *
     * @return the properties value.
     */
    BindingResourceProperties properties();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.appplatform.generated.fluent.models.BindingResourceInner object.
     *
     * @return the inner object.
     */
    BindingResourceInner innerModel();

    /** The entirety of the BindingResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The BindingResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the BindingResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the BindingResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName, appName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param serviceName The name of the Service resource.
             * @param appName The name of the App resource.
             * @return the next definition stage.
             */
            WithCreate withExistingApp(String resourceGroupName, String serviceName, String appName);
        }
        /**
         * The stage of the BindingResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BindingResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BindingResource create(Context context);
        }
        /** The stage of the BindingResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the Binding resource.
             *
             * @param properties Properties of the Binding resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(BindingResourceProperties properties);
        }
    }
    /**
     * Begins update for the BindingResource resource.
     *
     * @return the stage of resource update.
     */
    BindingResource.Update update();

    /** The template for BindingResource update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BindingResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BindingResource apply(Context context);
    }
    /** The BindingResource update stages. */
    interface UpdateStages {
        /** The stage of the BindingResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the Binding resource.
             *
             * @param properties Properties of the Binding resource.
             * @return the next definition stage.
             */
            Update withProperties(BindingResourceProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BindingResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BindingResource refresh(Context context);
}
