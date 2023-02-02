// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the import pipeline source. */
@Fluent
public final class ImportPipelineSourceProperties {
    /*
     * The type of source for the import pipeline.
     */
    @JsonProperty(value = "type")
    private PipelineSourceType type;

    /*
     * The source uri of the import pipeline.
     * When 'AzureStorageBlob': "https://accountName.blob.core.windows.net/containerName/blobName"
     * When 'AzureStorageBlobContainer': "https://accountName.blob.core.windows.net/containerName"
     */
    @JsonProperty(value = "uri")
    private String uri;

    /*
     * They key vault secret uri to obtain the source storage SAS token.
     */
    @JsonProperty(value = "keyVaultUri", required = true)
    private String keyVaultUri;

    /** Creates an instance of ImportPipelineSourceProperties class. */
    public ImportPipelineSourceProperties() {
    }

    /**
     * Get the type property: The type of source for the import pipeline.
     *
     * @return the type value.
     */
    public PipelineSourceType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of source for the import pipeline.
     *
     * @param type the type value to set.
     * @return the ImportPipelineSourceProperties object itself.
     */
    public ImportPipelineSourceProperties withType(PipelineSourceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the uri property: The source uri of the import pipeline. When 'AzureStorageBlob':
     * "https://accountName.blob.core.windows.net/containerName/blobName" When 'AzureStorageBlobContainer':
     * "https://accountName.blob.core.windows.net/containerName".
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The source uri of the import pipeline. When 'AzureStorageBlob':
     * "https://accountName.blob.core.windows.net/containerName/blobName" When 'AzureStorageBlobContainer':
     * "https://accountName.blob.core.windows.net/containerName".
     *
     * @param uri the uri value to set.
     * @return the ImportPipelineSourceProperties object itself.
     */
    public ImportPipelineSourceProperties withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the keyVaultUri property: They key vault secret uri to obtain the source storage SAS token.
     *
     * @return the keyVaultUri value.
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri property: They key vault secret uri to obtain the source storage SAS token.
     *
     * @param keyVaultUri the keyVaultUri value to set.
     * @return the ImportPipelineSourceProperties object itself.
     */
    public ImportPipelineSourceProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultUri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyVaultUri in model ImportPipelineSourceProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImportPipelineSourceProperties.class);
}
