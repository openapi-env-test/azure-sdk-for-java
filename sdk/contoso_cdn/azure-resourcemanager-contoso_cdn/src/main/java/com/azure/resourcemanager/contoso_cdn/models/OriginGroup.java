// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.contoso_cdn.fluent.models.OriginGroupInner;
import java.util.List;

/** An immutable client-side representation of OriginGroup. */
public interface OriginGroup {
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
     * Gets the healthProbeSettings property: Health probe settings to the origin that is used to determine the health
     * of the origin.
     *
     * @return the healthProbeSettings value.
     */
    HealthProbeParameters healthProbeSettings();

    /**
     * Gets the origins property: The source of the content being delivered via CDN within given origin group.
     *
     * @return the origins value.
     */
    List<ResourceReference> origins();

    /**
     * Gets the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     *
     * @return the trafficRestorationTimeToHealedOrNewEndpointsInMinutes value.
     */
    Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes();

    /**
     * Gets the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses. This property is currently not supported.
     *
     * @return the responseBasedOriginErrorDetectionSettings value.
     */
    ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings();

    /**
     * Gets the resourceState property: Resource status of the origin group.
     *
     * @return the resourceState value.
     */
    OriginGroupResourceState resourceState();

    /**
     * Gets the provisioningState property: Provisioning status of the origin group.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.contoso_cdn.fluent.models.OriginGroupInner object.
     *
     * @return the inner object.
     */
    OriginGroupInner innerModel();

    /** The entirety of the OriginGroup definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The OriginGroup definition stages. */
    interface DefinitionStages {
        /** The first stage of the OriginGroup definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the OriginGroup definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, profileName, endpointName.
             *
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @param profileName Name of the CDN profile which is unique within the resource group.
             * @param endpointName Name of the endpoint under the profile which is unique globally.
             * @return the next definition stage.
             */
            WithCreate withExistingEndpoint(String resourceGroupName, String profileName, String endpointName);
        }
        /**
         * The stage of the OriginGroup definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithHealthProbeSettings,
                DefinitionStages.WithOrigins,
                DefinitionStages.WithTrafficRestorationTimeToHealedOrNewEndpointsInMinutes,
                DefinitionStages.WithResponseBasedOriginErrorDetectionSettings {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            OriginGroup create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            OriginGroup create(Context context);
        }
        /** The stage of the OriginGroup definition allowing to specify healthProbeSettings. */
        interface WithHealthProbeSettings {
            /**
             * Specifies the healthProbeSettings property: Health probe settings to the origin that is used to determine
             * the health of the origin..
             *
             * @param healthProbeSettings Health probe settings to the origin that is used to determine the health of
             *     the origin.
             * @return the next definition stage.
             */
            WithCreate withHealthProbeSettings(HealthProbeParameters healthProbeSettings);
        }
        /** The stage of the OriginGroup definition allowing to specify origins. */
        interface WithOrigins {
            /**
             * Specifies the origins property: The source of the content being delivered via CDN within given origin
             * group..
             *
             * @param origins The source of the content being delivered via CDN within given origin group.
             * @return the next definition stage.
             */
            WithCreate withOrigins(List<ResourceReference> origins);
        }
        /**
         * The stage of the OriginGroup definition allowing to specify
         * trafficRestorationTimeToHealedOrNewEndpointsInMinutes.
         */
        interface WithTrafficRestorationTimeToHealedOrNewEndpointsInMinutes {
            /**
             * Specifies the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift
             * the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is
             * added. Default is 10 mins. This property is currently not supported..
             *
             * @param trafficRestorationTimeToHealedOrNewEndpointsInMinutes Time in minutes to shift the traffic to the
             *     endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10
             *     mins. This property is currently not supported.
             * @return the next definition stage.
             */
            WithCreate withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
                Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        }
        /** The stage of the OriginGroup definition allowing to specify responseBasedOriginErrorDetectionSettings. */
        interface WithResponseBasedOriginErrorDetectionSettings {
            /**
             * Specifies the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the
             * properties to determine origin health using real requests/responses. This property is currently not
             * supported..
             *
             * @param responseBasedOriginErrorDetectionSettings The JSON object that contains the properties to
             *     determine origin health using real requests/responses. This property is currently not supported.
             * @return the next definition stage.
             */
            WithCreate withResponseBasedOriginErrorDetectionSettings(
                ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings);
        }
    }
    /**
     * Begins update for the OriginGroup resource.
     *
     * @return the stage of resource update.
     */
    OriginGroup.Update update();

    /** The template for OriginGroup update. */
    interface Update
        extends UpdateStages.WithHealthProbeSettings,
            UpdateStages.WithOrigins,
            UpdateStages.WithTrafficRestorationTimeToHealedOrNewEndpointsInMinutes,
            UpdateStages.WithResponseBasedOriginErrorDetectionSettings {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        OriginGroup apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        OriginGroup apply(Context context);
    }
    /** The OriginGroup update stages. */
    interface UpdateStages {
        /** The stage of the OriginGroup update allowing to specify healthProbeSettings. */
        interface WithHealthProbeSettings {
            /**
             * Specifies the healthProbeSettings property: Health probe settings to the origin that is used to determine
             * the health of the origin..
             *
             * @param healthProbeSettings Health probe settings to the origin that is used to determine the health of
             *     the origin.
             * @return the next definition stage.
             */
            Update withHealthProbeSettings(HealthProbeParameters healthProbeSettings);
        }
        /** The stage of the OriginGroup update allowing to specify origins. */
        interface WithOrigins {
            /**
             * Specifies the origins property: The source of the content being delivered via CDN within given origin
             * group..
             *
             * @param origins The source of the content being delivered via CDN within given origin group.
             * @return the next definition stage.
             */
            Update withOrigins(List<ResourceReference> origins);
        }
        /**
         * The stage of the OriginGroup update allowing to specify
         * trafficRestorationTimeToHealedOrNewEndpointsInMinutes.
         */
        interface WithTrafficRestorationTimeToHealedOrNewEndpointsInMinutes {
            /**
             * Specifies the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift
             * the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is
             * added. Default is 10 mins. This property is currently not supported..
             *
             * @param trafficRestorationTimeToHealedOrNewEndpointsInMinutes Time in minutes to shift the traffic to the
             *     endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10
             *     mins. This property is currently not supported.
             * @return the next definition stage.
             */
            Update withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
                Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        }
        /** The stage of the OriginGroup update allowing to specify responseBasedOriginErrorDetectionSettings. */
        interface WithResponseBasedOriginErrorDetectionSettings {
            /**
             * Specifies the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the
             * properties to determine origin health using real requests/responses. This property is currently not
             * supported..
             *
             * @param responseBasedOriginErrorDetectionSettings The JSON object that contains the properties to
             *     determine origin health using real requests/responses. This property is currently not supported.
             * @return the next definition stage.
             */
            Update withResponseBasedOriginErrorDetectionSettings(
                ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    OriginGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    OriginGroup refresh(Context context);
}
