// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.AzureMonitorPrivateLinkScopeInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of AzureMonitorPrivateLinkScope. */
public interface AzureMonitorPrivateLinkScope {
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
     * Gets the provisioningState property: Current state of this PrivateLinkScope: whether or not is has been
     * provisioned within the resource group it is defined. Users cannot change this value but are able to read from it.
     * Values will include Provisioning ,Succeeded, Canceled and Failed.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the privateEndpointConnections property: List of private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

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
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.AzureMonitorPrivateLinkScopeInner
     * object.
     *
     * @return the inner object.
     */
    AzureMonitorPrivateLinkScopeInner innerModel();

    /** The entirety of the AzureMonitorPrivateLinkScope definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The AzureMonitorPrivateLinkScope definition stages. */
    interface DefinitionStages {
        /** The first stage of the AzureMonitorPrivateLinkScope definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AzureMonitorPrivateLinkScope definition allowing to specify location. */
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
        /** The stage of the AzureMonitorPrivateLinkScope definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the AzureMonitorPrivateLinkScope definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AzureMonitorPrivateLinkScope create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AzureMonitorPrivateLinkScope create(Context context);
        }
        /** The stage of the AzureMonitorPrivateLinkScope definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }
    /**
     * Begins update for the AzureMonitorPrivateLinkScope resource.
     *
     * @return the stage of resource update.
     */
    AzureMonitorPrivateLinkScope.Update update();

    /** The template for AzureMonitorPrivateLinkScope update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AzureMonitorPrivateLinkScope apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AzureMonitorPrivateLinkScope apply(Context context);
    }
    /** The AzureMonitorPrivateLinkScope update stages. */
    interface UpdateStages {
        /** The stage of the AzureMonitorPrivateLinkScope update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
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
    AzureMonitorPrivateLinkScope refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AzureMonitorPrivateLinkScope refresh(Context context);
}
