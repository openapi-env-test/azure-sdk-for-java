// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.fluent.models.ConfigurationServiceResourceInner;

/** An immutable client-side representation of ConfigurationServiceResource. */
public interface ConfigurationServiceResource {
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
     * Gets the properties property: Application Configuration Service properties payload.
     *
     * @return the properties value.
     */
    ConfigurationServiceProperties properties();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.appplatform.generated.fluent.models.ConfigurationServiceResourceInner
     * object.
     *
     * @return the inner object.
     */
    ConfigurationServiceResourceInner innerModel();

    /** The entirety of the ConfigurationServiceResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ConfigurationServiceResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ConfigurationServiceResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ConfigurationServiceResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param serviceName The name of the Service resource.
             * @return the next definition stage.
             */
            WithCreate withExistingSpring(String resourceGroupName, String serviceName);
        }
        /**
         * The stage of the ConfigurationServiceResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ConfigurationServiceResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ConfigurationServiceResource create(Context context);
        }
        /** The stage of the ConfigurationServiceResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Application Configuration Service properties payload.
             *
             * @param properties Application Configuration Service properties payload.
             * @return the next definition stage.
             */
            WithCreate withProperties(ConfigurationServiceProperties properties);
        }
    }
    /**
     * Begins update for the ConfigurationServiceResource resource.
     *
     * @return the stage of resource update.
     */
    ConfigurationServiceResource.Update update();

    /** The template for ConfigurationServiceResource update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ConfigurationServiceResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ConfigurationServiceResource apply(Context context);
    }
    /** The ConfigurationServiceResource update stages. */
    interface UpdateStages {
        /** The stage of the ConfigurationServiceResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Application Configuration Service properties payload.
             *
             * @param properties Application Configuration Service properties payload.
             * @return the next definition stage.
             */
            Update withProperties(ConfigurationServiceProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ConfigurationServiceResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ConfigurationServiceResource refresh(Context context);

    /**
     * Check if the Application Configuration Service settings are valid.
     *
     * @param settings Application Configuration Service settings to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return validation result for configuration service settings.
     */
    ConfigurationServiceSettingsValidateResult validate(ConfigurationServiceSettings settings);

    /**
     * Check if the Application Configuration Service settings are valid.
     *
     * @param settings Application Configuration Service settings to be validated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return validation result for configuration service settings.
     */
    ConfigurationServiceSettingsValidateResult validate(ConfigurationServiceSettings settings, Context context);
}
