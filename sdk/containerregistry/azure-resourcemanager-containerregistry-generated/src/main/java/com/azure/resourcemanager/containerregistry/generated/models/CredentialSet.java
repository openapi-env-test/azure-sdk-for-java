// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.CredentialSetInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of CredentialSet. */
public interface CredentialSet {
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
     * Gets the identity property: Identities associated with the resource. This is used to access the KeyVault secrets.
     *
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the loginServer property: The credentials are stored for this upstream or login server.
     *
     * @return the loginServer value.
     */
    String loginServer();

    /**
     * Gets the authCredentials property: List of authentication credentials stored for an upstream. Usually consists of
     * a primary and an optional secondary credential.
     *
     * @return the authCredentials value.
     */
    List<AuthCredential> authCredentials();

    /**
     * Gets the creationDate property: The creation date of credential store resource.
     *
     * @return the creationDate value.
     */
    OffsetDateTime creationDate();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.containerregistry.generated.fluent.models.CredentialSetInner object.
     *
     * @return the inner object.
     */
    CredentialSetInner innerModel();

    /** The entirety of the CredentialSet definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The CredentialSet definition stages. */
    interface DefinitionStages {
        /** The first stage of the CredentialSet definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the CredentialSet definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, registryName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param registryName The name of the container registry.
             * @return the next definition stage.
             */
            WithCreate withExistingRegistry(String resourceGroupName, String registryName);
        }
        /**
         * The stage of the CredentialSet definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithIdentity,
                DefinitionStages.WithLoginServer,
                DefinitionStages.WithAuthCredentials {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CredentialSet create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CredentialSet create(Context context);
        }
        /** The stage of the CredentialSet definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identities associated with the resource. This is used to access the
             * KeyVault secrets..
             *
             * @param identity Identities associated with the resource. This is used to access the KeyVault secrets.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityProperties identity);
        }
        /** The stage of the CredentialSet definition allowing to specify loginServer. */
        interface WithLoginServer {
            /**
             * Specifies the loginServer property: The credentials are stored for this upstream or login server..
             *
             * @param loginServer The credentials are stored for this upstream or login server.
             * @return the next definition stage.
             */
            WithCreate withLoginServer(String loginServer);
        }
        /** The stage of the CredentialSet definition allowing to specify authCredentials. */
        interface WithAuthCredentials {
            /**
             * Specifies the authCredentials property: List of authentication credentials stored for an upstream.
             * Usually consists of a primary and an optional secondary credential..
             *
             * @param authCredentials List of authentication credentials stored for an upstream. Usually consists of a
             *     primary and an optional secondary credential.
             * @return the next definition stage.
             */
            WithCreate withAuthCredentials(List<AuthCredential> authCredentials);
        }
    }
    /**
     * Begins update for the CredentialSet resource.
     *
     * @return the stage of resource update.
     */
    CredentialSet.Update update();

    /** The template for CredentialSet update. */
    interface Update extends UpdateStages.WithIdentity, UpdateStages.WithAuthCredentials {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CredentialSet apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CredentialSet apply(Context context);
    }
    /** The CredentialSet update stages. */
    interface UpdateStages {
        /** The stage of the CredentialSet update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identities associated with the resource. This is used to access the
             * KeyVault secrets..
             *
             * @param identity Identities associated with the resource. This is used to access the KeyVault secrets.
             * @return the next definition stage.
             */
            Update withIdentity(IdentityProperties identity);
        }
        /** The stage of the CredentialSet update allowing to specify authCredentials. */
        interface WithAuthCredentials {
            /**
             * Specifies the authCredentials property: List of authentication credentials stored for an upstream.
             * Usually consists of a primary and an optional secondary credential..
             *
             * @param authCredentials List of authentication credentials stored for an upstream. Usually consists of a
             *     primary and an optional secondary credential.
             * @return the next definition stage.
             */
            Update withAuthCredentials(List<AuthCredential> authCredentials);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CredentialSet refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CredentialSet refresh(Context context);
}
