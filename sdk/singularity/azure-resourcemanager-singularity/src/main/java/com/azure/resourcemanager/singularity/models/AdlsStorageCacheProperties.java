// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the properties of a storage cache resource backed by ADLS Gen 1. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ADLS")
@Fluent
public final class AdlsStorageCacheProperties extends StorageCachePropertiesBase {
    /*
     * ADLS path (e.g. adl://<adls name>.azuredatalakestore.net/<folder>)
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /*
     * Service principal tenant ID
     */
    @JsonProperty(value = "tenantId", required = true)
    private String tenantId;

    /*
     * Service principal client (application) ID
     */
    @JsonProperty(value = "clientId", required = true)
    private String clientId;

    /*
     * Service principal client secret
     */
    @JsonProperty(value = "clientSecret", required = true)
    private String clientSecret;

    /*
     * Describes options to use when mounting a storage cache container backed
     * by ADLS Gen1.
     */
    @JsonProperty(value = "mountOptions")
    private AdlsMountOptionsBase mountOptions;

    /**
     * Get the path property: ADLS path (e.g. adl://&lt;adls name&gt;.azuredatalakestore.net/&lt;folder&gt;).
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: ADLS path (e.g. adl://&lt;adls name&gt;.azuredatalakestore.net/&lt;folder&gt;).
     *
     * @param path the path value to set.
     * @return the AdlsStorageCacheProperties object itself.
     */
    public AdlsStorageCacheProperties withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the tenantId property: Service principal tenant ID.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Service principal tenant ID.
     *
     * @param tenantId the tenantId value to set.
     * @return the AdlsStorageCacheProperties object itself.
     */
    public AdlsStorageCacheProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the clientId property: Service principal client (application) ID.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Service principal client (application) ID.
     *
     * @param clientId the clientId value to set.
     * @return the AdlsStorageCacheProperties object itself.
     */
    public AdlsStorageCacheProperties withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: Service principal client secret.
     *
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: Service principal client secret.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the AdlsStorageCacheProperties object itself.
     */
    public AdlsStorageCacheProperties withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the mountOptions property: Describes options to use when mounting a storage cache container backed by ADLS
     * Gen1.
     *
     * @return the mountOptions value.
     */
    public AdlsMountOptionsBase mountOptions() {
        return this.mountOptions;
    }

    /**
     * Set the mountOptions property: Describes options to use when mounting a storage cache container backed by ADLS
     * Gen1.
     *
     * @param mountOptions the mountOptions value to set.
     * @return the AdlsStorageCacheProperties object itself.
     */
    public AdlsStorageCacheProperties withMountOptions(AdlsMountOptionsBase mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AdlsStorageCacheProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AdlsStorageCacheProperties withRegion(String region) {
        super.withRegion(region);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AdlsStorageCacheProperties withProvisioningState(ProvisioningState provisioningState) {
        super.withProvisioningState(provisioningState);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AdlsStorageCacheProperties withStatus(StorageCacheStatus status) {
        super.withStatus(status);
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
        if (path() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property path in model AdlsStorageCacheProperties"));
        }
        if (tenantId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property tenantId in model AdlsStorageCacheProperties"));
        }
        if (clientId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clientId in model AdlsStorageCacheProperties"));
        }
        if (clientSecret() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clientSecret in model AdlsStorageCacheProperties"));
        }
        if (mountOptions() != null) {
            mountOptions().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AdlsStorageCacheProperties.class);
}
