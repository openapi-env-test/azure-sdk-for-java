// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.GremlinGraphGetResultsInner;
import java.util.Map;

/** An immutable client-side representation of GremlinGraphGetResults. */
public interface GremlinGraphGetResults {
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
     * Gets the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the resource property: The resource property.
     *
     * @return the resource value.
     */
    GremlinGraphGetPropertiesResource resource();

    /**
     * Gets the options property: Cosmos DB options resource object.
     *
     * @return the options value.
     */
    OptionsResource options();

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
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.GremlinGraphGetResultsInner object.
     *
     * @return the inner object.
     */
    GremlinGraphGetResultsInner innerModel();

    /** The entirety of the GremlinGraphGetResults definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithResource,
            DefinitionStages.WithCreate {
    }
    /** The GremlinGraphGetResults definition stages. */
    interface DefinitionStages {
        /** The first stage of the GremlinGraphGetResults definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the GremlinGraphGetResults definition allowing to specify location. */
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
        /** The stage of the GremlinGraphGetResults definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName, databaseName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName Cosmos DB database account name.
             * @param databaseName Cosmos DB database name.
             * @return the next definition stage.
             */
            WithResource withExistingGremlinDatabase(String resourceGroupName, String accountName, String databaseName);
        }
        /** The stage of the GremlinGraphGetResults definition allowing to specify resource. */
        interface WithResource {
            /**
             * Specifies the resource property: The standard JSON format of a Gremlin graph.
             *
             * @param resource The standard JSON format of a Gremlin graph.
             * @return the next definition stage.
             */
            WithCreate withResource(GremlinGraphResource resource);
        }
        /**
         * The stage of the GremlinGraphGetResults definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithIdentity, DefinitionStages.WithOptions {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            GremlinGraphGetResults create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            GremlinGraphGetResults create(Context context);
        }
        /** The stage of the GremlinGraphGetResults definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the GremlinGraphGetResults definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }
        /** The stage of the GremlinGraphGetResults definition allowing to specify options. */
        interface WithOptions {
            /**
             * Specifies the options property: A key-value pair of options to be applied for the request. This
             * corresponds to the headers sent with the request..
             *
             * @param options A key-value pair of options to be applied for the request. This corresponds to the headers
             *     sent with the request.
             * @return the next definition stage.
             */
            WithCreate withOptions(CreateUpdateOptions options);
        }
    }
    /**
     * Begins update for the GremlinGraphGetResults resource.
     *
     * @return the stage of resource update.
     */
    GremlinGraphGetResults.Update update();

    /** The template for GremlinGraphGetResults update. */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithResource, UpdateStages.WithOptions {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        GremlinGraphGetResults apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        GremlinGraphGetResults apply(Context context);
    }
    /** The GremlinGraphGetResults update stages. */
    interface UpdateStages {
        /** The stage of the GremlinGraphGetResults update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the GremlinGraphGetResults update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }
        /** The stage of the GremlinGraphGetResults update allowing to specify resource. */
        interface WithResource {
            /**
             * Specifies the resource property: The standard JSON format of a Gremlin graph.
             *
             * @param resource The standard JSON format of a Gremlin graph.
             * @return the next definition stage.
             */
            Update withResource(GremlinGraphResource resource);
        }
        /** The stage of the GremlinGraphGetResults update allowing to specify options. */
        interface WithOptions {
            /**
             * Specifies the options property: A key-value pair of options to be applied for the request. This
             * corresponds to the headers sent with the request..
             *
             * @param options A key-value pair of options to be applied for the request. This corresponds to the headers
             *     sent with the request.
             * @return the next definition stage.
             */
            Update withOptions(CreateUpdateOptions options);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    GremlinGraphGetResults refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    GremlinGraphGetResults refresh(Context context);
}
