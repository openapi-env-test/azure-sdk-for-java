// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The properties used to create a new server by restoring to a different region from a geo replicated backup. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "createMode")
@JsonTypeName("GeoRestore")
@Fluent
public final class ServerPropertiesForGeoRestore extends ServerPropertiesForCreate {
    /*
     * The source server id to restore from.
     */
    @JsonProperty(value = "sourceServerId", required = true)
    private String sourceServerId;

    /**
     * Get the sourceServerId property: The source server id to restore from.
     *
     * @return the sourceServerId value.
     */
    public String sourceServerId() {
        return this.sourceServerId;
    }

    /**
     * Set the sourceServerId property: The source server id to restore from.
     *
     * @param sourceServerId the sourceServerId value to set.
     * @return the ServerPropertiesForGeoRestore object itself.
     */
    public ServerPropertiesForGeoRestore withSourceServerId(String sourceServerId) {
        this.sourceServerId = sourceServerId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForGeoRestore withVersion(ServerVersion version) {
        super.withVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForGeoRestore withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        super.withSslEnforcement(sslEnforcement);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForGeoRestore withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        super.withMinimalTlsVersion(minimalTlsVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForGeoRestore withInfrastructureEncryption(
        InfrastructureEncryption infrastructureEncryption) {
        super.withInfrastructureEncryption(infrastructureEncryption);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForGeoRestore withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        super.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForGeoRestore withStorageProfile(StorageProfile storageProfile) {
        super.withStorageProfile(storageProfile);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (sourceServerId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceServerId in model ServerPropertiesForGeoRestore"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerPropertiesForGeoRestore.class);
}
