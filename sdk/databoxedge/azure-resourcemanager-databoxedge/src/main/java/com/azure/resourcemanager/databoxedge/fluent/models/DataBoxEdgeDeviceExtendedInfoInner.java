// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.databoxedge.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.models.ClusterWitnessType;
import com.azure.resourcemanager.databoxedge.models.KeyVaultSyncStatus;
import com.azure.resourcemanager.databoxedge.models.Secret;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The extended Info of the Data Box Edge/Gateway device. */
@Fluent
public final class DataBoxEdgeDeviceExtendedInfoInner extends ArmBaseModel {
    /*
     * The extended info properties.
     */
    @JsonProperty(value = "properties")
    private DataBoxEdgeDeviceExtendedInfoProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of DataBoxEdgeDevice
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of DataBoxEdgeDeviceExtendedInfoInner class. */
    public DataBoxEdgeDeviceExtendedInfoInner() {
    }

    /**
     * Get the innerProperties property: The extended info properties.
     *
     * @return the innerProperties value.
     */
    private DataBoxEdgeDeviceExtendedInfoProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of DataBoxEdgeDevice.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the encryptionKeyThumbprint property: The digital signature of encrypted certificate.
     *
     * @return the encryptionKeyThumbprint value.
     */
    public String encryptionKeyThumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionKeyThumbprint();
    }

    /**
     * Set the encryptionKeyThumbprint property: The digital signature of encrypted certificate.
     *
     * @param encryptionKeyThumbprint the encryptionKeyThumbprint value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoInner object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoInner withEncryptionKeyThumbprint(String encryptionKeyThumbprint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataBoxEdgeDeviceExtendedInfoProperties();
        }
        this.innerProperties().withEncryptionKeyThumbprint(encryptionKeyThumbprint);
        return this;
    }

    /**
     * Get the encryptionKey property: The public part of the encryption certificate. Client uses this to encrypt any
     * secret.
     *
     * @return the encryptionKey value.
     */
    public String encryptionKey() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionKey();
    }

    /**
     * Set the encryptionKey property: The public part of the encryption certificate. Client uses this to encrypt any
     * secret.
     *
     * @param encryptionKey the encryptionKey value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoInner object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoInner withEncryptionKey(String encryptionKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataBoxEdgeDeviceExtendedInfoProperties();
        }
        this.innerProperties().withEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * Get the resourceKey property: The Resource ID of the Resource.
     *
     * @return the resourceKey value.
     */
    public String resourceKey() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceKey();
    }

    /**
     * Get the clientSecretStoreId property: The Key Vault ARM Id for client secrets.
     *
     * @return the clientSecretStoreId value.
     */
    public String clientSecretStoreId() {
        return this.innerProperties() == null ? null : this.innerProperties().clientSecretStoreId();
    }

    /**
     * Set the clientSecretStoreId property: The Key Vault ARM Id for client secrets.
     *
     * @param clientSecretStoreId the clientSecretStoreId value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoInner object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoInner withClientSecretStoreId(String clientSecretStoreId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataBoxEdgeDeviceExtendedInfoProperties();
        }
        this.innerProperties().withClientSecretStoreId(clientSecretStoreId);
        return this;
    }

    /**
     * Get the clientSecretStoreUrl property: The url to access the Client Key Vault.
     *
     * @return the clientSecretStoreUrl value.
     */
    public String clientSecretStoreUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().clientSecretStoreUrl();
    }

    /**
     * Set the clientSecretStoreUrl property: The url to access the Client Key Vault.
     *
     * @param clientSecretStoreUrl the clientSecretStoreUrl value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoInner object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoInner withClientSecretStoreUrl(String clientSecretStoreUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataBoxEdgeDeviceExtendedInfoProperties();
        }
        this.innerProperties().withClientSecretStoreUrl(clientSecretStoreUrl);
        return this;
    }

    /**
     * Get the channelIntegrityKeyName property: The name of Channel Integrity Key stored in the Client Key Vault.
     *
     * @return the channelIntegrityKeyName value.
     */
    public String channelIntegrityKeyName() {
        return this.innerProperties() == null ? null : this.innerProperties().channelIntegrityKeyName();
    }

    /**
     * Set the channelIntegrityKeyName property: The name of Channel Integrity Key stored in the Client Key Vault.
     *
     * @param channelIntegrityKeyName the channelIntegrityKeyName value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoInner object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoInner withChannelIntegrityKeyName(String channelIntegrityKeyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataBoxEdgeDeviceExtendedInfoProperties();
        }
        this.innerProperties().withChannelIntegrityKeyName(channelIntegrityKeyName);
        return this;
    }

    /**
     * Get the channelIntegrityKeyVersion property: The version of Channel Integrity Key stored in the Client Key Vault.
     *
     * @return the channelIntegrityKeyVersion value.
     */
    public String channelIntegrityKeyVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().channelIntegrityKeyVersion();
    }

    /**
     * Set the channelIntegrityKeyVersion property: The version of Channel Integrity Key stored in the Client Key Vault.
     *
     * @param channelIntegrityKeyVersion the channelIntegrityKeyVersion value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoInner object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoInner withChannelIntegrityKeyVersion(String channelIntegrityKeyVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataBoxEdgeDeviceExtendedInfoProperties();
        }
        this.innerProperties().withChannelIntegrityKeyVersion(channelIntegrityKeyVersion);
        return this;
    }

    /**
     * Get the keyVaultSyncStatus property: Key vault sync status.
     *
     * @return the keyVaultSyncStatus value.
     */
    public KeyVaultSyncStatus keyVaultSyncStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultSyncStatus();
    }

    /**
     * Set the keyVaultSyncStatus property: Key vault sync status.
     *
     * @param keyVaultSyncStatus the keyVaultSyncStatus value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoInner object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoInner withKeyVaultSyncStatus(KeyVaultSyncStatus keyVaultSyncStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataBoxEdgeDeviceExtendedInfoProperties();
        }
        this.innerProperties().withKeyVaultSyncStatus(keyVaultSyncStatus);
        return this;
    }

    /**
     * Get the deviceSecrets property: Device secrets, will be returned only with ODataFilter $expand=deviceSecrets.
     *
     * @return the deviceSecrets value.
     */
    public Map<String, Secret> deviceSecrets() {
        return this.innerProperties() == null ? null : this.innerProperties().deviceSecrets();
    }

    /**
     * Get the clusterWitnessType property: Cluster Witness Type.
     *
     * @return the clusterWitnessType value.
     */
    public ClusterWitnessType clusterWitnessType() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterWitnessType();
    }

    /**
     * Get the fileShareWitnessLocation property: The witness location of file share.
     *
     * @return the fileShareWitnessLocation value.
     */
    public String fileShareWitnessLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().fileShareWitnessLocation();
    }

    /**
     * Get the fileShareWitnessUsername property: The username of file share.
     *
     * @return the fileShareWitnessUsername value.
     */
    public String fileShareWitnessUsername() {
        return this.innerProperties() == null ? null : this.innerProperties().fileShareWitnessUsername();
    }

    /**
     * Get the cloudWitnessStorageAccountName property: The Cloud Witness Storage account name.
     *
     * @return the cloudWitnessStorageAccountName value.
     */
    public String cloudWitnessStorageAccountName() {
        return this.innerProperties() == null ? null : this.innerProperties().cloudWitnessStorageAccountName();
    }

    /**
     * Get the cloudWitnessContainerName property: The Container for cloud witness in the storage account.
     *
     * @return the cloudWitnessContainerName value.
     */
    public String cloudWitnessContainerName() {
        return this.innerProperties() == null ? null : this.innerProperties().cloudWitnessContainerName();
    }

    /**
     * Get the cloudWitnessStorageEndpoint property: The Azure service endpoint of the cloud witness storage account.
     *
     * @return the cloudWitnessStorageEndpoint value.
     */
    public String cloudWitnessStorageEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().cloudWitnessStorageEndpoint();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
