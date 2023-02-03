// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMExtensionInner;

/** An immutable client-side representation of VirtualMachineScaleSetVMExtension. */
public interface VirtualMachineScaleSetVMExtension {
    /**
     * Gets the id property: Resource Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the extension.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

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
     * Gets the protectedSettingsFromKeyVault property: The extensions protected settings that are passed by reference,
     * and consumed from key vault.
     *
     * @return the protectedSettingsFromKeyVault value.
     */
    KeyVaultSecretReference protectedSettingsFromKeyVault();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMExtensionInner
     * object.
     *
     * @return the inner object.
     */
    VirtualMachineScaleSetVMExtensionInner innerModel();

    /** The entirety of the VirtualMachineScaleSetVMExtension definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The VirtualMachineScaleSetVMExtension definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualMachineScaleSetVMExtension definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, vmScaleSetName, instanceId.
             *
             * @param resourceGroupName The name of the resource group.
             * @param vmScaleSetName The name of the VM scale set.
             * @param instanceId The instance ID of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withExistingVirtualMachine(String resourceGroupName, String vmScaleSetName, String instanceId);
        }
        /**
         * The stage of the VirtualMachineScaleSetVMExtension definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithForceUpdateTag,
                DefinitionStages.WithPublisher,
                DefinitionStages.WithTypePropertiesType,
                DefinitionStages.WithTypeHandlerVersion,
                DefinitionStages.WithAutoUpgradeMinorVersion,
                DefinitionStages.WithEnableAutomaticUpgrade,
                DefinitionStages.WithSettings,
                DefinitionStages.WithProtectedSettings,
                DefinitionStages.WithInstanceView,
                DefinitionStages.WithSuppressFailures,
                DefinitionStages.WithProtectedSettingsFromKeyVault {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualMachineScaleSetVMExtension create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualMachineScaleSetVMExtension create(Context context);
        }
        /** The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify forceUpdateTag. */
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
        /** The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify publisher. */
        interface WithPublisher {
            /**
             * Specifies the publisher property: The name of the extension handler publisher..
             *
             * @param publisher The name of the extension handler publisher.
             * @return the next definition stage.
             */
            WithCreate withPublisher(String publisher);
        }
        /** The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify typePropertiesType. */
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
        /** The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify typeHandlerVersion. */
        interface WithTypeHandlerVersion {
            /**
             * Specifies the typeHandlerVersion property: Specifies the version of the script handler..
             *
             * @param typeHandlerVersion Specifies the version of the script handler.
             * @return the next definition stage.
             */
            WithCreate withTypeHandlerVersion(String typeHandlerVersion);
        }
        /**
         * The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify autoUpgradeMinorVersion.
         */
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
        /** The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify enableAutomaticUpgrade. */
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
        /** The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify settings. */
        interface WithSettings {
            /**
             * Specifies the settings property: Json formatted public settings for the extension..
             *
             * @param settings Json formatted public settings for the extension.
             * @return the next definition stage.
             */
            WithCreate withSettings(Object settings);
        }
        /** The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify protectedSettings. */
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
        /** The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify instanceView. */
        interface WithInstanceView {
            /**
             * Specifies the instanceView property: The virtual machine extension instance view..
             *
             * @param instanceView The virtual machine extension instance view.
             * @return the next definition stage.
             */
            WithCreate withInstanceView(VirtualMachineExtensionInstanceView instanceView);
        }
        /** The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify suppressFailures. */
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
        /**
         * The stage of the VirtualMachineScaleSetVMExtension definition allowing to specify
         * protectedSettingsFromKeyVault.
         */
        interface WithProtectedSettingsFromKeyVault {
            /**
             * Specifies the protectedSettingsFromKeyVault property: The extensions protected settings that are passed
             * by reference, and consumed from key vault.
             *
             * @param protectedSettingsFromKeyVault The extensions protected settings that are passed by reference, and
             *     consumed from key vault.
             * @return the next definition stage.
             */
            WithCreate withProtectedSettingsFromKeyVault(KeyVaultSecretReference protectedSettingsFromKeyVault);
        }
    }
    /**
     * Begins update for the VirtualMachineScaleSetVMExtension resource.
     *
     * @return the stage of resource update.
     */
    VirtualMachineScaleSetVMExtension.Update update();

    /** The template for VirtualMachineScaleSetVMExtension update. */
    interface Update
        extends UpdateStages.WithForceUpdateTag,
            UpdateStages.WithPublisher,
            UpdateStages.WithTypePropertiesType,
            UpdateStages.WithTypeHandlerVersion,
            UpdateStages.WithAutoUpgradeMinorVersion,
            UpdateStages.WithEnableAutomaticUpgrade,
            UpdateStages.WithSettings,
            UpdateStages.WithProtectedSettings,
            UpdateStages.WithSuppressFailures,
            UpdateStages.WithProtectedSettingsFromKeyVault {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualMachineScaleSetVMExtension apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualMachineScaleSetVMExtension apply(Context context);
    }
    /** The VirtualMachineScaleSetVMExtension update stages. */
    interface UpdateStages {
        /** The stage of the VirtualMachineScaleSetVMExtension update allowing to specify forceUpdateTag. */
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
        /** The stage of the VirtualMachineScaleSetVMExtension update allowing to specify publisher. */
        interface WithPublisher {
            /**
             * Specifies the publisher property: The name of the extension handler publisher..
             *
             * @param publisher The name of the extension handler publisher.
             * @return the next definition stage.
             */
            Update withPublisher(String publisher);
        }
        /** The stage of the VirtualMachineScaleSetVMExtension update allowing to specify typePropertiesType. */
        interface WithTypePropertiesType {
            /**
             * Specifies the typePropertiesType property: Specifies the type of the extension; an example is
             * "CustomScriptExtension"..
             *
             * @param typePropertiesType Specifies the type of the extension; an example is "CustomScriptExtension".
             * @return the next definition stage.
             */
            Update withTypePropertiesType(String typePropertiesType);
        }
        /** The stage of the VirtualMachineScaleSetVMExtension update allowing to specify typeHandlerVersion. */
        interface WithTypeHandlerVersion {
            /**
             * Specifies the typeHandlerVersion property: Specifies the version of the script handler..
             *
             * @param typeHandlerVersion Specifies the version of the script handler.
             * @return the next definition stage.
             */
            Update withTypeHandlerVersion(String typeHandlerVersion);
        }
        /** The stage of the VirtualMachineScaleSetVMExtension update allowing to specify autoUpgradeMinorVersion. */
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
        /** The stage of the VirtualMachineScaleSetVMExtension update allowing to specify enableAutomaticUpgrade. */
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
        /** The stage of the VirtualMachineScaleSetVMExtension update allowing to specify settings. */
        interface WithSettings {
            /**
             * Specifies the settings property: Json formatted public settings for the extension..
             *
             * @param settings Json formatted public settings for the extension.
             * @return the next definition stage.
             */
            Update withSettings(Object settings);
        }
        /** The stage of the VirtualMachineScaleSetVMExtension update allowing to specify protectedSettings. */
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
        /** The stage of the VirtualMachineScaleSetVMExtension update allowing to specify suppressFailures. */
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
        /**
         * The stage of the VirtualMachineScaleSetVMExtension update allowing to specify protectedSettingsFromKeyVault.
         */
        interface WithProtectedSettingsFromKeyVault {
            /**
             * Specifies the protectedSettingsFromKeyVault property: The extensions protected settings that are passed
             * by reference, and consumed from key vault.
             *
             * @param protectedSettingsFromKeyVault The extensions protected settings that are passed by reference, and
             *     consumed from key vault.
             * @return the next definition stage.
             */
            Update withProtectedSettingsFromKeyVault(KeyVaultSecretReference protectedSettingsFromKeyVault);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VirtualMachineScaleSetVMExtension refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualMachineScaleSetVMExtension refresh(Context context);
}
