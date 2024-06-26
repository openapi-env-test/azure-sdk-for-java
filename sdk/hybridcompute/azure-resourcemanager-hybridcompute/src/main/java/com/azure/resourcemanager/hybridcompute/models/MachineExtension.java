// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineExtensionInner;
import java.util.Map;

/** An immutable client-side representation of MachineExtension. */
public interface MachineExtension {
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
     * Gets the properties property: Describes Machine Extension Properties.
     *
     * @return the properties value.
     */
    MachineExtensionProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.hybridcompute.fluent.models.MachineExtensionInner object.
     *
     * @return the inner object.
     */
    MachineExtensionInner innerModel();

    /** The entirety of the MachineExtension definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }

    /** The MachineExtension definition stages. */
    interface DefinitionStages {
        /** The first stage of the MachineExtension definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the MachineExtension definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /** The stage of the MachineExtension definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, machineName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param machineName The name of the machine where the extension should be created or updated.
             * @return the next definition stage.
             */
            WithCreate withExistingMachine(String resourceGroupName, String machineName);
        }

        /**
         * The stage of the MachineExtension definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            MachineExtension create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MachineExtension create(Context context);
        }

        /** The stage of the MachineExtension definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the MachineExtension definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Describes Machine Extension Properties..
             *
             * @param properties Describes Machine Extension Properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(MachineExtensionProperties properties);
        }
    }

    /**
     * Begins update for the MachineExtension resource.
     *
     * @return the stage of resource update.
     */
    MachineExtension.Update update();

    /** The template for MachineExtension update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithForceUpdateTag,
            UpdateStages.WithPublisher,
            UpdateStages.WithType,
            UpdateStages.WithTypeHandlerVersion,
            UpdateStages.WithEnableAutomaticUpgrade,
            UpdateStages.WithAutoUpgradeMinorVersion,
            UpdateStages.WithSettings,
            UpdateStages.WithProtectedSettings {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        MachineExtension apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MachineExtension apply(Context context);
    }

    /** The MachineExtension update stages. */
    interface UpdateStages {
        /** The stage of the MachineExtension update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the MachineExtension update allowing to specify forceUpdateTag. */
        interface WithForceUpdateTag {
            /**
             * Specifies the forceUpdateTag property: How the extension handler should be forced to update even if the
             * extension configuration has not changed..
             *
             * @param forceUpdateTag How the extension handler should be forced to update even if the extension
             *     configuration has not changed.
             * @return the next definition stage.
             */
            Update withForceUpdateTag(String forceUpdateTag);
        }

        /** The stage of the MachineExtension update allowing to specify publisher. */
        interface WithPublisher {
            /**
             * Specifies the publisher property: The name of the extension handler publisher..
             *
             * @param publisher The name of the extension handler publisher.
             * @return the next definition stage.
             */
            Update withPublisher(String publisher);
        }

        /** The stage of the MachineExtension update allowing to specify type. */
        interface WithType {
            /**
             * Specifies the type property: Specifies the type of the extension; an example is "CustomScriptExtension"..
             *
             * @param type Specifies the type of the extension; an example is "CustomScriptExtension".
             * @return the next definition stage.
             */
            Update withType(String type);
        }

        /** The stage of the MachineExtension update allowing to specify typeHandlerVersion. */
        interface WithTypeHandlerVersion {
            /**
             * Specifies the typeHandlerVersion property: Specifies the version of the script handler..
             *
             * @param typeHandlerVersion Specifies the version of the script handler.
             * @return the next definition stage.
             */
            Update withTypeHandlerVersion(String typeHandlerVersion);
        }

        /** The stage of the MachineExtension update allowing to specify enableAutomaticUpgrade. */
        interface WithEnableAutomaticUpgrade {
            /**
             * Specifies the enableAutomaticUpgrade property: Indicates whether the extension should be automatically
             * upgraded by the platform if there is a newer version available..
             *
             * @param enableAutomaticUpgrade Indicates whether the extension should be automatically upgraded by the
             *     platform if there is a newer version available.
             * @return the next definition stage.
             */
            Update withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade);
        }

        /** The stage of the MachineExtension update allowing to specify autoUpgradeMinorVersion. */
        interface WithAutoUpgradeMinorVersion {
            /**
             * Specifies the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor
             * version if one is available at deployment time. Once deployed, however, the extension will not upgrade
             * minor versions unless redeployed, even with this property set to true..
             *
             * @param autoUpgradeMinorVersion Indicates whether the extension should use a newer minor version if one is
             *     available at deployment time. Once deployed, however, the extension will not upgrade minor versions
             *     unless redeployed, even with this property set to true.
             * @return the next definition stage.
             */
            Update withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion);
        }

        /** The stage of the MachineExtension update allowing to specify settings. */
        interface WithSettings {
            /**
             * Specifies the settings property: Json formatted public settings for the extension..
             *
             * @param settings Json formatted public settings for the extension.
             * @return the next definition stage.
             */
            Update withSettings(Map<String, Object> settings);
        }

        /** The stage of the MachineExtension update allowing to specify protectedSettings. */
        interface WithProtectedSettings {
            /**
             * Specifies the protectedSettings property: The extension can contain either protectedSettings or
             * protectedSettingsFromKeyVault or no protected settings at all..
             *
             * @param protectedSettings The extension can contain either protectedSettings or
             *     protectedSettingsFromKeyVault or no protected settings at all.
             * @return the next definition stage.
             */
            Update withProtectedSettings(Map<String, Object> protectedSettings);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    MachineExtension refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MachineExtension refresh(Context context);
}
