// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.fluent.models.AfdEndpointInner;
import java.util.Map;

/** An immutable client-side representation of AfdEndpoint. */
public interface AfdEndpoint {
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
     * Gets the originResponseTimeoutSeconds property: Send and receive timeout on forwarding request to the origin.
     * When timeout is reached, the request fails and returns.
     *
     * @return the originResponseTimeoutSeconds value.
     */
    Integer originResponseTimeoutSeconds();

    /**
     * Gets the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @return the enabledState value.
     */
    EnabledState enabledState();

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
     * Gets the hostname property: The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g.
     * contoso.azureedge.net.
     *
     * @return the hostname value.
     */
    String hostname();

    /**
     * Gets the systemData property: Read only system data.
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
     * Gets the inner com.azure.resourcemanager.cdn.generated.fluent.models.AfdEndpointInner object.
     *
     * @return the inner object.
     */
    AfdEndpointInner innerModel();

    /** The entirety of the AfdEndpoint definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The AfdEndpoint definition stages. */
    interface DefinitionStages {
        /** The first stage of the AfdEndpoint definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AfdEndpoint definition allowing to specify location. */
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
        /** The stage of the AfdEndpoint definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, profileName.
             *
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @param profileName Name of the CDN profile which is unique within the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingProfile(String resourceGroupName, String profileName);
        }
        /**
         * The stage of the AfdEndpoint definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithOriginResponseTimeoutSeconds,
                DefinitionStages.WithEnabledState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AfdEndpoint create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AfdEndpoint create(Context context);
        }
        /** The stage of the AfdEndpoint definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AfdEndpoint definition allowing to specify originResponseTimeoutSeconds. */
        interface WithOriginResponseTimeoutSeconds {
            /**
             * Specifies the originResponseTimeoutSeconds property: Send and receive timeout on forwarding request to
             * the origin. When timeout is reached, the request fails and returns..
             *
             * @param originResponseTimeoutSeconds Send and receive timeout on forwarding request to the origin. When
             *     timeout is reached, the request fails and returns.
             * @return the next definition stage.
             */
            WithCreate withOriginResponseTimeoutSeconds(Integer originResponseTimeoutSeconds);
        }
        /** The stage of the AfdEndpoint definition allowing to specify enabledState. */
        interface WithEnabledState {
            /**
             * Specifies the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled'
             * or 'Disabled'.
             *
             * @param enabledState Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
             * @return the next definition stage.
             */
            WithCreate withEnabledState(EnabledState enabledState);
        }
    }
    /**
     * Begins update for the AfdEndpoint resource.
     *
     * @return the stage of resource update.
     */
    AfdEndpoint.Update update();

    /** The template for AfdEndpoint update. */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithOriginResponseTimeoutSeconds, UpdateStages.WithEnabledState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AfdEndpoint apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AfdEndpoint apply(Context context);
    }
    /** The AfdEndpoint update stages. */
    interface UpdateStages {
        /** The stage of the AfdEndpoint update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Endpoint tags..
             *
             * @param tags Endpoint tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the AfdEndpoint update allowing to specify originResponseTimeoutSeconds. */
        interface WithOriginResponseTimeoutSeconds {
            /**
             * Specifies the originResponseTimeoutSeconds property: Send and receive timeout on forwarding request to
             * the origin. When timeout is reached, the request fails and returns..
             *
             * @param originResponseTimeoutSeconds Send and receive timeout on forwarding request to the origin. When
             *     timeout is reached, the request fails and returns.
             * @return the next definition stage.
             */
            Update withOriginResponseTimeoutSeconds(Integer originResponseTimeoutSeconds);
        }
        /** The stage of the AfdEndpoint update allowing to specify enabledState. */
        interface WithEnabledState {
            /**
             * Specifies the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled'
             * or 'Disabled'.
             *
             * @param enabledState Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
             * @return the next definition stage.
             */
            Update withEnabledState(EnabledState enabledState);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AfdEndpoint refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AfdEndpoint refresh(Context context);
}
