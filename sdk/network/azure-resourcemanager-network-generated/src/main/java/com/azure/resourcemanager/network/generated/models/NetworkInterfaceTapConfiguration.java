// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceTapConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkTapInner;

/** An immutable client-side representation of NetworkInterfaceTapConfiguration. */
public interface NetworkInterfaceTapConfiguration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Sub Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the virtualNetworkTap property: The reference to the Virtual Network Tap resource.
     *
     * @return the virtualNetworkTap value.
     */
    VirtualNetworkTap virtualNetworkTap();

    /**
     * Gets the provisioningState property: The provisioning state of the network interface tap configuration resource.
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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceTapConfigurationInner
     * object.
     *
     * @return the inner object.
     */
    NetworkInterfaceTapConfigurationInner innerModel();

    /** The entirety of the NetworkInterfaceTapConfiguration definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The NetworkInterfaceTapConfiguration definition stages. */
    interface DefinitionStages {
        /** The first stage of the NetworkInterfaceTapConfiguration definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the NetworkInterfaceTapConfiguration definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, networkInterfaceName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param networkInterfaceName The name of the network interface.
             * @return the next definition stage.
             */
            WithCreate withExistingNetworkInterface(String resourceGroupName, String networkInterfaceName);
        }
        /**
         * The stage of the NetworkInterfaceTapConfiguration definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithName, DefinitionStages.WithVirtualNetworkTap {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NetworkInterfaceTapConfiguration create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkInterfaceTapConfiguration create(Context context);
        }
        /** The stage of the NetworkInterfaceTapConfiguration definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             *
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             *     access the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the NetworkInterfaceTapConfiguration definition allowing to specify virtualNetworkTap. */
        interface WithVirtualNetworkTap {
            /**
             * Specifies the virtualNetworkTap property: The reference to the Virtual Network Tap resource..
             *
             * @param virtualNetworkTap The reference to the Virtual Network Tap resource.
             * @return the next definition stage.
             */
            WithCreate withVirtualNetworkTap(VirtualNetworkTapInner virtualNetworkTap);
        }
    }
    /**
     * Begins update for the NetworkInterfaceTapConfiguration resource.
     *
     * @return the stage of resource update.
     */
    NetworkInterfaceTapConfiguration.Update update();

    /** The template for NetworkInterfaceTapConfiguration update. */
    interface Update extends UpdateStages.WithName, UpdateStages.WithVirtualNetworkTap {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NetworkInterfaceTapConfiguration apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkInterfaceTapConfiguration apply(Context context);
    }
    /** The NetworkInterfaceTapConfiguration update stages. */
    interface UpdateStages {
        /** The stage of the NetworkInterfaceTapConfiguration update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             *
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             *     access the resource.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the NetworkInterfaceTapConfiguration update allowing to specify virtualNetworkTap. */
        interface WithVirtualNetworkTap {
            /**
             * Specifies the virtualNetworkTap property: The reference to the Virtual Network Tap resource..
             *
             * @param virtualNetworkTap The reference to the Virtual Network Tap resource.
             * @return the next definition stage.
             */
            Update withVirtualNetworkTap(VirtualNetworkTapInner virtualNetworkTap);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    NetworkInterfaceTapConfiguration refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkInterfaceTapConfiguration refresh(Context context);
}
