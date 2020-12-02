// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.ContentKeyPolicyInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** An immutable client-side representation of ContentKeyPolicy. */
public interface ContentKeyPolicy {
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
     * Gets the policyId property: The legacy Policy ID.
     *
     * @return the policyId value.
     */
    UUID policyId();

    /**
     * Gets the created property: The creation date of the Policy.
     *
     * @return the created value.
     */
    OffsetDateTime created();

    /**
     * Gets the lastModified property: The last modified date of the Policy.
     *
     * @return the lastModified value.
     */
    OffsetDateTime lastModified();

    /**
     * Gets the description property: A description for the Policy.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the options property: The Key Policy options.
     *
     * @return the options value.
     */
    List<ContentKeyPolicyOption> options();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.generated.fluent.models.ContentKeyPolicyInner object.
     *
     * @return the inner object.
     */
    ContentKeyPolicyInner innerModel();

    /** The entirety of the ContentKeyPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ContentKeyPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the ContentKeyPolicy definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ContentKeyPolicy definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group within the Azure subscription.
             * @param accountName The Media Services account name.
             * @return the next definition stage.
             */
            WithCreate withExistingMediaService(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the ContentKeyPolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDescription, DefinitionStages.WithOptions {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ContentKeyPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ContentKeyPolicy create(Context context);
        }
        /** The stage of the ContentKeyPolicy definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: A description for the Policy..
             *
             * @param description A description for the Policy.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the ContentKeyPolicy definition allowing to specify options. */
        interface WithOptions {
            /**
             * Specifies the options property: The Key Policy options..
             *
             * @param options The Key Policy options.
             * @return the next definition stage.
             */
            WithCreate withOptions(List<ContentKeyPolicyOption> options);
        }
    }
    /**
     * Begins update for the ContentKeyPolicy resource.
     *
     * @return the stage of resource update.
     */
    ContentKeyPolicy.Update update();

    /** The template for ContentKeyPolicy update. */
    interface Update extends UpdateStages.WithDescription, UpdateStages.WithOptions {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ContentKeyPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ContentKeyPolicy apply(Context context);
    }
    /** The ContentKeyPolicy update stages. */
    interface UpdateStages {
        /** The stage of the ContentKeyPolicy update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: A description for the Policy..
             *
             * @param description A description for the Policy.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the ContentKeyPolicy update allowing to specify options. */
        interface WithOptions {
            /**
             * Specifies the options property: The Key Policy options..
             *
             * @param options The Key Policy options.
             * @return the next definition stage.
             */
            Update withOptions(List<ContentKeyPolicyOption> options);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ContentKeyPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ContentKeyPolicy refresh(Context context);
}
