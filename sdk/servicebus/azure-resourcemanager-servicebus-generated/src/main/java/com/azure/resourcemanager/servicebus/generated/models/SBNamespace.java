// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.servicebus.generated.fluent.models.SBNamespaceInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of SBNamespace. */
public interface SBNamespace {
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
     * Gets the sku property: Properties of SKU.
     *
     * @return the sku value.
     */
    SBSku sku();

    /**
     * Gets the identity property: Properties of BYOK Identity description.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the minimumTlsVersion property: The minimum TLS version for the cluster to support, e.g. '1.2'.
     *
     * @return the minimumTlsVersion value.
     */
    TlsVersion minimumTlsVersion();

    /**
     * Gets the provisioningState property: Provisioning state of the namespace.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the status property: Status of the namespace.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the createdAt property: The time the namespace was created.
     *
     * @return the createdAt value.
     */
    OffsetDateTime createdAt();

    /**
     * Gets the updatedAt property: The time the namespace was updated.
     *
     * @return the updatedAt value.
     */
    OffsetDateTime updatedAt();

    /**
     * Gets the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value.
     */
    String serviceBusEndpoint();

    /**
     * Gets the metricId property: Identifier for Azure Insights metrics.
     *
     * @return the metricId value.
     */
    String metricId();

    /**
     * Gets the zoneRedundant property: Enabling this property creates a Premium Service Bus Namespace in regions
     * supported availability zones.
     *
     * @return the zoneRedundant value.
     */
    Boolean zoneRedundant();

    /**
     * Gets the encryption property: Properties of BYOK Encryption description.
     *
     * @return the encryption value.
     */
    Encryption encryption();

    /**
     * Gets the privateEndpointConnections property: List of private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the disableLocalAuth property: This property disables SAS authentication for the Service Bus namespace.
     *
     * @return the disableLocalAuth value.
     */
    Boolean disableLocalAuth();

    /**
     * Gets the alternateName property: Alternate name for namespace.
     *
     * @return the alternateName value.
     */
    String alternateName();

    /**
     * Gets the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the premiumMessagingPartitions property: The number of partitions of a Service Bus namespace. This property
     * is only applicable to Premium SKU namespaces. The default value is 1 and possible values are 1, 2 and 4.
     *
     * @return the premiumMessagingPartitions value.
     */
    Integer premiumMessagingPartitions();

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
     * Gets the inner com.azure.resourcemanager.servicebus.generated.fluent.models.SBNamespaceInner object.
     *
     * @return the inner object.
     */
    SBNamespaceInner innerModel();

