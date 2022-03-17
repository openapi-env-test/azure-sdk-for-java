// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.RouteInner;
import com.azure.resourcemanager.network.generated.fluent.models.RouteTableInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of RouteTable. */
public interface RouteTable {
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
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the routes property: Collection of routes contained within a route table.
     *
     * @return the routes value.
     */
    List<Route> routes();

    /**
     * Gets the subnets property: A collection of references to subnets.
     *
     * @return the subnets value.
     */
    List<Subnet> subnets();

    /**
     * Gets the disableBgpRoutePropagation property: Whether to disable the routes learned by BGP on that route table.
     * True means disable.
     *
     * @return the disableBgpRoutePropagation value.
     */
    Boolean disableBgpRoutePropagation();

    /**
     * Gets the provisioningState property: The provisioning state of the route table resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the resourceGuid property: The resource GUID property of the route table.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.RouteTableInner object.
     *
     * @return the inner object.
     */
    RouteTableInner innerModel();

    /** The entirety of the RouteTable definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The RouteTable definition stages. */
    interface DefinitionStages {
        /** The first stage of the RouteTable definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the RouteTable definition allowing to specify location. */
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
        /** The stage of the RouteTable definition allowing to specify parent resource. */
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
         * The stage of the RouteTable definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithRoutes,
                DefinitionStages.WithDisableBgpRoutePropagation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            RouteTable create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RouteTable create(Context context);
        }
        /** The stage of the RouteTable definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the RouteTable definition allowing to specify routes. */
        interface WithRoutes {
            /**
             * Specifies the routes property: Collection of routes contained within a route table..
             *
             * @param routes Collection of routes contained within a route table.
             * @return the next definition stage.
             */
            WithCreate withRoutes(List<RouteInner> routes);
        }
        /** The stage of the RouteTable definition allowing to specify disableBgpRoutePropagation. */
        interface WithDisableBgpRoutePropagation {
            /**
             * Specifies the disableBgpRoutePropagation property: Whether to disable the routes learned by BGP on that
             * route table. True means disable..
             *
             * @param disableBgpRoutePropagation Whether to disable the routes learned by BGP on that route table. True
             *     means disable.
             * @return the next definition stage.
             */
            WithCreate withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation);
        }
    }
    /**
     * Begins update for the RouteTable resource.
     *
     * @return the stage of resource update.
     */
    RouteTable.Update update();

    /** The template for RouteTable update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        RouteTable apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RouteTable apply(Context context);
    }
    /** The RouteTable update stages. */
    interface UpdateStages {
        /** The stage of the RouteTable update allowing to specify tags. */
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
    RouteTable refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RouteTable refresh(Context context);
}
