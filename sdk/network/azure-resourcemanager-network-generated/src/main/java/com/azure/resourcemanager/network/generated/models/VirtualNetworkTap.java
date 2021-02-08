// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkTapInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of VirtualNetworkTap. */
public interface VirtualNetworkTap {
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
     * Gets the networkInterfaceTapConfigurations property: Specifies the list of resource IDs for the network interface
     * IP configuration that needs to be tapped.
     *
     * @return the networkInterfaceTapConfigurations value.
     */
    List<NetworkInterfaceTapConfiguration> networkInterfaceTapConfigurations();

    /**
     * Gets the resourceGuid property: The resourceGuid property of the virtual network tap.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the virtual network tap. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the destinationNetworkInterfaceIpConfiguration property: The reference to the private IP Address of the
     * collector nic that will receive the tap.
     *
     * @return the destinationNetworkInterfaceIpConfiguration value.
     */
    NetworkInterfaceIpConfiguration destinationNetworkInterfaceIpConfiguration();

    /**
     * Gets the destinationLoadBalancerFrontEndIpConfiguration property: The reference to the private IP address on the
     * internal Load Balancer that will receive the tap.
     *
     * @return the destinationLoadBalancerFrontEndIpConfiguration value.
     */
    FrontendIpConfiguration destinationLoadBalancerFrontEndIpConfiguration();

    /**
     * Gets the destinationPort property: The VXLAN destination port that will receive the tapped traffic.
     *
     * @return the destinationPort value.
     */
    Integer destinationPort();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkTapInner object.
     *
     * @return the inner object.
     */
    VirtualNetworkTapInner innerModel();

    /** The entirety of the VirtualNetworkTap definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The VirtualNetworkTap definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualNetworkTap definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the VirtualNetworkTap definition allowing to specify location. */
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
        /** The stage of the VirtualNetworkTap definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the VirtualNetworkTap definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithEtag,
                DefinitionStages.WithDestinationNetworkInterfaceIpConfiguration,
                DefinitionStages.WithDestinationLoadBalancerFrontEndIpConfiguration,
                DefinitionStages.WithDestinationPort {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualNetworkTap create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualNetworkTap create(Context context);
        }
        /** The stage of the VirtualNetworkTap definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the VirtualNetworkTap definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Gets a unique read-only string that changes whenever the resource is
             * updated..
             *
             * @param etag Gets a unique read-only string that changes whenever the resource is updated.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /**
         * The stage of the VirtualNetworkTap definition allowing to specify destinationNetworkInterfaceIpConfiguration.
         */
        interface WithDestinationNetworkInterfaceIpConfiguration {
            /**
             * Specifies the destinationNetworkInterfaceIpConfiguration property: The reference to the private IP
             * Address of the collector nic that will receive the tap.
             *
             * @param destinationNetworkInterfaceIpConfiguration The reference to the private IP Address of the
             *     collector nic that will receive the tap.
             * @return the next definition stage.
             */
            WithCreate withDestinationNetworkInterfaceIpConfiguration(
                NetworkInterfaceIpConfigurationInner destinationNetworkInterfaceIpConfiguration);
        }
        /**
         * The stage of the VirtualNetworkTap definition allowing to specify
         * destinationLoadBalancerFrontEndIpConfiguration.
         */
        interface WithDestinationLoadBalancerFrontEndIpConfiguration {
            /**
             * Specifies the destinationLoadBalancerFrontEndIpConfiguration property: The reference to the private IP
             * address on the internal Load Balancer that will receive the tap.
             *
             * @param destinationLoadBalancerFrontEndIpConfiguration The reference to the private IP address on the
             *     internal Load Balancer that will receive the tap.
             * @return the next definition stage.
             */
            WithCreate withDestinationLoadBalancerFrontEndIpConfiguration(
                FrontendIpConfigurationInner destinationLoadBalancerFrontEndIpConfiguration);
        }
        /** The stage of the VirtualNetworkTap definition allowing to specify destinationPort. */
        interface WithDestinationPort {
            /**
             * Specifies the destinationPort property: The VXLAN destination port that will receive the tapped traffic..
             *
             * @param destinationPort The VXLAN destination port that will receive the tapped traffic.
             * @return the next definition stage.
             */
            WithCreate withDestinationPort(Integer destinationPort);
        }
    }
    /**
     * Begins update for the VirtualNetworkTap resource.
     *
     * @return the stage of resource update.
     */
    VirtualNetworkTap.Update update();

    /** The template for VirtualNetworkTap update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualNetworkTap apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualNetworkTap apply(Context context);
    }
    /** The VirtualNetworkTap update stages. */
    interface UpdateStages {
        /** The stage of the VirtualNetworkTap update allowing to specify tags. */
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
    VirtualNetworkTap refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualNetworkTap refresh(Context context);
}