    /** The entirety of the SBNamespace definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The SBNamespace definition stages. */
    interface DefinitionStages {
        /** The first stage of the SBNamespace definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the SBNamespace definition allowing to specify location. */
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
        /** The stage of the SBNamespace definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the SBNamespace definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithMinimumTlsVersion,
                DefinitionStages.WithZoneRedundant,
                DefinitionStages.WithEncryption,
                DefinitionStages.WithPrivateEndpointConnections,
                DefinitionStages.WithDisableLocalAuth,
                DefinitionStages.WithAlternateName,
                DefinitionStages.WithPublicNetworkAccess,
                DefinitionStages.WithPremiumMessagingPartitions {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SBNamespace create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SBNamespace create(Context context);
        }
        /** The stage of the SBNamespace definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the SBNamespace definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Properties of SKU.
             *
             * @param sku Properties of SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(SBSku sku);
        }
        /** The stage of the SBNamespace definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Properties of BYOK Identity description.
             *
             * @param identity Properties of BYOK Identity description.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }
        /** The stage of the SBNamespace definition allowing to specify minimumTlsVersion. */
        interface WithMinimumTlsVersion {
            /**
             * Specifies the minimumTlsVersion property: The minimum TLS version for the cluster to support, e.g. '1.2'.
             *
             * @param minimumTlsVersion The minimum TLS version for the cluster to support, e.g. '1.2'.
             * @return the next definition stage.
             */
            WithCreate withMinimumTlsVersion(TlsVersion minimumTlsVersion);
        }
        /** The stage of the SBNamespace definition allowing to specify zoneRedundant. */
        interface WithZoneRedundant {
            /**
             * Specifies the zoneRedundant property: Enabling this property creates a Premium Service Bus Namespace in
             * regions supported availability zones..
             *
             * @param zoneRedundant Enabling this property creates a Premium Service Bus Namespace in regions supported
             *     availability zones.
             * @return the next definition stage.
             */
            WithCreate withZoneRedundant(Boolean zoneRedundant);
        }
        /** The stage of the SBNamespace definition allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Properties of BYOK Encryption description.
             *
             * @param encryption Properties of BYOK Encryption description.
             * @return the next definition stage.
             */
            WithCreate withEncryption(Encryption encryption);
        }
        /** The stage of the SBNamespace definition allowing to specify privateEndpointConnections. */
        interface WithPrivateEndpointConnections {
            /**
             * Specifies the privateEndpointConnections property: List of private endpoint connections..
             *
             * @param privateEndpointConnections List of private endpoint connections.
             * @return the next definition stage.
             */
            WithCreate withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections);
        }
        /** The stage of the SBNamespace definition allowing to specify disableLocalAuth. */
        interface WithDisableLocalAuth {
            /**
             * Specifies the disableLocalAuth property: This property disables SAS authentication for the Service Bus
             * namespace..
             *
             * @param disableLocalAuth This property disables SAS authentication for the Service Bus namespace.
             * @return the next definition stage.
             */
            WithCreate withDisableLocalAuth(Boolean disableLocalAuth);
        }
        /** The stage of the SBNamespace definition allowing to specify alternateName. */
        interface WithAlternateName {
            /**
             * Specifies the alternateName property: Alternate name for namespace.
             *
             * @param alternateName Alternate name for namespace.
             * @return the next definition stage.
             */
            WithCreate withAlternateName(String alternateName);
        }
        /** The stage of the SBNamespace definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This determines if traffic is allowed over public network. By
             * default it is enabled..
             *
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is
             *     enabled.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the SBNamespace definition allowing to specify premiumMessagingPartitions. */
        interface WithPremiumMessagingPartitions {
            /**
             * Specifies the premiumMessagingPartitions property: The number of partitions of a Service Bus namespace.
             * This property is only applicable to Premium SKU namespaces. The default value is 1 and possible values
             * are 1, 2 and 4.
             *
             * @param premiumMessagingPartitions The number of partitions of a Service Bus namespace. This property is
             *     only applicable to Premium SKU namespaces. The default value is 1 and possible values are 1, 2 and 4.
             * @return the next definition stage.
             */
            WithCreate withPremiumMessagingPartitions(Integer premiumMessagingPartitions);
        }
    }
    /**
     * Begins update for the SBNamespace resource.
     *
     * @return the stage of resource update.
     */
    SBNamespace.Update update();

    /** The template for SBNamespace update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSku,
            UpdateStages.WithIdentity,
            UpdateStages.WithEncryption,
            UpdateStages.WithPrivateEndpointConnections,
            UpdateStages.WithDisableLocalAuth,
            UpdateStages.WithAlternateName {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SBNamespace apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SBNamespace apply(Context context);
    }
    /** The SBNamespace update stages. */
    interface UpdateStages {
        /** The stage of the SBNamespace update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the SBNamespace update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Properties of SKU.
             *
             * @param sku Properties of SKU.
             * @return the next definition stage.
             */
            Update withSku(SBSku sku);
        }
        /** The stage of the SBNamespace update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Properties of BYOK Identity description.
             *
             * @param identity Properties of BYOK Identity description.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }
        /** The stage of the SBNamespace update allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Properties of BYOK Encryption description.
             *
             * @param encryption Properties of BYOK Encryption description.
             * @return the next definition stage.
             */
            Update withEncryption(Encryption encryption);
        }
        /** The stage of the SBNamespace update allowing to specify privateEndpointConnections. */
        interface WithPrivateEndpointConnections {
            /**
             * Specifies the privateEndpointConnections property: List of private endpoint connections..
             *
             * @param privateEndpointConnections List of private endpoint connections.
             * @return the next definition stage.
             */
            Update withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections);
        }
        /** The stage of the SBNamespace update allowing to specify disableLocalAuth. */
        interface WithDisableLocalAuth {
            /**
             * Specifies the disableLocalAuth property: This property disables SAS authentication for the Service Bus
             * namespace..
             *
             * @param disableLocalAuth This property disables SAS authentication for the Service Bus namespace.
             * @return the next definition stage.
             */
            Update withDisableLocalAuth(Boolean disableLocalAuth);
        }
        /** The stage of the SBNamespace update allowing to specify alternateName. */
        interface WithAlternateName {
            /**
             * Specifies the alternateName property: Alternate name for namespace.
             *
             * @param alternateName Alternate name for namespace.
             * @return the next definition stage.
             */
            Update withAlternateName(String alternateName);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SBNamespace refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SBNamespace refresh(Context context);
}
