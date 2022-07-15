// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elasticsan.fluent.models.SnapshotInner;
import java.util.Map;

/** An immutable client-side representation of Snapshot. */
public interface Snapshot {
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
     * Gets the systemData property: Resource metadata required by ARM RPC.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the creationData property: State of the operation on the resource.
     *
     * @return the creationData value.
     */
    SnapshotCreationData creationData();

    /**
     * Gets the provisioningState property: The snapshot provisioning state.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

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
     * Gets the inner com.azure.resourcemanager.elasticsan.fluent.models.SnapshotInner object.
     *
     * @return the inner object.
     */
    SnapshotInner innerModel();

    /** The entirety of the Snapshot definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The Snapshot definition stages. */
    interface DefinitionStages {
        /** The first stage of the Snapshot definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Snapshot definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the Snapshot definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, elasticSanName, volumeGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param elasticSanName The name of the ElasticSan.
             * @param volumeGroupName The name of the VolumeGroup.
             * @return the next definition stage.
             */
            WithCreate withExistingVolumegroup(String resourceGroupName, String elasticSanName, String volumeGroupName);
        }
        /**
         * The stage of the Snapshot definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithCreationData {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Snapshot create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Snapshot create(Context context);
        }
        /** The stage of the Snapshot definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Snapshot definition allowing to specify creationData. */
        interface WithCreationData {
            /**
             * Specifies the creationData property: State of the operation on the resource..
             *
             * @param creationData State of the operation on the resource.
             * @return the next definition stage.
             */
            WithCreate withCreationData(SnapshotCreationData creationData);
        }
    }
    /**
     * Begins update for the Snapshot resource.
     *
     * @return the stage of resource update.
     */
    Snapshot.Update update();

    /** The template for Snapshot update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Snapshot apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Snapshot apply(Context context);
    }
    /** The Snapshot update stages. */
    interface UpdateStages {
        /** The stage of the Snapshot update allowing to specify tags. */
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
    Snapshot refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Snapshot refresh(Context context);

    /**
     * Export a volume to a different Volume Group in same San account or different San account.
     *
     * @param parameters Snapshot object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume Snapshot request.
     */
    Snapshot export(ExportSnapshot parameters);

    /**
     * Export a volume to a different Volume Group in same San account or different San account.
     *
     * @param parameters Snapshot object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume Snapshot request.
     */
    Snapshot export(ExportSnapshot parameters, Context context);
}
