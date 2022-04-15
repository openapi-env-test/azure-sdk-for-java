package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Metadata describing an update file. */
@Fluent
public final class FileImportMetadata {
    /*
     * Update file name as specified inside import manifest.
     */
    @JsonProperty(value = "filename", required = true)
    private String filename;

    /*
     * Azure Blob location from which the update file can be downloaded by
     * Device Update for IoT Hub. This is typically a read-only SAS-protected
     * blob URL with an expiration set to at least 4 hours.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /**
     * Get the filename property: Update file name as specified inside import manifest.
     *
     * @return the filename value.
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * Set the filename property: Update file name as specified inside import manifest.
     *
     * @param filename the filename value to set.
     * @return the FileImportMetadata object itself.
     */
    public FileImportMetadata setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Get the url property: Azure Blob location from which the update file can be downloaded by Device Update for IoT
     * Hub. This is typically a read-only SAS-protected blob URL with an expiration set to at least 4 hours.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: Azure Blob location from which the update file can be downloaded by Device Update for IoT
     * Hub. This is typically a read-only SAS-protected blob URL with an expiration set to at least 4 hours.
     *
     * @param url the url value to set.
     * @return the FileImportMetadata object itself.
     */
    public FileImportMetadata setUrl(String url) {
        this.url = url;
        return this;
    }
}
