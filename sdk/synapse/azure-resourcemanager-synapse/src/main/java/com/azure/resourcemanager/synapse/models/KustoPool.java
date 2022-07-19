// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.FollowerDatabaseDefinitionInner;
import com.azure.resourcemanager.synapse.fluent.models.KustoPoolInner;
import java.util.Map;

/** An immutable client-side representation of KustoPool. */
public interface KustoPool {
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
     * Gets the sku property: The SKU of the kusto pool.
     *
     * @return the sku value.
     */
    AzureSku sku();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the state property: The state of the resource.
     *
     * @return the state value.
     */
    State state();

    /**
     * Gets the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    ResourceProvisioningState provisioningState();

    /**
     * Gets the uri property: The Kusto Pool URI.
     *
     * @return the uri value.
     */
    String uri();

    /**
     * Gets the dataIngestionUri property: The Kusto Pool data ingestion URI.
     *
     * @return the dataIngestionUri value.
     */
    String dataIngestionUri();

    /**
     * Gets the stateReason property: The reason for the Kusto Pool's current state.
     *
     * @return the stateReason value.
     */
    String stateReason();

    /**
     * Gets the optimizedAutoscale property: Optimized auto scale definition.
     *
     * @return the optimizedAutoscale value.
     */
    OptimizedAutoscale optimizedAutoscale();

    /**
     * Gets the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is enabled.
     *
     * @return the enableStreamingIngest value.
     */
    Boolean enableStreamingIngest();

    /**
     * Gets the enablePurge property: A boolean value that indicates if the purge operations are enabled.
     *
     * @return the enablePurge value.
     */
    Boolean enablePurge();

    /**
     * Gets the languageExtensions property: List of the Kusto Pool's language extensions.
     *
     * @return the languageExtensions value.
     */
    LanguageExtensionsList languageExtensions();

    /**
     * Gets the workspaceUid property: The workspace unique identifier.
     *
     * @return the workspaceUid value.
     */
    String workspaceUid();

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
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.KustoPoolInner object.
     *
     * @return the inner object.
     */
    KustoPoolInner innerModel();

