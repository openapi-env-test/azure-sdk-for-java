// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionPeeringInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ExpressRouteCrossConnection. */
public interface ExpressRouteCrossConnection {
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
     * Gets the primaryAzurePort property: The name of the primary port.
     *
     * @return the primaryAzurePort value.
     */
    String primaryAzurePort();

    /**
     * Gets the secondaryAzurePort property: The name of the secondary port.
     *
     * @return the secondaryAzurePort value.
     */
    String secondaryAzurePort();

    /**
     * Gets the stag property: The identifier of the circuit traffic.
     *
     * @return the stag value.
     */
    Integer stag();

    /**
     * Gets the peeringLocation property: The peering location of the ExpressRoute circuit.
     *
     * @return the peeringLocation value.
     */
    String peeringLocation();

    /**
     * Gets the bandwidthInMbps property: The circuit bandwidth In Mbps.
     *
     * @return the bandwidthInMbps value.
     */
    Integer bandwidthInMbps();

    /**
     * Gets the expressRouteCircuit property: The ExpressRouteCircuit.
     *
     * @return the expressRouteCircuit value.
     */
    ExpressRouteCircuitReference expressRouteCircuit();

    /**
     * Gets the serviceProviderProvisioningState property: The provisioning state of the circuit in the connectivity
     * provider system.
     *
     * @return the serviceProviderProvisioningState value.
     */
    ServiceProviderProvisioningState serviceProviderProvisioningState();

    /**
     * Gets the serviceProviderNotes property: Additional read only notes set by the connectivity provider.
     *
     * @return the serviceProviderNotes value.
     */
    String serviceProviderNotes();

    /**
     * Gets the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the peerings property: The list of peerings.
     *
     * @return the peerings value.
     */
    List<ExpressRouteCrossConnectionPeering> peerings();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionInner object.
     *
     * @return the inner object.
     */
    ExpressRouteCrossConnectionInner innerModel();

    /** The entirety of the ExpressRouteCrossConnection definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ExpressRouteCrossConnection definition stages. */
    interface DefinitionStages {
        /** The first stage of the ExpressRouteCrossConnection definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ExpressRouteCrossConnection definition allowing to specify location. */
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
        /** The stage of the ExpressRouteCrossConnection definition allowing to specify parent resource. */
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
         * The stage of the ExpressRouteCrossConnection definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithPeeringLocation,
                DefinitionStages.WithBandwidthInMbps,
                DefinitionStages.WithExpressRouteCircuit,
                DefinitionStages.WithServiceProviderProvisioningState,
                DefinitionStages.WithServiceProviderNotes,
                DefinitionStages.WithPeerings {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ExpressRouteCrossConnection create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ExpressRouteCrossConnection create(Context context);
        }
        /** The stage of the ExpressRouteCrossConnection definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ExpressRouteCrossConnection definition allowing to specify peeringLocation. */
        interface WithPeeringLocation {
            /**
             * Specifies the peeringLocation property: The peering location of the ExpressRoute circuit..
             *
             * @param peeringLocation The peering location of the ExpressRoute circuit.
             * @return the next definition stage.
             */
            WithCreate withPeeringLocation(String peeringLocation);
        }
        /** The stage of the ExpressRouteCrossConnection definition allowing to specify bandwidthInMbps. */
        interface WithBandwidthInMbps {
            /**
             * Specifies the bandwidthInMbps property: The circuit bandwidth In Mbps..
             *
             * @param bandwidthInMbps The circuit bandwidth In Mbps.
             * @return the next definition stage.
             */
            WithCreate withBandwidthInMbps(Integer bandwidthInMbps);
        }
        /** The stage of the ExpressRouteCrossConnection definition allowing to specify expressRouteCircuit. */
        interface WithExpressRouteCircuit {
            /**
             * Specifies the expressRouteCircuit property: The ExpressRouteCircuit..
             *
             * @param expressRouteCircuit The ExpressRouteCircuit.
             * @return the next definition stage.
             */
            WithCreate withExpressRouteCircuit(ExpressRouteCircuitReference expressRouteCircuit);
        }
        /**
         * The stage of the ExpressRouteCrossConnection definition allowing to specify serviceProviderProvisioningState.
         */
        interface WithServiceProviderProvisioningState {
            /**
             * Specifies the serviceProviderProvisioningState property: The provisioning state of the circuit in the
             * connectivity provider system..
             *
             * @param serviceProviderProvisioningState The provisioning state of the circuit in the connectivity
             *     provider system.
             * @return the next definition stage.
             */
            WithCreate withServiceProviderProvisioningState(
                ServiceProviderProvisioningState serviceProviderProvisioningState);
        }
        /** The stage of the ExpressRouteCrossConnection definition allowing to specify serviceProviderNotes. */
        interface WithServiceProviderNotes {
            /**
             * Specifies the serviceProviderNotes property: Additional read only notes set by the connectivity
             * provider..
             *
             * @param serviceProviderNotes Additional read only notes set by the connectivity provider.
             * @return the next definition stage.
             */
            WithCreate withServiceProviderNotes(String serviceProviderNotes);
        }
        /** The stage of the ExpressRouteCrossConnection definition allowing to specify peerings. */
        interface WithPeerings {
            /**
             * Specifies the peerings property: The list of peerings..
             *
             * @param peerings The list of peerings.
             * @return the next definition stage.
             */
            WithCreate withPeerings(List<ExpressRouteCrossConnectionPeeringInner> peerings);
        }
    }
    /**
     * Begins update for the ExpressRouteCrossConnection resource.
     *
     * @return the stage of resource update.
     */
    ExpressRouteCrossConnection.Update update();

    /** The template for ExpressRouteCrossConnection update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ExpressRouteCrossConnection apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ExpressRouteCrossConnection apply(Context context);
    }
    /** The ExpressRouteCrossConnection update stages. */
    interface UpdateStages {
        /** The stage of the ExpressRouteCrossConnection update allowing to specify tags. */
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
    ExpressRouteCrossConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ExpressRouteCrossConnection refresh(Context context);
}
