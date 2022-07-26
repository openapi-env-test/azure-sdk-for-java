// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskAccessInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of DiskAccess. */
public interface DiskAccess {
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
     * Gets the extendedLocation property: The extended location where the disk access will be created. Extended
     * location cannot be changed.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the privateEndpointConnections property: A readonly collection of private endpoint connections created on
     * the disk. Currently only one endpoint connection is supported.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the provisioningState property: The disk access resource provisioning state.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the timeCreated property: The time when the disk access was created.
     *
     * @return the timeCreated value.
     */
    OffsetDateTime timeCreated();

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
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.DiskAccessInner object.
     *
     * @return the inner object.
     */
    DiskAccessInner innerModel();

    /** The entirety of the DiskAccess definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The DiskAccess definition stages. */
    interface DefinitionStages {
        /** The first stage of the DiskAccess definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DiskAccess definition allowing to specify location. */
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
        /** The stage of the DiskAccess definition allowing to specify parent resource. */
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
         * The stage of the DiskAccess definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithExtendedLocation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DiskAccess create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DiskAccess create(Context context);
        }
        /** The stage of the DiskAccess definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DiskAccess definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extended location where the disk access will be created.
             * Extended location cannot be changed..
             *
             * @param extendedLocation The extended location where the disk access will be created. Extended location
             *     cannot be changed.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }
    }
    /**
     * Begins update for the DiskAccess resource.
     *
     * @return the stage of resource update.
     */
    DiskAccess.Update update();

    /** The template for DiskAccess update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DiskAccess apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DiskAccess apply(Context context);
    }
    /** The DiskAccess update stages. */
    interface UpdateStages {
        /** The stage of the DiskAccess update allowing to specify tags. */
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
    DiskAccess refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DiskAccess refresh(Context context);
}
