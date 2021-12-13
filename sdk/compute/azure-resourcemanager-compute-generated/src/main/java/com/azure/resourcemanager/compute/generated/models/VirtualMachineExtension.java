// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionInner;
import java.util.Map;

/** An immutable client-side representation of VirtualMachineExtension. */
public interface VirtualMachineExtension {
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
     * Gets the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     *
     * @return the forceUpdateTag value.
     */
    String forceUpdateTag();

    /**
     * Gets the publisher property: The name of the extension handler publisher.
     *
     * @return the publisher value.
     */
    String publisher();

    /**
     * Gets the typePropertiesType property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @return the typePropertiesType value.
     */
    String typePropertiesType();

    /**
     * Gets the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value.
     */
    String typeHandlerVersion();

    /**
     * Gets the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if
     * one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @return the autoUpgradeMinorVersion value.
     */
    Boolean autoUpgradeMinorVersion();

    /**
     * Gets the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     *
     * @return the enableAutomaticUpgrade value.
     */
    Boolean enableAutomaticUpgrade();

    /**
     * Gets the settings property: Json formatted public settings for the extension.
     *
     * @return the settings value.
     */
    Object settings();

    /**
     * Gets the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @return the protectedSettings value.
     */
    Object protectedSettings();

    /**
     * Gets the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the instanceView property: The virtual machine extension instance view.
     *
     * @return the instanceView value.
     */
    VirtualMachineExtensionInstanceView instanceView();

    /**
     * Gets the suppressFailures property: Indicates whether failures stemming from the extension will be suppressed
     * (Operational failures such as not connecting to the VM will not be suppressed regardless of this value). The
     * default is false.
     *
     * @return the suppressFailures value.
     */
    Boolean suppressFailures();

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
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionInner object.
     *
     * @return the inner object.
     */
    VirtualMachineExtensionInner innerModel();

