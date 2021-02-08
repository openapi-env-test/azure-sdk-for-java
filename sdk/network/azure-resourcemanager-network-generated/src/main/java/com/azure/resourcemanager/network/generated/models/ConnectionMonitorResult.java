// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectionMonitorResultInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of ConnectionMonitorResult. */
public interface ConnectionMonitorResult {
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
     * Gets the etag property: The etag property.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the source property: Describes the source of connection monitor.
     *
     * @return the source value.
     */
    ConnectionMonitorSource source();

    /**
     * Gets the destination property: Describes the destination of connection monitor.
     *
     * @return the destination value.
     */
    ConnectionMonitorDestination destination();

    /**
     * Gets the autoStart property: Determines if the connection monitor will start automatically once created.
     *
     * @return the autoStart value.
     */
    Boolean autoStart();

    /**
     * Gets the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     *
     * @return the monitoringIntervalInSeconds value.
     */
    Integer monitoringIntervalInSeconds();

    /**
     * Gets the provisioningState property: The provisioning state of the connection monitor.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the startTime property: The date and time when the connection monitor was started.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the monitoringStatus property: The monitoring status of the connection monitor.
     *
     * @return the monitoringStatus value.
     */
    String monitoringStatus();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ConnectionMonitorResultInner object.
     *
     * @return the inner object.
     */
    ConnectionMonitorResultInner innerModel();

    /** The entirety of the ConnectionMonitorResult definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithSource,
            DefinitionStages.WithDestination,
            DefinitionStages.WithCreate {
    }
    /** The ConnectionMonitorResult definition stages. */
    interface DefinitionStages {
        /** The first stage of the ConnectionMonitorResult definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, networkWatcherName.
             *
             * @param resourceGroupName The name of the resource group containing Network Watcher.
             * @param networkWatcherName The name of the Network Watcher resource.
             * @return the next definition stage.
             */
            WithSource withExistingNetworkWatcher(String resourceGroupName, String networkWatcherName);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify source. */
        interface WithSource {
            /**
             * Specifies the source property: Describes the source of connection monitor..
             *
             * @param source Describes the source of connection monitor.
             * @return the next definition stage.
             */
            WithDestination withSource(ConnectionMonitorSource source);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify destination. */
        interface WithDestination {
            /**
             * Specifies the destination property: Describes the destination of connection monitor..
             *
             * @param destination Describes the destination of connection monitor.
             * @return the next definition stage.
             */
            WithCreate withDestination(ConnectionMonitorDestination destination);
        }
        /**
         * The stage of the ConnectionMonitorResult definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithTags,
                DefinitionStages.WithAutoStart,
                DefinitionStages.WithMonitoringIntervalInSeconds {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ConnectionMonitorResult create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ConnectionMonitorResult create(Context context);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location Connection monitor location.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location Connection monitor location.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Connection monitor tags..
             *
             * @param tags Connection monitor tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify autoStart. */
        interface WithAutoStart {
            /**
             * Specifies the autoStart property: Determines if the connection monitor will start automatically once
             * created..
             *
             * @param autoStart Determines if the connection monitor will start automatically once created.
             * @return the next definition stage.
             */
            WithCreate withAutoStart(Boolean autoStart);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify monitoringIntervalInSeconds. */
        interface WithMonitoringIntervalInSeconds {
            /**
             * Specifies the monitoringIntervalInSeconds property: Monitoring interval in seconds..
             *
             * @param monitoringIntervalInSeconds Monitoring interval in seconds.
             * @return the next definition stage.
             */
            WithCreate withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds);
        }
    }
    /**
     * Begins update for the ConnectionMonitorResult resource.
     *
     * @return the stage of resource update.
     */
    ConnectionMonitorResult.Update update();

    /** The template for ConnectionMonitorResult update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSource,
            UpdateStages.WithDestination,
            UpdateStages.WithAutoStart,
            UpdateStages.WithMonitoringIntervalInSeconds {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ConnectionMonitorResult apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ConnectionMonitorResult apply(Context context);
    }
    /** The ConnectionMonitorResult update stages. */
    interface UpdateStages {
        /** The stage of the ConnectionMonitorResult update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Connection monitor tags..
             *
             * @param tags Connection monitor tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ConnectionMonitorResult update allowing to specify source. */
        interface WithSource {
            /**
             * Specifies the source property: Describes the source of connection monitor..
             *
             * @param source Describes the source of connection monitor.
             * @return the next definition stage.
             */
            Update withSource(ConnectionMonitorSource source);
        }
        /** The stage of the ConnectionMonitorResult update allowing to specify destination. */
        interface WithDestination {
            /**
             * Specifies the destination property: Describes the destination of connection monitor..
             *
             * @param destination Describes the destination of connection monitor.
             * @return the next definition stage.
             */
            Update withDestination(ConnectionMonitorDestination destination);
        }
        /** The stage of the ConnectionMonitorResult update allowing to specify autoStart. */
        interface WithAutoStart {
            /**
             * Specifies the autoStart property: Determines if the connection monitor will start automatically once
             * created..
             *
             * @param autoStart Determines if the connection monitor will start automatically once created.
             * @return the next definition stage.
             */
            Update withAutoStart(Boolean autoStart);
        }
        /** The stage of the ConnectionMonitorResult update allowing to specify monitoringIntervalInSeconds. */
        interface WithMonitoringIntervalInSeconds {
            /**
             * Specifies the monitoringIntervalInSeconds property: Monitoring interval in seconds..
             *
             * @param monitoringIntervalInSeconds Monitoring interval in seconds.
             * @return the next definition stage.
             */
            Update withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ConnectionMonitorResult refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ConnectionMonitorResult refresh(Context context);
}
