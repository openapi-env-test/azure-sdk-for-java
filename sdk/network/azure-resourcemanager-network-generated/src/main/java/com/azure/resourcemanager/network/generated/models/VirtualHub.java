// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.HubVirtualNetworkConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualHubInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of VirtualHub. */
public interface VirtualHub {
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
     * Gets the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the virtualWan property: The VirtualWAN to which the VirtualHub belongs.
     *
     * @return the virtualWan value.
     */
    SubResource virtualWan();

    /**
     * Gets the vpnGateway property: The VpnGateway associated with this VirtualHub.
     *
     * @return the vpnGateway value.
     */
    SubResource vpnGateway();

    /**
     * Gets the p2SVpnGateway property: The P2SVpnGateway associated with this VirtualHub.
     *
     * @return the p2SVpnGateway value.
     */
    SubResource p2SVpnGateway();

    /**
     * Gets the expressRouteGateway property: The expressRouteGateway associated with this VirtualHub.
     *
     * @return the expressRouteGateway value.
     */
    SubResource expressRouteGateway();

    /**
     * Gets the virtualNetworkConnections property: List of all vnet connections with this VirtualHub.
     *
     * @return the virtualNetworkConnections value.
     */
    List<HubVirtualNetworkConnection> virtualNetworkConnections();

    /**
     * Gets the addressPrefix property: Address-prefix for this VirtualHub.
     *
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * Gets the routeTable property: The routeTable associated with this virtual hub.
     *
     * @return the routeTable value.
     */
    VirtualHubRouteTable routeTable();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VirtualHubInner object.
     *
     * @return the inner object.
     */
    VirtualHubInner innerModel();

    /** The entirety of the VirtualHub definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The VirtualHub definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualHub definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the VirtualHub definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the VirtualHub definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The resource group name of the VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the VirtualHub definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithVirtualWan,
                DefinitionStages.WithVpnGateway,
                DefinitionStages.WithP2SVpnGateway,
                DefinitionStages.WithExpressRouteGateway,
                DefinitionStages.WithVirtualNetworkConnections,
                DefinitionStages.WithAddressPrefix,
                DefinitionStages.WithRouteTable,
                DefinitionStages.WithProvisioningState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualHub create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualHub create(Context context);
        }
        /** The stage of the VirtualHub definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the VirtualHub definition allowing to specify virtualWan. */
        interface WithVirtualWan {
            /**
             * Specifies the virtualWan property: The VirtualWAN to which the VirtualHub belongs.
             *
             * @param virtualWan The VirtualWAN to which the VirtualHub belongs.
             * @return the next definition stage.
             */
            WithCreate withVirtualWan(SubResource virtualWan);
        }
        /** The stage of the VirtualHub definition allowing to specify vpnGateway. */
        interface WithVpnGateway {
            /**
             * Specifies the vpnGateway property: The VpnGateway associated with this VirtualHub.
             *
             * @param vpnGateway The VpnGateway associated with this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withVpnGateway(SubResource vpnGateway);
        }
        /** The stage of the VirtualHub definition allowing to specify p2SVpnGateway. */
        interface WithP2SVpnGateway {
            /**
             * Specifies the p2SVpnGateway property: The P2SVpnGateway associated with this VirtualHub.
             *
             * @param p2SVpnGateway The P2SVpnGateway associated with this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withP2SVpnGateway(SubResource p2SVpnGateway);
        }
        /** The stage of the VirtualHub definition allowing to specify expressRouteGateway. */
        interface WithExpressRouteGateway {
            /**
             * Specifies the expressRouteGateway property: The expressRouteGateway associated with this VirtualHub.
             *
             * @param expressRouteGateway The expressRouteGateway associated with this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withExpressRouteGateway(SubResource expressRouteGateway);
        }
        /** The stage of the VirtualHub definition allowing to specify virtualNetworkConnections. */
        interface WithVirtualNetworkConnections {
            /**
             * Specifies the virtualNetworkConnections property: List of all vnet connections with this VirtualHub..
             *
             * @param virtualNetworkConnections List of all vnet connections with this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withVirtualNetworkConnections(List<HubVirtualNetworkConnectionInner> virtualNetworkConnections);
        }
        /** The stage of the VirtualHub definition allowing to specify addressPrefix. */
        interface WithAddressPrefix {
            /**
             * Specifies the addressPrefix property: Address-prefix for this VirtualHub..
             *
             * @param addressPrefix Address-prefix for this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withAddressPrefix(String addressPrefix);
        }
        /** The stage of the VirtualHub definition allowing to specify routeTable. */
        interface WithRouteTable {
            /**
             * Specifies the routeTable property: The routeTable associated with this virtual hub..
             *
             * @param routeTable The routeTable associated with this virtual hub.
             * @return the next definition stage.
             */
            WithCreate withRouteTable(VirtualHubRouteTable routeTable);
        }
        /** The stage of the VirtualHub definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The provisioning state of the resource..
             *
             * @param provisioningState The provisioning state of the resource.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(ProvisioningState provisioningState);
        }
    }
    /**
     * Begins update for the VirtualHub resource.
     *
     * @return the stage of resource update.
     */
    VirtualHub.Update update();

    /** The template for VirtualHub update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualHub apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualHub apply(Context context);
    }
    /** The VirtualHub update stages. */
    interface UpdateStages {
        /** The stage of the VirtualHub update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VirtualHub refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualHub refresh(Context context);
}
