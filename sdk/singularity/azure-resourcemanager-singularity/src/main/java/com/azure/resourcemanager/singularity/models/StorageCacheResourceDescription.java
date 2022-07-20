// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.fluent.models.StorageCacheResourceDescriptionInner;
import java.util.Map;

/** An immutable client-side representation of StorageCacheResourceDescription. */
public interface StorageCacheResourceDescription {
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
     * Gets the properties property: Describes the properties of a storage cache resource.
     *
     * @return the properties value.
     */
    StorageCachePropertiesBase properties();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: The systemData property.
     *
     * @return the systemData value.
     */
    ResourceSystemData systemData();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.singularity.fluent.models.StorageCacheResourceDescriptionInner object.
     *
     * @return the inner object.
     */
    StorageCacheResourceDescriptionInner innerModel();

    /** The entirety of the StorageCacheResourceDescription definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The StorageCacheResourceDescription definition stages. */
    interface DefinitionStages {
        /** The first stage of the StorageCacheResourceDescription definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the StorageCacheResourceDescription definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription.
             * @param accountName The name of the Singularity account.
             * @return the next definition stage.
             */
            WithProperties withExistingAccount(String resourceGroupName, String accountName);
        }
        /** The stage of the StorageCacheResourceDescription definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Describes the properties of a storage cache resource..
             *
             * @param properties Describes the properties of a storage cache resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(StorageCachePropertiesBase properties);
        }
        /**
         * The stage of the StorageCacheResourceDescription definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithSystemData {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            StorageCacheResourceDescription create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StorageCacheResourceDescription create(Context context);
        }
        /** The stage of the StorageCacheResourceDescription definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the StorageCacheResourceDescription definition allowing to specify systemData. */
        interface WithSystemData {
            /**
             * Specifies the systemData property: The systemData property..
             *
             * @param systemData The systemData property.
             * @return the next definition stage.
             */
            WithCreate withSystemData(ResourceSystemData systemData);
        }
    }
    /**
     * Begins update for the StorageCacheResourceDescription resource.
     *
     * @return the stage of resource update.
     */
    StorageCacheResourceDescription.Update update();

    /** The template for StorageCacheResourceDescription update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties, UpdateStages.WithSystemData {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        StorageCacheResourceDescription apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        StorageCacheResourceDescription apply(Context context);
    }
    /** The StorageCacheResourceDescription update stages. */
    interface UpdateStages {
        /** The stage of the StorageCacheResourceDescription update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the StorageCacheResourceDescription update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Describes the properties of a storage cache resource..
             *
             * @param properties Describes the properties of a storage cache resource.
             * @return the next definition stage.
             */
            Update withProperties(StorageCachePropertiesBase properties);
        }
        /** The stage of the StorageCacheResourceDescription update allowing to specify systemData. */
        interface WithSystemData {
            /**
             * Specifies the systemData property: The systemData property..
             *
             * @param systemData The systemData property.
             * @return the next definition stage.
             */
            Update withSystemData(ResourceSystemData systemData);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    StorageCacheResourceDescription refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StorageCacheResourceDescription refresh(Context context);

    /**
     * Resumes the storage cache resource identified by the name.
     *
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a storage cache resource.
     */
    StorageCacheResourceDescription resume();

    /**
     * Resumes the storage cache resource identified by the name.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a storage cache resource.
     */
    StorageCacheResourceDescription resume(Context context);

    /**
     * Suspends the storage cache resource identified by the name.
     *
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a storage cache resource.
     */
    StorageCacheResourceDescription suspend();

    /**
     * Suspends the storage cache resource identified by the name.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.singularity.models.ErrorModelPropertiesException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a storage cache resource.
     */
    StorageCacheResourceDescription suspend(Context context);
}
