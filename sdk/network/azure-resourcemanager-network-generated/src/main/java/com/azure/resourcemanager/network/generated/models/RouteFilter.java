// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitPeeringInner;
import com.azure.resourcemanager.network.generated.fluent.models.RouteFilterInner;
import com.azure.resourcemanager.network.generated.fluent.models.RouteFilterRuleInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of RouteFilter. */
public interface RouteFilter {
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
     * Gets the rules property: Collection of RouteFilterRules contained within a route filter.
     *
     * @return the rules value.
     */
    List<RouteFilterRule> rules();

    /**
     * Gets the peerings property: A collection of references to express route circuit peerings.
     *
     * @return the peerings value.
     */
    List<ExpressRouteCircuitPeering> peerings();

    /**
     * Gets the ipv6Peerings property: A collection of references to express route circuit ipv6 peerings.
     *
     * @return the ipv6Peerings value.
     */
    List<ExpressRouteCircuitPeering> ipv6Peerings();

    /**
     * Gets the provisioningState property: The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', 'Succeeded' and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.RouteFilterInner object.
     *
     * @return the inner object.
     */
    RouteFilterInner innerModel();

    /** The entirety of the RouteFilter definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The RouteFilter definition stages. */
    interface DefinitionStages {
        /** The first stage of the RouteFilter definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the RouteFilter definition allowing to specify location. */
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
        /** The stage of the RouteFilter definition allowing to specify parent resource. */
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
         * The stage of the RouteFilter definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithRules,
                DefinitionStages.WithPeerings,
                DefinitionStages.WithIpv6Peerings {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            RouteFilter create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RouteFilter create(Context context);
        }
        /** The stage of the RouteFilter definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the RouteFilter definition allowing to specify rules. */
        interface WithRules {
            /**
             * Specifies the rules property: Collection of RouteFilterRules contained within a route filter..
             *
             * @param rules Collection of RouteFilterRules contained within a route filter.
             * @return the next definition stage.
             */
            WithCreate withRules(List<RouteFilterRuleInner> rules);
        }
        /** The stage of the RouteFilter definition allowing to specify peerings. */
        interface WithPeerings {
            /**
             * Specifies the peerings property: A collection of references to express route circuit peerings..
             *
             * @param peerings A collection of references to express route circuit peerings.
             * @return the next definition stage.
             */
            WithCreate withPeerings(List<ExpressRouteCircuitPeeringInner> peerings);
        }
        /** The stage of the RouteFilter definition allowing to specify ipv6Peerings. */
        interface WithIpv6Peerings {
            /**
             * Specifies the ipv6Peerings property: A collection of references to express route circuit ipv6 peerings..
             *
             * @param ipv6Peerings A collection of references to express route circuit ipv6 peerings.
             * @return the next definition stage.
             */
            WithCreate withIpv6Peerings(List<ExpressRouteCircuitPeeringInner> ipv6Peerings);
        }
    }
    /**
     * Begins update for the RouteFilter resource.
     *
     * @return the stage of resource update.
     */
    RouteFilter.Update update();

    /** The template for RouteFilter update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithRules,
            UpdateStages.WithPeerings,
            UpdateStages.WithIpv6Peerings {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        RouteFilter apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RouteFilter apply(Context context);
    }
    /** The RouteFilter update stages. */
    interface UpdateStages {
        /** The stage of the RouteFilter update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the RouteFilter update allowing to specify rules. */
        interface WithRules {
            /**
             * Specifies the rules property: Collection of RouteFilterRules contained within a route filter..
             *
             * @param rules Collection of RouteFilterRules contained within a route filter.
             * @return the next definition stage.
             */
            Update withRules(List<RouteFilterRuleInner> rules);
        }
        /** The stage of the RouteFilter update allowing to specify peerings. */
        interface WithPeerings {
            /**
             * Specifies the peerings property: A collection of references to express route circuit peerings..
             *
             * @param peerings A collection of references to express route circuit peerings.
             * @return the next definition stage.
             */
            Update withPeerings(List<ExpressRouteCircuitPeeringInner> peerings);
        }
        /** The stage of the RouteFilter update allowing to specify ipv6Peerings. */
        interface WithIpv6Peerings {
            /**
             * Specifies the ipv6Peerings property: A collection of references to express route circuit ipv6 peerings..
             *
             * @param ipv6Peerings A collection of references to express route circuit ipv6 peerings.
             * @return the next definition stage.
             */
            Update withIpv6Peerings(List<ExpressRouteCircuitPeeringInner> ipv6Peerings);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    RouteFilter refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RouteFilter refresh(Context context);
}
