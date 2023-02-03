// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryInner;
import java.util.Map;

/** An immutable client-side representation of Gallery. */
public interface Gallery {
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
     * Gets the description property: The description of this Shared Image Gallery resource. This property is updatable.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the identifier property: Describes the gallery unique name.
     *
     * @return the identifier value.
     */
    GalleryIdentifier identifier();

    /**
     * Gets the provisioningState property: The current state of the gallery or gallery artifact.
     *
     * <p>The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    GalleryProvisioningState provisioningState();

    /**
     * Gets the sharingProfile property: Profile for gallery sharing to subscription or tenant.
     *
     * @return the sharingProfile value.
     */
    SharingProfile sharingProfile();

    /**
     * Gets the softDeletePolicy property: Contains information about the soft deletion policy of the gallery.
     *
     * @return the softDeletePolicy value.
     */
    SoftDeletePolicy softDeletePolicy();

    /**
     * Gets the sharingStatus property: Sharing status of current gallery.
     *
     * @return the sharingStatus value.
     */
    SharingStatus sharingStatus();

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
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.GalleryInner object.
     *
     * @return the inner object.
     */
    GalleryInner innerModel();

    /** The entirety of the Gallery definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Gallery definition stages. */
    interface DefinitionStages {
        /** The first stage of the Gallery definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Gallery definition allowing to specify location. */
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
        /** The stage of the Gallery definition allowing to specify parent resource. */
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
         * The stage of the Gallery definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDescription,
                DefinitionStages.WithIdentifier,
                DefinitionStages.WithSharingProfile,
                DefinitionStages.WithSoftDeletePolicy {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Gallery create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Gallery create(Context context);
        }
        /** The stage of the Gallery definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Gallery definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of this Shared Image Gallery resource. This property
             * is updatable..
             *
             * @param description The description of this Shared Image Gallery resource. This property is updatable.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the Gallery definition allowing to specify identifier. */
        interface WithIdentifier {
            /**
             * Specifies the identifier property: Describes the gallery unique name..
             *
             * @param identifier Describes the gallery unique name.
             * @return the next definition stage.
             */
            WithCreate withIdentifier(GalleryIdentifier identifier);
        }
        /** The stage of the Gallery definition allowing to specify sharingProfile. */
        interface WithSharingProfile {
            /**
             * Specifies the sharingProfile property: Profile for gallery sharing to subscription or tenant.
             *
             * @param sharingProfile Profile for gallery sharing to subscription or tenant.
             * @return the next definition stage.
             */
            WithCreate withSharingProfile(SharingProfile sharingProfile);
        }
        /** The stage of the Gallery definition allowing to specify softDeletePolicy. */
        interface WithSoftDeletePolicy {
            /**
             * Specifies the softDeletePolicy property: Contains information about the soft deletion policy of the
             * gallery..
             *
             * @param softDeletePolicy Contains information about the soft deletion policy of the gallery.
             * @return the next definition stage.
             */
            WithCreate withSoftDeletePolicy(SoftDeletePolicy softDeletePolicy);
        }
    }
    /**
     * Begins update for the Gallery resource.
     *
     * @return the stage of resource update.
     */
    Gallery.Update update();

    /** The template for Gallery update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithDescription,
            UpdateStages.WithIdentifier,
            UpdateStages.WithSharingProfile,
            UpdateStages.WithSoftDeletePolicy {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Gallery apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Gallery apply(Context context);
    }
    /** The Gallery update stages. */
    interface UpdateStages {
        /** The stage of the Gallery update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Gallery update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of this Shared Image Gallery resource. This property
             * is updatable..
             *
             * @param description The description of this Shared Image Gallery resource. This property is updatable.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the Gallery update allowing to specify identifier. */
        interface WithIdentifier {
            /**
             * Specifies the identifier property: Describes the gallery unique name..
             *
             * @param identifier Describes the gallery unique name.
             * @return the next definition stage.
             */
            Update withIdentifier(GalleryIdentifier identifier);
        }
        /** The stage of the Gallery update allowing to specify sharingProfile. */
        interface WithSharingProfile {
            /**
             * Specifies the sharingProfile property: Profile for gallery sharing to subscription or tenant.
             *
             * @param sharingProfile Profile for gallery sharing to subscription or tenant.
             * @return the next definition stage.
             */
            Update withSharingProfile(SharingProfile sharingProfile);
        }
        /** The stage of the Gallery update allowing to specify softDeletePolicy. */
        interface WithSoftDeletePolicy {
            /**
             * Specifies the softDeletePolicy property: Contains information about the soft deletion policy of the
             * gallery..
             *
             * @param softDeletePolicy Contains information about the soft deletion policy of the gallery.
             * @return the next definition stage.
             */
            Update withSoftDeletePolicy(SoftDeletePolicy softDeletePolicy);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Gallery refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Gallery refresh(Context context);
}