    /** The entirety of the KustoPool definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The KustoPool definition stages. */
    interface DefinitionStages {
        /** The first stage of the KustoPool definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the KustoPool definition allowing to specify location. */
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
        /** The stage of the KustoPool definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies workspaceName, resourceGroupName.
             *
             * @param workspaceName The name of the workspace.
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithSku withExistingWorkspace(String workspaceName, String resourceGroupName);
        }
        /** The stage of the KustoPool definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the kusto pool..
             *
             * @param sku The SKU of the kusto pool.
             * @return the next definition stage.
             */
            WithCreate withSku(AzureSku sku);
        }
        /**
         * The stage of the KustoPool definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithOptimizedAutoscale,
                DefinitionStages.WithEnableStreamingIngest,
                DefinitionStages.WithEnablePurge,
                DefinitionStages.WithWorkspaceUid,
                DefinitionStages.WithIfMatch,
                DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            KustoPool create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            KustoPool create(Context context);
        }
        /** The stage of the KustoPool definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the KustoPool definition allowing to specify optimizedAutoscale. */
        interface WithOptimizedAutoscale {
            /**
             * Specifies the optimizedAutoscale property: Optimized auto scale definition..
             *
             * @param optimizedAutoscale Optimized auto scale definition.
             * @return the next definition stage.
             */
            WithCreate withOptimizedAutoscale(OptimizedAutoscale optimizedAutoscale);
        }
        /** The stage of the KustoPool definition allowing to specify enableStreamingIngest. */
        interface WithEnableStreamingIngest {
            /**
             * Specifies the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is
             * enabled..
             *
             * @param enableStreamingIngest A boolean value that indicates if the streaming ingest is enabled.
             * @return the next definition stage.
             */
            WithCreate withEnableStreamingIngest(Boolean enableStreamingIngest);
        }
        /** The stage of the KustoPool definition allowing to specify enablePurge. */
        interface WithEnablePurge {
            /**
             * Specifies the enablePurge property: A boolean value that indicates if the purge operations are enabled..
             *
             * @param enablePurge A boolean value that indicates if the purge operations are enabled.
             * @return the next definition stage.
             */
            WithCreate withEnablePurge(Boolean enablePurge);
        }
        /** The stage of the KustoPool definition allowing to specify workspaceUid. */
        interface WithWorkspaceUid {
            /**
             * Specifies the workspaceUid property: The workspace unique identifier..
             *
             * @param workspaceUid The workspace unique identifier.
             * @return the next definition stage.
             */
            WithCreate withWorkspaceUid(String workspaceUid);
        }
        /** The stage of the KustoPool definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the Kusto Pool. Omit this value to always overwrite the
             * current Kusto Pool. Specify the last-seen ETag value to prevent accidentally overwriting concurrent
             * changes..
             *
             * @param ifMatch The ETag of the Kusto Pool. Omit this value to always overwrite the current Kusto Pool.
             *     Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
        /** The stage of the KustoPool definition allowing to specify ifNoneMatch. */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new Kusto Pool to be created, but to prevent
             * updating an existing Kusto Pool. Other values will result in a 412 Pre-condition Failed response..
             *
             * @param ifNoneMatch Set to '*' to allow a new Kusto Pool to be created, but to prevent updating an
             *     existing Kusto Pool. Other values will result in a 412 Pre-condition Failed response.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }
    /**
     * Begins update for the KustoPool resource.
     *
     * @return the stage of resource update.
     */
    KustoPool.Update update();

    /** The template for KustoPool update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSku,
            UpdateStages.WithOptimizedAutoscale,
            UpdateStages.WithEnableStreamingIngest,
            UpdateStages.WithEnablePurge,
            UpdateStages.WithWorkspaceUid,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        KustoPool apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        KustoPool apply(Context context);
    }
    /** The KustoPool update stages. */
    interface UpdateStages {
        /** The stage of the KustoPool update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the KustoPool update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the kusto pool..
             *
             * @param sku The SKU of the kusto pool.
             * @return the next definition stage.
             */
            Update withSku(AzureSku sku);
        }
        /** The stage of the KustoPool update allowing to specify optimizedAutoscale. */
        interface WithOptimizedAutoscale {
            /**
             * Specifies the optimizedAutoscale property: Optimized auto scale definition..
             *
             * @param optimizedAutoscale Optimized auto scale definition.
             * @return the next definition stage.
             */
            Update withOptimizedAutoscale(OptimizedAutoscale optimizedAutoscale);
        }
        /** The stage of the KustoPool update allowing to specify enableStreamingIngest. */
        interface WithEnableStreamingIngest {
            /**
             * Specifies the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is
             * enabled..
             *
             * @param enableStreamingIngest A boolean value that indicates if the streaming ingest is enabled.
             * @return the next definition stage.
             */
            Update withEnableStreamingIngest(Boolean enableStreamingIngest);
        }
        /** The stage of the KustoPool update allowing to specify enablePurge. */
        interface WithEnablePurge {
            /**
             * Specifies the enablePurge property: A boolean value that indicates if the purge operations are enabled..
             *
             * @param enablePurge A boolean value that indicates if the purge operations are enabled.
             * @return the next definition stage.
             */
            Update withEnablePurge(Boolean enablePurge);
        }
        /** The stage of the KustoPool update allowing to specify workspaceUid. */
        interface WithWorkspaceUid {
            /**
             * Specifies the workspaceUid property: The workspace unique identifier..
             *
             * @param workspaceUid The workspace unique identifier.
             * @return the next definition stage.
             */
            Update withWorkspaceUid(String workspaceUid);
        }
        /** The stage of the KustoPool update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the Kusto Pool. Omit this value to always overwrite the
             * current Kusto Pool. Specify the last-seen ETag value to prevent accidentally overwriting concurrent
             * changes..
             *
             * @param ifMatch The ETag of the Kusto Pool. Omit this value to always overwrite the current Kusto Pool.
             *     Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    KustoPool refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    KustoPool refresh(Context context);

    /**
     * Stops a Kusto pool.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop();

    /**
     * Stops a Kusto pool.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(Context context);

    /**
     * Starts a Kusto pool.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * Starts a Kusto pool.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * Returns a list of language extensions that can run within KQL queries.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of language extension objects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LanguageExtension> listLanguageExtensions();

    /**
     * Returns a list of language extensions that can run within KQL queries.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of language extension objects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LanguageExtension> listLanguageExtensions(Context context);

    /**
     * Add a list of language extensions that can run within KQL queries.
     *
     * @param languageExtensionsToAdd The language extensions to add.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void addLanguageExtensions(LanguageExtensionsList languageExtensionsToAdd);

    /**
     * Add a list of language extensions that can run within KQL queries.
     *
     * @param languageExtensionsToAdd The language extensions to add.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void addLanguageExtensions(LanguageExtensionsList languageExtensionsToAdd, Context context);

    /**
     * Remove a list of language extensions that can run within KQL queries.
     *
     * @param languageExtensionsToRemove The language extensions to remove.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void removeLanguageExtensions(LanguageExtensionsList languageExtensionsToRemove);

    /**
     * Remove a list of language extensions that can run within KQL queries.
     *
     * @param languageExtensionsToRemove The language extensions to remove.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void removeLanguageExtensions(LanguageExtensionsList languageExtensionsToRemove, Context context);

    /**
     * Returns a list of databases that are owned by this Kusto Pool and were followed by another Kusto Pool.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database principals operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases();

    /**
     * Returns a list of databases that are owned by this Kusto Pool and were followed by another Kusto Pool.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database principals operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases(Context context);

    /**
     * Detaches all followers of a database owned by this Kusto Pool.
     *
     * @param followerDatabaseToRemove The follower databases properties to remove.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detachFollowerDatabases(FollowerDatabaseDefinitionInner followerDatabaseToRemove);

    /**
     * Detaches all followers of a database owned by this Kusto Pool.
     *
     * @param followerDatabaseToRemove The follower databases properties to remove.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detachFollowerDatabases(FollowerDatabaseDefinitionInner followerDatabaseToRemove, Context context);
}
