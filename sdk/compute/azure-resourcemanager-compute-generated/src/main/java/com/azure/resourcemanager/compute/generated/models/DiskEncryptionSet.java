// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskEncryptionSetInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of DiskEncryptionSet. */
public interface DiskEncryptionSet {
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
     * Gets the identity property: The managed identity for the disk encryption set. It should be given permission on
     * the key vault before it can be used to encrypt disks.
     *
     * @return the identity value.
     */
    EncryptionSetIdentity identity();

    /**
     * Gets the activeKey property: The key vault key which is currently used by this disk encryption set.
     *
     * @return the activeKey value.
     */
    KeyVaultAndKeyReference activeKey();

    /**
     * Gets the previousKeys property: A readonly collection of key vault keys previously used by this disk encryption
     * set while a key rotation is in progress. It will be empty if there is no ongoing key rotation.
     *
     * @return the previousKeys value.
     */
    List<KeyVaultAndKeyReference> previousKeys();

    /**
     * Gets the provisioningState property: The disk encryption set provisioning state.
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
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.DiskEncryptionSetInner object.
     *
     * @return the inner object.
     */
    DiskEncryptionSetInner innerModel();

    /** The entirety of the DiskEncryptionSet definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The DiskEncryptionSet definition stages. */
    interface DefinitionStages {
        /** The first stage of the DiskEncryptionSet definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DiskEncryptionSet definition allowing to specify location. */
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
        /** The stage of the DiskEncryptionSet definition allowing to specify parent resource. */
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
         * The stage of the DiskEncryptionSet definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithIdentity, DefinitionStages.WithActiveKey {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DiskEncryptionSet create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DiskEncryptionSet create(Context context);
        }
        /** The stage of the DiskEncryptionSet definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DiskEncryptionSet definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed identity for the disk encryption set. It should be given
             * permission on the key vault before it can be used to encrypt disks..
             *
             * @param identity The managed identity for the disk encryption set. It should be given permission on the
             *     key vault before it can be used to encrypt disks.
             * @return the next definition stage.
             */
            WithCreate withIdentity(EncryptionSetIdentity identity);
        }
        /** The stage of the DiskEncryptionSet definition allowing to specify activeKey. */
        interface WithActiveKey {
            /**
             * Specifies the activeKey property: The key vault key which is currently used by this disk encryption set..
             *
             * @param activeKey The key vault key which is currently used by this disk encryption set.
             * @return the next definition stage.
             */
            WithCreate withActiveKey(KeyVaultAndKeyReference activeKey);
        }
    }
    /**
     * Begins update for the DiskEncryptionSet resource.
     *
     * @return the stage of resource update.
     */
    DiskEncryptionSet.Update update();

    /** The template for DiskEncryptionSet update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithActiveKey {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DiskEncryptionSet apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DiskEncryptionSet apply(Context context);
    }
    /** The DiskEncryptionSet update stages. */
    interface UpdateStages {
        /** The stage of the DiskEncryptionSet update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the DiskEncryptionSet update allowing to specify activeKey. */
        interface WithActiveKey {
            /**
             * Specifies the activeKey property: Key Vault Key Url and vault id of KeK, KeK is optional and when
             * provided is used to unwrap the encryptionKey.
             *
             * @param activeKey Key Vault Key Url and vault id of KeK, KeK is optional and when provided is used to
             *     unwrap the encryptionKey.
             * @return the next definition stage.
             */
            Update withActiveKey(KeyVaultAndKeyReference activeKey);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DiskEncryptionSet refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DiskEncryptionSet refresh(Context context);
}
