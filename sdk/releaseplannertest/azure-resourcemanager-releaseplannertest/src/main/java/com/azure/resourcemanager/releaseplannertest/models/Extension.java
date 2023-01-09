// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.releaseplannertest.fluent.models.ExtensionInner;
import java.util.Map;

/** An immutable client-side representation of Extension. */
public interface Extension {
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
     * Gets the extensionId property: Extension Id.
     *
     * @return the extensionId value.
     */
    String extensionId();

    /**
     * Gets the extensionCategory property: Extension category. e.g. weather/sensor/satellite.
     *
     * @return the extensionCategory value.
     */
    String extensionCategory();

    /**
     * Gets the installedExtensionVersion property: Installed extension version.
     *
     * @return the installedExtensionVersion value.
     */
    String installedExtensionVersion();

    /**
     * Gets the extensionAuthLink property: Extension auth link.
     *
     * @return the extensionAuthLink value.
     */
    String extensionAuthLink();

    /**
     * Gets the extensionApiDocsLink property: Extension api docs link.
     *
     * @return the extensionApiDocsLink value.
     */
    String extensionApiDocsLink();

    /**
     * Gets the additionalApiProperties property: Additional api properties.
     *
     * @return the additionalApiProperties value.
     */
    Map<String, ApiProperties> additionalApiProperties();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.releaseplannertest.fluent.models.ExtensionInner object.
     *
     * @return the inner object.
     */
    ExtensionInner innerModel();

    /** The entirety of the Extension definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Extension definition stages. */
    interface DefinitionStages {
        /** The first stage of the Extension definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Extension definition allowing to specify parent resource. */
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
         * The stage of the Extension definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithExtensionVersion, DefinitionStages.WithAdditionalApiProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Extension create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Extension create(Context context);
        }
        /** The stage of the Extension definition allowing to specify extensionVersion. */
        interface WithExtensionVersion {
            /**
             * Specifies the extensionVersion property: Extension Version..
             *
             * @param extensionVersion Extension Version.
             * @return the next definition stage.
             */
            WithCreate withExtensionVersion(String extensionVersion);
        }
        /** The stage of the Extension definition allowing to specify additionalApiProperties. */
        interface WithAdditionalApiProperties {
            /**
             * Specifies the additionalApiProperties property: Additional Api Properties..
             *
             * @param additionalApiProperties Additional Api Properties.
             * @return the next definition stage.
             */
            WithCreate withAdditionalApiProperties(Map<String, ApiProperties> additionalApiProperties);
        }
    }
    /**
     * Begins update for the Extension resource.
     *
     * @return the stage of resource update.
     */
    Extension.Update update();

    /** The template for Extension update. */
    interface Update extends UpdateStages.WithExtensionVersion, UpdateStages.WithAdditionalApiProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Extension apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Extension apply(Context context);
    }
    /** The Extension update stages. */
    interface UpdateStages {
        /** The stage of the Extension update allowing to specify extensionVersion. */
        interface WithExtensionVersion {
            /**
             * Specifies the extensionVersion property: Extension Version..
             *
             * @param extensionVersion Extension Version.
             * @return the next definition stage.
             */
            Update withExtensionVersion(String extensionVersion);
        }
        /** The stage of the Extension update allowing to specify additionalApiProperties. */
        interface WithAdditionalApiProperties {
            /**
             * Specifies the additionalApiProperties property: Additional Api Properties..
             *
             * @param additionalApiProperties Additional Api Properties.
             * @return the next definition stage.
             */
            Update withAdditionalApiProperties(Map<String, ApiProperties> additionalApiProperties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Extension refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Extension refresh(Context context);
}
