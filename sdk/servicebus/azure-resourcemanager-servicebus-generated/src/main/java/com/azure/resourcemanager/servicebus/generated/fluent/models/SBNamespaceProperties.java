// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicebus.generated.models.Encryption;
import com.azure.resourcemanager.servicebus.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.servicebus.generated.models.TlsVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties of the namespace. */
@Fluent
public final class SBNamespaceProperties {
    /*
     * The minimum TLS version for the cluster to support, e.g. '1.2'
     */
    @JsonProperty(value = "minimumTlsVersion")
    private TlsVersion minimumTlsVersion;

    /*
     * Provisioning state of the namespace.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Status of the namespace.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The time the namespace was created
     */
    @JsonProperty(value = "createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The time the namespace was updated.
     */
    @JsonProperty(value = "updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Endpoint you can use to perform Service Bus operations.
     */
    @JsonProperty(value = "serviceBusEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusEndpoint;

    /*
     * Identifier for Azure Insights metrics
     */
    @JsonProperty(value = "metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /*
     * Enabling this property creates a Premium Service Bus Namespace in regions supported availability zones.
     */
    @JsonProperty(value = "zoneRedundant")
    private Boolean zoneRedundant;

    /*
     * Properties of BYOK Encryption description
     */
    @JsonProperty(value = "encryption")
    private Encryption encryption;

    /*
     * List of private endpoint connections.
     */
    @JsonProperty(value = "privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * This property disables SAS authentication for the Service Bus namespace.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * Alternate name for namespace
     */
    @JsonProperty(value = "alternateName")
    private String alternateName;

    /*
     * This determines if traffic is allowed over public network. By default it is enabled.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The number of partitions of a Service Bus namespace. This property is only applicable to Premium SKU namespaces.
     * The default value is 1 and possible values are 1, 2 and 4
     */
    @JsonProperty(value = "premiumMessagingPartitions")
    private Integer premiumMessagingPartitions;

    /** Creates an instance of SBNamespaceProperties class. */
    public SBNamespaceProperties() {
    }

    /**
     * Get the minimumTlsVersion property: The minimum TLS version for the cluster to support, e.g. '1.2'.
     *
     * @return the minimumTlsVersion value.
     */
    public TlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: The minimum TLS version for the cluster to support, e.g. '1.2'.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the SBNamespaceProperties object itself.
     */
    public SBNamespaceProperties withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the namespace.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: Status of the namespace.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the createdAt property: The time the namespace was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     *
     * @return the metricId value.
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get the zoneRedundant property: Enabling this property creates a Premium Service Bus Namespace in regions
     * supported availability zones.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: Enabling this property creates a Premium Service Bus Namespace in regions
     * supported availability zones.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the SBNamespaceProperties object itself.
     */
    public SBNamespaceProperties withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Get the encryption property: Properties of BYOK Encryption description.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Properties of BYOK Encryption description.
     *
     * @param encryption the encryption value to set.
     * @return the SBNamespaceProperties object itself.
     */
    public SBNamespaceProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: List of private endpoint connections.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the SBNamespaceProperties object itself.
     */
    public SBNamespaceProperties withPrivateEndpointConnections(
        List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the disableLocalAuth property: This property disables SAS authentication for the Service Bus namespace.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: This property disables SAS authentication for the Service Bus namespace.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the SBNamespaceProperties object itself.
     */
    public SBNamespaceProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the alternateName property: Alternate name for namespace.
     *
     * @return the alternateName value.
     */
    public String alternateName() {
        return this.alternateName;
    }

    /**
     * Set the alternateName property: Alternate name for namespace.
     *
     * @param alternateName the alternateName value to set.
     * @return the SBNamespaceProperties object itself.
     */
    public SBNamespaceProperties withAlternateName(String alternateName) {
        this.alternateName = alternateName;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the SBNamespaceProperties object itself.
     */
    public SBNamespaceProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the premiumMessagingPartitions property: The number of partitions of a Service Bus namespace. This property
     * is only applicable to Premium SKU namespaces. The default value is 1 and possible values are 1, 2 and 4.
     *
     * @return the premiumMessagingPartitions value.
     */
    public Integer premiumMessagingPartitions() {
        return this.premiumMessagingPartitions;
    }

    /**
     * Set the premiumMessagingPartitions property: The number of partitions of a Service Bus namespace. This property
     * is only applicable to Premium SKU namespaces. The default value is 1 and possible values are 1, 2 and 4.
     *
     * @param premiumMessagingPartitions the premiumMessagingPartitions value to set.
     * @return the SBNamespaceProperties object itself.
     */
    public SBNamespaceProperties withPremiumMessagingPartitions(Integer premiumMessagingPartitions) {
        this.premiumMessagingPartitions = premiumMessagingPartitions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryption() != null) {
            encryption().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
