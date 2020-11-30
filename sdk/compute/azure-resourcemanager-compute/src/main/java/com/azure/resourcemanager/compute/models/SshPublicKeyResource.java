// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.SshPublicKeyResourceInner;
import java.util.Map;

/** An immutable client-side representation of SshPublicKeyResource. */
public interface SshPublicKeyResource {
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
     * Gets the publicKey property: SSH public key used to authenticate to a virtual machine through ssh. If this
     * property is not initially provided when the resource is created, the publicKey property will be populated when
     * generateKeyPair is called. If the public key is provided upon resource creation, the provided public key needs to
     * be at least 2048-bit and in ssh-rsa format.
     *
     * @return the publicKey value.
     */
    String publicKey();

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
     * Gets the inner com.azure.resourcemanager.compute.fluent.models.SshPublicKeyResourceInner object.
     *
     * @return the inner object.
     */
    SshPublicKeyResourceInner innerModel();

    /** The entirety of the SshPublicKeyResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The SshPublicKeyResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the SshPublicKeyResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the SshPublicKeyResource definition allowing to specify location. */
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
        /** The stage of the SshPublicKeyResource definition allowing to specify parent resource. */
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
         * The stage of the SshPublicKeyResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithPublicKey {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SshPublicKeyResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SshPublicKeyResource create(Context context);
        }
        /** The stage of the SshPublicKeyResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the SshPublicKeyResource definition allowing to specify publicKey. */
        interface WithPublicKey {
            /**
             * Specifies the publicKey property: SSH public key used to authenticate to a virtual machine through ssh.
             * If this property is not initially provided when the resource is created, the publicKey property will be
             * populated when generateKeyPair is called. If the public key is provided upon resource creation, the
             * provided public key needs to be at least 2048-bit and in ssh-rsa format..
             *
             * @param publicKey SSH public key used to authenticate to a virtual machine through ssh. If this property
             *     is not initially provided when the resource is created, the publicKey property will be populated when
             *     generateKeyPair is called. If the public key is provided upon resource creation, the provided public
             *     key needs to be at least 2048-bit and in ssh-rsa format.
             * @return the next definition stage.
             */
            WithCreate withPublicKey(String publicKey);
        }
    }
    /**
     * Begins update for the SshPublicKeyResource resource.
     *
     * @return the stage of resource update.
     */
    SshPublicKeyResource.Update update();

    /** The template for SshPublicKeyResource update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithPublicKey {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SshPublicKeyResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SshPublicKeyResource apply(Context context);
    }
    /** The SshPublicKeyResource update stages. */
    interface UpdateStages {
        /** The stage of the SshPublicKeyResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the SshPublicKeyResource update allowing to specify publicKey. */
        interface WithPublicKey {
            /**
             * Specifies the publicKey property: SSH public key used to authenticate to a virtual machine through ssh.
             * If this property is not initially provided when the resource is created, the publicKey property will be
             * populated when generateKeyPair is called. If the public key is provided upon resource creation, the
             * provided public key needs to be at least 2048-bit and in ssh-rsa format..
             *
             * @param publicKey SSH public key used to authenticate to a virtual machine through ssh. If this property
             *     is not initially provided when the resource is created, the publicKey property will be populated when
             *     generateKeyPair is called. If the public key is provided upon resource creation, the provided public
             *     key needs to be at least 2048-bit and in ssh-rsa format.
             * @return the next definition stage.
             */
            Update withPublicKey(String publicKey);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SshPublicKeyResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SshPublicKeyResource refresh(Context context);
}
