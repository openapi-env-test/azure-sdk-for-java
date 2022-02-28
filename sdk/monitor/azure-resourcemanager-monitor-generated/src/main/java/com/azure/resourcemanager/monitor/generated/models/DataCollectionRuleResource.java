// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.DataCollectionRuleResourceInner;
import java.util.Map;

/** An immutable client-side representation of DataCollectionRuleResource. */
public interface DataCollectionRuleResource {
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
     * Gets the kind property: The kind of the resource.
     *
     * @return the kind value.
     */
    KnownDataCollectionRuleResourceKind kind();

    /**
     * Gets the etag property: Resource entity tag (ETag).
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.DataCollectionRuleResourceInner object.
     *
     * @return the inner object.
     */
    DataCollectionRuleResourceInner innerModel();

    /** The entirety of the DataCollectionRuleResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The DataCollectionRuleResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the DataCollectionRuleResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DataCollectionRuleResource definition allowing to specify location. */
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
        /** The stage of the DataCollectionRuleResource definition allowing to specify parent resource. */
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
         * The stage of the DataCollectionRuleResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithKind {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DataCollectionRuleResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DataCollectionRuleResource create(Context context);
        }
        /** The stage of the DataCollectionRuleResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DataCollectionRuleResource definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of the resource..
             *
             * @param kind The kind of the resource.
             * @return the next definition stage.
             */
            WithCreate withKind(KnownDataCollectionRuleResourceKind kind);
        }
    }
    /**
     * Begins update for the DataCollectionRuleResource resource.
     *
     * @return the stage of resource update.
     */
    DataCollectionRuleResource.Update update();

    /** The template for DataCollectionRuleResource update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DataCollectionRuleResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DataCollectionRuleResource apply(Context context);
    }
    /** The DataCollectionRuleResource update stages. */
    interface UpdateStages {
        /** The stage of the DataCollectionRuleResource update allowing to specify tags. */
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
    DataCollectionRuleResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DataCollectionRuleResource refresh(Context context);
}