    /** The entirety of the VirtualMachineExtension definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The VirtualMachineExtension definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualMachineExtension definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify location. */
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
        /** The stage of the VirtualMachineExtension definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, vmName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param vmName The name of the virtual machine where the extension should be created or updated.
             * @return the next definition stage.
             */
            WithCreate withExistingVirtualMachine(String resourceGroupName, String vmName);
        }
        /**
         * The stage of the VirtualMachineExtension definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithForceUpdateTag,
                DefinitionStages.WithPublisher,
                DefinitionStages.WithTypePropertiesType,
                DefinitionStages.WithTypeHandlerVersion,
                DefinitionStages.WithAutoUpgradeMinorVersion,
                DefinitionStages.WithEnableAutomaticUpgrade,
                DefinitionStages.WithSettings,
                DefinitionStages.WithProtectedSettings,
                DefinitionStages.WithInstanceView,
                DefinitionStages.WithSuppressFailures {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualMachineExtension create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualMachineExtension create(Context context);
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify forceUpdateTag. */
        interface WithForceUpdateTag {
            /**
             * Specifies the forceUpdateTag property: How the extension handler should be forced to update even if the
             * extension configuration has not changed..
             *
             * @param forceUpdateTag How the extension handler should be forced to update even if the extension
             *     configuration has not changed.
             * @return the next definition stage.
             */
            WithCreate withForceUpdateTag(String forceUpdateTag);
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify publisher. */
        interface WithPublisher {
            /**
             * Specifies the publisher property: The name of the extension handler publisher..
             *
             * @param publisher The name of the extension handler publisher.
             * @return the next definition stage.
             */
            WithCreate withPublisher(String publisher);
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify typePropertiesType. */
        interface WithTypePropertiesType {
            /**
             * Specifies the typePropertiesType property: Specifies the type of the extension; an example is
             * "CustomScriptExtension"..
             *
             * @param typePropertiesType Specifies the type of the extension; an example is "CustomScriptExtension".
             * @return the next definition stage.
             */
            WithCreate withTypePropertiesType(String typePropertiesType);
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify typeHandlerVersion. */
        interface WithTypeHandlerVersion {
            /**
             * Specifies the typeHandlerVersion property: Specifies the version of the script handler..
             *
             * @param typeHandlerVersion Specifies the version of the script handler.
             * @return the next definition stage.
             */
            WithCreate withTypeHandlerVersion(String typeHandlerVersion);
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify autoUpgradeMinorVersion. */
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
            WithCreate withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion);
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify enableAutomaticUpgrade. */
        interface WithEnableAutomaticUpgrade {
            /**
             * Specifies the enableAutomaticUpgrade property: Indicates whether the extension should be automatically
             * upgraded by the platform if there is a newer version of the extension available..
             *
             * @param enableAutomaticUpgrade Indicates whether the extension should be automatically upgraded by the
             *     platform if there is a newer version of the extension available.
             * @return the next definition stage.
             */
            WithCreate withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade);
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify settings. */
        interface WithSettings {
            /**
             * Specifies the settings property: Json formatted public settings for the extension..
             *
             * @param settings Json formatted public settings for the extension.
             * @return the next definition stage.
             */
            WithCreate withSettings(Object settings);
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify protectedSettings. */
        interface WithProtectedSettings {
            /**
             * Specifies the protectedSettings property: The extension can contain either protectedSettings or
             * protectedSettingsFromKeyVault or no protected settings at all..
             *
             * @param protectedSettings The extension can contain either protectedSettings or
             *     protectedSettingsFromKeyVault or no protected settings at all.
             * @return the next definition stage.
             */
            WithCreate withProtectedSettings(Object protectedSettings);
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify instanceView. */
        interface WithInstanceView {
            /**
             * Specifies the instanceView property: The virtual machine extension instance view..
             *
             * @param instanceView The virtual machine extension instance view.
             * @return the next definition stage.
             */
            WithCreate withInstanceView(VirtualMachineExtensionInstanceView instanceView);
        }
        /** The stage of the VirtualMachineExtension definition allowing to specify suppressFailures. */
        interface WithSuppressFailures {
            /**
             * Specifies the suppressFailures property: Indicates whether failures stemming from the extension will be
             * suppressed (Operational failures such as not connecting to the VM will not be suppressed regardless of
             * this value). The default is false..
             *
             * @param suppressFailures Indicates whether failures stemming from the extension will be suppressed
             *     (Operational failures such as not connecting to the VM will not be suppressed regardless of this
             *     value). The default is false.
             * @return the next definition stage.
             */
            WithCreate withSuppressFailures(Boolean suppressFailures);
        }
    }
    /**
     * Begins update for the VirtualMachineExtension resource.
     *
     * @return the stage of resource update.
     */
    VirtualMachineExtension.Update update();

    /** The template for VirtualMachineExtension update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithForceUpdateTag,
            UpdateStages.WithPublisher,
            UpdateStages.WithType,
            UpdateStages.WithTypeHandlerVersion,
            UpdateStages.WithAutoUpgradeMinorVersion,
            UpdateStages.WithEnableAutomaticUpgrade,
            UpdateStages.WithSettings,
            UpdateStages.WithProtectedSettings,
            UpdateStages.WithSuppressFailures {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualMachineExtension apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualMachineExtension apply(Context context);
    }
    /** The VirtualMachineExtension update stages. */
    interface UpdateStages {
        /** The stage of the VirtualMachineExtension update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the VirtualMachineExtension update allowing to specify forceUpdateTag. */
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
        /** The stage of the VirtualMachineExtension update allowing to specify publisher. */
        interface WithPublisher {
            /**
             * Specifies the publisher property: The name of the extension handler publisher..
             *
             * @param publisher The name of the extension handler publisher.
             * @return the next definition stage.
             */
            Update withPublisher(String publisher);
        }
        /** The stage of the VirtualMachineExtension update allowing to specify type. */
        interface WithType {
            /**
             * Specifies the type property: Specifies the type of the extension; an example is "CustomScriptExtension"..
             *
             * @param type Specifies the type of the extension; an example is "CustomScriptExtension".
             * @return the next definition stage.
             */
            Update withType(String type);
        }
        /** The stage of the VirtualMachineExtension update allowing to specify typeHandlerVersion. */
        interface WithTypeHandlerVersion {
            /**
             * Specifies the typeHandlerVersion property: Specifies the version of the script handler..
             *
             * @param typeHandlerVersion Specifies the version of the script handler.
             * @return the next definition stage.
             */
            Update withTypeHandlerVersion(String typeHandlerVersion);
        }
        /** The stage of the VirtualMachineExtension update allowing to specify autoUpgradeMinorVersion. */
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
        /** The stage of the VirtualMachineExtension update allowing to specify enableAutomaticUpgrade. */
        interface WithEnableAutomaticUpgrade {
            /**
             * Specifies the enableAutomaticUpgrade property: Indicates whether the extension should be automatically
             * upgraded by the platform if there is a newer version of the extension available..
             *
             * @param enableAutomaticUpgrade Indicates whether the extension should be automatically upgraded by the
             *     platform if there is a newer version of the extension available.
             * @return the next definition stage.
             */
            Update withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade);
        }
        /** The stage of the VirtualMachineExtension update allowing to specify settings. */
        interface WithSettings {
            /**
             * Specifies the settings property: Json formatted public settings for the extension..
             *
             * @param settings Json formatted public settings for the extension.
             * @return the next definition stage.
             */
            Update withSettings(Object settings);
        }
        /** The stage of the VirtualMachineExtension update allowing to specify protectedSettings. */
        interface WithProtectedSettings {
            /**
             * Specifies the protectedSettings property: The extension can contain either protectedSettings or
             * protectedSettingsFromKeyVault or no protected settings at all..
             *
             * @param protectedSettings The extension can contain either protectedSettings or
             *     protectedSettingsFromKeyVault or no protected settings at all.
             * @return the next definition stage.
             */
            Update withProtectedSettings(Object protectedSettings);
        }
        /** The stage of the VirtualMachineExtension update allowing to specify suppressFailures. */
        interface WithSuppressFailures {
            /**
             * Specifies the suppressFailures property: Indicates whether failures stemming from the extension will be
             * suppressed (Operational failures such as not connecting to the VM will not be suppressed regardless of
             * this value). The default is false..
             *
             * @param suppressFailures Indicates whether failures stemming from the extension will be suppressed
             *     (Operational failures such as not connecting to the VM will not be suppressed regardless of this
             *     value). The default is false.
             * @return the next definition stage.
             */
            Update withSuppressFailures(Boolean suppressFailures);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VirtualMachineExtension refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualMachineExtension refresh(Context context);
}
