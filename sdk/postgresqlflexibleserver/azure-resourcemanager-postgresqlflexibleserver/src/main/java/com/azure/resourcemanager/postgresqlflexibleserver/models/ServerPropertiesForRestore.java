// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** The properties used to create a new server by restoring from a backup. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "createMode")
@JsonTypeName("PointInTimeRestore")
@Fluent
public final class ServerPropertiesForRestore extends ServerPropertiesForCreate {
    /*
     * The source server id to restore from.
     */
    @JsonProperty(value = "sourceServerId", required = true)
    private String sourceServerId;

    /*
     * Restore point creation time (ISO8601 format), specifying the time to
     * restore from.
     */
    @JsonProperty(value = "restorePointInTime", required = true)
    private OffsetDateTime restorePointInTime;

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
     * @return the ServerPropertiesForRestore object itself.
     */
    public ServerPropertiesForRestore withSourceServerId(String sourceServerId) {
        this.sourceServerId = sourceServerId;
        return this;
    }

    /**
     * Get the restorePointInTime property: Restore point creation time (ISO8601 format), specifying the time to restore
     * from.
     *
     * @return the restorePointInTime value.
     */
    public OffsetDateTime restorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * Set the restorePointInTime property: Restore point creation time (ISO8601 format), specifying the time to restore
     * from.
     *
     * @param restorePointInTime the restorePointInTime value to set.
     * @return the ServerPropertiesForRestore object itself.
     */
    public ServerPropertiesForRestore withRestorePointInTime(OffsetDateTime restorePointInTime) {
        this.restorePointInTime = restorePointInTime;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForRestore withVersion(ServerVersion version) {
        super.withVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForRestore withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        super.withSslEnforcement(sslEnforcement);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForRestore withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        super.withMinimalTlsVersion(minimalTlsVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForRestore withInfrastructureEncryption(InfrastructureEncryption infrastructureEncryption) {
        super.withInfrastructureEncryption(infrastructureEncryption);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForRestore withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        super.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForRestore withStorageProfile(StorageProfile storageProfile) {
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
                        "Missing required property sourceServerId in model ServerPropertiesForRestore"));
        }
        if (restorePointInTime() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property restorePointInTime in model ServerPropertiesForRestore"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerPropertiesForRestore.class);
}
