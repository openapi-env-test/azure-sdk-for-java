package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Metadata describing the import manifest, a document which describes the files and other metadata about an update
 * version.
 */
@Fluent
public final class ImportManifestMetadata {
    /*
     * Azure Blob location from which the import manifest can be downloaded by
     * Device Update for IoT Hub. This is typically a read-only SAS-protected
     * blob URL with an expiration set to at least 4 hours.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /*
     * File size in number of bytes.
     */
    @JsonProperty(value = "sizeInBytes", required = true)
    private long sizeInBytes;

    /*
     * A JSON object containing the hash(es) of the file. At least SHA256 hash
     * is required. This object can be thought of as a set of key-value pairs
     * where the key is the hash algorithm, and the value is the hash of the
     * file calculated using that algorithm.
     */
    @JsonProperty(value = "hashes", required = true)
    private Map<String, String> hashes;

    /**
     * Get the url property: Azure Blob location from which the import manifest can be downloaded by Device Update for
     * IoT Hub. This is typically a read-only SAS-protected blob URL with an expiration set to at least 4 hours.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: Azure Blob location from which the import manifest can be downloaded by Device Update for
     * IoT Hub. This is typically a read-only SAS-protected blob URL with an expiration set to at least 4 hours.
     *
     * @param url the url value to set.
     * @return the ImportManifestMetadata object itself.
     */
    public ImportManifestMetadata setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the sizeInBytes property: File size in number of bytes.
     *
     * @return the sizeInBytes value.
     */
    public long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Set the sizeInBytes property: File size in number of bytes.
     *
     * @param sizeInBytes the sizeInBytes value to set.
     * @return the ImportManifestMetadata object itself.
     */
    public ImportManifestMetadata setSizeInBytes(long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * Get the hashes property: A JSON object containing the hash(es) of the file. At least SHA256 hash is required.
     * This object can be thought of as a set of key-value pairs where the key is the hash algorithm, and the value is
     * the hash of the file calculated using that algorithm.
     *
     * @return the hashes value.
     */
    public Map<String, String> getHashes() {
        return this.hashes;
    }

    /**
     * Set the hashes property: A JSON object containing the hash(es) of the file. At least SHA256 hash is required.
     * This object can be thought of as a set of key-value pairs where the key is the hash algorithm, and the value is
     * the hash of the file calculated using that algorithm.
     *
     * @param hashes the hashes value to set.
     * @return the ImportManifestMetadata object itself.
     */
    public ImportManifestMetadata setHashes(Map<String, String> hashes) {
        this.hashes = hashes;
        return this;
    }
}
