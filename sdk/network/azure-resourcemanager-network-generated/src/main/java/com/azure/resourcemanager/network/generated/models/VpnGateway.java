// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VpnConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of VpnGateway. */
public interface VpnGateway {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @return the virtualHub value.
     */
    SubResource virtualHub();

    /**
     * Gets the connections property: List of all vpn connections to the gateway.
     *
     * @return the connections value.
     */
    List<VpnConnection> connections();

    /**
     * Gets the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value.
     */
    BgpSettings bgpSettings();

    /**
     * Gets the provisioningState property: The provisioning state of the VPN gateway resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     *
     * @return the vpnGatewayScaleUnit value.
     */
    Integer vpnGatewayScaleUnit();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayInner object.
     *
     * @return the inner object.
     */
    VpnGatewayInner innerModel();

    /** The entirety of the VpnGateway definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The VpnGateway definition stages. */
    interface DefinitionStages {
        /** The first stage of the VpnGateway definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the VpnGateway definition allowing to specify location. */
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
        /** The stage of the VpnGateway definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The resource group name of the VpnGateway.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the VpnGateway definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithVirtualHub,
                DefinitionStages.WithConnections,
                DefinitionStages.WithBgpSettings,
                DefinitionStages.WithVpnGatewayScaleUnit {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VpnGateway create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VpnGateway create(Context context);
        }
        /** The stage of the VpnGateway definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the VpnGateway definition allowing to specify virtualHub. */
        interface WithVirtualHub {
            /**
             * Specifies the virtualHub property: The VirtualHub to which the gateway belongs..
             *
             * @param virtualHub The VirtualHub to which the gateway belongs.
             * @return the next definition stage.
             */
            WithCreate withVirtualHub(SubResource virtualHub);
        }
        /** The stage of the VpnGateway definition allowing to specify connections. */
        interface WithConnections {
            /**
             * Specifies the connections property: List of all vpn connections to the gateway..
             *
             * @param connections List of all vpn connections to the gateway.
             * @return the next definition stage.
             */
            WithCreate withConnections(List<VpnConnectionInner> connections);
        }
        /** The stage of the VpnGateway definition allowing to specify bgpSettings. */
        interface WithBgpSettings {
            /**
             * Specifies the bgpSettings property: Local network gateway's BGP speaker settings..
             *
             * @param bgpSettings Local network gateway's BGP speaker settings.
             * @return the next definition stage.
             */
            WithCreate withBgpSettings(BgpSettings bgpSettings);
        }
        /** The stage of the VpnGateway definition allowing to specify vpnGatewayScaleUnit. */
        interface WithVpnGatewayScaleUnit {
            /**
             * Specifies the vpnGatewayScaleUnit property: The scale unit for this vpn gateway..
             *
             * @param vpnGatewayScaleUnit The scale unit for this vpn gateway.
             * @return the next definition stage.
             */
            WithCreate withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit);
        }
    }
    /**
     * Begins update for the VpnGateway resource.
     *
     * @return the stage of resource update.
     */
    VpnGateway.Update update();

    /** The template for VpnGateway update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VpnGateway apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VpnGateway apply(Context context);
    }
    /** The VpnGateway update stages. */
    interface UpdateStages {
        /** The stage of the VpnGateway update allowing to specify tags. */
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
    VpnGateway refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VpnGateway refresh(Context context);
}
