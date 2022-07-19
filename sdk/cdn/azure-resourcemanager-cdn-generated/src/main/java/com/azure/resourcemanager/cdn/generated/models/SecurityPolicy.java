// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.fluent.models.SecurityPolicyInner;

/** An immutable client-side representation of SecurityPolicy. */
public interface SecurityPolicy {
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
     * Gets the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the profileName property: The name of the profile which holds the security policy.
     *
     * @return the profileName value.
     */
    String profileName();

    /**
     * Gets the parameters property: object which contains security policy parameters.
     *
     * @return the parameters value.
     */
    SecurityPolicyPropertiesParameters parameters();

    /**
     * Gets the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    AfdProvisioningState provisioningState();

    /**
     * Gets the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    DeploymentStatus deploymentStatus();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.cdn.generated.fluent.models.SecurityPolicyInner object.
     *
     * @return the inner object.
     */
    SecurityPolicyInner innerModel();

    /** The entirety of the SecurityPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The SecurityPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the SecurityPolicy definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SecurityPolicy definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, profileName.
             *
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is
             *     unique within the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingProfile(String resourceGroupName, String profileName);
        }
        /**
         * The stage of the SecurityPolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithParameters {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SecurityPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SecurityPolicy create(Context context);
        }
        /** The stage of the SecurityPolicy definition allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: object which contains security policy parameters.
             *
             * @param parameters object which contains security policy parameters.
             * @return the next definition stage.
             */
            WithCreate withParameters(SecurityPolicyPropertiesParameters parameters);
        }
    }
    /**
     * Begins update for the SecurityPolicy resource.
     *
     * @return the stage of resource update.
     */
    SecurityPolicy.Update update();

    /** The template for SecurityPolicy update. */
    interface Update extends UpdateStages.WithParameters {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SecurityPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SecurityPolicy apply(Context context);
    }
    /** The SecurityPolicy update stages. */
    interface UpdateStages {
        /** The stage of the SecurityPolicy update allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: object which contains security policy parameters.
             *
             * @param parameters object which contains security policy parameters.
             * @return the next definition stage.
             */
            Update withParameters(SecurityPolicyPropertiesParameters parameters);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SecurityPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SecurityPolicy refresh(Context context);
}
