// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** disk encryption set update resource. */
@JsonFlatten
@Fluent
public class DiskEncryptionSetUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskEncryptionSetUpdate.class);

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Key Vault Key Url and vault id of KeK, KeK is optional and when provided
     * is used to unwrap the encryptionKey
     */
    @JsonProperty(value = "properties.activeKey")
    private KeyVaultAndKeyReference activeKey;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the DiskEncryptionSetUpdate object itself.
     */
    public DiskEncryptionSetUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the activeKey property: Key Vault Key Url and vault id of KeK, KeK is optional and when provided is used to
     * unwrap the encryptionKey.
     *
     * @return the activeKey value.
     */
    public KeyVaultAndKeyReference activeKey() {
        return this.activeKey;
    }

    /**
     * Set the activeKey property: Key Vault Key Url and vault id of KeK, KeK is optional and when provided is used to
     * unwrap the encryptionKey.
     *
     * @param activeKey the activeKey value to set.
     * @return the DiskEncryptionSetUpdate object itself.
     */
    public DiskEncryptionSetUpdate withActiveKey(KeyVaultAndKeyReference activeKey) {
        this.activeKey = activeKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (activeKey() != null) {
            activeKey().validate();
        }
    }
}
