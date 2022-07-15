// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elasticsan.models.EncryptionType;
import com.azure.resourcemanager.elasticsan.models.NetworkRuleSet;
import com.azure.resourcemanager.elasticsan.models.ProvisioningStates;
import com.azure.resourcemanager.elasticsan.models.StorageTargetType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VolumeGroup response properties. */
@Fluent
public final class VolumeGroupProperties {
    /*
     * State of the operation on the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStates provisioningState;

    /*
     * Type of storage target
     */
    @JsonProperty(value = "protocolType", required = true)
    private StorageTargetType protocolType;

    /*
     * Type of encryption
     */
    @JsonProperty(value = "encryption", required = true)
    private EncryptionType encryption;

    /*
     * A collection of rules governing the accessibility from specific network
     * locations.
     */
    @JsonProperty(value = "networkAcls")
    private NetworkRuleSet networkAcls;

    /**
     * Get the provisioningState property: State of the operation on the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStates provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the protocolType property: Type of storage target.
     *
     * @return the protocolType value.
     */
    public StorageTargetType protocolType() {
        return this.protocolType;
    }

    /**
     * Set the protocolType property: Type of storage target.
     *
     * @param protocolType the protocolType value to set.
     * @return the VolumeGroupProperties object itself.
     */
    public VolumeGroupProperties withProtocolType(StorageTargetType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get the encryption property: Type of encryption.
     *
     * @return the encryption value.
     */
    public EncryptionType encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Type of encryption.
     *
     * @param encryption the encryption value to set.
     * @return the VolumeGroupProperties object itself.
     */
    public VolumeGroupProperties withEncryption(EncryptionType encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the networkAcls property: A collection of rules governing the accessibility from specific network locations.
     *
     * @return the networkAcls value.
     */
    public NetworkRuleSet networkAcls() {
        return this.networkAcls;
    }

    /**
     * Set the networkAcls property: A collection of rules governing the accessibility from specific network locations.
     *
     * @param networkAcls the networkAcls value to set.
     * @return the VolumeGroupProperties object itself.
     */
    public VolumeGroupProperties withNetworkAcls(NetworkRuleSet networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (protocolType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protocolType in model VolumeGroupProperties"));
        }
        if (encryption() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property encryption in model VolumeGroupProperties"));
        }
        if (networkAcls() != null) {
            networkAcls().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VolumeGroupProperties.class);
}
